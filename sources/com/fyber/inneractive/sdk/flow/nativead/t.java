package com.fyber.inneractive.sdk.flow.nativead;

import android.net.Uri;
import com.fyber.inneractive.sdk.network.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.nativead.f f20838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f20839b;

    public t(com.fyber.inneractive.sdk.response.nativead.f fVar, s sVar) {
        this.f20838a = fVar;
        this.f20839b = sVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        Uri uri = (Uri) obj;
        if (exc instanceof com.fyber.inneractive.sdk.network.g) {
            return;
        }
        if (exc != null || uri == null) {
            this.f20839b.a(null, exc, this.f20838a);
            return;
        }
        s sVar = this.f20839b;
        com.fyber.inneractive.sdk.response.nativead.f fVar = this.f20838a;
        sVar.a(new g(fVar.f23755a, uri), null, fVar);
    }
}
