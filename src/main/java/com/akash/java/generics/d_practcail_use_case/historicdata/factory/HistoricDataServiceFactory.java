package com.akash.java.generics.d_practcail_use_case.historicdata.factory;

import com.akash.java.generics.d_practcail_use_case.constants.HistoricDataType;
import com.akash.java.generics.d_practcail_use_case.historicdata.dto.BaseHistoricDataDTO;
import com.akash.java.generics.d_practcail_use_case.historicdata.service.HistoricDataService;

/**
 * @author Akash M
 */
public interface HistoricDataServiceFactory {
    <T extends BaseHistoricDataDTO<?>> HistoricDataService<T> getHistoricDataService(
        HistoricDataType historicDataType
    );
}


//What I did
//public interface HistoricDataServiceFactory {
//    HistoricDataService<?> getHistoricDataService(HistoricDataType historicDataType);
//}