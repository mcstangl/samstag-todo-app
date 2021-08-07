package de.weekendsession.samstagtodoapp.model;

import de.weekendsession.samstagtodoapp.enums.Status;

import java.util.Objects;

public class TodoItem {

    private String id;
    private String title;
    private String description;
    private String timestamp;
    private Status status;

    public TodoItem(String id, String title, String description, String timestamp, Status status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.timestamp = timestamp;
        this.status = status;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoItem todoItem = (TodoItem) o;
        return Objects.equals(id, todoItem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", status=" + status +
                '}';
    }
}
