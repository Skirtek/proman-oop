package com.codecool;

import com.codecool.common.Author;
import com.codecool.common.Board;
import com.codecool.common.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Proman {
    public static void main(String[] args) {
        //Board mainBoard = new Board();

        // Singleton test
        Board mainBoard = Board.getMainBoard();
        System.out.println(mainBoard);

        Board anotherBoard = Board.getMainBoard();
        System.out.println(anotherBoard);

        Author defaultAuthor = new Author(1, "Default User", "default@proman.pl");
        Author anotherAuthor = new Author(2, "Another user", "author@proman.pl");

        List<Author> authors = new ArrayList<>();
        authors.add(defaultAuthor);
        authors.add(anotherAuthor);

        System.out.println("---------------------------------------------------");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter task title:");
        String title = scanner.nextLine();
        System.out.println(title);

        System.out.println("Enter task description:");
        String description = scanner.nextLine();
        System.out.println(description);

        System.out.println("Enter task estimation:");
        int estimation = scanner.nextInt();
        System.out.println(estimation);

        System.out.println("Select author:");

        int iterator = 0;

        for (Author author : authors) {
            iterator++;
            System.out.println((iterator) + ": " + author);
        }

        // CTRL + SHIFT + /
/*        for (int i = 0; i < authors.size(); i++) {
            System.out.println((i + 1) + ": " + authors.get(i));
        }*/

        int authorId = scanner.nextInt();

        Author selectedAuthor = authors.get(authorId - 1);

        Task task = new Task(title, description, estimation, selectedAuthor);

        mainBoard.addNewTask(task);
        mainBoard.showAllTasks();
    }
}