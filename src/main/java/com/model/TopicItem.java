package com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "topicItem")
public class TopicItem {
    @Id
    private String id;
    private String description;
    private String title;
    private String type;
    private String ansItems;
    private String answer;

    public TopicItem() {

    }

    public TopicItem(String id, String description, String type, String ansItems, String answer) {
        this.id = id;
        this.description = description;
        this.type = type;
        this.ansItems = ansItems;
        this.answer = answer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAnsItems() {
        return ansItems;
    }

    public void setAnsItems(String ansItems) {
        this.ansItems = ansItems;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
