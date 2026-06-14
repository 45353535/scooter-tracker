package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23045d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a[] f23046e = new a[100];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a[] f23042a = new a[1];

    public final synchronized void a(int i10) {
        boolean z10 = i10 < this.f23043b;
        this.f23043b = i10;
        if (z10) {
            a();
        }
    }

    public final synchronized void a(a[] aVarArr) {
        try {
            int i10 = this.f23045d;
            int length = aVarArr.length + i10;
            a[] aVarArr2 = this.f23046e;
            if (length >= aVarArr2.length) {
                this.f23046e = (a[]) Arrays.copyOf(aVarArr2, Math.max(aVarArr2.length * 2, i10 + aVarArr.length));
            }
            for (a aVar : aVarArr) {
                byte[] bArr = aVar.f22941a;
                if (bArr != null && bArr.length != 65536) {
                    throw new IllegalArgumentException();
                }
                a[] aVarArr3 = this.f23046e;
                int i11 = this.f23045d;
                this.f23045d = i11 + 1;
                aVarArr3[i11] = aVar;
            }
            this.f23044c -= aVarArr.length;
            notifyAll();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void a() {
        int i10 = this.f23043b;
        int i11 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f23162a;
        int iMax = Math.max(0, ((i10 + 65535) / 65536) - this.f23044c);
        int i12 = this.f23045d;
        if (iMax >= i12) {
            return;
        }
        Arrays.fill(this.f23046e, iMax, i12, (Object) null);
        this.f23045d = iMax;
    }
}
