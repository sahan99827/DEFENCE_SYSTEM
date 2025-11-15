package controller;

import View.*;
import interfaces.Observer;
import java.util.ArrayList;

public class DifeanceObservable{
    
    private ArrayList<Observer>observerList = new ArrayList<>(); 
    
    public void addDifenceObserver(Observer observer){
        observerList.add(observer);
    }
    
    public void removeobserver(Observer observer){
        observerList.remove(observer);
    }
    
    public void setArea(boolean isClear){
        for(Observer observere : observerList){
            observere.setAreaClear(isClear);
        }
    }
    
    public void setSliderValueInBtn(int value){
        for(Observer observere : observerList){
            observere.setBtnValue(value);
        }
    }
    
    public void setMsgPublic(String msg){
        for(Observer observer : observerList){
            observer.setMassageOtherBoxes(msg);
        }
    }
    
    public void setPrivateMsg1(String msg){
        for(Observer observer : observerList){
            if(observer instanceof Helicopter){
              observer.setprivateMassage(msg);
            }    
        }
    }
    
   public void setPrivateMsg2(String msg){
       for(Observer observer : observerList){
           if(observer instanceof Submarine){
               observer.setprivateMassage(msg);
           }
       }
   }
   
   public void setPrivateMsg3(String msg){
       for(Observer observer : observerList){
           if(observer instanceof Tank){
               observer.setprivateMassage(msg);
           }
       }
   }
    
}
