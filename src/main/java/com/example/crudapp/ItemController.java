package com.example.crudapp;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/items")
@AllArgsConstructor
public class ItemController {
    private ItemService itemService;

    @GetMapping
    public List<Item> getAllItems() {
        return itemService.generateDummyData(10);
    }
}
