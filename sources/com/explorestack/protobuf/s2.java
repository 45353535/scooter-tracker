package com.explorestack.protobuf;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class s2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final s2 f19340f = new s2(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f19341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f19342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f19343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f19345e;

    private s2() {
        this(0, new int[8], new Object[8], true);
    }

    private void b() {
        int i10 = this.f19341a;
        int[] iArr = this.f19342b;
        if (i10 == iArr.length) {
            int i11 = i10 + (i10 < 4 ? 8 : i10 >> 1);
            this.f19342b = Arrays.copyOf(iArr, i11);
            this.f19343c = Arrays.copyOf(this.f19343c, i11);
        }
    }

    public static s2 c() {
        return f19340f;
    }

    private static int f(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    private static int g(Object[] objArr, int i10) {
        int iHashCode = 17;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode = (iHashCode * 31) + objArr[i11].hashCode();
        }
        return iHashCode;
    }

    static s2 i() {
        return new s2();
    }

    private static boolean j(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    private static boolean l(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    void a() {
        if (!this.f19345e) {
            throw new UnsupportedOperationException();
        }
    }

    public int d() {
        int iA0;
        int i10 = this.f19344d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f19341a; i12++) {
            int i13 = this.f19342b[i12];
            int iA = z2.a(i13);
            int iB = z2.b(i13);
            if (iB == 0) {
                iA0 = n.a0(iA, ((Long) this.f19343c[i12]).longValue());
            } else if (iB == 1) {
                iA0 = n.p(iA, ((Long) this.f19343c[i12]).longValue());
            } else if (iB == 2) {
                iA0 = n.h(iA, (ByteString) this.f19343c[i12]);
            } else if (iB == 3) {
                iA0 = (n.X(iA) * 2) + ((s2) this.f19343c[i12]).d();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.invalidWireType());
                }
                iA0 = n.n(iA, ((Integer) this.f19343c[i12]).intValue());
            }
            i11 += iA0;
        }
        this.f19344d = i11;
        return i11;
    }

    public int e() {
        int i10 = this.f19344d;
        if (i10 != -1) {
            return i10;
        }
        int iL = 0;
        for (int i11 = 0; i11 < this.f19341a; i11++) {
            iL += n.L(z2.a(this.f19342b[i11]), (ByteString) this.f19343c[i11]);
        }
        this.f19344d = iL;
        return iL;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) obj;
        int i10 = this.f19341a;
        return i10 == s2Var.f19341a && l(this.f19342b, s2Var.f19342b, i10) && j(this.f19343c, s2Var.f19343c, this.f19341a);
    }

    public void h() {
        this.f19345e = false;
    }

    public int hashCode() {
        int i10 = this.f19341a;
        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + i10) * 31) + f(this.f19342b, i10)) * 31) + g(this.f19343c, this.f19341a);
    }

    void k(int i10, Object obj) {
        a();
        b();
        int[] iArr = this.f19342b;
        int i11 = this.f19341a;
        iArr[i11] = i10;
        this.f19343c[i11] = obj;
        this.f19341a = i11 + 1;
    }

    private s2(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f19344d = -1;
        this.f19341a = i10;
        this.f19342b = iArr;
        this.f19343c = objArr;
        this.f19345e = z10;
    }
}
