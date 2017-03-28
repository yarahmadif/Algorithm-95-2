public static void BubbleSortt(File file){
		
		/*
		 fatemeh yarahmadi 9450033
		 samaneh shoheib   9450014
		 yasaman mansouri  9599947
		 
		 run-time=over 24 hours
		 worst case=O(n^2)
		 */
		
		ArrayList< Integer> MyArray=new ArrayList<>();
		
		
		try{ 
	    	FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				 String[] str;
	                str= line.split(",");
	             
	                for(int i=0;i<str.length;i++){
	                	MyArray.add(Integer.parseInt(str[i]));
	                }
	                
			}
			fileReader.close();
	    }catch (Exception e) {
		}
		
		 boolean change;
		    do {
		        change = false;
		        for (int i = 0; i<MyArray.size()-1; i++) {
		        	int m=i+1;
		             if (MyArray.get(i) > MyArray.get(m)) {
		                 int temp =MyArray.get(i);
		                 MyArray.set(i, MyArray.get(m));
		                 MyArray.set(m, temp);
		                 change = true;
	             }
		        }
		    } while (change);
		    
		
		    
	}