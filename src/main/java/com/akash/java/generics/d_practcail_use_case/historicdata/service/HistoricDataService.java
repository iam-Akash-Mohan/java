package com.akash.java.generics.d_practcail_use_case.historicdata.service;

import com.akash.java.generics.d_practcail_use_case.constants.HistoricDataType;
import com.akash.java.generics.d_practcail_use_case.historicdata.dto.BaseHistoricDataDTO;

import java.util.List;

/**
 * @author Akash M
 */
public interface HistoricDataService<T extends BaseHistoricDataDTO<?>> {
    T save(T dto);
    List<T> saveAll(List<T> dtos);
    HistoricDataType getType();
}
