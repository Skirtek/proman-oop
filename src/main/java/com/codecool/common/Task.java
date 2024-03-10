package com.codecool.common;

import com.codecool.enums.Status;

import java.time.LocalDateTime;

public class Task {
    private String title;
    private String description;
    private int estimatedDays;
    private Status status;
    private Author author;
    private LocalDateTime creationDateTime;

    public Task(String title, String description, int estimatedDays, Author author) {
        this.title = title;
        this.description = description;
        this.estimatedDays = estimatedDays;
        this.author = author;

        this.status = Status.NEW;
        this.creationDateTime = LocalDateTime.now();
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getEstimatedDays() {
        return estimatedDays;
    }

    public Status getStatus() {
        return status;
    }

    public Author getAuthor() {
        return author;
    }

    public LocalDateTime getCreationDateTime() {
        return creationDateTime;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", estimatedDays=" + estimatedDays +
                ", status=" + status +
                ", author=" + author +
                ", creationDateTime=" + creationDateTime +
                '}';
    }
}
