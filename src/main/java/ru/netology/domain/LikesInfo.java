package ru.netology.domain;

public class LikesInfo {

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    int count;// Кол-во пользователей которым понравилась запись

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    boolean canLike;// может ли текущий пользователь поставить лайк

}
