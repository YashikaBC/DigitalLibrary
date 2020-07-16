package com.trust.Samarthanam.DigitalLibrary.Controller;

import com.opencsv.exceptions.CsvException;
import com.trust.Samarthanam.DigitalLibrary.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public ResponseEntity<List> getAllbooks() throws IOException, CsvException {
        return ResponseEntity.ok().body(BookService.bookList());
    }
    @GetMapping("/books/{key}")
    public ResponseEntity<ArrayList> getBook(@PathVariable String key) throws IOException, CsvException {
        return ResponseEntity.ok().body(BookService.findBook(key));
    }


}
