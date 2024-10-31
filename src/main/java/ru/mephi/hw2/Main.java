package ru.mephi.hw2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Введите Широту: (например: 40.714627 (широта Нью-Йорка))");
            String lat = scanner.nextLine();
            System.out.println("Введите Долготу: (например: -74.002863 (долгота Нью-Йорка))");
            String lon = scanner.nextLine();
            System.out.println("Введите количество дней, за которое необходимо получить среднее арифметическое температуры: (например 5)");
            Integer limit = scanner.nextInt();
            YandexWeather weather = new YandexWeather(lat, lon, limit);
            System.out.println("Широта: " + lat + " Долгота: " + lon + " Количество дней: " + limit);
            System.out.println("Температура в населенном пункте " + weather.getLocation() + ": " + weather.getTemp() + "° по Цельсию");
            System.out.println("Средняя температура в дневное время за " + limit + " дня/дней: " + weather.getForecastsAvg() + "° по Цельсию");
        }

        catch (InputMismatchException e){
            System.out.println("Некорректный ввод. Попробуйте еще раз!");
        }

    }
}