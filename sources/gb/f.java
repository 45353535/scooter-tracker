package gb;

import androidx.collection.SieveCacheKt;
import oa.s;
import q9.d0;

/* JADX INFO: loaded from: classes12.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f72713a = new d0(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f72714b;

    private long a(s sVar) {
        int i10 = 0;
        sVar.peekFully(this.f72713a.e(), 0, 1);
        int i11 = this.f72713a.e()[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        sVar.peekFully(this.f72713a.e(), 1, i13);
        while (i10 < i13) {
            i10++;
            i14 = (this.f72713a.e()[i10] & 255) + (i14 << 8);
        }
        this.f72714b += i13 + 1;
        return i14;
    }

    public boolean b(s sVar) {
        long length = sVar.getLength();
        long j10 = 1024;
        if (length != -1 && length <= 1024) {
            j10 = length;
        }
        int i10 = (int) j10;
        sVar.peekFully(this.f72713a.e(), 0, 4);
        long J = this.f72713a.J();
        this.f72714b = 4;
        while (J != 440786851) {
            int i11 = this.f72714b + 1;
            this.f72714b = i11;
            if (i11 == i10) {
                return false;
            }
            sVar.peekFully(this.f72713a.e(), 0, 1);
            J = ((J << 8) & (-256)) | ((long) (this.f72713a.e()[0] & 255));
        }
        long jA = a(sVar);
        long j11 = this.f72714b;
        if (jA != Long.MIN_VALUE && (length == -1 || j11 + jA < length)) {
            while (true) {
                int i12 = this.f72714b;
                long j12 = j11 + jA;
                if (i12 < j12) {
                    if (a(sVar) == Long.MIN_VALUE) {
                        return false;
                    }
                    long jA2 = a(sVar);
                    if (jA2 < 0 || jA2 > SieveCacheKt.NodeLinkMask) {
                        break;
                    }
                    if (jA2 != 0) {
                        int i13 = (int) jA2;
                        sVar.advancePeekPosition(i13);
                        this.f72714b += i13;
                    }
                } else if (i12 == j12) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
