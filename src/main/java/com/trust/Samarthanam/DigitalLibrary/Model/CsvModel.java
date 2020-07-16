package com.trust.Samarthanam.DigitalLibrary.Model;

import com.opencsv.bean.CsvBindByName;

public class CsvModel {
    @CsvBindByName
    private String title;
    @CsvBindByName
    private String Author;
    @CsvBindByName
    private String subject;
    @CsvBindByName
    private long ISBN;


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return Author;
    }

    public String getSubject() {
        return subject;
    }

    public long getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return "CsvModel{" +
                "title='" + title + '\'' +
                ", Author='" + Author + '\'' +
                ", subject='" + subject + '\'' +
                ", ISBN=" + ISBN +
                '}';
    }
}


