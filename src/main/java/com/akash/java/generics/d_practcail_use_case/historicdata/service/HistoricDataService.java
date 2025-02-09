package com.akash.java.generics.d_practcail_use_case.historicdata.service;

import com.akash.java.generics.d_practcail_use_case.constants.HistoricDataType;
import com.akash.java.generics.d_practcail_use_case.historicdata.dto.BaseHistoricDataDTO;

/**
 * @author Akash M
 */
public interface HistoricDataService<T extends BaseHistoricDataDTO<?>> {
    T save(T dto);
    HistoricDataType getType();
}
