/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rdcit.oc.spy;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

/**
 *
 * @author sa841
 */
public class CarSpy {

    // Car car = new Car("carId", "carName");
    Car car = new Car();
    Car carSpy = spy(car);

    @Ignore
    @Test
    public void carSpyTest() {

        doReturn("RRRRR " + carSpy.getName()).when(carSpy).getName();
        doCallRealMethod().when(carSpy).getId();
        // doReturn("FINAL").when(carSpy).fMethod();
        //  doNothing().when(carSpy).setColor("red");
        doCallRealMethod().when(carSpy).setColor("red");
        when(carSpy.getId()).thenCallRealMethod();

        System.out.println(carSpy.getName());
        System.out.println("First call " + carSpy.getId());
        System.out.println("Second call" + carSpy.getId());

        carSpy.setColor("red");
        System.out.println("GGGGG" + carSpy.getColor());
    }

    @Ignore
    @Test
    public void test() {
        doReturn("First id").when(carSpy).setId("car id");
        doReturn("Second id").when(carSpy).setId("car id");
        System.out.println(" TEST " + carSpy.setId("car id"));
    }

    @Test
    public void test2() {
        System.out.println("########## When do Test ########");
        when(carSpy.setId("id")).thenReturn("Cahnged id");
        System.out.println(carSpy.setId("id"));
        System.out.println(carSpy.getId());
    }

    @Test
    public void test3() {
        System.out.println("########## do whenn Test ########");
        doReturn("Changed test3 ").when(carSpy).setId("id3");
         System.out.println(carSpy.setId("id3"));
        System.out.println(carSpy.getId());
    }

    public void verificatrion() {
        System.out.println("************ VERIFICATION");

        System.out.println(carSpy.getName());
        System.out.println(carSpy.getId());
        System.out.println(carSpy.getId());
        System.out.println(carSpy.getColor());
    }

    public static void main(String args[]) {
        Result result = JUnitCore.runClasses(CarSpy.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.getMessage());
        }
        System.out.println(result.wasSuccessful());
        CarSpy c = new CarSpy();
        c.verificatrion();
    }

}
