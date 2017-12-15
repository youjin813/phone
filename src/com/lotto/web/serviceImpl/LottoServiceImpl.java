package com.lotto.web.serviceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.lotto.web.bean.LottoBean;
import com.lotto.web.service.LottoService;

public class LottoServiceImpl implements LottoService{
	private List<LottoBean> lottos;
	public LottoServiceImpl() {
		lottos = new ArrayList<LottoBean>();
	}

	@Override
	public void makeLottos(LottoBean bean) {
		LottoBean lotto = null;
		/**if(bean.getMoney()>5000) {
		bean.setMoney("5000");
		}*/
		for(int i=0;i<bean.getMoney()/1000;i++) {
			lotto = new LottoBean();
			lotto.setNumber(makeLotto());
			lottos.add(lotto);
			}
		System.out.println(""+lottos);
		}
	
	@Override
	public int[] makeLotto() {
		int[] lotto = new int[6];
		for(int i=0;i<6;i++) {
			int num = (int)(Math.random()*45)+1;
			boolean exist = false;
			for(int j=0;j<lotto.length;j++) {
				if(num == lotto[j]) {
					exist = true;
					break;
				}
			}
			if(exist) {
				i--;
				continue;
			}else {
				lotto[i]=num;
			}
		}
		Arrays.sort(lotto);	
		for(int i=0;i<6;i++) {
			System.out.println(lotto[i]);
		}
		return lotto;
		}
	@Override
	public List<LottoBean> showLottos() {
		// TODO Auto-generated method stub
		return null;
		}
	}
