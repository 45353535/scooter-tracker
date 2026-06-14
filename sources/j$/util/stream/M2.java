package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class M2 extends A2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f85093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f85094e;

    @Override // j$.util.stream.AbstractC5705h2, j$.util.stream.InterfaceC5725l2
    public final void l(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f85093d = new Object[(int) j10];
    }

    @Override // j$.util.stream.AbstractC5705h2, j$.util.stream.InterfaceC5725l2
    public final void k() {
        int i10 = 0;
        Arrays.sort(this.f85093d, 0, this.f85094e, this.f84989b);
        long j10 = this.f85094e;
        InterfaceC5725l2 interfaceC5725l2 = this.f85274a;
        interfaceC5725l2.l(j10);
        if (!this.f84990c) {
            while (i10 < this.f85094e) {
                interfaceC5725l2.accept(this.f85093d[i10]);
                i10++;
            }
        } else {
            while (i10 < this.f85094e && !interfaceC5725l2.n()) {
                interfaceC5725l2.accept(this.f85093d[i10]);
                i10++;
            }
        }
        interfaceC5725l2.k();
        this.f85093d = null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.f85093d;
        int i10 = this.f85094e;
        this.f85094e = i10 + 1;
        objArr[i10] = obj;
    }
}
