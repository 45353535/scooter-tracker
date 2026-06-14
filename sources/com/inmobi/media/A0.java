package com.inmobi.media;

import android.content.Context;
import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.media.A0;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f36535a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f36536b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f36537c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4193z0 f36538d = new C4193z0(this);

    public A0() {
        Runnable runnable = new Runnable() { // from class: w3.b
            @Override // java.lang.Runnable
            public final void run() {
                A0.a(this.f106982b);
            }
        };
        Context context = Ji.f37157a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Ji.f37163g.submit(runnable);
    }

    public static final void a(A0 a02) {
        H0 h02 = (H0) E0.f36762a.getValue();
        C4193z0 listener = a02.f36538d;
        h02.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        h02.f36973b = new WeakReference(listener);
    }

    public static final Unit b(A0 a02) {
        a02.f36535a.set(true);
        C3774i4 c3774i4 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        eg.i.d(A9.f36557c, null, null, new C4168y0(a02, (AdConfig) Y3.f38021a.a(AdConfig.class), null), 3, null);
        return Unit.f93236a;
    }

    public final void a() {
        AbstractC3642d.a(new Function0() { // from class: w3.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return A0.b(this.f106971b);
            }
        });
    }

    public static void a(AdQualityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            eg.h.b(null, new C4143x0(result, null), 1, null);
            if (result.getImageLocation().length() == 0) {
                return;
            }
            new File(result.getImageLocation()).delete();
        } catch (Exception unused) {
        }
    }
}
