package ha;

import ga.b1;
import ha.f;
import oa.s0;
import q9.u;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f72981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b1[] f72982b;

    public c(int[] iArr, b1[] b1VarArr) {
        this.f72981a = iArr;
        this.f72982b = b1VarArr;
    }

    public int[] a() {
        int[] iArr = new int[this.f72982b.length];
        int i10 = 0;
        while (true) {
            b1[] b1VarArr = this.f72982b;
            if (i10 >= b1VarArr.length) {
                return iArr;
            }
            iArr[i10] = b1VarArr[i10].J();
            i10++;
        }
    }

    public void b(long j10) {
        for (b1 b1Var : this.f72982b) {
            b1Var.c0(j10);
        }
    }

    @Override // ha.f.b
    public s0 track(int i10, int i11) {
        int i12 = 0;
        while (true) {
            int[] iArr = this.f72981a;
            if (i12 >= iArr.length) {
                u.c("BaseMediaChunkOutput", "Unmatched track of type: " + i11);
                return new oa.n();
            }
            if (i11 == iArr[i12]) {
                return this.f72982b[i12];
            }
            i12++;
        }
    }
}
