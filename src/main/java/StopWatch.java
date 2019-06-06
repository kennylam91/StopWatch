import java.util.Date;

public class StopWatch {
    public StopWatch(){
        startTime= new Date();
    }
    private Date startTime;
    private Date endTime;

    void start(){
        startTime= new Date();

    }

    void stop(){
        endTime= new Date();
    }

    double getElapsedTime(){
        return endTime.getTime()- startTime.getTime();
    }

}
