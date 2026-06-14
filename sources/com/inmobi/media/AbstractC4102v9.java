package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.AbstractC4102v9;
import com.ironsource.C4240b4;
import j$.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.v9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC4102v9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f39762a = lf.i.a(new Function0() { // from class: w3.fb
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbstractC4102v9.b();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f39763b;

    static {
        String simpleName = AbstractC4102v9.class.getSimpleName();
        f39763b = simpleName;
        Intrinsics.checkNotNull(simpleName);
    }

    public static String a() {
        Ea ea2 = (Ea) f39762a.getValue();
        String string = null;
        if (ea2 != null) {
            Intrinsics.checkNotNullParameter("cip", C4240b4.i.W);
            string = ea2.f36783a.getString("cip", null);
        }
        String TAG = f39763b;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        return string;
    }

    public static final Ea b() {
        Context context = Ji.f37157a;
        if (context == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = Ea.f36782b;
        return Da.a(context, "inmobi_store");
    }

    public static void a(String str) {
        Ea ea2 = (Ea) f39762a.getValue();
        if (ea2 != null) {
            ConcurrentHashMap concurrentHashMap = Ea.f36782b;
            ea2.a("cip", str, false);
            Unit unit = Unit.f93236a;
        }
        Intrinsics.checkNotNull(f39763b);
    }
}
