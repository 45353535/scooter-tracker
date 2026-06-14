package com.appodeal.ads.segments;

import android.content.Context;
import com.ironsource.C4240b4;
import java.util.Random;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.appodeal.ads.storage.e0 f14490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f14491b;

    public n(com.appodeal.ads.storage.e0 keyValueStorage) {
        Intrinsics.checkNotNullParameter(keyValueStorage, "keyValueStorage");
        this.f14490a = keyValueStorage;
        this.f14491b = lf.i.a(new Function0() { // from class: com.appodeal.ads.segments.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(n.b(this.f14489b));
            }
        });
    }

    public static final int b(n nVar) {
        com.appodeal.ads.storage.e0 e0Var = nVar.f14490a;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter("part_of_audience", C4240b4.i.W);
        com.appodeal.ads.storage.a0 a0Var = e0Var.f14800a;
        a0Var.getClass();
        Intrinsics.checkNotNullParameter("part_of_audience", C4240b4.i.W);
        int i10 = a0Var.c(com.appodeal.ads.storage.d.f14788c).getInt("part_of_audience", -1);
        Integer numValueOf = Integer.valueOf(i10);
        if (i10 == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        int iNextInt = new Random().nextInt(100) + 1;
        com.appodeal.ads.storage.e0 e0Var2 = nVar.f14490a;
        e0Var2.getClass();
        Intrinsics.checkNotNullParameter("part_of_audience", C4240b4.i.W);
        com.appodeal.ads.storage.a0 a0Var2 = e0Var2.f14800a;
        a0Var2.getClass();
        Intrinsics.checkNotNullParameter("part_of_audience", C4240b4.i.W);
        eg.i.d((CoroutineScope) a0Var2.f14784b.getValue(), null, null, new com.appodeal.ads.storage.r(a0Var2, iNextInt, null), 3, null);
        return iNextInt;
    }

    @Override // com.appodeal.ads.segments.t
    public final Object a(Context context, g0 ruleHelper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ruleHelper, "ruleHelper");
        return Integer.valueOf(((Number) this.f14491b.getValue()).intValue());
    }
}
