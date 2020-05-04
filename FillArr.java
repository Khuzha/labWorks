package com.khuzha.objects;

public class FillArr {
    public float[] fill(int count) {
        float arr[] = new float[count];

        for (int i = 0; i < count; i++) {
            arr[i] = (float)(1 / (Math.pow(i, 5) + 3));
        }

        return arr;
    }
}
