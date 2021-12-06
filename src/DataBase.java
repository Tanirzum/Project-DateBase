import java.util.*;

public class DataBase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Можно указать точное количество миллисекунд, которое прошло с 00:00 1 января 1970 года " +
                "до требуемой даты, и она будет создана:");
        long milSecond = scanner.nextLong();
        Date date = new Date(milSecond);
        System.out.println("У нас получилось " + date);
    }
}
