package pl.jana.bilety.event;

import java.util.Date;
import lombok.Data;

@Data
public class Event {
    private int id;
    private String name;
    private Date date;
    // inne pola i metody dostępowe
}