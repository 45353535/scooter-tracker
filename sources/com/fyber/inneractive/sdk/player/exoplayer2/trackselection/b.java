package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.source.y;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f22925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f22927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o[] f22928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f22929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22930f;

    public b(y yVar, int... iArr) {
        if (iArr.length <= 0) {
            throw new IllegalStateException();
        }
        yVar.getClass();
        this.f22925a = yVar;
        int length = iArr.length;
        this.f22926b = length;
        this.f22928d = new o[length];
        int i10 = 0;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f22928d[i11] = yVar.f22914b[iArr[i11]];
        }
        Arrays.sort(this.f22928d, new a());
        this.f22927c = new int[this.f22926b];
        while (true) {
            int i12 = this.f22926b;
            if (i10 >= i12) {
                this.f22929e = new long[i12];
                return;
            } else {
                this.f22927c[i10] = yVar.a(this.f22928d[i10]);
                i10++;
            }
        }
    }

    public abstract int a();

    public final boolean a(int i10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = this.f22929e[i10] > jElapsedRealtime;
        int i11 = 0;
        while (i11 < this.f22926b && !z10) {
            z10 = i11 != i10 && this.f22929e[i11] <= jElapsedRealtime;
            i11++;
        }
        if (!z10) {
            return false;
        }
        long[] jArr = this.f22929e;
        jArr[i10] = Math.max(jArr[i10], jElapsedRealtime + 60000);
        return true;
    }

    public abstract Object b();

    public abstract int c();

    public abstract void d();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f22925a == bVar.f22925a && Arrays.equals(this.f22927c, bVar.f22927c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f22930f == 0) {
            this.f22930f = Arrays.hashCode(this.f22927c) + (System.identityHashCode(this.f22925a) * 31);
        }
        return this.f22930f;
    }
}
