package yads;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lo implements bo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u43 f113172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f113173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f113174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yv0[] f113175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f113176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f113177f;

    public lo(u43 u43Var, int[] iArr) {
        int i10 = 0;
        fi.b(iArr.length > 0);
        this.f113172a = (u43) fi.a(u43Var);
        int length = iArr.length;
        this.f113173b = length;
        this.f113175d = new yv0[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f113175d[i11] = u43Var.a(iArr[i11]);
        }
        Arrays.sort(this.f113175d, new Comparator() { // from class: yads.zi
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return lo.a((yv0) obj, (yv0) obj2);
            }
        });
        this.f113174c = new int[this.f113173b];
        while (true) {
            int i12 = this.f113173b;
            if (i10 >= i12) {
                this.f113176e = new long[i12];
                return;
            } else {
                this.f113174c[i10] = u43Var.a(this.f113175d[i10]);
                i10++;
            }
        }
    }

    @Override // yads.bo0
    public void a() {
    }

    @Override // yads.bo0
    public void b() {
    }

    @Override // yads.bo0
    public final u43 c() {
        return this.f113172a;
    }

    @Override // yads.bo0
    public final yv0 d() {
        return this.f113175d[f()];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            lo loVar = (lo) obj;
            if (this.f113172a == loVar.f113172a && Arrays.equals(this.f113174c, loVar.f113174c)) {
                return true;
            }
        }
        return false;
    }

    @Override // yads.bo0
    public final int g() {
        return this.f113174c.length;
    }

    public final int hashCode() {
        if (this.f113177f == 0) {
            this.f113177f = Arrays.hashCode(this.f113174c) + (System.identityHashCode(this.f113172a) * 31);
        }
        return this.f113177f;
    }

    @Override // yads.bo0
    public /* synthetic */ void i() {
        q4.c(this);
    }

    @Override // yads.bo0
    public /* synthetic */ void j() {
        q4.d(this);
    }

    @Override // yads.bo0
    public void a(float f10) {
    }

    @Override // yads.bo0
    public final int b(int i10) {
        return this.f113174c[i10];
    }

    @Override // yads.bo0
    public final int c(int i10) {
        for (int i11 = 0; i11 < this.f113173b; i11++) {
            if (this.f113174c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // yads.bo0
    public /* synthetic */ void a(boolean z10) {
        q4.a(this, z10);
    }

    @Override // yads.bo0
    public final boolean b(int i10, long j10) {
        return this.f113176e[i10] > j10;
    }

    @Override // yads.bo0
    public /* synthetic */ boolean a(long j10, tt ttVar, List list) {
        return q4.b(this, j10, ttVar, list);
    }

    @Override // yads.bo0
    public final boolean a(int i10, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zB = b(i10, jElapsedRealtime);
        int i11 = 0;
        while (i11 < this.f113173b && !zB) {
            zB = (i11 == i10 || b(i11, jElapsedRealtime)) ? false : true;
            i11++;
        }
        if (!zB) {
            return false;
        }
        long[] jArr = this.f113176e;
        long j11 = jArr[i10];
        int i12 = w83.f117341a;
        long j12 = jElapsedRealtime + j10;
        if (((j10 ^ j12) & (jElapsedRealtime ^ j12)) < 0) {
            j12 = Long.MAX_VALUE;
        }
        jArr[i10] = Math.max(j11, j12);
        return true;
    }

    @Override // yads.bo0
    public int a(long j10, List list) {
        return list.size();
    }

    @Override // yads.bo0
    public final yv0 a(int i10) {
        return this.f113175d[i10];
    }

    @Override // yads.bo0
    public final int a(yv0 yv0Var) {
        for (int i10 = 0; i10 < this.f113173b; i10++) {
            if (this.f113175d[i10] == yv0Var) {
                return i10;
            }
        }
        return -1;
    }

    public static /* synthetic */ int a(yv0 yv0Var, yv0 yv0Var2) {
        return yv0Var2.f118394i - yv0Var.f118394i;
    }
}
