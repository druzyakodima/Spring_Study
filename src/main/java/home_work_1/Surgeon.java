package home_work_1;

public class Surgeon implements Doctor{

    @Override
    public void reception() {

        WorkingHours workingHours = new WorkingHours();
        System.out.println("Хирург принимает в кабинете 518");
        workingHours.workTimeDoctor();
    }
}
