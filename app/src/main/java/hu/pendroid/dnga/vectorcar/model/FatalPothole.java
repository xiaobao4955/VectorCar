package hu.pendroid.dnga.vectorcar.model;

import com.adrianrobotka.brick.Vector;

/**
 * The fatal pothole that causes game over
 */
public final class FatalPothole extends LaneModel {
    public FatalPothole(int lane) {
        super(lane);
        position = calculatePositionByLane(lane);
        metrics = new Vector(1, 1);
        motion = new Vector(0, 0);
    }

    private Vector calculatePositionByLane(int lane) {
        //TODO implement this
        return null;
    }
}
