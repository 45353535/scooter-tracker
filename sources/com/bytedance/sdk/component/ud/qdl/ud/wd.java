package com.bytedance.sdk.component.ud.qdl.ud;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
final class wd extends mml {
    final transient int[] jpc;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    final transient byte[][] f16715wd;

    wd(qdl qdlVar, int i10) {
        super(null);
        tvp.qdl(qdlVar.f16714ud, 0L, i10);
        mzz mzzVar = qdlVar.qdl;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            int i14 = mzzVar.lnr;
            int i15 = mzzVar.f16712ud;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            mzzVar = mzzVar.mo;
        }
        this.f16715wd = new byte[i13][];
        this.jpc = new int[i13 * 2];
        mzz mzzVar2 = qdlVar.qdl;
        int i16 = 0;
        while (i11 < i10) {
            byte[][] bArr = this.f16715wd;
            bArr[i16] = mzzVar2.qdl;
            int i17 = mzzVar2.lnr;
            int i18 = mzzVar2.f16712ud;
            i11 += i17 - i18;
            if (i11 > i10) {
                i11 = i10;
            }
            int[] iArr = this.jpc;
            iArr[i16] = i11;
            iArr[bArr.length + i16] = i18;
            mzzVar2.mml = true;
            i16++;
            mzzVar2 = mzzVar2.mo;
        }
    }

    private mml mzz() {
        return new mml(mml());
    }

    @Override // com.bytedance.sdk.component.ud.qdl.ud.mml
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mml) {
            mml mmlVar = (mml) obj;
            if (mmlVar.lnr() == lnr() && qdl(0, mmlVar, 0, lnr())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.ud.qdl.ud.mml
    public int hashCode() {
        int i10 = this.mzz;
        if (i10 != 0) {
            return i10;
        }
        int length = this.f16715wd.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            byte[] bArr = this.f16715wd[i11];
            int[] iArr = this.jpc;
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
        this.mzz = i12;
        return i12;
    }

    @Override // com.bytedance.sdk.component.ud.qdl.ud.mml
    public int lnr() {
        return this.jpc[this.f16715wd.length - 1];
    }

    @Override // com.bytedance.sdk.component.ud.qdl.ud.mml
    public byte[] mml() {
        int[] iArr = this.jpc;
        byte[][] bArr = this.f16715wd;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr2 = this.jpc;
            int i12 = iArr2[length + i10];
            int i13 = iArr2[i10];
            System.arraycopy(this.f16715wd[i10], i12, bArr2, i11, i13 - i11);
            i10++;
            i11 = i13;
        }
        return bArr2;
    }

    @Override // com.bytedance.sdk.component.ud.qdl.ud.mml
    public String qdl() {
        return mzz().qdl();
    }

    @Override // com.bytedance.sdk.component.ud.qdl.ud.mml
    public String toString() {
        return mzz().toString();
    }

    @Override // com.bytedance.sdk.component.ud.qdl.ud.mml
    public String ud() {
        return mzz().ud();
    }

    private int ud(int i10) {
        int iBinarySearch = Arrays.binarySearch(this.jpc, 0, this.f16715wd.length, i10 + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    @Override // com.bytedance.sdk.component.ud.qdl.ud.mml
    public mml qdl(int i10, int i11) {
        return mzz().qdl(i10, i11);
    }

    @Override // com.bytedance.sdk.component.ud.qdl.ud.mml
    public byte qdl(int i10) {
        tvp.qdl(this.jpc[this.f16715wd.length - 1], i10, 1L);
        int iUd = ud(i10);
        int i11 = iUd == 0 ? 0 : this.jpc[iUd - 1];
        int[] iArr = this.jpc;
        byte[][] bArr = this.f16715wd;
        return bArr[iUd][(i10 - i11) + iArr[bArr.length + iUd]];
    }

    @Override // com.bytedance.sdk.component.ud.qdl.ud.mml
    public boolean qdl(int i10, mml mmlVar, int i11, int i12) {
        if (i10 < 0 || i10 > lnr() - i12) {
            return false;
        }
        int iUd = ud(i10);
        while (i12 > 0) {
            int i13 = iUd == 0 ? 0 : this.jpc[iUd - 1];
            int iMin = Math.min(i12, ((this.jpc[iUd] - i13) + i13) - i10);
            int[] iArr = this.jpc;
            byte[][] bArr = this.f16715wd;
            if (!mmlVar.qdl(i11, bArr[iUd], (i10 - i13) + iArr[bArr.length + iUd], iMin)) {
                return false;
            }
            i10 += iMin;
            i11 += iMin;
            i12 -= iMin;
            iUd++;
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.ud.qdl.ud.mml
    public boolean qdl(int i10, byte[] bArr, int i11, int i12) {
        if (i10 < 0 || i10 > lnr() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int iUd = ud(i10);
        while (i12 > 0) {
            int i13 = iUd == 0 ? 0 : this.jpc[iUd - 1];
            int iMin = Math.min(i12, ((this.jpc[iUd] - i13) + i13) - i10);
            int[] iArr = this.jpc;
            byte[][] bArr2 = this.f16715wd;
            if (!tvp.qdl(bArr2[iUd], (i10 - i13) + iArr[bArr2.length + iUd], bArr, i11, iMin)) {
                return false;
            }
            i10 += iMin;
            i11 += iMin;
            i12 -= iMin;
            iUd++;
        }
        return true;
    }
}
