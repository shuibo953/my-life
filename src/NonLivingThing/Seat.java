package NonLivingThing;

import java.util.Scanner;

public class Seat {

    private boolean isBroken = false;
    private boolean inUse = false;

    /**
     *
     * @return the seat whether could place thing on it or not
     */
    public boolean isVariable() {
        return !isBroken && !inUse;
    }

    /**
     * the seat be destroyed by external force, so change the seat's state(isBroken) from good to broken
     */
    public void destroy() {
        assert !this.isBroken : "the seat is destroyed already, so cannot destroy again";
        this.isBroken = true;
    }

    /**
     * place thing to seat todo: make show how assert work
     */
    public void addBurden() {
        assert !this.isBroken : "the seat is destroyed, so cannot place thing to it";
        assert !this.inUse : "the seat is place, so cannot place thing to it";
        this.inUse = true;
    }

    /**
     * clean thing from seat
     */
    public void reduceBurden() {
        assert !this.isBroken && this.inUse;
        this.inUse = false;
    }

}
