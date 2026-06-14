package com.fyber.inneractive.sdk.cache;

import com.fyber.inneractive.sdk.network.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f20218a;

    public h(k kVar) {
        this.f20218a = kVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        String str = (String) obj;
        if (str != null) {
            this.f20218a.f20223c = str;
        }
    }
}
