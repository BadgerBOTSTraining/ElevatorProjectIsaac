package frc.robot.subsystems.elevator;

import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.hardware.CANcoder;
import com.ctre.phoenix6.signals.GravityTypeValue;
import com.ctre.phoenix6.signals.InvertedValue;
import com.ctre.phoenix6.signals.NeutralModeValue;
import com.ctre.phoenix6.signals.StaticFeedforwardSignValue;
import static edu.wpi.first.units.Units.Amps;
import static edu.wpi.first.units.Units.RotationsPerSecond;
import static edu.wpi.first.units.Units.RotationsPerSecondPerSecond;

import badgerutils.motor.MotorConfigUtils;
import edu.wpi.first.units.measure.AngularAcceleration;
import edu.wpi.first.units.measure.AngularVelocity;

public class ElevatorConstants {
    public static final double KP = 0, KD = 0, KS = 0, KG = 0;

    public static final double INCHES_TO_ROTATIONS=1;

    private static final double MOTOR_TO_SENSOR_RATIO= 1, SENSOR_TO_MECHANISM_RATIO = 1;
    
    public static final AngularVelocity MAX_VELOICTY = RotationsPerSecond.of(100);

    public static final AngularAcceleration MAX_ACCELERATION = RotationsPerSecondPerSecond.of(100);

    public static final TalonFXConfiguration MOTOR_CONFIG_CW = new TalonFXConfiguration()
    .withMotorOutput(MotorConfigUtils.createMotorOutputConfig(InvertedValue.Clockwise_Positive,NeutralModeValue.Brake))
    .withCurrentLimits((MotorConfigUtils.createCurrentLimitsConfig(Amps.of(40), Amps.of(60))))
    .withSlot0(MotorConfigUtils.createSlotConfig(KP, KD, KS, 0, KG, GravityTypeValue.Elevator_Static, StaticFeedforwardSignValue.UseClosedLoopSign))
    .withMotionMagic(MotorConfigUtils.createMotionMagicConfig(MAX_VELOICTY,MAX_ACCELERATION))
    .withFeedback(MotorConfigUtils.createCanCoderFeedbackConfig(new CANcoder(2),MOTOR_TO_SENSOR_RATIO,SENSOR_TO_MECHANISM_RATIO));

    public static final TalonFXConfiguration MOTOR_CONFIG_CCW = MotorConfigUtils.createInvertedConfig(MOTOR_CONFIG_CW);


}
