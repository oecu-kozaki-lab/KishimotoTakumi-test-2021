 import java.io.*;
 import java.util.*;
 
 public class j_Ex_3_2_1 {
  // CSVファイルをArrayListに読み込み
  public static void main(String[] args) {
  BufferedReader br = null;
  BufferedWriter bw = null;
  String Read_file_name = "Q7105556.nt"; // 入力ファイル
  String Write_file_name = "Q7105556_W.nt"; //出力ファイル
  try {
  File Rfile = new File(Read_file_name);
  File Wfile = new File(Write_file_name);
  br = new BufferedReader(new FileReader(Rfile));
  bw = new BufferedWriter(new FileWriter(Wfile));
  
  
  String line;
  while ((line = br.readLine()) != null) {

	// readLineで一行ずつ読み込む
	  line = br.readLine();
	//<http://www.wikidata.org/prop/direct/P31>を含む行を判定して書き込む
	  if(line.indexOf("<http://www.wikidata.org/prop/direct/P31>") >= 0){
		 
		  if(line.indexOf("http://www.wikidata.org/prop/direct/") >= 0) {
			 line = line.replace("http://www.wikidata.org/prop/direct/", "wdt:");  
	
		  }
		  if(line.indexOf("http://www.wikidata.org/entity/") >= 0) {
			 line = line.replace("http://www.wikidata.org/entity/", "wd:");
		  }
		//System.out.println(line);
		  bw.write(line);
	  }
	  //<http://www.wikidata.org/prop/direct/P279>を含む行を判定して書き込む
	 if(line.indexOf("<http://www.wikidata.org/prop/direct/P279>") >= 0){
		 if(line.indexOf("http://www.wikidata.org/prop/direct/") >= 0) {
			line = line.replace("http://www.wikidata.org/prop/direct/", "wdt:");  
		  }
		  if(line.indexOf("http://www.wikidata.org/entity/") >= 0) {
			 line = line.replace("http://www.wikidata.org/entity/", "wd:");
		  }
		  bw.write(line);
	  }
	 //<http://www.w3.org/2004/02/skos/core#altLabel>かつラベルの言語が日本語、または英語である行を判定して書き込む
	 if(line.indexOf("<http://www.w3.org/2004/02/skos/core#altLabel>") >= 0) {
		 if(line.indexOf("@ja") >= 0) {
			 if(line.indexOf("http://www.wikidata.org/prop/direct/") >= 0) {
				 line = line.replace("http://www.wikidata.org/prop/direct/", "wdt:");  
			  }
			  if(line.indexOf("http://www.wikidata.org/entity/") >= 0) {
				line = line.replace("http://www.wikidata.org/entity/", "wd:");
			  }
			 bw.write(line);
		 }
		 if(line.indexOf("@en") >= 0) {
			 if(line.indexOf("http://www.wikidata.org/prop/direct/") >= 0) {
				 line = line.replace("http://www.wikidata.org/prop/direct/", "wdt:");  
			  }
			  if(line.indexOf("http://www.wikidata.org/entity/") >= 0) {
				line = line.replace("http://www.wikidata.org/entity/", "wd:");
			  }
			 bw.write(line);
			 
		 }
	 }
	 //<http://www.w3.org/2000/01/rdf-schema#label>かつラベルの言語が日本語、または英語である行を判定して書き込む
	 if(line.indexOf("<http://www.w3.org/2000/01/rdf-schema#label>") >= 0) {
		 if(line.indexOf("@ja") >= 0) {
			 if(line.indexOf("http://www.wikidata.org/prop/direct/") >= 0) {
				 line = line.replace("http://www.wikidata.org/prop/direct/", "wdt:");  
			  }
			  if(line.indexOf("http://www.wikidata.org/entity/") >= 0) {
				 line = line.replace("http://www.wikidata.org/entity/", "wd:");
			  }
			 bw.write(line);
		 }
		 if(line.indexOf("@en") >= 0) {
			 if(line.indexOf("http://www.wikidata.org/prop/direct/") >= 0) {
				 line = line.replace("http://www.wikidata.org/prop/direct/", "wdt:");  
			  }
			  if(line.indexOf("http://www.wikidata.org/entity/") >= 0) {
				line = line.replace("http://www.wikidata.org/entity/", "wd:");
			  }
			 bw.write(line);
			 
		 }
	 }
  }
  } catch (Exception e) {
	  System.out.println(e.getMessage());
	  } finally {
	  try {
	  br.close();
	  bw.close();
	  } catch (Exception e) {
	  System.out.println(e.getMessage());
	  }
	  }


  System.out.print("終了しました");
 }
 }
 