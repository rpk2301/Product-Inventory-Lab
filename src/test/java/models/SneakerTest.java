package models;

import org.junit.Assert;
import org.junit.Test;
import services.SneakerService;

public class SneakerTest {

    @Test
    public void testSetName()
    {
        Sneaker sneaker = new Sneaker();
        sneaker.setName("Paul");
        String actual =  sneaker.getName();
        String expected = "Paul";
        Assert.assertEquals(expected,actual);
    }
    @Test // (1)
    public void constructorTest(){

        // (2)
        int expectedId = 6;
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennnis";
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        // (3)
        Sneaker testSneaker = new Sneaker(expectedId, expectedName, expectedBrand,
                expectedSport, expectedQty,expectedPrice);

        // (4)
        Assert.assertEquals(expectedId, testSneaker.getId());
        Assert.assertEquals(expectedName, testSneaker.getName());
        Assert.assertEquals(expectedBrand, testSneaker.getBrand());
        Assert.assertEquals(expectedSport, testSneaker.getSport());
        Assert.assertEquals(expectedQty, testSneaker.getQty());
        Assert.assertEquals(expectedPrice, testSneaker.getPrice(),0.01);
    }


    @Test
    public void createTest(){

        // (1)
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennis";
        float expectedSize = 10.5F;
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        // (2)
        SneakerService sneakerService = new SneakerService();
        Sneaker testSneaker = sneakerService.create(expectedName, expectedBrand,
                expectedSport, expectedSize, expectedQty, expectedPrice);

        // (3)
        int actualId = testSneaker.getId();
        String actualName = testSneaker.getName();
        String actualBrand = testSneaker.getBrand();
        String actualSport = testSneaker.getSport();
        float actualSize = testSneaker.getSize();
        int actualQty = testSneaker.getQty();
        float actualPrice = testSneaker.getPrice();

        // (4)
        Assert.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBrand, actualBrand);
        Assert.assertEquals(expectedSport, actualSport);
        Assert.assertEquals(expectedSize, actualSize,0.01);
        Assert.assertEquals(expectedQty, actualQty);
        Assert.assertEquals(expectedPrice, actualPrice,0.01);

    }



}



