package com.bridgelabz.datastructuretest;

import com.bridgelabz.datastructure.INode;
import com.bridgelabz.datastructure.MyNode;
import com.bridgelabz.datastructure.MyStack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackTest {

    @Test
    public void given3Numbers_WhenAddedToStack_ShouldHaveLastAddedNode() {
        MyStack myStack = new MyStack();
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        INode peak = myStack.peak();
        myStack.printStack();
        Assertions.assertEquals(myThirdNode, peak);
    }
}