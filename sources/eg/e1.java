package eg;

import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e1 extends CoroutineDispatcher {
    @Override // kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int i10, String str) {
        jg.m.a(i10);
        return jg.m.b(this, str);
    }

    public abstract e1 m();

    protected final String p() {
        e1 e1VarM;
        e1 e1VarC = o0.c();
        if (this == e1VarC) {
            return "Dispatchers.Main";
        }
        try {
            e1VarM = e1VarC.m();
        } catch (UnsupportedOperationException unused) {
            e1VarM = null;
        }
        if (this == e1VarM) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
