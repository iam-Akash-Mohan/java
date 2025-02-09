package com.akash.java.generics.d_practcail_use_case.historicdata.service.impl;

import com.akash.java.generics.d_practcail_use_case.constants.HistoricDataType;
import com.akash.java.generics.d_practcail_use_case.historicdata.dto.AttachmentHistoricDataDTO;
import com.akash.java.generics.d_practcail_use_case.historicdata.service.HistoricDataService;
import org.springframework.stereotype.Service;

/**
 * @author Akash M
 */
@Service
class AttachmentHistoricDataService implements HistoricDataService<AttachmentHistoricDataDTO> {

    @Override
    public AttachmentHistoricDataDTO save(AttachmentHistoricDataDTO dto) {
        return null;
    }

    @Override
    public HistoricDataType getType() {
        return HistoricDataType.ATTACHMENT;
    }
}
