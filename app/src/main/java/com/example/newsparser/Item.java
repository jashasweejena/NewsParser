package com.example.newsparser;

public class Item {

    int background;
    String itemTitle;
    int profilePhoto;
    int nbFollowers;

    public Item() {
    }

    public Item(int background, String profileName, int profilePhoto, int nbFollowers) {
        this.background = background;
        this.itemTitle = profileName;
        this.profilePhoto = profilePhoto;
        this.nbFollowers = nbFollowers;
    }

    public int getBackground() {
        return background;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public int getProfilePhoto() {
        return profilePhoto;
    }

    public int getNbFollowers() {
        return nbFollowers;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public void setProfilePhoto(int profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public void setNbFollowers(int nbFollowers) {
        this.nbFollowers = nbFollowers;
    }
}
