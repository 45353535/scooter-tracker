package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* JADX INFO: loaded from: classes12.dex */
public abstract class B0 {
    public static I6 a(Handler handler, A0 a02) {
        return new I6(handler, a02);
    }

    public static Gf a(Context context, I6 i62) {
        return new Gf(context, i62);
    }

    public static Bi a(Gf gf2, Context context, ICommonExecutor iCommonExecutor) {
        C5334p0 c5334p0 = new C5334p0(context, iCommonExecutor, C5186j4.l().e());
        return new Bi(c5334p0, new Un(new C5419sb()), new M4(gf2), new C5048dk(context, c5334p0));
    }

    public static Sl a(Context context, Bi bi2, C4965af c4965af, Handler handler) {
        return new Sl(bi2, new C4972am(context, c4965af), handler);
    }

    public static C5325og a(Bi bi2, C4965af c4965af, Handler handler) {
        return new C5325og(bi2, c4965af, handler, c4965af.s());
    }

    public static C5327oi a(Context context, Gf gf2, Bi bi2, Handler handler, Sl sl) {
        return new C5327oi(context, gf2, bi2, handler, sl);
    }

    public static C5195jd a(Context context) {
        return new C5195jd(C5186j4.l().f77467c.a(), C5186j4.l().b(context), "client_modules", new SystemTimeProvider());
    }
}
