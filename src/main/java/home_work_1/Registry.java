package home_work_1;

public class Registry implements IRegistry {

    private Doctor doctor;
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void signUpOnReception() {
        var archive = new Archive();
        archive.medicalCard();
        doctor.reception();
    }
}
