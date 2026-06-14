package c0;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b {
    public static final Object a(hh.e eVar, Continuation continuation) {
        kotlinx.coroutines.e eVar2 = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
        eVar2.I();
        j jVar = new j(eVar, eVar2);
        eVar.m(jVar);
        eVar2.v(jVar);
        Object objC = eVar2.C();
        if (objC == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objC;
    }
}
