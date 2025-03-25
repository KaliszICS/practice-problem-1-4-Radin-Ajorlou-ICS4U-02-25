import java.io.*;
import java.util.*;


public class PracticeProblem {

	public static void main(String args[]) {
		
	}


	public static String getName(int line, String file)
	{
		String output = "";
		Scanner inputStream = null;
		String name = "";
		try{
			inputStream = new Scanner( new BufferedReader (new FileReader(file)));
			for (int i = 1; i <= line-1; i++ ){

				String useless = inputStream.nextLine();
			}
			name = inputStream.next() + " " + inputStream.next();

		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			try {
				if (inputStream != null)
				{
					inputStream.close();
				}
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		return name;

	}




	public static int getAge(int line, String file){
		Scanner scanner = null;
		int age = -1; 
		int i; 
		try{
			scanner =  new Scanner(new BufferedReader(new FileReader(file)));
			for (i = 1; i <= line - 1; i++){
				String useless = scanner.nextLine();
			}
			if (i > 1){
				String useless = scanner.next();
				useless = scanner.next();
				age = scanner.nextInt();
			}

		}
		catch(IOException e){
			System.out.println(e);
		}
		finally{
			if (scanner != null){
				scanner.close();
			}
		}
		return age;
	}



	public static int getNumber(int line, String file){
		Scanner scanner = null;
		int num = -1;
		int i;
		try{
			scanner = new Scanner(new BufferedReader(new FileReader(file)));
			for (i = 1; i <= line - 1; i++){
				if (scanner.hasNextLine()){
					scanner.nextLine();
				}
				else {
					return -1;
				}
			}
			if (line != 0){
				scanner.next();
				scanner.next();
				scanner.next();
				num = scanner.nextInt();
			}

		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		finally{
			if (scanner != null){
				scanner.close();
			}
		}
		return num;
	}











	public static void fileAppend(String output, String fileName)
	{
		BufferedWriter bw = null; 
		try
		{
			bw = new BufferedWriter(new FileWriter(fileName, true));
			bw.write(output);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		finally 
		{
			try
			{
				if (bw != null)
				{
					bw.close();
				}
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
		}


	}











}
