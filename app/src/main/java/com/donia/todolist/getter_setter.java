package com.donia.todolist;

public class getter_setter {

    private String title, detail;
    private int icon;

    public getter_setter(String title, String detail, int icon) {
        this.title = title;
        this.detail = detail;
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
