package com.example.lamp.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Paper {
    int idx;
    String title;
    String guidename;
    String prayname;
    String respname;
    String offername;
    String ccm1;
    String ccm2;
    String ccm3;
    String ccm4;
    String resp;
    String long_label;
    int chapter;
    int paragraph;
    int start;
    int fin;
    String notice;
    String notice1;
    String notice2;
    String notice3;
    String speachname;
    String nprayname;
    String nrespname;
    String noffername;
    Date createdAt;
}
