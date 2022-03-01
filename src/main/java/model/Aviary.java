package model;
import animals.Animal;

import java.util.HashMap;

public class Aviary <R extends Animal> {


    private Size size;//Добавить в класс Aviary поле Size size
    public Size getSize(){return size;}

    // и конструктор с одним параметром, иницилизирующим данное поле.
    public Aviary (Size size){
        this.size=size;
    }

    //Для хранения животных в классе Aviary добавить поле HashMap<>.
    // В качестве ключа использовать уникальный идентификатор
    // (имя животного, name), а в качестве значения использовать
    // животное - объект того же типа, который используется
    // в класс Aviary (универсальный параметр).
    // Сразу проинициализировать поле пустой коллекцией.

    private HashMap <String, R> aviaryMap = new HashMap<>();

  //  addAnimal - добавить животное в вольер (метод принимает объект
  //  животного с соответствующим вольеру типом);
    public void addAnimal(R animal){
        if (size.equals(animal.getSize())){
            aviaryMap.put(animal.getName(), animal);}
        else {
            throw new WrongSizeException("WrongFoodException");}
        }

        //getAnimal - получить ссылку на животное в вольере по name,
        // тип возвращаемого значения должен соответствовать
        // универсальному параметру обобщенного класса;

        public R getAnimal (String name){
        R animal= aviaryMap.get(name);
            System.out.println(animal);
            return animal;
        }

        //removeAnimal - удалить животное из вольера по name, вернуть
        // boolean в зависимости от того было ли указанное животное в вольере;
        public boolean removeAnimal(String name){
        if (aviaryMap.containsKey(name)) {
            aviaryMap.remove(name);
            return true;
        }else {
            return false;
             }

        }

    }

