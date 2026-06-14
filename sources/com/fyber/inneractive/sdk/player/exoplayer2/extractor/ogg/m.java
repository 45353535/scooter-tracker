package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f22363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22366d;

    public m(byte[] bArr) {
        this.f22363a = bArr;
        this.f22364b = bArr.length;
    }

    public final boolean a() {
        boolean z10 = (((this.f22363a[this.f22365c] & 255) >> this.f22366d) & 1) == 1;
        b(1);
        return z10;
    }

    public final void b(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f22365c + i11;
        this.f22365c = i12;
        int i13 = (i10 - (i11 * 8)) + this.f22366d;
        this.f22366d = i13;
        if (i13 > 7) {
            this.f22365c = i12 + 1;
            this.f22366d = i13 - 8;
        }
        int i14 = this.f22365c;
        if (i14 >= 0) {
            int i15 = this.f22364b;
            if (i14 < i15) {
                return;
            }
            if (i14 == i15 && this.f22366d == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final int a(int i10) {
        int i11 = this.f22365c;
        int iMin = Math.min(i10, 8 - this.f22366d);
        int i12 = i11 + 1;
        int i13 = ((this.f22363a[i11] & 255) >> this.f22366d) & (255 >> (8 - iMin));
        while (iMin < i10) {
            i13 |= (this.f22363a[i12] & 255) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        b(i10);
        return i14;
    }
}
