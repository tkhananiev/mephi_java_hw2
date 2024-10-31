package ru.mephi.hw2;

public class YandexWeatherApi {
    public String now_dt;
    public Fact fact;
    public Info info;
    public Forecasts[] forecasts;

    static class Forecasts {
        public String sunrise;
        public Parts parts;
        static class Parts {
            public Day day;
            static class Day {
                public String temp_avg;
            }
        }
    }
    static class Info {
        public Tzinfo tzinfo;
        static class Tzinfo {
            public String name;
        }
    }
    static class Fact {
        public String temp;
    }
}
