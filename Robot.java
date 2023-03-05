public class Robot extends Sportsman {

    public static final String OBJECT_CLASS = "Робот";
    public static final String SUCCESFULL_RUN_RESULT = "Пробежал дистанцию ";
    public static final String BAD_RUN_RESULT = " Выбыл из соревнования.";
    public static final String SUCCESFULL_JUMP_RESULT = "Преодолел высоту ";
    public static final String BAD_JUMP_RESULT = " Не преодолел препятствие.";

    public Robot(String name, int maxdistance, double maxheight) {
        super(name,maxdistance,maxheight);
        super.info= OBJECT_CLASS + " с названием " + name;
        super.succesfulrunresult=SUCCESFULL_RUN_RESULT;
        super.badrunresult=BAD_RUN_RESULT;
        super.succesfuljumpresult=SUCCESFULL_JUMP_RESULT;
        super.badjumpresult=BAD_JUMP_RESULT;
    }

}