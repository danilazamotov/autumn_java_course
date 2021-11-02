package com.nectraker.autumn2021.ClassTask;

import com.nectraker.autumn2021.ClassTask.unit.Month;
import com.nectraker.autumn2021.ClassTask.unit.Season;

import java.util.EnumMap;
import java.util.concurrent.Callable;

public enum SeasonService {
    INSTANCE;

    private EnumMap<Month, Callable<Season>> enumMap;

     SeasonService() {
        enumMap = new EnumMap<>(Month.class);
        for (Month month : Month.values()) {
            if (month.ordinal() < 3) {
                enumMap.put(month, () -> Season.Winter);
            }
            else if ((month.ordinal() <= 3) && (month.ordinal() < 6)) {
                enumMap.put(month, () -> Season.Spring);
            }
            else  if ((month.ordinal() <= 6) && (month.ordinal() < 9)) {
                enumMap.put(month, () -> Season.Summer);
            }
            else  if (month.ordinal() <= 9) {
                enumMap.put(month, () -> Season.Autumn);
            }
        }
    }

    void typeMonthtoData (Month month) throws Exception {
        Season season = enumMap.get(month).call();
        System.out.printf("Время года: %s, Описание: %s\n", season.name(),season.getDescription());

    }

}


