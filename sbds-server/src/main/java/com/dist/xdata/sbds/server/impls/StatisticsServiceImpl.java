package com.dist.xdata.sbds.server.impls;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSONArray;
import com.dist.xdata.sbds.api.StatisticsService;
import com.dist.xdata.sbds.domain.LandBalanceDTO;

@Service(version = "1.0.0", loadbalance = "roundrobin", timeout = 120000, retries = 1)
public class StatisticsServiceImpl implements StatisticsService {

	@Override
	public Object getLandBalance() {
		Resource resource = new ClassPathResource("data.json");
		InputStream inputStream = null;
		BufferedReader bufferedReader = null;
		try {
			inputStream = resource.getInputStream();
			bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
			String b;
			StringBuffer stringBuffer = new StringBuffer();
			while ((b = bufferedReader.readLine()) != null) {
				stringBuffer.append(b);
			}
			return JSONArray.parseArray(stringBuffer.toString(), LandBalanceDTO.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
				if (bufferedReader != null) {
					bufferedReader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return "暂无数据";
	}
}
