package com.example.commonlibrary.bean.chat;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * @ClassName: RecentMessageEntity
 * @Description: (这里用一句话描述这个类的作用)
 * @author sunweixing
 * @date 2018-09-07
 */
@Entity
public class RecentMessageEntity {
//    用户ID或群ID



    public static final int TYPE_GROUP=1;
    public static final int TYPE_PERSON=2;
    @Id
    private String id;
    private String content;
    private long createdTime;
    private int contentType;
    private int type;

//    发送状态
    private int sendStatus;

    @Generated(hash = 1457310003)
    public RecentMessageEntity(String id, String content, long createdTime,
            int contentType, int type, int sendStatus) {
        this.id = id;
        this.content = content;
        this.createdTime = createdTime;
        this.contentType = contentType;
        this.type = type;
        this.sendStatus = sendStatus;
    }

    @Generated(hash = 122482021)
    public RecentMessageEntity() {
    }


    public int getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(int sendStatus) {
        this.sendStatus = sendStatus;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

   


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(long createdTime) {
        this.createdTime = createdTime;
    }

    public int getContentType() {
        return contentType;
    }

    public void setContentType(int contentType) {
        this.contentType = contentType;
    }


    @Override
    public boolean equals(Object obj) {
        return obj!=null&&obj instanceof RecentMessageEntity
                && ((RecentMessageEntity) obj).getId().equals(getId());
    }
}
