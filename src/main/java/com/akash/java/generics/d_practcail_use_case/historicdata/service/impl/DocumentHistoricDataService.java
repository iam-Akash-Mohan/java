package com.akash.java.generics.d_practcail_use_case.historicdata.service.impl;

import com.akash.java.generics.d_practcail_use_case.constants.HistoricDataType;
import com.akash.java.generics.d_practcail_use_case.historicdata.dto.DocumentHistoricDataDTO;
import com.akash.java.generics.d_practcail_use_case.historicdata.service.HistoricDataService;

/**
 * @author Akash M
 */
public class DocumentHistoricDataService implements HistoricDataService<DocumentHistoricDataDTO> {
    @Override
    public DocumentHistoricDataDTO save(DocumentHistoricDataDTO dto) {
        return null;
    }

    @Override
    public HistoricDataType getType() {
        return HistoricDataType.DOCUMENT;
    }
}
