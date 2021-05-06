package com.myapplicationdev.android.demodatabase;

public class Task {
    private int _id;
    private String description;
    private String date;

    public Task(int _id, String description, String date) {
        this._id = _id;
        this.description = description;
        this.date = date;
    }

    public int get_id() {
        return _id;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

}
