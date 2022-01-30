package com.thealgorithms.maths;

/*
Finds the area of a parallelepiped when given 3 vectors using the properties of the triple product.
 */

public class VectorVolume {

    public static double volume(int[] V, int[] W, int[] U)
    {
        int[] temp = {0,0,0};
        temp[0] = (V[1] * W[2]) - (V[2]*W[1]);
        temp[1] = (V[2] * W[0]) - (V[0]*W[2]);
        temp[2] = (V[0] * W[1]) - (V[1]*W[0]);


        return Math.abs(temp[0]*U[0] + temp[1]*U[1] + temp[2]*U[2]);
    }
}
