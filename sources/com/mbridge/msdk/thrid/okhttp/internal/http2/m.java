package com.mbridge.msdk.thrid.okhttp.internal.http2;

import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f51517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f51518b = new int[10];

    void a() {
        this.f51517a = 0;
        Arrays.fill(this.f51518b, 0);
    }

    int b() {
        if ((this.f51517a & 2) != 0) {
            return this.f51518b[1];
        }
        return -1;
    }

    int c(int i10) {
        return (this.f51517a & 32) != 0 ? this.f51518b[5] : i10;
    }

    boolean d(int i10) {
        return ((1 << i10) & this.f51517a) != 0;
    }

    int b(int i10) {
        return (this.f51517a & 16) != 0 ? this.f51518b[4] : i10;
    }

    int c() {
        if ((this.f51517a & 128) != 0) {
            return this.f51518b[7];
        }
        return 65535;
    }

    int d() {
        return Integer.bitCount(this.f51517a);
    }

    m a(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f51518b;
            if (i10 < iArr.length) {
                this.f51517a = (1 << i10) | this.f51517a;
                iArr[i10] = i11;
            }
        }
        return this;
    }

    int a(int i10) {
        return this.f51518b[i10];
    }

    void a(m mVar) {
        for (int i10 = 0; i10 < 10; i10++) {
            if (mVar.d(i10)) {
                a(i10, mVar.a(i10));
            }
        }
    }
}
