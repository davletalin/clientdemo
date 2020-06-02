package kz.davletalin.fibo.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "request")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "time")
    private LocalDateTime dateTime;
    @Column(name = "fiboindex")
    private long fiboIndex;
    @Column(name = "fibovalue")
    private String fiboValue;
    @Column(name = "status")
    private Status status;

    public Request() {
    }

    public Request(LocalDateTime dateTime, long fiboIndex, String fiboValue, Status status) {
        this.dateTime = dateTime;
        this.fiboIndex = fiboIndex;
        this.fiboValue = fiboValue;
        this.status = status;
    }

    public Request(LocalDateTime dateTime, int fiboIndex, int i, Status success) {
        this.dateTime = dateTime;
        this.fiboIndex = fiboIndex;
        this.fiboValue = fiboValue;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }



    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
