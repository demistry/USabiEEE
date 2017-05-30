package com.example.ilenwabordavid.usabieee;

/**
 * Created by ILENWABOR DAVID on 30/05/2017.
 */

public class Calc {
    private static double point1=0, point2, point3, point4, point5, point6, point7, point8, point9;
    public void setEEE431(String grade){
        switch (grade){
            case "A": point1 = 15;break;
            case "B": point1 = 4 * 3;break;
            case "C": point1 = 3 * 3;break;
            case "D": point1 = 2 * 3;break;
            case "E": point1 = 0;break;
            case "F": point1 = 0;break;
            default:
                break;
        }
    }
    public void setEEE433(String grade){
        switch (grade){
            case "A": point2 = 5 * 3;break;
            case "B": point2 = 4 * 3;break;
            case "C": point2 = 3 * 3;break;
            case "D": point2 = 2 * 3;break;
            case "E": point2 = 0;break;
            case "F": point2 = 0;break;
            default:
                break;
        }
    }
    public void setELA401(String grade){
        switch (grade){
            case "A": point3 = 5 * 2;break;
            case "B": point3 = 4 * 2;break;
            case "C": point3 = 3 * 2;break;
            case "D": point3 = 2 * 2;break;
            case "E": point3 = 0;break;
            case "F": point3 = 0;break;
            default:
                break;
        }
    }
    public void setEEE451(String grade){
        switch (grade){
            case "A": point4 = 5 * 3;break;
            case "B": point4 = 4 * 3;break;
            case "C": point4 = 3 * 3;break;
            case "D": point4 = 2 * 3;break;
            case "E": point4 = 0;break;
            case "F": point4 = 0;break;
            default:
                break;
        }
    }
    public void setEEE453(String grade){
        switch (grade){
            case "A": point5 = 5 * 3;break;
            case "B": point5 = 4 * 3;break;
            case "C": point5 = 3 * 3;break;
            case "D": point5 = 2 * 3;break;
            case "E": point5 = 0;break;
            case "F": point5 = 0;break;
            default:
                break;
        }
    }
    public void setCED400(String grade){
        switch (grade){
            case "A": point6 = 5 * 2;break;
            case "B": point6 = 4 * 2;break;
            case "C": point6 = 3 * 2;break;
            case "D": point6 = 2 * 2;break;
            case "E": point6 = 0;break;
            case "F": point6 = 0;break;
            default:
                break;
        }
    }
    public void setEEE471(String grade){
        switch (grade){
            case "A": point7 = 5 * 3;break;
            case "B": point7 = 4 * 3;break;
            case "C": point7 = 3 * 3;break;
            case "D": point7 = 2 * 3;break;
            case "E": point7 = 0;break;
            case "F": point7 = 0;break;
            default:
                break;
        }
    }
    public void setEEE473(String grade){
        switch (grade){
            case "A": point8 = 5 * 3;break;
            case "B": point8 = 4 * 3;break;
            case "C": point8 = 3 * 3;break;
            case "D": point8 = 2 * 3;break;
            case "E": point8 = 0;break;
            case "F": point8 = 0;break;
            default:
                break;
        }
    }
    public void setEEE481(String grade){
        switch (grade) {
            case "A":
                point9 = 5 * 3;
                break;
            case "B":
                point9 = 4 * 3;
                break;
            case "C":
                point9 = 3 * 3;
                break;
            case "D":
                point9 = 2 * 3;
                break;
            case "E":
                point9 = 0;
                break;
            case "F":
                point9 = 0;
                break;
            default:
                break;
        }
    }

    public static double calculateGP(){
        double result=0;
        double sum=0;
        sum =  point1 + point2 + point3 + point4 + point5 + point6 + point7 + point8 + point9;
        result = sum/25;
        return result;
    }
}
