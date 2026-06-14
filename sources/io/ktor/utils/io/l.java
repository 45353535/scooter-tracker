package io.ktor.utils.io;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l {
    public static final Object a(k kVar, Continuation continuation) {
        h.s(kVar);
        a aVar = kVar instanceof a ? (a) kVar : null;
        if ((aVar == null || !aVar.n()) && hf.c.b(kVar.f()) < 1048576) {
            return Unit.f93236a;
        }
        Object objC = kVar.c(continuation);
        return objC == pf.b.g() ? objC : Unit.f93236a;
    }
}
