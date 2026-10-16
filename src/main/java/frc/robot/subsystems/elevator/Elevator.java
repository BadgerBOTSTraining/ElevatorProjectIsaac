package frc.robot.subsystems.elevator;

import org.littletonrobotics.junction.Logger;

import edu.wpi.first.units.measure.Distance;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Elevator extends SubsystemBase{
    private final ElevatorIOInputsAutoLogged inputs = new ElevatorIOInputsAutoLogged();
    private final ElevatorIO io;

    // elevator constructor
    public Elevator(ElevatorIO io){
        this.io=io;
    }


    /*
     * this function is periodically called to update the inputs to the elevator
     */
    @Override
    public void periodic(){
        io.updateInputs(inputs);
        Logger.processInputs("Elevator", inputs);
    }

    public void setPosition(Distance height){
        io.setPosition(height);
        Logger.recordOutput("Elevator/Requested Position", height);
    }

    //public Command runElevatorCommand()
}
