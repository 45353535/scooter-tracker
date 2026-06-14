package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class L2 extends AbstractC5794z2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f85086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f85087d;

    @Override // j$.util.stream.AbstractC5700g2, j$.util.stream.InterfaceC5725l2
    public final void l(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f85086c = new long[(int) j10];
    }

    @Override // j$.util.stream.AbstractC5700g2, j$.util.stream.InterfaceC5725l2
    public final void k() {
        int i10 = 0;
        Arrays.sort(this.f85086c, 0, this.f85087d);
        long j10 = this.f85087d;
        InterfaceC5725l2 interfaceC5725l2 = this.f85266a;
        interfaceC5725l2.l(j10);
        if (!this.f85410b) {
            while (i10 < this.f85087d) {
                interfaceC5725l2.accept(this.f85086c[i10]);
                i10++;
            }
        } else {
            while (i10 < this.f85087d && !interfaceC5725l2.n()) {
                interfaceC5725l2.accept(this.f85086c[i10]);
                i10++;
            }
        }
        interfaceC5725l2.k();
        this.f85086c = null;
    }

    @Override // j$.util.stream.InterfaceC5720k2, j$.util.stream.InterfaceC5725l2
    public final void accept(long j10) {
        long[] jArr = this.f85086c;
        int i10 = this.f85087d;
        this.f85087d = i10 + 1;
        jArr[i10] = j10;
    }
}
