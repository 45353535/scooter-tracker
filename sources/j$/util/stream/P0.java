package j$.util.stream;

import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public abstract class P0 extends H0 implements E0 {
    @Override // j$.util.stream.F0
    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return AbstractC5773v1.m(this, intFunction);
    }

    @Override // j$.util.stream.E0
    public final void e(Object obj) {
        ((E0) this.f85040a).e(obj);
        ((E0) this.f85041b).e(obj);
    }

    @Override // j$.util.stream.E0
    public final void r(int i10, Object obj) {
        F0 f02 = this.f85040a;
        ((E0) f02).r(i10, obj);
        ((E0) this.f85041b).r(i10 + ((int) ((E0) f02).count()), obj);
    }

    @Override // j$.util.stream.E0
    public final Object d() {
        long j10 = this.f85042c;
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object objC = c((int) j10);
        r(0, objC);
        return objC;
    }

    public final String toString() {
        long j10 = this.f85042c;
        return j10 < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.f85040a, this.f85041b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(j10));
    }
}
