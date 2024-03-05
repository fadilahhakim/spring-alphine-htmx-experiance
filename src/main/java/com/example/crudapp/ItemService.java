package com.example.crudapp;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    public List<Item> generateDummyData(int count) {
        List<Item> items = new ArrayList<>();

        for(int i = 1; i<= count; i++) {
            Item item = new Item();
            item.setId((long)i);
            item.setName("item" + i);
            items.add(item);
        }

        return items;
    }
}
