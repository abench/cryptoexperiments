package abench.info.puzzle.exp;

public class CoolCryptoAnalysis {
	static String openText="creature_creature_creature";
	static String cipherText="]VTYJQC]aGC]_PDJ[{RJ[EEMLA";	 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0;i<openText.length();i++){

			//System.out.println(99|93);
			System.out.println(openText.charAt(i)+"\t"+
								(int)openText.charAt(i)+
								"\t"+
								cipherText.charAt(i)+"\t"+
								(int)cipherText.charAt(i)+
								"\t"+
								(char)((int)openText.charAt(i)^(int)cipherText.charAt(i))+
								"\t"+
								((int)openText.charAt(i)^(int)cipherText.charAt(i))
								);
			
		};

	}

}
