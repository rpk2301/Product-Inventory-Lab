package services;

import models.Sneaker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SneakerService {
    private static int nextId = 1;

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        SneakerService.nextId = nextId;
    }

    public List<Sneaker> getInventory() {
        return inventory;
    }

    public void setInventory(List<Sneaker> inventory) {
        this.inventory = inventory;
    }

    List<Sneaker> inventory = new ArrayList<Sneaker>();

    public SneakerService()
    {

    }

    public Sneaker findSneaker(int id)
    {
        for(Sneaker s: inventory)
        {
            if(id == s.getId())
                return s;
        }
        return null;
    }

    public Sneaker[] findAll()
    {
       return inventory.toArray(new Sneaker[inventory.size()]);
    }

    public boolean delete(int id)
    {
        for(Sneaker s: inventory)
        {
            if(id == s.getId()) {
                inventory.remove(s);
                return true;
            }
        }
        return false;
    }


    public  Sneaker create(String name, String brand, String sport, float size, int quantity, float price) {

        // (2)
        Sneaker createdSneaker = new Sneaker(nextId++, name, brand, sport, size, quantity, price);

        // (3)
       inventory.add(createdSneaker);

        // (4)
        return createdSneaker;
    }

}
