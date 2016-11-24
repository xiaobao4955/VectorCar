package hu.pendroid.dnga.vectorcar.view;

import android.graphics.Canvas;

import com.adrianrobotka.brick.Drawer;

import hu.pendroid.dnga.vectorcar.model.Car;

public class CarDrawer extends Drawer {
    private Car car;
    /**
     * Create Drawer and add itself to the Storage
     *
     * @param car The Car to draw
     */

    public CarDrawer(Car car) {
        super(car);
    }
    @Override
    public void draw(Canvas canvas) {

    }
}
