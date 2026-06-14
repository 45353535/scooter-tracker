package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
final class aa extends t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ IBinder f28757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ ad f28758d;

    aa(ad adVar, IBinder iBinder) {
        this.f28758d = adVar;
        this.f28757c = iBinder;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        this.f28758d.f28760b.f28775n = (IInterface) this.f28758d.f28760b.f28770i.a(this.f28757c);
        ae.r(this.f28758d.f28760b);
        this.f28758d.f28760b.f28768g = false;
        Iterator it = this.f28758d.f28760b.f28765d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f28758d.f28760b.f28765d.clear();
    }
}
