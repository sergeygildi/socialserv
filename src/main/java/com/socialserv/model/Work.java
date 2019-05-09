package com.socialserv.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Work {

    public static final int START_SEQ = 100000;

    @Id
    @SequenceGenerator(name = "global_seq", sequenceName = "global_seq", allocationSize = 1, initialValue = START_SEQ)
    private Integer id;

    private int price;

    private LocalDateTime registerTime;



}
