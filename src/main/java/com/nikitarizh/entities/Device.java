package com.nikitarizh.entities;

import javafx.beans.property.*;

public class Device {
    private SimpleIntegerProperty id;
    private SimpleStringProperty type;
    private SimpleStringProperty location;
    private SimpleStringProperty status;
    private SimpleStringProperty serial;

    public Device(String type, String location, String status) {
        this.id = null;
        this.type = new SimpleStringProperty(type);
        this.location = new SimpleStringProperty(location);
        this.status = new SimpleStringProperty(status);
    }

    public Device(int id, String type, String location, String status) {
        this.id = new SimpleIntegerProperty(id);
        this.type = new SimpleStringProperty(type);
        this.location = new SimpleStringProperty(location);
        this.status = new SimpleStringProperty(status);
    }

    public int getId() {
        return id.get();
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public String getType() {
        return type.get();
    }

    public void setType(String type) {
        this.type.set(type);
    }

    public StringProperty typeProperty() {
        return type;
    }

    public String getLocation() {
        return location.get();
    }

    public void setLocation(String location) {
        this.location.set(location);
    }

    public StringProperty locationProperty() {
        return location;
    }

    public String getStatus() {
        return status.get();
    }

    public void setStatus(String status) {
        this.status.set(status);
    }

    public StringProperty statusProperty() {
        return status;
    }
}
