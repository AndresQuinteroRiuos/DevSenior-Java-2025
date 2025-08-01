public enum WeekDay {
    MONDAY (1, "Lunes"),
         TUESDAY(2, "Martes"),
          WEDNESDAY(3, "Miercoles"),
           THURSDAY(4, "Jueves"),
            FRIDAY(5, "Viernes"),
             SATURDAY(6, "Sabiado"),
              SUNDAY(7, "Domingo"),
              MYDAY;

    
    private Integer Num;

    private String Name;

    

    

     WeekDay() {
        this(0,"sin asignar");
    }

    WeekDay(Integer Num, String Name) {
        this.Num = Num;
        this.Name = Name;
    }
    



     public String getName() {
        return Name;
    }





    public Integer getNum() {
        return Num;
    }



    @Override
    public String toString() {
       
        return getName();
    }

    
}
