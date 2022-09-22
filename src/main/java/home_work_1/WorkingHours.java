package home_work_1;

import java.util.Date;
import java.util.Random;

public class WorkingHours {
    public void workTimeDoctor() {

        System.out.printf("с %s до %s\n", getRandomTime(18000000L, 29800000L), getRandomTime(32000000L, 46800000L));
    }

    private String getRandomTime(long with, long upTo) {

        Date time = new Date();
        Random random = new Random();

        long worksWith = random.nextLong(with, upTo);
        time.setTime(worksWith);

        return time.toString().substring(11, 16);
    }
}
