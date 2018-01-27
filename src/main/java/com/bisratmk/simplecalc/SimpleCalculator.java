/*simpleCalc , get three parameter from web  - https://localhost:8080/BisratMK
?FirstNum&SecondNum&Firstletter of operation
example https://localhost:8080/BisratMK/?4&%&A
A  is the first letter of addition
Bisrat M Kebede ,jan 27,2018
*/
package com.bisratmk.simplecalc;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SimpleCalculator {
    @RequestMapping("/BisratMKScalc")
    public  String CalcMethod (@RequestParam("Fnum") int fnum ,@RequestParam("Snum") int snum
            ,@RequestParam("FLetter") String key ){
        double calculator ,calc = 0;
        int count = 0;
        String Result = "" ;
        do { if (fnum != 0 && key.equals("P")) {
            calculator =  Math.pow(fnum, snum);
                Result = "Power of two no is : " + String.valueOf(calculator); }
                else if (fnum != 0 && key.equals("m")) {
            calculator = Math.max(fnum , snum) ;calc = Math.min(fnum,snum);
                Result = "Max is: " + String.valueOf(calculator)+" " + "Min is: "
                        + String.valueOf(calc) ; }
                else  if (fnum != 0 && key.equals("A")) { calculator = fnum + snum;
                Result = "Added result is " + String.valueOf(calculator); }
                else  if (fnum != 0 && key.equals("S")) { calculator = fnum - snum;
            Result = "Difference result is  " + String.valueOf(calculator); }
                else  if (fnum != 0 && key.equals("D")) { calculator = fnum / snum;
            Result = "Divided result is " + String.valueOf(calculator); }
                else  if (fnum != 0 && key.equals("M")) { calculator = fnum * snum;
            Result = "Multiplied result is " + String.valueOf(calculator); }
                else  if (fnum != 0 && key.equals("s")) { calculator = Math.sqrt(fnum);
                calc = Math.sqrt(snum);
            Result = "Sqroot of First no: " + String.valueOf(calculator) +" , "+ "Sqroot of Second no: " + String.valueOf(calc); }
                else { Result = "error"; }
        } while (count == 1); /* I have used 'do while' because it check expression after Exc */
        return Result;
          }
          }

