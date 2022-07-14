package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {  //comment
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Koray";
        } else { // TODO extend the programm here
            if(query.contains("plus")){
                String[] k = query.split(" ");
                int number1 = Integer.parseInt(k[2]);
                int number2 = Integer.parseInt(k[4]);
                String retval = "";
                retval += (number1 + number2);
                return retval;
            }

            if(query.contains("largest")){
                String[] k = query.split(":");
                String[] kk = k[1].substring(1).split(", ");
                int tempoMax = -111;
                int size = kk.length;
                for(int kh =0 ; kh < size ; kh ++ ){
                    int temp = Integer.parseInt(kk[kh]);
                    if(temp > tempoMax)
                        tempoMax = temp;
                }
                return "" + tempoMax;

            }

            if(query.contains("multiplied")){
                String[] k = query.split(" ");
                int number1 = Integer.parseInt(k[2]);
                int number2 = Integer.parseInt(k[5]);
                String retval = "";
                retval += (number1 * number2);
                return retval;
            }
            return "";
        }
    }
}
