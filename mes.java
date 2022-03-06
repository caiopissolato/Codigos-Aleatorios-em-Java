import java.time.LocalDate;

public class mes {
    public static void main(String[] args){
        LocalDate data = LocalDate.of(2017,1,1);
        while(data.getYear() == 2017){
            System.out.printf("Dia: %d\n Mes: %d\n\n", data.getDayOfMonth(), data.getMonthValue());
            data = data.plusDays(1);
        }
    }
}