package com.nectraker.autumn2021.ClassTask.unit;

public enum Season {
    Summer("Отличная погода для прогулок"),
    Autumn("Все еще отличная погода, но стоит запастись чаем"),
    Winter("Отличная погода, чтобы сидеть дома и пить чай"),
    Spring("Ни тепло, ни холодно: можно гулять и пить чай");

    private String description;

    Season(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
