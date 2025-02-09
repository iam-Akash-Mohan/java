package com.akash.java.generics.d_practcail_use_case.historicdata;

import com.akash.java.generics.d_practcail_use_case.snapshots.DocumentSnapshotDTO;

/**
 * @author Akash M
 */
public class DocumentHistoricData extends BaseHistoricData<DocumentSnapshotDTO> {
    private DocumentSnapshotDTO snapshot;

    @Override
    public DocumentSnapshotDTO getSnapshot() {
        return snapshot;
    }
}
