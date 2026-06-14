package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.Oj;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Oj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f37505a = lf.i.a(new Function0() { // from class: w3.x3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Oj.a();
        }
    });

    public static final void a(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        ((Handler) f37505a.getValue()).post(runnable);
    }

    public static final Handler a() {
        return new Handler(Looper.getMainLooper());
    }
}
