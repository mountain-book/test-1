import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 */

/**
 * @author internousdev
 *
 */
public class Hello {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("入力してください");
		String t=br.readLine();
		System.out.println(t);
		// TODO 自動生成されたメソッド・スタブ

	}

}
