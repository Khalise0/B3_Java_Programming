package day28_arrayList;

public class HtmlGenerator {
    public static void main(String[] args) {

        String str = "div^2";

        System.out.println(htmlGenerator(str) );
        System.out.println(htmlGenerator("li^3"));
        System.out.println( htmlGenerator("span^5"));



    }


    public static String htmlGenerator (String str){

        //String [] arr = str.split("\\^");
       String [] arr = str.replace("^", " ").split(" ");

        //   int num = Integer.parseInt(arr[arr.length-1]);
        //            OR
       Integer num = Integer.valueOf(arr[1]);


        String html = "";
        for (int i = 0; i < num; i++) {

            html += "<" + arr[0] + "></" + arr[0] + ">";

        }

        return html;
    }

}
