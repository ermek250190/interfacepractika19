package com.company;

import org.w3c.dom.ls.LSOutput;

public abstract class AbstractMammal extends AbstractAnimals{
//    Supers the constructor of the Animals
//    Interface AnimalsInterface:
//    String food();   //потребление еды
//    String tasksRequired();// ар сезондо эмне кылаарын коргозуп берет
//    Double dailyNorm();//дневная норма пищи
//    Boolean huntForFood();//охота  за едой


    public AbstractMammal(double height, int weight, String location, String timeOfday, String season, String gender) {
        super(height, weight, location, timeOfday, season, gender);
    }

    String food();

    String tasksRequired();
    Double dailyNorm();
    Boolean huntForFood();
}

