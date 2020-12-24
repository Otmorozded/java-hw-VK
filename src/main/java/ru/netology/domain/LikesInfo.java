package ru.netology.domain;

public class LikesInfo {

    boolean canLike;// может ли текущий пользователь поставить лайк
    int count;// Кол-во пользователей которым понравилась запись

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }



    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }



}
