package com.akash.java.generics.d_practcail_use_case.historicdata.dto;

import com.akash.java.generics.d_practcail_use_case.historicdata.model.BaseHistoricData;
import com.akash.java.generics.d_practcail_use_case.snapshots.DocumentSnapshotDTO;

/**
 * @author Akash M
 */
public class DocumentHistoricDataDTO extends BaseHistoricDataDTO<DocumentSnapshotDTO> {
    private DocumentSnapshotDTO snapshot;

    @Override
    public DocumentSnapshotDTO getSnapshot() {
        return snapshot;
    }
}
