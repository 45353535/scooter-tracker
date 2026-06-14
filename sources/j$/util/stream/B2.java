package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class B2 extends AbstractC5784x2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public P2 f84995c;

    @Override // j$.util.stream.AbstractC5690e2, j$.util.stream.InterfaceC5725l2
    public final void l(long j10) {
        P2 p22;
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j10 <= 0) {
            p22 = new P2();
        } else {
            p22 = new P2((int) j10);
        }
        this.f84995c = p22;
    }

    @Override // j$.util.stream.AbstractC5690e2, j$.util.stream.InterfaceC5725l2
    public final void k() {
        double[] dArr = (double[]) this.f84995c.d();
        Arrays.sort(dArr);
        long length = dArr.length;
        InterfaceC5725l2 interfaceC5725l2 = this.f85254a;
        interfaceC5725l2.l(length);
        int i10 = 0;
        if (!this.f85399b) {
            int length2 = dArr.length;
            while (i10 < length2) {
                interfaceC5725l2.accept(dArr[i10]);
                i10++;
            }
        } else {
            int length3 = dArr.length;
            while (i10 < length3) {
                double d10 = dArr[i10];
                if (interfaceC5725l2.n()) {
                    break;
                }
                interfaceC5725l2.accept(d10);
                i10++;
            }
        }
        interfaceC5725l2.k();
    }

    @Override // j$.util.stream.InterfaceC5710i2, java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.f84995c.accept(d10);
    }
}
