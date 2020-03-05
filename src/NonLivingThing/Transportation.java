package NonLivingThing;

import LivingThing.Life;

public class Transportation {
    private int maxFreeWeight;
    private Seat[] seats;
    private Life[] lives;
    private int passengersOnBoard;
    private boolean canAddMorePassenger;
    private int currentPassengers() {
        return this.passengersOnBoard;
    }

}
