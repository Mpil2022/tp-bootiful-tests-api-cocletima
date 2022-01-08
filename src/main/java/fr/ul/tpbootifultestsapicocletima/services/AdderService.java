package fr.ul.tpbootifultestsapicocletima.services;

import org.springframework.stereotype.Service;

/**
 * @author Tabary
 */
@Service
public class AdderService {
    private int num;

    /**
     * Getter for the number in the API memory
     * @return this.num
     */
    public int getNum() {
        return num;
    }

    /**
     * Setter for the number in the API memory
     * @param num the new value
     */
    public void setNum(int num) {
        this.num = num;
    }

    /**
     * Calculate the result of the sum of the number in the API memory and the number passed as parameter
     * @param other the other number of the sum
     * @return this.num + other
     */
    public int add(int other) {
        return this.num + other;
    }

    /**
     * Update the value of the number in the API memory by the sum of it and the number passed as parameter
     * @param other the other number of the sum
     * @return the sum of the number in memory and the parameter
     */
    public int accumulate(int other) {
        return this.num += other;
    }
}
