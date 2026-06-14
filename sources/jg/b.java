package jg;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e0 f85862a = new e0("CLOSED");

    public static final c b(c cVar) {
        while (true) {
            Object objG = cVar.g();
            if (objG == f85862a) {
                return cVar;
            }
            c cVar2 = (c) objG;
            if (cVar2 != null) {
                cVar = cVar2;
            } else if (cVar.m()) {
                return cVar;
            }
        }
    }

    public static final Object c(b0 b0Var, long j10, Function2 function2) {
        while (true) {
            if (b0Var.f85864d >= j10 && !b0Var.k()) {
                return c0.a(b0Var);
            }
            Object objG = b0Var.g();
            if (objG == f85862a) {
                return c0.a(f85862a);
            }
            b0 b0Var2 = (b0) ((c) objG);
            if (b0Var2 == null) {
                b0Var2 = (b0) function2.invoke(Long.valueOf(b0Var.f85864d + 1), b0Var);
                if (b0Var.o(b0Var2)) {
                    if (b0Var.k()) {
                        b0Var.n();
                    }
                }
            }
            b0Var = b0Var2;
        }
    }
}
