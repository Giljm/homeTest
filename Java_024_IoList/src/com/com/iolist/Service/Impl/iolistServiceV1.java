package com.com.iolist.Service.Impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.com.iolist.model.IoVO;

public class iolistServiceV1 {

	private List<IoVO> ioVO;
	private String str매입매출;

	public iolistServiceV1() {
		ioVO = new ArrayList<IoVO>();
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

				} else {
					IoVO vo = new IoVO(scores[0], scores[1], scores[2], scores[3], scores[4], scores[5], scores[6],
							Integer.valueOf(scores[7]), Integer.valueOf(scores[8]), Integer.valueOf(scores[9]),
							Integer.valueOf(scores[10]));

					ioVO.add(vo);
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