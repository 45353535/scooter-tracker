package com.fyber.inneractive.sdk.flow.endcard;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class p extends u {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f20706j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f20707k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f20708l;

    public p(o oVar) {
        super(oVar);
        com.fyber.inneractive.sdk.model.vast.o oVar2 = oVar.f20648c.f21045e.f21166f;
        this.f20706j = oVar2 != null ? oVar2.f21217a : null;
    }

    public final void b(com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a aVar) {
        if (TextUtils.isEmpty(this.f20718e) || TextUtils.isEmpty(this.f20707k)) {
            return;
        }
        if (this.f20719f || !this.f20721h.compareAndSet(false, true)) {
            IAlog.a("%sisWebLoaded: %s, mFmpEndCardPrepareInProgress: %s", this.f20644a, Boolean.valueOf(this.f20719f), Boolean.valueOf(this.f20721h.get()));
        } else {
            a(aVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.u
    public final q d() {
        b bVar = this.f20645b;
        return new q(bVar.f20648c.f21045e, (o) bVar);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.u
    public final boolean f() {
        return false;
    }
}
