package com.unity3d.mediation.adapters.levelplay;

import com.ironsource.mediationsdk.adunit.adapter.BaseAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdaptiveInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public abstract class LevelPlayBaseAdapter extends BaseAdapter implements AdapterMetaDataInterface, AdapterAdaptiveInterface {
    private boolean mAdapterDebug;

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdaptiveInterface
    public int getAdaptiveHeight(int i10) {
        return -1;
    }

    public boolean isAdaptersDebugEnabled() {
        return this.mAdapterDebug;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.BaseAdapter, com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface
    public void setAdapterDebug(boolean z10) {
        this.mAdapterDebug = z10;
    }

    public void setMetaData(@Nullable String str, @Nullable List<String> list) {
    }
}
