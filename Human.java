public class Human extends Sportsman {

   public static final String OBJECT_CLASS = "Человек";
   public static final String SUCCESFULL_RUN_RESULT = " Успешно преодолел дистанцию ";
   public static final String BAD_RUN_RESULT = "Выбыл из соревнования";
   public static final String SUCCESFULL_JUMP_RESULT = "Преодолел стенку высотой ";
   public static final String BAD_JUMP_RESULT = " Не преодолел стену.";

   public Human(String name, int maxdistance, double maxheight){
      super(name,maxdistance,maxheight);
      super.info = OBJECT_CLASS + " По имени " + name;
      super.succesfulrunresult=SUCCESFULL_RUN_RESULT;
      super.badrunresult=BAD_RUN_RESULT;
      super.succesfuljumpresult=SUCCESFULL_JUMP_RESULT;
      super.badjumpresult=BAD_JUMP_RESULT;
}

}
