package com.array;

import java.util.Arrays;
import java.util.Scanner;

class mergesortedarray
{

    public static void merge(int[] X, int[] Y)
    {
        int m = X.length;
        int n = Y.length;


        for (int i = 0; i < m; i++)
        {

            if (X[i] > Y[0])
            {

                int temp = X[i];
                X[i] = Y[0];
                Y[0] = temp;

                int first = Y[0];
                int k;
                for (k = 1; k < n && Y[k] < first; k++) {
                    Y[k - 1] = Y[k];
                }

                Y[k - 1] = first;
            }
        }
    }

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] X = new int[n];
        int[] Y = new int[m];
        for (int i=0;i<n;i++)
        {
            X[i] = sc.nextInt();
        }
        for (int j =0;j<m;j++)
        {
            Y[j] = sc.nextInt();
        }
        merge(X, Y);

        System.out.println("X: " + Arrays.toString(X));
        System.out.println("Y: " + Arrays.toString(Y));
    }
}
