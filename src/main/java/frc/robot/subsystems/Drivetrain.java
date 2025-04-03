package frc.robot.subsystems;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
import com.revrobotics.spark.config.SparkMaxConfig;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {

      // 3 meters per second.
  public static final double kMaxSpeed = 3.0;
  // 1/2 rotation per second.
  public static final double kMaxAngularSpeed = Math.PI;

  private static final double kTrackWidth = 0.381 * 2;
  private static final double kWheelRadius = 0.0508;
  private static final int kEncoderResolution = -4096;

    private SparkMax m_leftFollower = new SparkMax(10, MotorType.kBrushless);
    private SparkMax m_leftLeader = new SparkMax(11, MotorType.kBrushless);
    private SparkMax m_rightFollower = new SparkMax(20, MotorType.kBrushless);
    private SparkMax m_rightLeader = new SparkMax(21, MotorType.kBrushless);

    private final SparkMaxConfig m_leftLeaderConfig = new SparkMaxConfig();
    private final SparkMaxConfig m_leftFollowerConfig = new SparkMaxConfig();
    private final SparkMaxConfig m_rightLeaderConfig = new SparkMaxConfig();
    private final SparkMaxConfig m_rightFollowerConfig = new SparkMaxConfig();
    public Object drive;

    public Drivetrain(){
        m_leftFollowerConfig.idleMode(IdleMode.kCoast);
        m_leftLeaderConfig.idleMode(IdleMode.kCoast);
        m_rightFollowerConfig.idleMode(IdleMode.kCoast);
        m_rightLeaderConfig.idleMode(IdleMode.kCoast);
        m_leftFollowerConfig.follow(m_leftLeader);
        m_rightFollowerConfig.follow(m_rightLeader);

    }

    public void drive(double d, double rawAxis) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'drive'");
    }

}
