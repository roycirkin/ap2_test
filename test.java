public class main {
	
	
public static void main(String[] args) throws Exception{

	String s1 = "<Button     onAction =     \"function\"  Text=\"abcde\"   >";
	String s2 = "<Button    Text=     \"abcde\"onAction   =   \"function\"   >";

	String [] splitByText = s2.split("Text");// can be switched with s1
	String [] splitByOnAction = s2.split("onAction");// can be switched with s1
	
	if (splitByText[0].length() > splitByOnAction[0].length()) {
		String after = splitByOnAction[1];
		int start = after.indexOf("\"", 0);
		int end = after.indexOf("\"", start+1);
		String command = after.substring(start+1, end);
		
		System.out.println(command); //the command
		
		after= after.substring(end+1);
		String[] splitbyText = after.split("Text");
		String aferText = splitbyText[1];
		String[] afterByText = aferText.split("\"");
		int len = afterByText.length;
		int lenEnd = afterByText[len-1].length();
		int lenstart = afterByText[0].length();
		System.out.println(aferText.substring(lenstart+1, aferText.length()- lenEnd-1)); // printing the text
	} else {
		String afterText = splitByText[1];
		String [] splited = afterText.split("\"");
		int splitedLength = splited.length;
		String commandName = splited[splitedLength-2];
		
		System.out.println(commandName); //the command
		
		int start = splited[0].length()+1;
		int end = afterText.length() - splited[splitedLength - 1].length()
				- splited[splitedLength - 2].length() - splited[splitedLength - 3].length() - 3;
		String text = afterText.substring(start, end);
		System.out.println(text);// printing the text

	}











}





}