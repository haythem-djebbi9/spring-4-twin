package com.example.spring1.entities;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;
@Entity
public class Calls
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long callsId ;
    private LocalDateTime callTime ;
    private String callnumber ;
  //  private Set<Skills> requiredSkills ;

    @Enumerated(EnumType.STRING)
    private callStatus status ;
}
