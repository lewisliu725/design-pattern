package com.lelib.designpattern.behavior.strategy.sortedlist;

import java.util.List;
import java.util.Objects;

public class SortedList {
    private List<String> items;
    private SortStrategy sortStrategy;

    public SortedList(List<String> items, SortStrategy sortStrategy) {
        this.items = items;
        this.sortStrategy = sortStrategy;
    }

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void add(String item) {
        this.items.add(item);
    }

    public void remove(String item) {
        this.items.remove(item);
    }

    public void sort() {
        this.sortStrategy.sort(this.items);
    }
}
