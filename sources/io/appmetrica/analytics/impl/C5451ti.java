package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ti, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5451ti {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f78302a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5533x0 f78303b;

    public C5451ti(C5533x0 c5533x0) {
        this.f78303b = c5533x0;
    }

    public static C5451ti a() {
        return AbstractC5426si.f78240a;
    }

    public final C5252li a(Context context, String str) {
        C5252li c5252li;
        C5252li c5252li2 = (C5252li) this.f78302a.get(str);
        if (c5252li2 != null) {
            return c5252li2;
        }
        synchronized (this.f78302a) {
            try {
                c5252li = (C5252li) this.f78302a.get(str);
                if (c5252li == null) {
                    IHandlerExecutor iHandlerExecutorA = C5186j4.l().f77467c.a();
                    this.f78303b.getClass();
                    if (C5508w0.f78473e == null) {
                        ((G9) iHandlerExecutorA).f75815b.post(new RunnableC5401ri(this, context));
                    }
                    c5252li = new C5252li(context.getApplicationContext(), str, new C5533x0());
                    this.f78302a.put(str, c5252li);
                    c5252li.d(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c5252li;
    }
}
