package com.fyber.inneractive.sdk.cache;

import com.fyber.inneractive.sdk.network.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f20217a;

    public g(k kVar) {
        this.f20217a = kVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        String str = (String) obj;
        if (str != null) {
            this.f20217a.f20222b = str;
        }
    }
}
