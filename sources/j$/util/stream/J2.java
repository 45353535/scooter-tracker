package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class J2 extends AbstractC5784x2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double[] f85066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f85067d;

    @Override // j$.util.stream.AbstractC5690e2, j$.util.stream.InterfaceC5725l2
    public final void l(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f85066c = new double[(int) j10];
    }

    @Override // j$.util.stream.AbstractC5690e2, j$.util.stream.InterfaceC5725l2
    public final void k() {
        int i10 = 0;
        Arrays.sort(this.f85066c, 0, this.f85067d);
        long j10 = this.f85067d;
        InterfaceC5725l2 interfaceC5725l2 = this.f85254a;
        interfaceC5725l2.l(j10);
        if (!this.f85399b) {
            while (i10 < this.f85067d) {
                interfaceC5725l2.accept(this.f85066c[i10]);
                i10++;
            }
        } else {
            while (i10 < this.f85067d && !interfaceC5725l2.n()) {
                interfaceC5725l2.accept(this.f85066c[i10]);
                i10++;
            }
        }
        interfaceC5725l2.k();
        this.f85066c = null;
    }

    @Override // j$.util.stream.InterfaceC5710i2, java.util.function.DoubleConsumer
    public final void accept(double d10) {
        double[] dArr = this.f85066c;
        int i10 = this.f85067d;
        this.f85067d = i10 + 1;
        dArr[i10] = d10;
    }
}
