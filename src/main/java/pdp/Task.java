package pdp;

import java.time.LocalDate;

public class Task {
    private String title;
    private String description;
    private boolean isCompleted;
    private LocalDate dueDate;

    public Task() {
    }

    public Task(String title, String description, boolean isCompleted, LocalDate dueDate) {
        this.title = title;
        this.description = description;
        this.isCompleted = isCompleted;
        this.dueDate = dueDate;
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

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", isCompleted=" + isCompleted +
                ", dueDate=" + dueDate +
                '}';
    }
}