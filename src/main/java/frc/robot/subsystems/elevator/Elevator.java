package frc.robot.subsystems.elevator;

import org.littletonrobotics.junction.Logger;

import edu.wpi.first.units.measure.Angle;
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

    public void setPosition(Angle pos){
        io.setPosition(pos);
        Logger.recordOutput("Elevator/Requested Position", pos);
    }

    //public Command runElevatorCommand()
}
