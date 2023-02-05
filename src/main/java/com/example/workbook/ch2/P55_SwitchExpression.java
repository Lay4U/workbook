package com.example.workbook.ch2;

public class P55_SwitchExpression {

    private Player createPlayer(PlayerTypes playerType) {
        switch (playerType) {
            case TENNIS:
                return new TennisPlayer();
            case FOOTBALL:
                return new FootballPlayer();
            case SNOOKER:
                return new SnookerPlayer();
            case UNKNOWN:
                throw new UnknownPlayerException("Unknown player type");
            default:
                throw new IllegalArgumentException("Invalid player type");
        }
    }

    private Player createPlayerSwitch(PlayerTypes playerType) {
        Player player = null;

        switch (playerType) {
            case TENNIS:
                player = new TennisPlayer();
                break;
            case FOOTBALL:
                player = new FootballPlayer();
                break;
            case SNOOKER:
                player = new SnookerPlayer();
                break;
            case UNKNOWN:
                throw new UnknownPlayerException("Unknown player type");
            default:
                throw new IllegalArgumentException("Invalid player type");
        }

        return player;
    }

    private Player createPlayerSwitchExpression(PlayerTypes playerType) {
        return switch (playerType) {
            case TENNIS ->  new TennisPlayer();
            case FOOTBALL -> new FootballPlayer();
            case SNOOKER -> new SnookerPlayer();
            case UNKNOWN -> throw new UnknownPlayerException("Unknown player type");
            default -> throw new IllegalArgumentException("Invalid player type");
        };
    }

    private SportType fetchSportTypeByPlayerType(PlayerTypes playerType){
        return switch(playerType){
            case UNKNOWN -> null;
            case TENNIS, GOLF, SNOOKER -> new Individual();
            case FOOTBALL, VOLLEY -> new Team();
        };
    }

    private Player createPlayer2(PlayerTypes playerType){
        return switch(playerType){
            case TENNIS -> {
                System.out.println("Creating tennis player");
                yield new TennisPlayer();
            }
            case FOOTBALL -> {
                System.out.println("Creating football player");
                yield new FootballPlayer();
            }
            case SNOOKER -> {
                System.out.println("Creating snooker player");
                yield new SnookerPlayer();
            }
            default -> throw new IllegalStateException("Unexpected value: " + playerType);
        };
    }


    public enum PlayerTypes {
        TENNIS,
        FOOTBALL,
        SNOOKER,
        UNKNOWN,
        GOLF,
        VOLLEY
    }

    public class Player {

    }

    public class TennisPlayer extends Player {

    }

    public class FootballPlayer extends Player {
    }

    private class SnookerPlayer extends Player {
    }

    private class UnknownPlayerException extends RuntimeException {
        public UnknownPlayerException(String unknownPlayerType) {

        }
    }

    private class SportType {
    }

    private class Individual extends SportType {
    }

    private class Team extends SportType {
    }
}
