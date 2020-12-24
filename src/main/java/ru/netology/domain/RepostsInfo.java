package ru.netology.domain;

public class RepostsInfo {

    int count;// Количество пользователей скопировавших запись
    boolean userReposted;// наличие репоста от текущего пользователя

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isUserReposted() {
        return userReposted;
    }

    public void setUserReposted(boolean userReposted) {
        this.userReposted = userReposted;
    }
}
