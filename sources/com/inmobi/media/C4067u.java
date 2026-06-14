package com.inmobi.media;

import com.squareup.picasso.Callback;

/* JADX INFO: renamed from: com.inmobi.media.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4067u implements Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4117w f39624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.e f39625b;

    public C4067u(C4117w c4117w, kotlinx.coroutines.e eVar) {
        this.f39624a = c4117w;
        this.f39625b = eVar;
    }

    @Override // com.squareup.picasso.Callback
    public final void onError(Exception exc) {
        C3903n9 c3903n9 = this.f39624a.f39810d;
        if (c3903n9 != null) {
            c3903n9.a("AdChoiceViewManager", "onError Called " + exc);
        }
        P4.a(this.f39625b, Boolean.FALSE);
    }

    @Override // com.squareup.picasso.Callback
    public final void onSuccess() {
        C3903n9 c3903n9 = this.f39624a.f39810d;
        if (c3903n9 != null) {
            c3903n9.a("AdChoiceViewManager", "onSuccess Called");
        }
        P4.a(this.f39625b, Boolean.TRUE);
    }
}
