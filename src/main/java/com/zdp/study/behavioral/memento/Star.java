package com.zdp.study.behavioral.memento;

import lombok.Data;

/**
 * @author zdp
 * @date 2021/6/30
 * @desc 星球
 */
public class Star {

    private int ageYears;

    private int massTons;

    private StarType starType;

    public Star(int ageYears, int massTons, StarType starType) {
        this.ageYears = ageYears;
        this.massTons = massTons;
        this.starType = starType;
    }

    public void timePass(){
        ageYears = ageYears * 2;
        massTons = massTons * 8;

        switch (starType){
            case SUN:
                starType = StarType.RED_GIANT;
                break;
            case RED_GIANT:
                starType = StarType.WHITE_DWARF;
                break;
            case WHITE_DWARF:
                starType = StarType.SUPERNOVA;
                break;
            case SUPERNOVA:
                starType = StarType.DEAD;
                break;
            case DEAD:
                massTons = 0;
                break;
            default:
                break;
        }
    }

    public StarMemento getMemento(){
        StarMementoInner result = new StarMementoInner();
        result.setAgeYears(ageYears);
        result.setMassTons(massTons);
        result.setStarType(starType);

        return result;
    }

    public void setMemento(StarMemento starMemento){
        StarMementoInner mementoInner = (StarMementoInner)starMemento;
        this.ageYears = mementoInner.getAgeYears();
        this.massTons = mementoInner.getMassTons();
        this.starType = mementoInner.getStarType();
    }

    @Override
    public String toString() {
        return "{" +
                "ageYears=" + ageYears +
                ", massTons=" + massTons +
                ", starType=" + starType +
                '}';
    }

    @Data
    private class StarMementoInner implements StarMemento{
        private int ageYears;

        private int massTons;

        private StarType starType;
    }
}
