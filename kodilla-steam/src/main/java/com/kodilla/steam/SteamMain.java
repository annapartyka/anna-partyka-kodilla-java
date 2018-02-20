package com.kodilla.steam;

import com.kodilla.steam.beatifier.PoemBeautifier;
import com.kodilla.steam.book.Book;
import com.kodilla.steam.book.BookDirectory;
import com.kodilla.steam.forumuser.Forum;
import com.kodilla.steam.forumuser.ForumUser;
import com.kodilla.steam.iterate.NumbersGenerator;
import com.kodilla.steam.lambda.ExpressionExecutor;
import com.kodilla.steam.reference.FunctionalCalculator;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class SteamMain {
    public static void main(String[] args) {
//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//        System.out.println("Calculating expressions with lambdas");
//        expressionExecutor.executeExpression(10,5,(a,b)-> a + b);
//        expressionExecutor.executeExpression(10,5,(a,b)-> a - b);
//        expressionExecutor.executeExpression(10,5,(a,b)-> a * b);
//        expressionExecutor.executeExpression(10,5,(a,b)-> a / b);
//
//        System.out.println("Calculating expressions with method references");
//        expressionExecutor.executeExpression(3,4,FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3,4,FunctionalCalculator::subBFromA);
//        expressionExecutor.executeExpression(3,4,FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(3,4,FunctionalCalculator::divideAByB);
//
//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//        poemBeautifier.beautify("ABC ", " " , "ABC");
//
//
//        System.out.println("Using Stream to generate even numbers from 1 to 20");
//        NumbersGenerator.generateEven(20);

//        BookDirectory theBookDirectory = new BookDirectory();
//
//        Map<String, Book> theResultMaOfBooks = theBookDirectory.getList().stream()
//        .filter(book -> book.getYearOfPublication() > 2005)
//        .collect(Collectors.toMap(Book::getSignature, book -> book ));
//
//        System.out.println("# elements: " + theResultMaOfBooks.size());
//            theResultMaOfBooks.entrySet().stream()
//                    .map(entry->entry.getKey()+ ": " + entry.getValue())
//                    .forEach(System.out::println);
//            BookDirectory theBookDirectory = new BookDirectory();
//            String theResutStringOfBooks = theBookDirectory.getList().stream()
//                    .filter(book -> book.getYearOfPublication() > 2005)
//                    .map(Book::toString)
//                    .collect(Collectors.joining(",\n","<<", ">>"));
//        System.out.println(theResutStringOfBooks);

        Forum theForum = new Forum();
        Map<Integer, ForumUser> theMapOfForumUsers = theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getNumberOfPosts() >= 1)
                .filter(forumUser -> forumUser.getDateOfBirth().getDayOfYear() < 90)

                //tu dodać odfilrowanie tylko tych co mają co najmniej 20 lat
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

                theMapOfForumUsers.entrySet().stream()
                        .map(entry -> entry.getKey() + ": " + entry.getValue())
                        .forEach(System.out::println);



    }
}