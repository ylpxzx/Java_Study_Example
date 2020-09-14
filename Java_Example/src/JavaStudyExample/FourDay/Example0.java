package JavaStudyExample.FourDay;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Example0 {
    // TODO 计算某年、某月、某日和某年、某月、某日之间的天数间隔和周数
    public static void leadTime(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input first date: ");
        String str = scanner.nextLine();
        System.out.println("Please input second date: ");
        String str1 = scanner.nextLine();
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date parse = dateFormat.parse(str);
            Date parse1 = dateFormat.parse(str1);
            System.out.println(parse);
            long a = 0;
            if (parse.after(parse1)){
                a = parse.getTime() - parse1.getTime();
            }else {
                a = parse1.getTime() - parse.getTime();
            }
            long oneDay = 1000 * 60 * 60 * 24;
            long day = a / oneDay;
            long week = day / 7;
            System.out.println("day num : " + day);
            System.out.println("week num : " + week);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Example0.leadTime();
    }
}
