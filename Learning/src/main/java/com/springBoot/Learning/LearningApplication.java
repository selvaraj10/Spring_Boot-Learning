package com.springBoot.Learning;

public class LearningApplication {

    public static void main(String[] args) {
//        ArrayL arrayL = new ArrayL();
//        PatternPrinting patternPrinting = new PatternPrinting();
//        int[] arr = {1, 1, 2, 2, -3,-2,3, 4,-2, 5};
//        int[] arr = {1,2};
//        System.out.println("First Largest number in Array = " + arrayL.firstLargeNumber(arr));
//        System.out.println("Second Largest number in Array = " + arrayL.secondLargestNumber(arr));
//        System.out.println("First Smallest number in Array = " + arrayL.smallestElement(arr));
//        System.out.println("Second Smallest number in Array = " + arrayL.secondSmallestNumber(arr));
//        System.out.println("Checking the array is shorted = " + arrayL.check(arr));
//        System.out.println("Duplicate count in Array = " + arrayL.duplicateElementCount(arr));
//        System.out.println("Duplicate count in Array = " + arrayL.duplicateElementCount(arr));
//        System.out.println("Rotate Array values = " + Arrays.toString(arrayL.rotateArrayOnePlace(arr, arr.length)));
//        patternPrinting.bigPattern();

        LinkedListL linkedListL = new LinkedListL(4);

        linkedListL.append(23);
        linkedListL.append(3);
        linkedListL.append(13);

        linkedListL.prepend(1);
        linkedListL.prepend(17);

        System.out.println("Get node at n Index -: " +  linkedListL.get(3).value);

        System.out.println("Removed node at first -: " + linkedListL.removeFirst().value);

        System.out.println("Removed node at last -: " + linkedListL.removeLast().value);

        System.out.println("Is value is set -: " +  linkedListL.set(1, 22));

        System.out.println("Is value is insert  -: " +  linkedListL.insert(3, 26));

        System.out.println("Is value is remove  -: " +  linkedListL.remove(3).value);

        linkedListL.reverse();

        linkedListL.getHead();
        linkedListL.getTail();
        linkedListL.getLength();
        linkedListL.printLst();
    }

}
