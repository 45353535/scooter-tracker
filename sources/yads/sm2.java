package yads;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class sm2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f115876a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile sm2 f115877b;

    public static void a(Context context, final Object obj) {
        e72.a(context).a(new wm2() { // from class: yads.pq0
            @Override // yads.wm2
            public final boolean a(km2 km2Var) {
                return sm2.a(obj, km2Var);
            }
        });
    }

    public static final boolean a(Object obj, km2 km2Var) {
        return Intrinsics.areEqual(obj, km2Var.f112777q);
    }
}
