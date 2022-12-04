package com.example.reviewer.search;

import lombok.Data;

import java.util.List;

@Data
public class SearchResult {

    private int numFound;
    private List<SearchResultBook> docs;

}
