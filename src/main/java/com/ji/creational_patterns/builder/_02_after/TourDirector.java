package com.ji.creational_patterns.builder._02_after;

import com.ji.creational_patterns.builder._01_before.TourPlan;

import java.time.LocalDate;

public class TourDirector {

    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder){
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan cancunTrip(){
        return tourPlanBuilder.title("칸쿤 여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2022, 12, 9))
                .whereToStay("리조트")
                .addPlan(0, "체크인학고 짐 풀기")
                .addPlan(0, "저녁 식사")
                .getPlan();

    }

    public TourPlan longBeachTrip(){
        return tourPlanBuilder.title("롱비치")
                .startDate(LocalDate.of(2022, 7, 15))
                .getPlan();
    }
}

