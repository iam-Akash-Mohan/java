package com.akash.java.generics.d_practcail_use_case.historicdata;

import com.akash.java.generics.d_practcail_use_case.snapshots.BaseSnapshotDTO;

/**
 * @author Akash M
 */
public interface SnapshotProvider<T extends BaseSnapshotDTO> {
    Long getId();
    Long getEntityId();
    T getSnapshot();
}
