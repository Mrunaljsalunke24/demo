package com.master.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "master")
@Getter
@Setter
@ToString
public class MasterEntity {
    @Id
    String masterId;
    String masterName;
    String masterValue;
    String masterData;
}
