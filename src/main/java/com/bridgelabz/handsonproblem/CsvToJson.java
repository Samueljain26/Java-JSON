package com.bridgelabz.handsonproblem;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.File;
import java.util.List;
import java.util.Map;

public class CsvToJson {
    public static void main(String[] args) throws Exception {
        File csvFile = new File("Data.csv");

        CsvMapper csvMapper = new CsvMapper();
        CsvSchema csvSchema = CsvSchema.emptySchema().withHeader();

        MappingIterator<Map<String, String>> iterator =
                csvMapper.readerFor(Map.class).with(csvSchema).readValues(csvFile);

        List<Map<String, String>> data = iterator.readAll();

        ObjectMapper jsonMapper = new ObjectMapper();
        String json = jsonMapper.writeValueAsString(data);

        System.out.println(json);
    }
}
