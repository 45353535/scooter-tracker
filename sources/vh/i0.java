package vh;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i0 extends h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient byte[][] f106853g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final transient int[] f106854h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(byte[][] segments, int[] directory) {
        super(h.f106841f.m());
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(directory, "directory");
        this.f106853g = segments;
        this.f106854h = directory;
    }

    private final h W() {
        return new h(Q());
    }

    private final Object writeReplace() {
        h hVarW = W();
        Intrinsics.checkNotNull(hVarW, "null cannot be cast to non-null type java.lang.Object");
        return hVarW;
    }

    @Override // vh.h
    public int B(byte[] other, int i10) {
        Intrinsics.checkNotNullParameter(other, "other");
        return W().B(other, i10);
    }

    @Override // vh.h
    public boolean F(int i10, h other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i10 < 0 || i10 > K() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iB = wh.e.b(this, i10);
        while (i10 < i13) {
            int i14 = iB == 0 ? 0 : U()[iB - 1];
            int i15 = U()[iB] - i14;
            int i16 = U()[V().length + iB];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!other.G(i11, V()[iB], i16 + (i10 - i14), iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iB++;
        }
        return true;
    }

    @Override // vh.h
    public boolean G(int i10, byte[] other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i10 < 0 || i10 > K() - i12 || i11 < 0 || i11 > other.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iB = wh.e.b(this, i10);
        while (i10 < i13) {
            int i14 = iB == 0 ? 0 : U()[iB - 1];
            int i15 = U()[iB] - i14;
            int i16 = U()[V().length + iB];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!b.a(V()[iB], i16 + (i10 - i14), other, i11, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iB++;
        }
        return true;
    }

    @Override // vh.h
    public String M(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return W().M(charset);
    }

    @Override // vh.h
    public h N(int i10, int i11) {
        int iD = b.d(this, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i10 + " < 0").toString());
        }
        if (iD > K()) {
            throw new IllegalArgumentException(("endIndex=" + iD + " > length(" + K() + ')').toString());
        }
        int i12 = iD - i10;
        if (i12 < 0) {
            throw new IllegalArgumentException(("endIndex=" + iD + " < beginIndex=" + i10).toString());
        }
        if (i10 == 0 && iD == K()) {
            return this;
        }
        if (i10 == iD) {
            return h.f106841f;
        }
        int iB = wh.e.b(this, i10);
        int iB2 = wh.e.b(this, iD - 1);
        byte[][] bArr = (byte[][]) ArraysKt.copyOfRange(V(), iB, iB2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iB <= iB2) {
            int i13 = iB;
            int i14 = 0;
            while (true) {
                iArr[i14] = Math.min(U()[i13] - i10, i12);
                int i15 = i14 + 1;
                iArr[i14 + bArr.length] = U()[V().length + i13];
                if (i13 == iB2) {
                    break;
                }
                i13++;
                i14 = i15;
            }
        }
        int i16 = iB != 0 ? U()[iB - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i10 - i16);
        return new i0(bArr, iArr);
    }

    @Override // vh.h
    public h P() {
        return W().P();
    }

    @Override // vh.h
    public byte[] Q() {
        byte[] bArr = new byte[K()];
        int length = V().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = U()[length + i10];
            int i14 = U()[i10];
            int i15 = i14 - i11;
            ArraysKt.copyInto(V()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // vh.h
    public void T(e buffer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i12 = i10 + i11;
        int iB = wh.e.b(this, i10);
        while (i10 < i12) {
            int i13 = iB == 0 ? 0 : U()[iB - 1];
            int i14 = U()[iB] - i13;
            int i15 = U()[V().length + iB];
            int iMin = Math.min(i12, i14 + i13) - i10;
            int i16 = i15 + (i10 - i13);
            g0 g0Var = new g0(V()[iB], i16, i16 + iMin, true, false);
            g0 g0Var2 = buffer.f106814b;
            if (g0Var2 == null) {
                g0Var.f106839g = g0Var;
                g0Var.f106838f = g0Var;
                buffer.f106814b = g0Var;
            } else {
                Intrinsics.checkNotNull(g0Var2);
                g0 g0Var3 = g0Var2.f106839g;
                Intrinsics.checkNotNull(g0Var3);
                g0Var3.c(g0Var);
            }
            i10 += iMin;
            iB++;
        }
        buffer.b0(buffer.e0() + ((long) i11));
    }

    public final int[] U() {
        return this.f106854h;
    }

    public final byte[][] V() {
        return this.f106853g;
    }

    @Override // vh.h
    public String d() {
        return W().d();
    }

    @Override // vh.h
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.K() == K() && F(0, hVar, 0, K())) {
                return true;
            }
        }
        return false;
    }

    @Override // vh.h
    public int hashCode() {
        int iN = n();
        if (iN != 0) {
            return iN;
        }
        int length = V().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = U()[length + i10];
            int i14 = U()[i10];
            byte[] bArr = V()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        H(i11);
        return i11;
    }

    @Override // vh.h
    public h i(String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = V().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = U()[length + i10];
            int i13 = U()[i10];
            messageDigest.update(V()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.checkNotNull(bArrDigest);
        return new h(bArrDigest);
    }

    @Override // vh.h
    public int o() {
        return U()[V().length - 1];
    }

    @Override // vh.h
    public String r() {
        return W().r();
    }

    @Override // vh.h
    public int t(byte[] other, int i10) {
        Intrinsics.checkNotNullParameter(other, "other");
        return W().t(other, i10);
    }

    @Override // vh.h
    public String toString() {
        return W().toString();
    }

    @Override // vh.h
    public byte[] v() {
        return Q();
    }

    @Override // vh.h
    public byte x(int i10) {
        b.b(U()[V().length - 1], i10, 1L);
        int iB = wh.e.b(this, i10);
        return V()[iB][(i10 - (iB == 0 ? 0 : U()[iB - 1])) + U()[V().length + iB]];
    }
}
