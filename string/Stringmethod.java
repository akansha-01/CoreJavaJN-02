package string;
public class StringMethods {
	public static void main(String[] args) {
		String s= new String ("Strings are constant ; their values cannot be changed"
				+  " are created String buffers "
				+ " because String objects are immutable");
		System.out.println(s);
		System.out.println("Length : "+s.length());
		System.out.println("char at 3 :"+s.charAt(3));
		System.out.println("index of String : "+s.indexOf("are"));
		System.out.println("index of String : "+s.indexOf("String",3));
		System.out.println("index of String : "+s.lastIndexOf("String"));
		
		String s1 ="Hello";
		String s2=" Hi";
		String s3 ="Hello";
		System.out.println(s3.compareTo(s1));
		System.err.println(s1);
		System.out.println(s1.isEmpty());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1);
		
        StringBuffer sb = new StringBuffer(s1);
        System.out.println(sb);
        sb.append(", How are you?");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.replace(5, 4, "! ");
        System.out.print(sb);
        s1=sb.toString();
        System.out.println(s1);           
	}
}
