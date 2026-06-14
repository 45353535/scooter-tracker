package com.startapp.sdk.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f64900a;

    public m(p pVar) {
        this.f64900a = pVar;
    }

    public final void a(x2 x2Var) {
        synchronized (this.f64900a.f65057a) {
            try {
                Iterator it = this.f64900a.f65057a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (it.next() == x2Var) {
                        it.remove();
                        break;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
