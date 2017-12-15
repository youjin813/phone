package com.lotto.web.controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.Provider.Service;

import javax.swing.JOptionPane;

import com.lotto.web.bean.LottoBean;
import com.lotto.web.constants_Pool.Value;
import com.lotto.web.service.LottoService;
import com.lotto.web.serviceImpl.LottoServiceImpl;

public class LottoController {
	public static void main(String[] args) {
		LottoService lottoService = new LottoServiceImpl(); 
		LottoBean lotto ; 

		while(true) {
			switch(JOptionPane.showInputDialog(Value.MENU)) {
			case "0":
				JOptionPane.showMessageDialog(null, "시스템 종료");
				return;
			case "1":
				lotto = new LottoBean();
				lotto.setMoney(Integer.parseInt(JOptionPane.showInputDialog("얼마?")));   //Integer.parseInt int를 string으로
				lottoService.makeLottos(lotto);
				break;
			case "2":
				JOptionPane.showMessageDialog(null, lottoService.showLottos());
				//로또 번호 생성 임플에서 동작(메소드)만들어야함 1~45까지 랜덤 숫자 생성 겹치면 안돼 번호 생성해서 가지고 있음 
				break;
			case "3":
				File f = new File("C:\\Users\\hb1002\\jse\\workspace\\lotto\\lotto.txt");
				BufferedWriter bw = null;
				try {
					bw = new BufferedWriter(new FileWriter(f));
					bw.write("로또번호 : 1 2 3 4 5 6 ");
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						bw.flush();
						bw.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				//번호 보여줌
				break;
			}
		}
	}
}
