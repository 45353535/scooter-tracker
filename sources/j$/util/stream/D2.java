package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class D2 extends AbstractC5794z2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T2 f85016c;

    @Override // j$.util.stream.AbstractC5700g2, j$.util.stream.InterfaceC5725l2
    public final void l(long j10) {
        T2 t22;
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j10 <= 0) {
            t22 = new T2();
        } else {
            t22 = new T2((int) j10);
        }
        this.f85016c = t22;
    }

    @Override // j$.util.stream.AbstractC5700g2, j$.util.stream.InterfaceC5725l2
    public final void k() {
        long[] jArr = (long[]) this.f85016c.d();
        Arrays.sort(jArr);
        long length = jArr.length;
        InterfaceC5725l2 interfaceC5725l2 = this.f85266a;
        interfaceC5725l2.l(length);
        int i10 = 0;
        if (!this.f85410b) {
            int length2 = jArr.length;
            while (i10 < length2) {
                interfaceC5725l2.accept(jArr[i10]);
                i10++;
            }
        } else {
            int length3 = jArr.length;
            while (i10 < length3) {
                long j10 = jArr[i10];
                if (interfaceC5725l2.n()) {
                    break;
                }
                interfaceC5725l2.accept(j10);
                i10++;
            }
        }
        interfaceC5725l2.k();
    }

    @Override // j$.util.stream.InterfaceC5720k2, j$.util.stream.InterfaceC5725l2
    public final void accept(long j10) {
        this.f85016c.accept(j10);
    }
}
