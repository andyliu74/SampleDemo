
package com.toryang.sampledemo.model.entities.comingSoon;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rating {

    @SerializedName("max")
    @Expose
    private Integer max;
    @SerializedName("average")
    @Expose
    private Double average;
    @SerializedName("stars")
    @Expose
    private String stars;
    @SerializedName("min")
    @Expose
    private Integer min;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Rating() {
    }

    /**
     * 
     * @param min
     * @param max
     * @param stars
     * @param average
     */
    public Rating(Integer max, Double average, String stars, Integer min) {
        this.max = max;
        this.average = average;
        this.stars = stars;
        this.min = min;
    }

    /**
     * 
     * @return
     *     The max
     */
    public Integer getMax() {
        return max;
    }

    /**
     * 
     * @param max
     *     The max
     */
    public void setMax(Integer max) {
        this.max = max;
    }

    /**
     * 
     * @return
     *     The average
     */
    public Double getAverage() {
        return average;
    }

    /**
     * 
     * @param average
     *     The average
     */
    public void setAverage(Double average) {
        this.average = average;
    }

    /**
     * 
     * @return
     *     The stars
     */
    public String getStars() {
        return stars;
    }

    /**
     * 
     * @param stars
     *     The stars
     */
    public void setStars(String stars) {
        this.stars = stars;
    }

    /**
     * 
     * @return
     *     The min
     */
    public Integer getMin() {
        return min;
    }

    /**
     * 
     * @param min
     *     The min
     */
    public void setMin(Integer min) {
        this.min = min;
    }

}