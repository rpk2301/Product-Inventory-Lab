package services;

import models.Sneaker;
import org.junit.Assert;
import org.junit.Test;

public class SneakerServiceTest {

    @Test
    public void FindAllTest(){
        SneakerService service = new SneakerService();
        service.inventory.add(service.create("Lebron","James","LeShoes",12.3F,1,19.99F));
        Sneaker[] test = service.findAll();
        Assert.assertEquals(test[0],service.getInventory().get(0));

    }
}
