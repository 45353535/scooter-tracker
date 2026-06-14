package ig;

import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes3.dex */
final class b0 extends hg.b0 implements StateFlow {
    public b0(int i10) {
        super(1, Integer.MAX_VALUE, gg.a.f72766c);
        g(Integer.valueOf(i10));
    }

    @Override // kotlinx.coroutines.flow.StateFlow
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(((Number) L()).intValue());
        }
        return numValueOf;
    }

    public final boolean Z(int i10) {
        boolean zG;
        synchronized (this) {
            zG = g(Integer.valueOf(((Number) L()).intValue() + i10));
        }
        return zG;
    }
}
