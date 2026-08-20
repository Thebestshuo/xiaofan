package operator;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class Demo8 {
    public static void main(String[] args) {
        Date date = new Date();
        long timeStamp = date.getTime();
        System.out.println("时间戳：" + timeStamp);

        // 1. 创建本地化格式化器
        DateTimeFormatter china = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);

        // 2. Instant绑定本地时区，转ZonedDateTime再格式化
        Instant instant = date.toInstant();
        String timeStr = china.format(instant.atZone(ZoneId.systemDefault()));
        System.out.println(timeStr);
    }
}