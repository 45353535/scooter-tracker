package yads;

import android.content.Context;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class az1 {
    public static zy1 a(Context context, es2 es2Var, nz1 nz1Var, c4 c4Var, iz1 iz1Var, v5 v5Var) {
        CoroutineScope coroutineScopeA = kotlinx.coroutines.i.a(eg.m1.b(null, 1, null).plus(eg.o0.b()).plus(new k10(((pr3) es2Var).a())));
        sz1 sz1Var = new sz1(es2Var, c4Var);
        vz1 vz1Var = new vz1(c4Var);
        z13 z13Var = z13.f118512b;
        return new zy1(context, es2Var, nz1Var, c4Var, iz1Var, v5Var, coroutineScopeA, sz1Var, vz1Var, y13.a(), new yx1(context, es2Var, c4Var, v5Var, coroutineScopeA));
    }
}
