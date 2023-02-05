package com.example.workbook.ch2;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Date;

public class P51_ImmutableBuilder {

    public static final class User{
        private final String nickname;
        private final String password;
        private final String firstname;
        private final String lastname;
        private final String email;
        private final Date created;

        public User(UserBuilder builder) {
            this.nickname = builder.nickname;
            this.password = builder.password;
            this.firstname = builder.firstname;
            this.lastname = builder.lastname;
            this.email = builder.email;
            this.created = builder.created;
        }

        public static UserBuilder getBuilder(String nickname, String password){
            return new UserBuilder(nickname, password);
        }
    }
    public static final class UserBuilder{
        @NotNull(message = "Nickname cannot be null")
        @Size(min = 3, max = 20, message = "must be between 3 and 20 characters")
        private String nickname;

        @NotNull(message = "Password cannot be null")
        @Size(min = 6, max = 20, message = "must be between 6 and 20 characters")
        private String password;

        @Size(min = 3, max = 20, message = "must be between 3 and 20 characters")
        private String firstname;

        @Size(min = 3, max = 20, message = "must be between 3 and 20 characters")
        private String lastname;

        @Email(message = "must be a valid email address")
        private String email;

        private final Date created;

        public UserBuilder(String nickname, String password) {
            this.nickname = nickname;
            this.password = password;
            this.created = new Date();
        }

        public UserBuilder firstname(String firstname){
            this.firstname = firstname;
            return this;
        }

        public UserBuilder lastname(String lastname){
            this.lastname = lastname;
            return this;
        }

        public UserBuilder email(String email){
            this.email = email;
            return this;
        }

        public UserBuilder created(Date created){
            this.created = created;
            return this;
        }

        public User build(){
            return new User(this);
        }

        public String getNickname() {
            return nickname;
        }

        public String getPassword() {
            return password;
        }

        public String getFirstname() {
            return firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public String getEmail() {
            return email;
        }

        public Date getCreated() {
            return created;
        }
    }

    public void playground(){
        User user1 = User.getBuilder("marin", "hjjuhj").build();

        User user2 = User.getBuilder("ionk", "44f2f22")
                .email("ion@gmail.com")
                .build();

        User user3 = User.getBuilder("monika", "klooi0988")
                .email("monika@gmail.com")
                .firstname("Monika")
                .lastname("Mihai")
                .build();
    }
}
