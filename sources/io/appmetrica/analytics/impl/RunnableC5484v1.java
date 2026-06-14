package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC5484v1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f78408a;

    public RunnableC5484v1(Context context) {
        this.f78408a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Vj vj = AbstractC5452tj.f78304a;
        Context context = this.f78408a;
        synchronized (vj) {
            try {
                if (vj.f76603b == null) {
                    vj.f76603b = AbstractC5426si.f78240a.a(context, "20799a27-fa80-4b36-b2db-0f8141f24180");
                    Iterator it = vj.f76602a.iterator();
                    while (it.hasNext()) {
                        ((Xa) it.next()).a(vj.f76603b);
                    }
                    vj.f76602a.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
