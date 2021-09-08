/*
 * Created by Osman Balci on 2021.5.19
 * Copyright © 2021 Osman Balci. All rights reserved.
 */
package edu.vt.controllers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "sliderController")
@RequestScoped

public class SliderController {

    // The List contains image filenames, e.g., photo1.png
    private List<String> listOfSliderImageFilenames;

    /*
    The PostConstruct annotation is used on a method that needs to be executed after
    dependency injection is done to perform any initialization. The initialization
    method init() is the first method invoked before this class is put into service.
    */
    @PostConstruct
    public void init() {
        listOfSliderImageFilenames = new ArrayList<>();

        for (int i = 1; i <= 12; i++) {
            listOfSliderImageFilenames.add("photo" + i + ".png");
        }
    }

    /*
    =============
    Getter Method
    =============
     */
    public List<String> getListOfSliderImageFilenames() {
        return listOfSliderImageFilenames;
    }

    /*
    ===============
    Instance Method
    ===============
     */
    public String description(String imageFilename) {

        String imageDescription = "";

        switch (imageFilename) {
            case "photo1.png":
                imageDescription = "Cagliari Sport";
                break;
            case "photo2.png":
                imageDescription = "Apple Watch and Health App";
                break;
            case "photo3.png":
                imageDescription = "Body Mass Index for Women";
                break;
            case "photo4.png":
                imageDescription = "Body Mass Index for Men";
                break;
            case "photo5.png":
                imageDescription = "Exercise for Good Health and Fitness";
                break;
            case "photo6.png":
                imageDescription = "Eat Fruits and Vegetables for Good Health";
                break;
            case "photo7.png":
                imageDescription = "A Weight Club Provides Exercise Equipment";
                break;
            case "photo8.png":
                imageDescription = "Apps Help You Lose Weight";
                break;
            case "photo9.png":
                imageDescription = "Blacksburg Health and Fitness at The Weight Club";
                break;
            case "photo10.png":
                imageDescription = "Fruits and Vegetables are Key for Good Health and Fitness";
                break;
            case "photo11.png":
                imageDescription = "Fitness Magazine";
                break;
            case "photo12.png":
                imageDescription = "An Apple a Day Keeps the Doctor Away!";
                break;
        }

        return imageDescription;
    }
}
