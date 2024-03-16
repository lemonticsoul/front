package com.swig.manda.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
public class MainTopic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String goal;
    // 기본 생성자


    @OneToMany(mappedBy = "mainTopic", cascade = CascadeType.ALL)
    private List<Detail> details;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;




}


