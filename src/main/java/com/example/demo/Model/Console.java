package com.example.demo.Model;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "Console")
public class Console {

    //MEM VARS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String manuCompany;
    private String releaseDate;

    //CONSTRUCTOR
    public Console(Long id, String name, String manuCompany, String releaseDate) {
        this.id = id;
        this.name = name;
        this.manuCompany = manuCompany;
        this.releaseDate = releaseDate;
    }

    //GETTERS AND SETTERS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManuCompany() {
        return manuCompany;
    }

    public void setManuCompany(String manuCompany) {
        this.manuCompany = manuCompany;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
