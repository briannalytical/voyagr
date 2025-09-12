package com.briannalytical.Voyagr.Models;

import java.time.LocalDate;
import java.util.List;

public class Days {

    private LocalDate beginDate;
    private LocalDate endDate;
    private List<LocalDate> individualDate;

    public Days(LocalDate beginDate, LocalDate endDate, List<LocalDate> individualDate) {
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.individualDate = individualDate;
    }
}


