package frc.robot.subsystems.elevator;

import static edu.wpi.first.units.Units.Inches;

import edu.wpi.first.units.measure.Distance;

public enum ElevatorPositions {
    LEVEL_1(Inches.of(5)),
    LEVEL_2(Inches.of(10));

    public final Distance height;

    private ElevatorPositions(Distance height){
        this.height = height;
    }
}
