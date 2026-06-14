package com.inmobi.media;

import android.content.Context;
import com.ironsource.C4240b4;
import j$.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.bk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3611bk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Ea f38285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f38286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Integer f38287c;

    static {
        Ea eaA;
        Context context = Ji.f37157a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Ea.f36782b;
            eaA = Da.a(context, "imtelemetrydboverflow");
        } else {
            eaA = null;
        }
        f38285a = eaA;
        f38286b = -1;
    }

    public static int a() {
        if (f38286b == -1) {
            Ea ea2 = f38285a;
            int i10 = 0;
            if (ea2 != null) {
                Intrinsics.checkNotNullParameter("count", C4240b4.i.W);
                i10 = ea2.f36783a.getInt("count", 0);
            }
            f38286b = i10;
        }
        return f38286b;
    }
}
