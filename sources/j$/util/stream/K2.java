package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class K2 extends AbstractC5789y2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f85074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f85075d;

    @Override // j$.util.stream.AbstractC5695f2, j$.util.stream.InterfaceC5725l2
    public final void l(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f85074c = new int[(int) j10];
    }

    @Override // j$.util.stream.AbstractC5695f2, j$.util.stream.InterfaceC5725l2
    public final void k() {
        int i10 = 0;
        Arrays.sort(this.f85074c, 0, this.f85075d);
        long j10 = this.f85075d;
        InterfaceC5725l2 interfaceC5725l2 = this.f85261a;
        interfaceC5725l2.l(j10);
        if (!this.f85404b) {
            while (i10 < this.f85075d) {
                interfaceC5725l2.accept(this.f85074c[i10]);
                i10++;
            }
        } else {
            while (i10 < this.f85075d && !interfaceC5725l2.n()) {
                interfaceC5725l2.accept(this.f85074c[i10]);
                i10++;
            }
        }
        interfaceC5725l2.k();
        this.f85074c = null;
    }

    @Override // j$.util.stream.InterfaceC5715j2, j$.util.stream.InterfaceC5725l2
    public final void accept(int i10) {
        int[] iArr = this.f85074c;
        int i11 = this.f85075d;
        this.f85075d = i11 + 1;
        iArr[i11] = i10;
    }
}
