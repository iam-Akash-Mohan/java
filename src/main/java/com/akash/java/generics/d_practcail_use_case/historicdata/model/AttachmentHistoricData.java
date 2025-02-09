package com.akash.java.generics.d_practcail_use_case.historicdata.model;

import com.akash.java.generics.d_practcail_use_case.snapshots.AttachmentSnapshotDTO;

/**
 * @author Akash M
 */
public class AttachmentHistoricData extends BaseHistoricData<AttachmentSnapshotDTO> {

    private AttachmentSnapshotDTO snapshot;

    @Override
    public AttachmentSnapshotDTO getSnapshot() {
        return snapshot;
    }
}
