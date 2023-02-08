package homework.lesson43;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Triangle {
    public static void main(String[] args) {
        triangleReculc(args);
    }

    public static void triangleReculc(String[] x) {

        Integer max = MaxNumber.maxNumberRecuclc(x);
        List<String> list = new ArrayList<>();
        Integer SideOne;
        Integer SideTwo;
        boolean allSideIsEmpty = false;
        try {
           list = Stream.of(x).filter(y -> !y.equals(max.toString())).collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            SideOne = Integer.parseInt(x[0]);
            SideTwo = Integer.parseInt(x[1]);
            allSideIsEmpty = true;
        }
        if (allSideIsEmpty == false) {
            SideOne = Integer.parseInt(list.get(0));
            SideTwo = Integer.parseInt(list.get(1));
        }
        if (max + SideOne > SideTwo && max + SideTwo > SideOne && SideOne + SideTwo > max) {
            System.out.println("Треугольник существует.");
            if (max * max == SideOne * SideOne + SideTwo * SideTwo) {
                System.out.println("right");
            } else if (max * max > SideOne * SideOne + SideTwo * SideTwo) {
                System.out.println("obtuse");
            } else System.out.println("acute");
        }
        else
            System.out.println("Треугольник не существует.");

    }
}
