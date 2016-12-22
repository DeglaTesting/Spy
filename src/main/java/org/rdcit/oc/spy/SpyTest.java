/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rdcit.oc.spy;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.mockito.InOrder;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author sa841
 */
@RunWith(MockitoJUnitRunner.class)
public class SpyTest {

    @Test
    public void test() {
        List list = new ArrayList();
        List spyList = spy(list);
        spyList.add("one");
        spyList.add("second");
        System.out.println(spyList.get(0));
        System.out.println(spyList.get(1));
        verify(spyList).add("second");
        InOrder inorder = inOrder(spyList);
        inorder.verify(spyList).add("one");
        inorder.verify(spyList).get(0);
    }

    public static void main(String args[]) {

        Result result = JUnitCore.runClasses(SpyTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.getMessage());
        }
        System.out.println(result.wasSuccessful());

    }

}
