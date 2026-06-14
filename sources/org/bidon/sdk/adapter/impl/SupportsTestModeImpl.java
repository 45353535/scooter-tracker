package org.bidon.sdk.adapter.impl;

import kotlin.Metadata;
import org.bidon.sdk.adapter.SupportsTestMode;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lorg/bidon/sdk/adapter/impl/SupportsTestModeImpl;", "Lorg/bidon/sdk/adapter/SupportsTestMode;", "<init>", "()V", "isTestMode", "", "()Z", "setTestMode", "(Z)V", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SupportsTestModeImpl implements SupportsTestMode {
    private boolean isTestMode;

    @Override // org.bidon.sdk.adapter.SupportsTestMode
    /* JADX INFO: renamed from: isTestMode, reason: from getter */
    public boolean getIsTestMode() {
        return this.isTestMode;
    }

    @Override // org.bidon.sdk.adapter.SupportsTestMode
    public void setTestMode(boolean z10) {
        this.isTestMode = z10;
    }
}
