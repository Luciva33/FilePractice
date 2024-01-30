import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		String path = "data. txt";
		List<String> list = new ArrayList<String>();

		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"))) {

			String line = null;
			while ((line = br.readLine()) != null) {

				//int num = Integer.parseInt(line);
				list.add(line);
			}

		} catch (IOException e) {

		}

		for (String s : list) {
			System.out.println(s);
		}
	}

	public void save() {

		String path = "data. txt";
		try (BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream(path, true), "UTF-8"))) {

			bw.write("Hello,world!\n");
			bw.write("今日はいい天気\n");
			bw.write("書き込みの終了\n");

		} catch (IOException e) {

		}

	}

}
