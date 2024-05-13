package dev.quin.spring.QuanLyBanHang.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "timekeeping")
public class Timekeeping {
    @Id
    @Column(name = "timekeeping_id")
    private String timekeeping_id;
    @Column(name = "time_start",length = 20)
    private String time_start;
    @Column(name ="timer_end",length = 20)
    private String timer_end;
    @Column(name = "amount_for_a_hour")
    private double amount_for_a_hour;
    @Column(name = "number_of_working_day")
    private int number_of_working_day;
    @Column(name = "over_time")
    private float over_time;
    @Column(name = "reward")
    private double reward;
    @Column(name ="punish" )
    private double punish;

    public Timekeeping() {
    }

    public Timekeeping(String timekeeping_id
            , String time_start, String timer_end, double amount_for_a_hour
            , int number_of_working_day, float over_time, double reward, double punish) {
        this.timekeeping_id = timekeeping_id;
        this.time_start = time_start;
        this.timer_end = timer_end;
        this.amount_for_a_hour = amount_for_a_hour;
        this.number_of_working_day = number_of_working_day;
        this.over_time = over_time;
        this.reward = reward;
        this.punish = punish;
    }

    public String getTimekeeping_id() {
        return timekeeping_id;
    }

    public void setTimekeeping_id(String timekeeping_id) {
        this.timekeeping_id = timekeeping_id;
    }

    public String getTime_start() {
        return time_start;
    }

    public void setTime_start(String time_start) {
        this.time_start = time_start;
    }

    public String getTimer_end() {
        return timer_end;
    }

    public void setTimer_end(String timer_end) {
        this.timer_end = timer_end;
    }

    public double getAmount_for_a_hour() {
        return amount_for_a_hour;
    }

    public void setAmount_for_a_hour(double amount_for_a_hour) {
        this.amount_for_a_hour = amount_for_a_hour;
    }

    public int getNumber_of_working_day() {
        return number_of_working_day;
    }

    public void setNumber_of_working_day(int number_of_working_day) {
        this.number_of_working_day = number_of_working_day;
    }

    public float getOver_time() {
        return over_time;
    }

    public void setOver_time(float over_time) {
        this.over_time = over_time;
    }

    public double getReward() {
        return reward;
    }

    public void setReward(double reward) {
        this.reward = reward;
    }

    public double getPunish() {
        return punish;
    }

    public void setPunish(double punish) {
        this.punish = punish;
    }
}
