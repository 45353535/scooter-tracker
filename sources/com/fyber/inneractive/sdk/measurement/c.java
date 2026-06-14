package com.fyber.inneractive.sdk.measurement;

import com.fyber.inneractive.sdk.network.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f21092a;

    public c(e eVar) {
        this.f21092a = eVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        String str = (String) obj;
        if (str != null) {
            this.f21092a.f21098d = str;
        }
    }
}
