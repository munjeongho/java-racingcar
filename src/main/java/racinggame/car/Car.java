package racinggame.car;

import racinggame.strategy.MovingStrategy;

public class Car {

    private static final int STARTING_POSITION = 0;
    private final RacingRecord racingRecord;
    private int position;

    public Car() {
        this.position = STARTING_POSITION;
        this.racingRecord = new RacingRecord();
    }

    public void race(MovingStrategy strategy) {
        if (strategy.isMove()) {
            position++;
        }
        racingRecord.save(position);
    }

    public int getPosition() {
        return position;
    }

    public void print(int index) {
        racingRecord.print(index);
    }
}