package com.nectraker.autumn2021.ClassTask;

import com.nectraker.autumn2021.ClassTask.unit.Month;


public class Main {
    public static void main(String[] args) throws Exception {
        SeasonService seasonService = SeasonService.INSTANCE;

        seasonService.typeMonthtoData(Month.July);
        seasonService.typeMonthtoData(Month.May);
    }
}
