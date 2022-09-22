package home_work_1;

public class Therapist implements Doctor {
    @Override
    public void reception() {

        WorkingHours workingHours = new WorkingHours();
        System.out.println("Терапевт принимает в кабинете 517");

        workingHours.workTimeDoctor();
    }
}
