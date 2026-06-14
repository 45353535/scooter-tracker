package com.mbridge.msdk.thrid.okio;

import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
final class q extends f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final transient byte[][] f51774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final transient int[] f51775g;

    q(c cVar, int i10) {
        super(null);
        u.a(cVar.f51733b, 0L, i10);
        o oVar = cVar.f51732a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            int i14 = oVar.f51767c;
            int i15 = oVar.f51766b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            oVar = oVar.f51770f;
        }
        this.f51774f = new byte[i13][];
        this.f51775g = new int[i13 * 2];
        o oVar2 = cVar.f51732a;
        int i16 = 0;
        while (i11 < i10) {
            byte[][] bArr = this.f51774f;
            bArr[i16] = oVar2.f51765a;
            int i17 = oVar2.f51767c;
            int i18 = oVar2.f51766b;
            i11 += i17 - i18;
            if (i11 > i10) {
                i11 = i10;
            }
            int[] iArr = this.f51775g;
            iArr[i16] = i11;
            iArr[bArr.length + i16] = i18;
            oVar2.f51768d = true;
            i16++;
            oVar2 = oVar2.f51770f;
        }
    }

    private int b(int i10) {
        int iBinarySearch = Arrays.binarySearch(this.f51775g, 0, this.f51774f.length, i10 + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    private f n() {
        return new f(l());
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public f a(int i10, int i11) {
        return n().a(i10, i11);
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public String d() {
        return n().d();
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (fVar.j() == j() && a(0, fVar, 0, j())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public String g() {
        return n().g();
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public f h() {
        return n().h();
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public int hashCode() {
        int i10 = this.f51738b;
        if (i10 != 0) {
            return i10;
        }
        int length = this.f51774f.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            byte[] bArr = this.f51774f[i11];
            int[] iArr = this.f51775g;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        this.f51738b = i12;
        return i12;
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public f i() {
        return n().i();
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public int j() {
        return this.f51775g[this.f51774f.length - 1];
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public f k() {
        return n().k();
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public byte[] l() {
        int[] iArr = this.f51775g;
        byte[][] bArr = this.f51774f;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr2 = this.f51775g;
            int i12 = iArr2[length + i10];
            int i13 = iArr2[i10];
            System.arraycopy(this.f51774f[i10], i12, bArr2, i11, i13 - i11);
            i10++;
            i11 = i13;
        }
        return bArr2;
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public String m() {
        return n().m();
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public String toString() {
        return n().toString();
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public byte a(int i10) {
        u.a(this.f51775g[this.f51774f.length - 1], i10, 1L);
        int iB = b(i10);
        int i11 = iB == 0 ? 0 : this.f51775g[iB - 1];
        int[] iArr = this.f51775g;
        byte[][] bArr = this.f51774f;
        return bArr[iB][(i10 - i11) + iArr[bArr.length + iB]];
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    void a(c cVar) {
        int length = this.f51774f.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr = this.f51775g;
            int i12 = iArr[length + i10];
            int i13 = iArr[i10];
            o oVar = new o(this.f51774f[i10], i12, (i12 + i13) - i11, true, false);
            o oVar2 = cVar.f51732a;
            if (oVar2 == null) {
                oVar.f51771g = oVar;
                oVar.f51770f = oVar;
                cVar.f51732a = oVar;
            } else {
                oVar2.f51771g.a(oVar);
            }
            i10++;
            i11 = i13;
        }
        cVar.f51733b += (long) i11;
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public boolean a(int i10, f fVar, int i11, int i12) {
        if (i10 < 0 || i10 > j() - i12) {
            return false;
        }
        int iB = b(i10);
        while (i12 > 0) {
            int i13 = iB == 0 ? 0 : this.f51775g[iB - 1];
            int iMin = Math.min(i12, ((this.f51775g[iB] - i13) + i13) - i10);
            int[] iArr = this.f51775g;
            byte[][] bArr = this.f51774f;
            if (!fVar.a(i11, bArr[iB], (i10 - i13) + iArr[bArr.length + iB], iMin)) {
                return false;
            }
            i10 += iMin;
            i11 += iMin;
            i12 -= iMin;
            iB++;
        }
        return true;
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public boolean a(int i10, byte[] bArr, int i11, int i12) {
        if (i10 < 0 || i10 > j() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int iB = b(i10);
        while (i12 > 0) {
            int i13 = iB == 0 ? 0 : this.f51775g[iB - 1];
            int iMin = Math.min(i12, ((this.f51775g[iB] - i13) + i13) - i10);
            int[] iArr = this.f51775g;
            byte[][] bArr2 = this.f51774f;
            if (!u.a(bArr2[iB], (i10 - i13) + iArr[bArr2.length + iB], bArr, i11, iMin)) {
                return false;
            }
            i10 += iMin;
            i11 += iMin;
            i12 -= iMin;
            iB++;
        }
        return true;
    }
}
