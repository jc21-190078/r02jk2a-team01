
public class Kadai01 {

	/**
	 * 課題01
	 * 文字列の左右の文字を反転して返すメソッド
	 * @param s　対象の文字
	 * @return 左右を反転した結果
	 */
	String ReverseString(String s) {

			try{

			char[] array=s.toCharArray();

			char work;

//			int i;

//			int j;

			for (int i = 0 , j = array.length-1; i<j; i++ , j--) {


				work=array[i];

				array[i]=array[j];

				array[j]=work;

			}

			return new String(array);

			}

			catch(NullPointerException e) {
				System.out.println("終了します");

			}
			return s;	 
			}

	}