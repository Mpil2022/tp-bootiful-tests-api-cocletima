package fr.ul.tpbootifultestsapicocletima.services;

import org.springframework.stereotype.Service;

/**
 * @author Tabary
 */
@Service
public class AdderService {
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int add(int other) {
        return this.num + other;
    }

    public int accumulate(int other) {
        return this.num += other;
    }
}
