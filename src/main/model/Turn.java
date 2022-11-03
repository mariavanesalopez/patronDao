package main.model;

import java.time.LocalDateTime;

public class Turn {
    private Integer id;
    private LocalDateTime DateTime;
    private Boolean confirmDate;


    public Turn() {
    }

    public Turn(Integer id, LocalDateTime dateTime, Boolean confirmDate) {
        this.id = id;
        this.DateTime = dateTime;
        this.confirmDate = confirmDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDateTime() {
        return DateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        DateTime = dateTime;
    }

    public Boolean getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(Boolean confirmDate) {
        this.confirmDate = confirmDate;
    }
}
