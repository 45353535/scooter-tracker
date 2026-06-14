package com.fyber.inneractive.sdk.cache;

import com.fyber.inneractive.sdk.network.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f20220a;

    public j(k kVar) {
        this.f20220a = kVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        String str = (String) obj;
        if (str != null) {
            this.f20220a.f20225e = str;
        }
    }
}
