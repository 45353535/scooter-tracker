package gg;

import eg.d0;
import gg.y;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
final class u extends h implements v {
    public u(CoroutineContext coroutineContext, g gVar) {
        super(coroutineContext, gVar, true, true);
    }

    @Override // kotlinx.coroutines.a
    protected void Y0(Throwable th2, boolean z10) {
        if (c1().l(th2) || z10) {
            return;
        }
        d0.a(getContext(), th2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a
    /* JADX INFO: renamed from: d1, reason: merged with bridge method [inline-methods] */
    public void Z0(Unit unit) {
        y.a.a(c1(), null, 1, null);
    }

    @Override // kotlinx.coroutines.a, kotlinx.coroutines.b0, kotlinx.coroutines.Job
    public boolean isActive() {
        return super.isActive();
    }

    @Override // gg.v
    public /* bridge */ /* synthetic */ y m() {
        return b1();
    }
}
