package org.usfirst.frc.team4915.stronghold.commands.IntakeLauncher;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team4915.stronghold.Robot;

public class AimLauncherCommand extends Command {

    public AimLauncherCommand() {
        requires(Robot.intakeLauncher);
    }

    protected void initialize() {

    }

    protected void execute() {
        Robot.intakeLauncher.aimLauncher();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        System.out.println("Interrupted");
    }

    protected void interrupted() {

    }
}