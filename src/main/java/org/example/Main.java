package org.example;

public class Main {
        public static void main(String[] args) {
            Post post = new Post();
            post.name = "Иван";
            post.surname = "Иванов";
            post.patronymic = "Иванович";
            post.phone = "+79999999999";
            post.passport = "4444 # 44444444";
            post.subscription = true;
            post.birthday = new FormDate();
            post.birthday.day = 13;
            post.birthday.month = 6;
            post.birthday.year = 1999;
        }
}