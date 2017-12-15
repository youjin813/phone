package com.lotto.web.service;

import java.util.List;

import com.lotto.web.bean.LottoBean;

public interface LottoService {
	public void makeLottos(LottoBean lotto);

	public List<LottoBean> showLottos();

	public int[] makeLotto();
	
	
}

