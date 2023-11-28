public class StaticMain {
    public static void main(String[] args){

        workStatic ws=new workStatic();
        ws.brand="app";
        ws.price="122";
       // workStatic.name="SmartPhone";
        ws.show();

        workStatic ws1=new workStatic();
        ws1.brand="samu";
        ws1.price="1223";
        //workStatic.name="Phone";
        ws1.show();
        ws.show(); //name is changed to Phone because of static

        workStatic.show1(ws);

    }

}
