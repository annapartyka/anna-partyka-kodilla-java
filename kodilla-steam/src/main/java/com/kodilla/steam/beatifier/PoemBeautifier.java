package com.kodilla.steam.beatifier;

public class PoemBeautifier{
    public void beautify(String a, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(a);
        System.out.println(result);
    }
}

