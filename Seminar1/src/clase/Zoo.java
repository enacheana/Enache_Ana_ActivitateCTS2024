package clase;

import java.util.HashMap;
import java.util.Map;

public class Zoo {

    private String name;
    private ZooKeeper zooKeeper;
    private Map<Animal, String> animals;

    public void feedAllAnimals(){
        for(var a:animals.entrySet()){
            zooKeeper.feedAnimal(a.getKey(), a.getValue());
        }
    }

    public Zoo(String name, ZooKeeper zooKeeper, Map<Animal, String> animals) {
        this.name = name;
        this.zooKeeper = zooKeeper;
        this.animals = animals;
    }

    public void adaugaAnimal(Animal animal, String food){
        if(animals==null){
            animals=new HashMap<>();
        }
        animals.put(animal, food);
    }
}
