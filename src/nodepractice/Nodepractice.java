/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodepractice;

/**
 *
 * @author appzone
 */
public class Nodepractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Node nodeA = new Node();
        nodeA.input = 4;
        
        
        Node nodeB = new Node();
        nodeB.input = 3;
        
        Node nodeC = new Node();
        nodeC.input = 7;
        
        Node nodeD = new Node();
        nodeD.input = 8;
        
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        // TODO code application logic here
        System.out.println(listLength(nodeA));
        System.out.println(listLength(nodeB));
        System.out.println(listLength(nodeC));
        System.out.println(listLength(nodeD));
    }
    
    static int listLength(Node node){
        int length = 0;// used to increase count of number of linked nodes
        Node temp = node; // used to hold current node e.g temp = nodeA, nodeA is the current node we want to analyze
        while(temp!= null){ // if current node does not reference null
            length++;  // increase the count or start counting the links till you get to null
            temp = temp.next; // the next linked node becomes the current node till it reaches null
            //node.node = null;
            
        }
        return length; // return the amount of linked nodes
    
    }
    
}
