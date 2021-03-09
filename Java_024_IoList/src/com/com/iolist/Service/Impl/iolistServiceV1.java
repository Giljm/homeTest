package com.com.iolist.Service.Impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.com.iolist.model.IoListVO;

public class iolistServiceV1 {

	private List<IoListVO> ioVO;
	private String str매입매출;

	public iolistServiceV1() {
		ioVO = new ArrayList<IoListVO>();
		str매입매출 = "src/com/com/iolist/애입매출데이터.txt";

	}

	public void loadiolist() {
		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(str매입매출);
			buffer = new BufferedReader(fileReader);

			int Buy = 0;
			int Sell = 0;

			while (true) {
				String reader = buffer.readLine();
				String scores[] = reader.split(","); // 읽은 값을 , 로 나눔

				if (reader == null) {
					break;

				}

				System.out.println(scores[0] + "\t" + scores[4] + "\t\t\t" + scores[5] + "\t\t\t" + scores[6]);

			}
		} catch (FileNotFoundException e) {
			e.getStackTrace();
		} catch (IOException e) {
			e.getStackTrace();
		}

	}

}