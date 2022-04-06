package com.examly.springapp.model;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import java.util.Date;
import java.util.List;
import com.examly.springapp.model.UserModel;

@Entity
public class ChatModel {
    @Id
    private String chatId;
    @ManyToOne()
    private UserModel primaryUser;
    @ManyToOne()
    private UserModel secondaryUser;
    @ElementCollection(targetClass=String.class)
    private List<String> chatHistory;
    private Boolean status;
    private Date lastSeen;

    public String getChatId() {
        return chatId;
    }
    public void setChatId(String chatId) {
        this.chatId = chatId;
    }
    public UserModel getPrimaryUser() {
        return primaryUser;
    }
    public void setPrimaryUser(UserModel primaryUser) {
        this.primaryUser = primaryUser;
    }
    public UserModel getSecondaryUser() {
        return secondaryUser;
    }
    public void setSecondaryUser(UserModel secondaryUser) {
        this.secondaryUser = secondaryUser;
    }
    public List<String> getChatHistory() {
        return chatHistory;
    }
    public void setChatHistory(List<String> chatHistory) {
        this.chatHistory = chatHistory;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(Date lastSeen) {
        this.lastSeen = lastSeen;
    }

    public ChatModel() {}

    public ChatModel(String chatId, UserModel primaryUser, UserModel secondaryUser, List<String> chatHistory, Boolean status, Date lastSeen) {
        this.setChatId(chatId);
        this.setPrimaryUser(primaryUser);
        this.setSecondaryUser(secondaryUser);
        this.setChatHistory(chatHistory);
        this.setStatus(status);
        this.setLastSeen(lastSeen);
    }
}
