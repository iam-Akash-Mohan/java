package com.akash.java.generics.d_practcail_use_case.historicdata.service.impl;

import com.akash.java.generics.d_practcail_use_case.constants.HistoricDataType;
import com.akash.java.generics.d_practcail_use_case.historicdata.dto.DocumentHistoricDataDTO;
import com.akash.java.generics.d_practcail_use_case.historicdata.service.HistoricDataService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Akash M
 */
@Service
class DocumentHistoricDataService implements HistoricDataService<DocumentHistoricDataDTO> {
    @Override
    public DocumentHistoricDataDTO save(DocumentHistoricDataDTO dto) {
        return null;
    }

    @Override
    public List<DocumentHistoricDataDTO> saveAll(List<DocumentHistoricDataDTO> dtos) {
        return null;
    }

    @Override
    public HistoricDataType getType() {
        return HistoricDataType.DOCUMENT;
    }
}
