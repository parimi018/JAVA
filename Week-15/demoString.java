class demoString
{
	public static void main(String args[])
	{
		String str = "    Tayyab & co"; 
		System.out.println("Original string: " + str);
		System.out.println("trim(): " + str.trim());
		str = str.trim();
		System.out.println("toLowerCase(): " + str.toLowerCase());
		System.out.println("toUpperCase(): " + str.toUpperCase());
		System.out.println("length(): " + str.length());
		System.out.println("charAt(4): " + str.charAt(4));
		System.out.println("indexOf('o'): " + str.indexOf('o'));
		System.out.println("substring(3, 10): " + str.substring(3, 10));
		System.out.println("replace(\"Tayyab & co\", \"TAYYAB &CO\"): " + str.replace("Tayyab & co", "TAYYAB &CO"));
		System.out.println("equalsIgnoreCase(\"TaYyab &Co\"): " + str.equalsIgnoreCase("TaYyab &Co"));
		System.out.println("contains(\"&\"): " + str.contains("&"));
	}
}