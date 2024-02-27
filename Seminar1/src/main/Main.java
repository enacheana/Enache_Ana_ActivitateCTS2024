package main;

import clase.*;

import java.util.HashMap;

public class Main {
    public enum FeedType{
        OMNIVORE, HERBIVORE, CARNIVORE
    }
    public static void main(String[] args) {
        ZooKeeper zooKeeper=new ZooKeeper("Ion");
        Zoo zoo=new Zoo("Zoo", zooKeeper, new HashMap<>());

        Animal anotherAnimal=new Zebra("Marty ", 21);

        zoo.adaugaAnimal(anotherAnimal, "grass");
        zoo.adaugaAnimal(new Lion("Simba ", 10), "Marty");
        zoo.adaugaAnimal(new Pisica("Thomas ", 5), "pliculet");

        zoo.feedAllAnimals();

        FeedType feedType=FeedType.CARNIVORE;

    }
}