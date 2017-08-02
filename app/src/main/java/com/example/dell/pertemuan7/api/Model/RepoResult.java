package com.example.dell.pertemuan7.api.Model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Asus on 01/08/2017.
 */

public class RepoResult implements Serializable {
    int totalCount;
    boolean incompleteResults;
    List<Item> items;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public boolean isIncompleteResults() {
        return incompleteResults;
    }

    public void setIncompleteResults(boolean incompleteResults) {
        this.incompleteResults = incompleteResults;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
