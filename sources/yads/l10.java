package yads;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l10 {
    public static CoroutineScope a(nl0 nl0Var) {
        return kotlinx.coroutines.i.a(eg.m1.b(null, 1, null).plus(eg.o0.b()).plus(nl0Var != null ? new k10(nl0Var) : new j10()));
    }

    public static CoroutineScope b(nl0 nl0Var) {
        return kotlinx.coroutines.i.a(eg.m1.b(null, 1, null).plus(eg.o0.c().m()).plus(nl0Var != null ? new k10(nl0Var) : new j10()));
    }

    public static CoroutineScope a(mr1 mr1Var) {
        return kotlinx.coroutines.i.a(eg.m1.b(null, 1, null).plus(eg.o0.a()).plus(new k10(mr1Var)));
    }
}
