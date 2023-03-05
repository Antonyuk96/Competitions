public class Cat extends Sportsman {

    public static final String OBJECT_CLASS = "Cat";
    public static final String SUCCESFULL_RUN_RESULT = " Препятствие успешно пройдено ";
    public static final String BAD_RUN_RESULT = " Не финишировал и выбывает";
    public static final String SUCCESFULL_JUMP_RESULT = "Преодолел стенку высотой ";
    public static final String BAD_JUMP_RESULT = " Не преодолел высоту";

  public Cat(String name, int maxdistance, double maxheight) {
        super(name,maxdistance,maxheight);
        super.info= OBJECT_CLASS + " Кличка " + name;
        super.succesfulrunresult=SUCCESFULL_RUN_RESULT;
        super.badrunresult=BAD_RUN_RESULT;
        super.succesfuljumpresult=SUCCESFULL_JUMP_RESULT;
        super.badjumpresult=BAD_JUMP_RESULT;
    }
}