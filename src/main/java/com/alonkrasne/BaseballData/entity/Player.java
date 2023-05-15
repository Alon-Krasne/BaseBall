package com.alonkrasne.BaseballData.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "player")
@Data
public class Player {

    @Id
    @CsvBindByName()
    private String playerID;

    @Column(name = "birth_year")
    @CsvBindByName()
    private int birthYear;

    @Column(name = "birth_month")
    @CsvBindByName()
    private int birthMonth;

    @Column(name = "birth_day")
    @CsvBindByName()
    private int birthDay;

    @Column(name = "birth_country")
    @CsvBindByName()
    private String birthCountry;

    @Column(name = "birth_state")
    @CsvBindByName()
    private String birthState;

    @Column(name = "birth_city")
    @CsvBindByName()
    private String birthCity;

    @Column(name = "death_year")
    @CsvBindByName()
    private Integer deathYear;

    @Column(name = "death_month")
    @CsvBindByName()
    private Integer deathMonth;

    @Column(name = "death_day")
    @CsvBindByName()
    private Integer deathDay;

    @Column(name = "death_country")
    @CsvBindByName()
    private String deathCountry;

    @Column(name = "death_state")
    @CsvBindByName()
    private String deathState;

    @Column(name = "death_city")
    @CsvBindByName()
    private String deathCity;

    @Column(name = "name_first")
    @CsvBindByName()
    private String nameFirst;

    @Column(name = "name_last")
    @CsvBindByName()
    private String nameLast;

    @Column(name = "name_given")
    @CsvBindByName()
    private String nameGiven;

    @Column(name = "weight")
    @CsvBindByName()
    private int weight;

    @Column(name = "height")
    @CsvBindByName()
    private int height;

    @Column(name = "bats")
    @CsvBindByName()
    private String bats;

    @Column(name = "throws")
    @CsvBindByName()
    @JsonProperty("throws")
    private String throws_;

    @Column(name = "debut")
    @CsvBindByName()
    @CsvDate("yyyy-MM-dd")
    private LocalDate debut;

    @Column(name = "final_game")
    @CsvBindByName()
    @CsvDate("yyyy-MM-dd")
    private LocalDate finalGame;

    @Column(name = "retro_id")
    @CsvBindByName()
    private String retroID;

    @Column(name = "bbref_id")
    @CsvBindByName()
    private String bbrefID;
}
