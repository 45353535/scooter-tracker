package com.fyber.inneractive.sdk.activities;

import com.fyber.inneractive.sdk.click.q;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements com.fyber.inneractive.sdk.click.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveInternalBrowserActivity f20147a;

    public h(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f20147a = inneractiveInternalBrowserActivity;
    }

    @Override // com.fyber.inneractive.sdk.click.o
    public final void a(com.fyber.inneractive.sdk.click.b bVar) {
        if (bVar.f20249a != q.FAILED) {
            InneractiveInternalBrowserActivity.a(this.f20147a, bVar);
            this.f20147a.finish();
        }
    }
}
