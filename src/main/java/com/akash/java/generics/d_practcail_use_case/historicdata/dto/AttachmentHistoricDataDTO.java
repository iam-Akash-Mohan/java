package com.akash.java.generics.d_practcail_use_case.historicdata.dto;

import com.akash.java.generics.d_practcail_use_case.snapshots.AttachmentSnapshotDTO;

/**
 * @author Akash M
 */
public class AttachmentHistoricDataDTO extends BaseHistoricDataDTO<AttachmentSnapshotDTO> {

    private AttachmentSnapshotDTO snapshot;

    @Override
    public AttachmentSnapshotDTO getSnapshot() {
        return snapshot;
    }
}
