package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class C2 extends AbstractC5789y2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public R2 f85003c;

    @Override // j$.util.stream.AbstractC5695f2, j$.util.stream.InterfaceC5725l2
    public final void l(long j10) {
        R2 r22;
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j10 <= 0) {
            r22 = new R2();
        } else {
            r22 = new R2((int) j10);
        }
        this.f85003c = r22;
    }

    @Override // j$.util.stream.AbstractC5695f2, j$.util.stream.InterfaceC5725l2
    public final void k() {
        int[] iArr = (int[]) this.f85003c.d();
        Arrays.sort(iArr);
        long length = iArr.length;
        InterfaceC5725l2 interfaceC5725l2 = this.f85261a;
        interfaceC5725l2.l(length);
        int i10 = 0;
        if (!this.f85404b) {
            int length2 = iArr.length;
            while (i10 < length2) {
                interfaceC5725l2.accept(iArr[i10]);
                i10++;
            }
        } else {
            int length3 = iArr.length;
            while (i10 < length3) {
                int i11 = iArr[i10];
                if (interfaceC5725l2.n()) {
                    break;
                }
                interfaceC5725l2.accept(i11);
                i10++;
            }
        }
        interfaceC5725l2.k();
    }

    @Override // j$.util.stream.InterfaceC5715j2, j$.util.stream.InterfaceC5725l2
    public final void accept(int i10) {
        this.f85003c.accept(i10);
    }
}
