package org.rehkalainin;

public class ClassicMusic implements Music {

    private ClassicMusic(){};

    public static ClassicMusic getClassicMusic(){
        return new ClassicMusic();
    }


    public String getSong() {
        return "Beethoven symphony 5";
    }

    public void doMyInit(){
        System.out.println("Doing init");
    }

    public void doMyDestroy(){
        System.out.println("Doing destroy");
    }

}
