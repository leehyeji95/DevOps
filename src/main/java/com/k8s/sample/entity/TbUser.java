package com.k8s.sample.entity;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;

@Data
@Getter
@Entity(name="tbuser")
public class TbUser {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)  // 기본키 (식별자)
    private int userCode;
    @Column(length=50, nullable = false)
    private String userId;
    @Column(length=50, nullable = false)
    private String userName;

}
