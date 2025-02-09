package com.akash.java.generics.d_practcail_use_case.historicdata.factory.impl;

import com.akash.java.generics.d_practcail_use_case.constants.HistoricDataType;
import com.akash.java.generics.d_practcail_use_case.historicdata.dto.BaseHistoricDataDTO;
import com.akash.java.generics.d_practcail_use_case.historicdata.factory.HistoricDataServiceFactory;
import com.akash.java.generics.d_practcail_use_case.historicdata.service.HistoricDataService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Akash M
 */
@Service
class HistoricDataServiceFactoryImpl implements HistoricDataServiceFactory {
    private final Map<HistoricDataType, HistoricDataService<? extends BaseHistoricDataDTO<?>>> historicDataServiceMap;

    public HistoricDataServiceFactoryImpl(
        List<HistoricDataService<? extends BaseHistoricDataDTO<?>>> historicDataServices
    ) {
        this.historicDataServiceMap = historicDataServices.stream()
                .collect(Collectors.toMap(HistoricDataService::getType, Function.identity()));
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T extends BaseHistoricDataDTO<?>> HistoricDataService<T> getHistoricDataService(
        HistoricDataType historicDataType
    ) {
        return (HistoricDataService<T>) historicDataServiceMap.get(historicDataType);
    }
}
