package ec;

import id.a0;
import id.h1;
import id.q0;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public interface b {

    public interface a {
        void onError(a0 a0Var);

        void onSuccess(Object obj);
    }

    void a(q0 q0Var, Object obj, a aVar);

    void b(Object obj);

    void c(q0 q0Var, Object obj, a aVar);

    Object d(h1 h1Var, Object obj, Continuation continuation);

    Object e(q0 q0Var, Object obj, Continuation continuation);

    void f(q0 q0Var, Object obj, a aVar);
}
