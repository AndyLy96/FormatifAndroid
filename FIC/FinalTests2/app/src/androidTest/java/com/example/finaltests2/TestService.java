package com.example.finaltests2;

import org.junit.Assert;
import org.junit.Test;

public class TestService {


    @Test
    public void testPasVraimentUnTest() {
        // exemple d'utilisation du code, .
        Service service = new Service();
        int poignees = service.nombrePoigneesDeMainPour(350);
        System.out.println(poignees);
        // TODO pour qu'un test soit valide, il faut qu'il puisse échouer

//        Assert.assertEquals(0, service.nombrePoigneesDeMainPour(0));
//        Assert.assertEquals(1, service.nombrePoigneesDeMainPour(2));
//        Assert.assertEquals(6, service.nombrePoigneesDeMainPour(4));
    }

    @Test
    public void nombre1CorrectDePoigneOk() {
        Service service = new Service();
        Assert.assertEquals(0, service.nombrePoigneesDeMainPour(0));

    }

    @Test
    public void nombre2CorrectDePoigneOk() {
        Service service = new Service();
        Assert.assertEquals(6, service.nombrePoigneesDeMainPour(4));
    }

    @Test
    public void nombre3CorrectDePoigneOk() {
        Service service = new Service();
        Assert.assertEquals(1, service.nombrePoigneesDeMainPour(2));
    }

    @Test(expected = Exception.class)
    public void nombreIncorrectDePoigneKo() {
        Service service = new Service();
        Assert.assertEquals(3, service.nombrePoigneesDeMainPour(0));

    }

    @Test(expected = Exception.class)
    public void nombre2IncorrectDePoigneKo() {
        Service service = new Service();

        Assert.assertEquals(4, service.nombrePoigneesDeMainPour(4));
    }

    @Test(expected = Exception.class)
    public void nombre3IncorrectDePoigneKo() {
        Service service = new Service();

        Assert.assertEquals(2, service.nombrePoigneesDeMainPour(2));

    }

    @Test(expected = Exception.class)
    public void nombreImpoDePersonneKo() {
        Service service = new Service();
        int poignees = service.nombrePoigneesDeMainPour(-1);
        Assert.fail("impossible");
    }

}
