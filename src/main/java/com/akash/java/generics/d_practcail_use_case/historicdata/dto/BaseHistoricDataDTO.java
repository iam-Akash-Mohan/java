package com.akash.java.generics.d_practcail_use_case.historicdata.dto;

import com.akash.java.generics.d_practcail_use_case.historicdata.SnapshotProvider;
import com.akash.java.generics.d_practcail_use_case.snapshots.BaseSnapshotDTO;

/**
 * @author Akash M
 */
public abstract class BaseHistoricDataDTO<T extends BaseSnapshotDTO> implements SnapshotProvider<T> {
    private Long id;
    private Long entityId;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public Long getEntityId() {
        return entityId;
    }
}
