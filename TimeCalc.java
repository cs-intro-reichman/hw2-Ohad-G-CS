public class TimeCalc {
    public static void main(String[] args) {
        int minutesToAdd = Integer.parseInt(args[1]);
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

        int NewHours = (hours + minutesToAdd / 60) % 24;
        int NewMinutes =  (minutes + minutesToAdd % 60);
        if (NewMinutes >= 60 ) {
            NewMinutes = NewMinutes - 60;
            NewHours++;
            NewHours = NewHours % 24;
            
        }
        if (NewHours < 10) {
            System.out.print("0");
        }
        System.out.print(NewHours + ":");
        if (NewMinutes < 10) {
            System.out.print("0");
        }
        System.out.print(NewMinutes);
    }
}

