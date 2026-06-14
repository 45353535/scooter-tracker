package yads;

import androidx.core.view.InputDeviceCompat;

/* JADX INFO: loaded from: classes4.dex */
public final class ku2 implements z63 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ju2 f112859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w92 f112860b = new w92(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f112861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f112862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f112863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f112864f;

    public ku2(ju2 ju2Var) {
        this.f112859a = ju2Var;
    }

    @Override // yads.z63
    public final void a(int i10, w92 w92Var) {
        boolean z10 = (i10 & 1) != 0;
        int iM = z10 ? w92Var.f117357b + w92Var.m() : -1;
        if (this.f112864f) {
            if (!z10) {
                return;
            }
            this.f112864f = false;
            w92Var.e(iM);
            this.f112862d = 0;
        }
        while (true) {
            int i11 = w92Var.f117358c - w92Var.f117357b;
            if (i11 <= 0) {
                return;
            }
            int i12 = this.f112862d;
            if (i12 < 3) {
                if (i12 == 0) {
                    int iM2 = w92Var.m();
                    w92Var.e(w92Var.f117357b - 1);
                    if (iM2 == 255) {
                        this.f112864f = true;
                        return;
                    }
                }
                int iMin = Math.min(w92Var.f117358c - w92Var.f117357b, 3 - this.f112862d);
                w92Var.a(this.f112860b.f117356a, this.f112862d, iMin);
                int i13 = this.f112862d + iMin;
                this.f112862d = i13;
                if (i13 == 3) {
                    this.f112860b.e(0);
                    this.f112860b.d(3);
                    w92 w92Var2 = this.f112860b;
                    w92Var2.e(w92Var2.f117357b + 1);
                    int iM3 = this.f112860b.m();
                    int iM4 = this.f112860b.m();
                    this.f112863e = (iM3 & 128) != 0;
                    int i14 = (((iM3 & 15) << 8) | iM4) + 3;
                    this.f112861c = i14;
                    byte[] bArr = this.f112860b.f117356a;
                    if (bArr.length < i14) {
                        this.f112860b.a(Math.min(InputDeviceCompat.SOURCE_TOUCHSCREEN, Math.max(i14, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(i11, this.f112861c - i12);
                w92Var.a(this.f112860b.f117356a, this.f112862d, iMin2);
                int i15 = this.f112862d + iMin2;
                this.f112862d = i15;
                int i16 = this.f112861c;
                if (i15 != i16) {
                    continue;
                } else {
                    if (this.f112863e) {
                        byte[] bArr2 = this.f112860b.f117356a;
                        int i17 = -1;
                        for (int i18 = 0; i18 < i16; i18++) {
                            i17 = w83.f117354n[((i17 >>> 24) ^ (bArr2[i18] & 255)) & 255] ^ (i17 << 8);
                        }
                        int i19 = w83.f117341a;
                        if (i17 != 0) {
                            this.f112864f = true;
                            return;
                        }
                        this.f112860b.d(this.f112861c - 4);
                    } else {
                        this.f112860b.d(i16);
                    }
                    this.f112860b.e(0);
                    this.f112859a.a(this.f112860b);
                    this.f112862d = 0;
                }
            }
        }
    }

    @Override // yads.z63
    public final void a(l43 l43Var, ap0 ap0Var, y63 y63Var) {
        this.f112859a.a(l43Var, ap0Var, y63Var);
        this.f112864f = true;
    }

    @Override // yads.z63
    public final void a() {
        this.f112864f = true;
    }
}
