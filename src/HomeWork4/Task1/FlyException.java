package HomeWork4.Task1;

public class FlyException extends Exception{

    public FlyException() {
    }

    public FlyException(String message) {
        super(message);
    }


    public String getMessage (){

        return ("Ошибка,Утка ранена");
    }
    public String getMessage1 (){

        return ("Ошибка, самолет без пассажиров");
    }


}
