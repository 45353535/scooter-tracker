package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.Moloco;

/* JADX INFO: loaded from: classes10.dex */
public final class x implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55465b = "SDKInitStateSignalProvider";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f55466c = Moloco.isInitialized();

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.f55466c = Moloco.isInitialized();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        StringBuilder sb2;
        boolean z10 = this.f55466c;
        boolean zIsInitialized = Moloco.isInitialized();
        boolean z11 = z10 != zIsInitialized;
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        String str = this.f55465b;
        if (z11) {
            sb2 = new StringBuilder();
            sb2.append("[CBT] sdkInitialized updated from ");
            sb2.append(z10);
            sb2.append(" to ");
            sb2.append(zIsInitialized);
        } else {
            sb2 = new StringBuilder();
            sb2.append("[CBT] sdkInitialized didn't change (before: ");
            sb2.append(z10);
            sb2.append(", after: ");
            sb2.append(zIsInitialized);
            sb2.append(')');
        }
        MolocoLogger.debugBuildLog$default(molocoLogger, str, sb2.toString(), false, 4, null);
        return z11;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public String c() {
        return this.f55465b;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Boolean d() {
        return Boolean.valueOf(this.f55466c);
    }
}
