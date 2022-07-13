package com.epam.rd.autotasks;

public class HalvingCarousel extends DecrementingCarousel {

    public HalvingCarousel(final int capacity) {
        super(capacity);
    }

    @Override
    public int nextResult(){
        if (currentPosition >= capacity)
            currentPosition = 0;

        while (values[currentPosition]==0){
            currentPosition++;
            if (currentPosition >= capacity)
                currentPosition = 0;
        }
        int temp = values[currentPosition];
        values[currentPosition]=values[currentPosition++]/2;
        return temp;
    }
}
