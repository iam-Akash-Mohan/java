package com.akash.java;

import com.akash.java.generics.d_practcail_use_case.constants.HistoricDataType;
import com.akash.java.generics.d_practcail_use_case.historicdata.dto.BaseHistoricDataDTO;
import com.akash.java.generics.d_practcail_use_case.historicdata.factory.HistoricDataServiceFactory;
import com.akash.java.generics.d_practcail_use_case.historicdata.service.HistoricDataService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Akash M
 */
@SpringBootTest
class HistoricDataTest {

    @Autowired
    private HistoricDataServiceFactory historicDataServiceFactory;

    @Test
    void test(){
        HistoricDataService<BaseHistoricDataDTO<?>> historicDataService =
                historicDataServiceFactory.getHistoricDataService(HistoricDataType.DOCUMENT);
        historicDataService.save(null);
        HistoricDataService<BaseHistoricDataDTO<?>> historicDataService1 =
                historicDataServiceFactory.getHistoricDataService(HistoricDataType.ATTACHMENT);
        historicDataService1.save(null);
    }
}
