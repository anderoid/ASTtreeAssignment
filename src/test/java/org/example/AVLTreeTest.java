package org.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AVLTreeTest {

    @Test
    public void emptyTreeTest() {
        AVLTree tree = new AVLTree();
        Assert.assertTrue(tree.height() == -1);
    }
    @Test
    public void emptyTreeWith2InsertsShouldGiveHeight1() {
        AVLTree tree = new AVLTree();
        int[] intArray = new int[]{-1, 34};

        for (int i : intArray) {
            tree.insert(i);
        }
        assertEquals(1, tree.height());
    }

    @Test
    public void treeIsAVLEvenAfterInsertion2Items() {
        AVLTree tree = new AVLTree();
        int[] intArray = new int[]{-1, 34};

        for (int i : intArray) {
            tree.insert(i);
        }
        Assert.assertTrue(isAdelsonCheck(tree));
    }


    @Test
    public void treeShouldBeAVLEvenAfterDeletion() {
        AVLTree tree = new AVLTree();

        for (int i = 0; i < 6; i++) {
            tree.insert(i);
        }
        tree.delete(3);
        Assert.assertTrue(isAdelsonCheck(tree, tree.getRoot()));
    }


    @Test
    public void duplicateExceptionTest() {
        AVLTree tree = new AVLTree();

        tree.insert(2);
        try {
            tree.insert(2);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "duplicate Key!");
        }
    }


    @Test
    public void insertGoodLeftCoverRight() {
        AVLTree tree = new AVLTree();

        int[] intArray = new int[]{40, 20, 10, 25, 30, 22, 50};

        for (int i : intArray) {
            tree.insert(i);
        }

        Assert.assertTrue(isAdelsonCheck(tree, tree.getRoot()));

    }


    private boolean isAdelsonCheck(AVLTree tree) {
        return isAdelsonCheck(tree, tree.getRoot());
    }

    private boolean isAdelsonCheck(AVLTree tree, AVLTree.Node node) {
        if (node == null)
            return true;
        int b_factor = tree.getBalance(node);

        if (b_factor >= -1 && b_factor <= 1) {
            if (isAdelsonCheck(tree, node.left)) {
                return isAdelsonCheck(tree, node.right);
            }
            return false;
        } else {
            return false;
        }
    }


    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        java.lang.Class<?> wildcardClass5 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        java.lang.Class<?> wildcardClass7 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find(0);
        java.lang.Class<?> wildcardClass8 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.delete((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        java.lang.Class<?> wildcardClass6 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = node7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        aVLTree0.insert((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = node8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 1);
        aVLTree0.insert((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        int int4 = aVLTree0.height();
        org.example.AVLTree.Node node5 = null;
        int int6 = aVLTree0.getBalance(node5);
        org.example.AVLTree.Node node7 = null;
        int int8 = aVLTree0.getBalance(node7);
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 1);
        org.example.AVLTree.Node node9 = aVLTree0.find((-1));
        int int10 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        int int8 = aVLTree0.height();
        aVLTree0.delete((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 1);
        org.example.AVLTree.Node node9 = aVLTree0.find((-1));
        org.example.AVLTree.Node node10 = null;
        int int11 = aVLTree0.getBalance(node10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        int int7 = aVLTree0.height();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        aVLTree0.insert((int) (byte) -1);
        aVLTree0.delete((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete(10);
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (byte) -1);
        java.lang.Class<?> wildcardClass12 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        java.lang.Class<?> wildcardClass1 = aVLTree0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        aVLTree0.insert((int) 'a');
        aVLTree0.insert(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        int int7 = aVLTree0.height();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        org.example.AVLTree.Node node11 = aVLTree0.find(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        int int8 = aVLTree0.height();
        org.example.AVLTree.Node node9 = null;
        int int10 = aVLTree0.getBalance(node9);
        aVLTree0.insert((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree.Node node6 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.insert(100);
        aVLTree0.insert((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        aVLTree0.insert(0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) (short) 100);
        aVLTree0.delete(10);
        int int12 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        org.example.AVLTree.Node node9 = aVLTree0.getRoot();
        int int10 = aVLTree0.height();
        org.example.AVLTree.Node node11 = null;
        int int12 = aVLTree0.getBalance(node11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((-1));
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        org.example.AVLTree.Node node13 = aVLTree0.find((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        org.example.AVLTree.Node node8 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        int int7 = aVLTree0.height();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        aVLTree0.insert((int) (byte) -1);
        java.lang.Class<?> wildcardClass12 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node2 = aVLTree0.find((int) (short) 0);
        org.example.AVLTree.Node node4 = aVLTree0.find((-1));
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) (short) 100);
        aVLTree0.delete(10);
        org.example.AVLTree.Node node12 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        org.example.AVLTree.Node node6 = aVLTree0.find(10);
        int int7 = aVLTree0.height();
        org.example.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        org.example.AVLTree.Node node11 = aVLTree0.find(100);
        aVLTree0.delete((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.find(0);
        org.example.AVLTree.Node node9 = aVLTree0.find((int) (short) -1);
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        int int3 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete(10);
        org.example.AVLTree.Node node11 = aVLTree0.find((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.example.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 100);
        int int10 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node3 = aVLTree0.find((int) '#');
        org.example.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        org.example.AVLTree.Node node6 = aVLTree0.getRoot();
        org.example.AVLTree.Node node7 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = node7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        aVLTree0.insert((int) 'a');
        java.lang.Class<?> wildcardClass7 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        org.example.AVLTree.Node node4 = aVLTree0.find(1);
        aVLTree0.insert((int) (byte) 100);
        java.lang.Class<?> wildcardClass7 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.example.AVLTree aVLTree0 = new org.example.AVLTree();
        org.example.AVLTree.Node node1 = aVLTree0.getRoot();
        org.example.AVLTree.Node node2 = null;
        int int3 = aVLTree0.getBalance(node2);
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }


}