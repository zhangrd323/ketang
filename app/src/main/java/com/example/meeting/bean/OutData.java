package com.example.meeting.bean;

/**
 * @Describe
 * @Author Mrsleep1
 * @Date 2020/4/28
 * @Contact 920671458@qq.com
 */
public class OutData {
    private Group group;
    private User user;

    public OutData(Group group, User user) {
        this.group = group;
        this.user = user;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
