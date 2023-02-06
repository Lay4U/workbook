package com.example.workbook.ch3;

import java.io.Serializable;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class P77_ImplementingChessClock {
    public void playground(){
        Clock fixedClock = Clock.fixed(Instant.now(), ZoneOffset.UTC);
        Clock tickClock = Clock.tickSeconds(ZoneId.of("Europe/Bucharest"));

        Instant instant = tickClock.instant();
    }

    public class ChessClock extends Clock implements Serializable{
        @Override
        public ZoneId getZone() {
            return ZoneOffset.UTC;
        }

        @Override
        public Clock withZone(ZoneId zone) {
            throw new UnsupportedOperationException("Not supported yet.");
        }


        public enum Player{
            LEFT,
            RIGHT
        }

        private static final long serialVersionUID = 1L;
        private Instant instantStart;
        private Instant instantLeft;
        private Instant instantRight;
        private long timeLeft;
        private long timeRight;
        private Player player;

        public ChessClock(Player player) {
            this.player = player;
        }

        public Instant gameStart(){
            if (this.instantStart == null){
                this.timeLeft = 0;
                this.timeRight = 0;
                this.instantStart = Instant.now();
                this.instantLeft = instantStart;
                this.instantRight = instantStart;
            }
            return instantStart;
        }

        public Instant gameEnd(){
            if (this.instantStart == null){
                instantStart = null;
                return Instant.now();
            }
            throw new IllegalStateException("Game not started");
        }

        @Override
        public Instant instant() {
            if(this.instantStart != null){
                if(player == Player.LEFT){
                    player = Player.RIGHT;

                    long secondsLeft = Instant.now().getEpochSecond() - instantRight.getEpochSecond();
                    Instant instantLeft = this.instantLeft.plusSeconds(secondsLeft - timeLeft);
                    timeLeft = secondsLeft;

                    return instantLeft;
                }else{
                     player = Player.LEFT;

                    long secondsRight = Instant.now().getEpochSecond() - instantLeft.getEpochSecond();
                    instantRight = instantRight.plusSeconds(secondsRight - timeRight);
                    timeRight = secondsRight;

                    return instantRight;
                }
            }
            throw new IllegalStateException("Game not started");
        }
    }
}
