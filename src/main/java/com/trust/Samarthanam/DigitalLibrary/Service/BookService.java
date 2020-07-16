package com.trust.Samarthanam.DigitalLibrary.Service;
import com.fasterxml.jackson.databind.MappingIterator;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

@org.springframework.stereotype.Service
@Component
public class BookService {
    @Autowired
    private static String filename = "C:/Users/Yashika.Yashu-lappy/Downloads/DigitalLibrary/DigitalLibrary/src/main/resources/static/CsvModel.csv";

    public static List<String[]> bookList() throws IOException, CsvException {

        FileReader filereader = new FileReader(filename);
        CSVReader csvReader = new CSVReaderBuilder(filereader)
                .withSkipLines(1)
                .build();
        List<String[]> allData = csvReader.readAll();
        return allData;
    }

    public static ArrayList<String[]> findBook(String key) throws IOException, CsvException {
        FileReader filereader = new FileReader(filename);
        CSVReader csvReader = new CSVReaderBuilder(filereader)
                .withSkipLines(1)
                .build();
        List<String[]> allData = csvReader.readAll();
        String[] b = null;
        for (String[] book : allData)
            for (String s : book) {
                if (s.equals(key))
                    b = book;
            }
                ArrayList<String[]> a = new ArrayList<>();
                a.add(b);
    return a;

    }
}

