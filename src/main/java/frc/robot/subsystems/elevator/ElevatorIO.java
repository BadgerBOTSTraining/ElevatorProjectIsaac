package frc.robot.subsystems.elevator;

import org.littletonrobotics.junction.AutoLog;

import badgerutils.advantagekit.cancoder.LoggedCANCoder;
import badgerutils.advantagekit.talonfx.LoggedTalonFX;
import edu.wpi.first.units.measure.Distance;

public interface ElevatorIO {
    @AutoLog
    public static class ElevatorIOInputs {
        public LoggedTalonFX leftMotor;
        public LoggedTalonFX rightMotor;
        public LoggedCANCoder encoder;
    }

    public void updateInputs(ElevatorIOInputs inputs);
    
    public void setPosition(Distance height);
}
