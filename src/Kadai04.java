
public class Kadai04 {

	/**
	 * 課題04
	 * 文字列の中に含まれるアルファベットの中で、一番多く使われている文字を返す
	 * @param s 文字列
	 * @return sの中に入っていた文字
	 */
	char getMaxString(String s){
	    int[] alphabet = new int[26];
	    char[] ch = s.toUpperCase().toCharArray();
	    int max=0;
	    int ap;
	    for(int i=0;i<ch.length;i++){
	        ap=ch[i]-'A';
	        alphabet[ap]++;
	        max=Math.max(max, alphabet[ap]);
	    }
	    char cm=' ';
	    for(int i=0;i<alphabet.length;i++){
	        if(max == alphabet[i]){
	            cm = (char) (i+'A');
	            break;
	        }
	    }
	    return cm;
	}
}