package com.example.commonlibrary.bean.chat;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * @ClassName: StepData
 * @Description: (这里用一句话描述这个类的作用)
 * @author sunweixing
 * @date 2018-09-07
 */
@Entity
public class StepData {

    @Id
    private String time;
    private int stepCount;


    private String uid;


//    server ID
    private String id;


    @Generated(hash = 960821497)
    public StepData(String time, int stepCount, String uid, String id) {
        this.time = time;
        this.stepCount = stepCount;
        this.uid = uid;
        this.id = id;
    }

    @Generated(hash = 90761876)
    public StepData() {
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }



    


    public String getTime() {
        return time;
    }

    public int getStepCount() {
        return stepCount;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setStepCount(int stepCount) {
        this.stepCount = stepCount;
    }
}
