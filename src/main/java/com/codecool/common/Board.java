package com.codecool.common;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private static Board mainBoard;

    private static int boardAmount = 1;

    private int boardId;

    private List<Task> tasksList = new ArrayList<>();

    private Board() {
        boardId = boardAmount;

        boardAmount++;
    }

    public int getBoardId() {
        return boardId;
    }

    public List<Task> getTasksList() {
        return tasksList;
    }

    public void addNewTask(Task task) {
        tasksList.add(task);
    }

    public void removeTask(Task task) {
        tasksList.remove(task);
    }

    public void showAllTasks() {
        for (Task task : tasksList) {
            System.out.println(task);
        }
    }

    public static Board getMainBoard() {
        if (mainBoard == null) {
            mainBoard = new Board();
        }

        return mainBoard;
    }
}
