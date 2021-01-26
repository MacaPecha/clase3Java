package Tarde;

import java.util.Date;

public class Time {
    private long horaInicial;
    private long horaFinal;

    public void start(){
        this.horaInicial = new Date().getTime();
    }

    public void stop(){
        this.horaFinal = new Date().getTime();
    }

    public long elapsedTime(){
        return this.horaFinal - this.horaInicial;
    }

}
