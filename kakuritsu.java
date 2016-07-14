class kakuritsu{

    public static void main(String args[]){
	
	//	Random rand = new Random();
	int num = 0;
	int round = 1000;
	
	for(int i = 1; i <= round; i++){
	int rand = (int)(Math.random()*100);	    
	    switch(rand){
	    case 1:
		System.out.println(i + "回転目 : 当たり!!!! " + rand);
		num++;
		break;
	    default:
		System.out.println( i + "回転目 : はずれ " + rand);
	    }		
	}
	System.out.println("");
	System.out.println(round + "回転であなたは " + num + " 回当たりました");
	
    }
    
}