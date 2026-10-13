package frc.robot.subsystems.elevator;

import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.signals.GravityTypeValue;
import com.ctre.phoenix6.signals.InvertedValue;
import com.ctre.phoenix6.signals.NeutralModeValue;
import com.ctre.phoenix6.signals.StaticFeedforwardSignValue;
import static edu.wpi.first.units.Units.Amps;

import badgerutils.motor.MotorConfigUtils;

public class ELevatorConstants {
    public static final double KP = 0, KD = 0, KS = 0, KG = 0;

    public static final TalonFXConfiguration MOTOR_CONFIG_CW = new TalonFXConfiguration()
    .withMotorOutput(MotorConfigUtils.createMotorOutputConfig(InvertedValue.Clockwise_Positive,NeutralModeValue.Brake))
    .withCurrentLimits((MotorConfigUtils.createCurrentLimitsConfig(Amps.of(40), Amps.of(60))))
    .withSlot0(MotorConfigUtils.createSlotConfig(KP, KD, KS, 0, KG, GravityTypeValue.Elevator_Static, StaticFeedforwardSignValue.UseClosedLoopSign));
}
