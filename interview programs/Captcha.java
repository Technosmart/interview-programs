import java.util.Random;
import java.util.*;
class Captcha
{
public static void main(String... as) throws Exception
{
Scanner sc=new Scanner(System.in);
Captcha ch=new Captcha();
String cap=ch.generateCaptchaString();
System.out.println(cap);
System.out.println("Enter above captcha:");
String str=sc.next();
if(str.equals(cap))
System.out.println("Entered Captcha is Correct");
else{
System.out.println("Entered Captcha is not Correct");
Runtime.getRuntime().exec( "command /c cls" ) ;
main();
}
}
public String generateCaptchaString() {
	Random random = new Random();
	int length = 7 + (Math.abs(random.nextInt()) % 3);

	StringBuffer captchaStringBuffer = new StringBuffer();
	for (int i = 0; i < length; i++) {
		int baseCharNumber = Math.abs(random.nextInt()) % 62;
		int charNumber = 0;
		if (baseCharNumber < 26) {
			charNumber = 65 + baseCharNumber;
		}
		else if (baseCharNumber < 52){
			charNumber = 97 + (baseCharNumber - 26);
		}
		else {
			charNumber = 48 + (baseCharNumber - 52);
		}
		captchaStringBuffer.append((char)charNumber);
	}

	return captchaStringBuffer.toString();
}
}