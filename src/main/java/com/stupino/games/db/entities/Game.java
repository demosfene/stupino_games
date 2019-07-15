package com.stupino.games.db.entities;

public class Game {

//    ДЛЯ ТОГО ЧТОБЫ ЧТО ТО ВЫТАЩИТЬ ИЗ ОБЪЕКТА, У ОБЪЕКТА ЭТО ДОЛЖНО БЫТЬ)

    private Integer id;
    private String title;
    private String description;
    private String image;
    private String numberOfParticipants;
    private Integer amount;
    private Integer used_count;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNumberOfParticipants() {
        return numberOfParticipants;
    }

    public void setNumberOfParticipants(String numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getUsed_count() {
        return used_count;
    }

    public void setUsed_count(Integer used_count) {
        this.used_count = used_count;
    }
}
