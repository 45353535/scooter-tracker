package jg;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f85903b = AtomicIntegerFieldUpdater.newUpdater(p0.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private q0[] f85904a;

    private final q0[] g() {
        q0[] q0VarArr = this.f85904a;
        if (q0VarArr == null) {
            q0[] q0VarArr2 = new q0[4];
            this.f85904a = q0VarArr2;
            return q0VarArr2;
        }
        if (c() < q0VarArr.length) {
            return q0VarArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(q0VarArr, c() * 2);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        q0[] q0VarArr3 = (q0[]) objArrCopyOf;
        this.f85904a = q0VarArr3;
        return q0VarArr3;
    }

    private final void k(int i10) {
        f85903b.set(this, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void l(int r6) {
        /*
            r5 = this;
        L0:
            int r0 = r6 * 2
            int r1 = r0 + 1
            int r2 = r5.c()
            if (r1 < r2) goto Lb
            goto L3e
        Lb:
            jg.q0[] r2 = r5.f85904a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r0 = r0 + 2
            int r3 = r5.c()
            if (r0 >= r3) goto L2b
            r3 = r2[r0]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L2b
            goto L2c
        L2b:
            r0 = r1
        L2c:
            r1 = r2[r6]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r2[r0]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L3f
        L3e:
            return
        L3f:
            r5.n(r6, r0)
            r6 = r0
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: jg.p0.l(int):void");
    }

    private final void m(int i10) {
        while (i10 > 0) {
            q0[] q0VarArr = this.f85904a;
            Intrinsics.checkNotNull(q0VarArr);
            int i11 = (i10 - 1) / 2;
            q0 q0Var = q0VarArr[i11];
            Intrinsics.checkNotNull(q0Var);
            q0 q0Var2 = q0VarArr[i10];
            Intrinsics.checkNotNull(q0Var2);
            if (((Comparable) q0Var).compareTo(q0Var2) <= 0) {
                return;
            }
            n(i10, i11);
            i10 = i11;
        }
    }

    private final void n(int i10, int i11) {
        q0[] q0VarArr = this.f85904a;
        Intrinsics.checkNotNull(q0VarArr);
        q0 q0Var = q0VarArr[i11];
        Intrinsics.checkNotNull(q0Var);
        q0 q0Var2 = q0VarArr[i10];
        Intrinsics.checkNotNull(q0Var2);
        q0VarArr[i10] = q0Var;
        q0VarArr[i11] = q0Var2;
        q0Var.setIndex(i10);
        q0Var2.setIndex(i11);
    }

    public final void a(q0 q0Var) {
        q0Var.e(this);
        q0[] q0VarArrG = g();
        int iC = c();
        k(iC + 1);
        q0VarArrG[iC] = q0Var;
        q0Var.setIndex(iC);
        m(iC);
    }

    public final q0 b() {
        q0[] q0VarArr = this.f85904a;
        if (q0VarArr != null) {
            return q0VarArr[0];
        }
        return null;
    }

    public final int c() {
        return f85903b.get(this);
    }

    public final boolean e() {
        return c() == 0;
    }

    public final q0 f() {
        q0 q0VarB;
        synchronized (this) {
            q0VarB = b();
        }
        return q0VarB;
    }

    public final boolean h(q0 q0Var) {
        boolean z10;
        synchronized (this) {
            if (q0Var.d() == null) {
                z10 = false;
            } else {
                i(q0Var.getIndex());
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final jg.q0 i(int r6) {
        /*
            r5 = this;
            jg.q0[] r0 = r5.f85904a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r5.c()
            r2 = -1
            int r1 = r1 + r2
            r5.k(r1)
            int r1 = r5.c()
            if (r6 >= r1) goto L3d
            int r1 = r5.c()
            r5.n(r6, r1)
            int r1 = r6 + (-1)
            int r1 = r1 / 2
            if (r6 <= 0) goto L3a
            r3 = r0[r6]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r0[r1]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L3a
            r5.n(r6, r1)
            r5.m(r1)
            goto L3d
        L3a:
            r5.l(r6)
        L3d:
            int r6 = r5.c()
            r6 = r0[r6]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            r1 = 0
            r6.e(r1)
            r6.setIndex(r2)
            int r2 = r5.c()
            r0[r2] = r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jg.p0.i(int):jg.q0");
    }

    public final q0 j() {
        q0 q0VarI;
        synchronized (this) {
            q0VarI = c() > 0 ? i(0) : null;
        }
        return q0VarI;
    }
}
