class Prac{

	public static void main(String[] args){
	
		String text="matheesha123";
		
		int length=text.length();
		int num=0;
		int str=0;
		double sumOfprob=0.0;
		double probabilityOfchar=0.0;
		
		for(int i=0;i<length;i++){
			int count=0;
			
			for(int c=1;c<i+1;c++){
				if(text.charAt(i)==text.charAt(c)){
					break;
				}
				
				for(int j=i;j<length;j++){
				
					if(text.charAt(i)==text.charAt(j)){
						System.out.println(text.charAt(j));
						count++;
					}
				}
			
			}
			if(count>0){
				probabilityOfchar=count/length;
				System.out.println(probabilityOfchar);
			}
			
			sumOfprob+=(-probabilityOfchar)*(Math.log(probabilityOfchar));
			
		}
		System.out.println(sumOfprob);
		
		
		
		
	}

}
