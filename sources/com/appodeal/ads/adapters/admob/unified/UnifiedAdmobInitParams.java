package com.appodeal.ads.adapters.admob.unified;

import com.appodeal.ads.InitializeParams;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/appodeal/ads/adapters/admob/unified/UnifiedAdmobInitParams;", "Lcom/appodeal/ads/InitializeParams;", "isDisableMediationInit", "", "<init>", "(Z)V", "()Z", "toString", "", "admob_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UnifiedAdmobInitParams implements InitializeParams {
    private final boolean isDisableMediationInit;

    public UnifiedAdmobInitParams(boolean z10) {
        this.isDisableMediationInit = z10;
    }

    /* JADX INFO: renamed from: isDisableMediationInit, reason: from getter */
    public final boolean getIsDisableMediationInit() {
        return this.isDisableMediationInit;
    }

    @NotNull
    public String toString() {
        return "UnifiedAdmobInitParams(isDisableMediationInit=" + this.isDisableMediationInit + ")";
    }
}
