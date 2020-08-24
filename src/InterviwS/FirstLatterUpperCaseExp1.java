package InterviwS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstLatterUpperCaseExp1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("please enter some name");
		String input=br.readLine();
		StringBuilder sb=new StringBuilder(input.length());
		String[] word=input.split("\\ ");
		for(int i=0; i<word.length;i++)
		{
			sb.append(Character.toUpperCase(word[i].charAt(0))).
			append(word[i].substring(1)).append(" ");
		}
		System.out.println(sb);
		

	}




	}


