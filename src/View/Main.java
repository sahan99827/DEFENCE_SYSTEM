package View;

import controller.DifeanceObservable;


public class Main {

    public static void main(String[] args) {
            
        DifeanceObservable observable = new DifeanceObservable(); 
        MainController mainController = new MainController(observable);
        
        observable.addDifenceObserver(new Helicopter(mainController));
        observable.addDifenceObserver(new Submarine(mainController));
        observable.addDifenceObserver(new Tank(mainController));
      
    }
}
