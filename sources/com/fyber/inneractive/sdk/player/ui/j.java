package com.fyber.inneractive.sdk.player.ui;

import com.fyber.inneractive.sdk.player.controller.z;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.u1;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f23368b;

    public j(l lVar, int i10) {
        this.f23368b = lVar;
        this.f23367a = i10;
    }

    @Override // com.fyber.inneractive.sdk.util.u1
    public final void a() {
        if (this.f23368b.f23363h) {
            IAlog.a("Autoclick is aborted - app in background", new Object[0]);
        } else {
            IAlog.a("Autoclick is triggered", new Object[0]);
            ((z) this.f23368b.f23362g).a(this.f23367a, l.I);
        }
        this.f23368b.p();
    }
}
