package oa;

import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;
import oa.b0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class z {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b0 f96676a;

        public a(b0 b0Var) {
            this.f96676a = b0Var;
        }
    }

    public static boolean a(s sVar) {
        q9.d0 d0Var = new q9.d0(4);
        sVar.peekFully(d0Var.e(), 0, 4);
        return d0Var.J() == 1716281667;
    }

    public static int b(s sVar) throws n9.x {
        sVar.resetPeekPosition();
        q9.d0 d0Var = new q9.d0(2);
        sVar.peekFully(d0Var.e(), 0, 2);
        int iP = d0Var.P();
        if ((iP >> 2) == 16382) {
            sVar.resetPeekPosition();
            return iP;
        }
        sVar.resetPeekPosition();
        throw n9.x.a("First frame does not start with sync code.", null);
    }

    public static n9.v c(s sVar, boolean z10) throws Throwable {
        n9.v vVarA = new g0().a(sVar, z10 ? null : cb.h.f6661b);
        if (vVarA == null || vVarA.e() == 0) {
            return null;
        }
        return vVarA;
    }

    public static n9.v d(s sVar, boolean z10) throws Throwable {
        sVar.resetPeekPosition();
        long peekPosition = sVar.getPeekPosition();
        n9.v vVarC = c(sVar, z10);
        sVar.skipFully((int) (sVar.getPeekPosition() - peekPosition));
        return vVarC;
    }

    public static boolean e(s sVar, a aVar) {
        sVar.resetPeekPosition();
        q9.c0 c0Var = new q9.c0(new byte[4]);
        sVar.peekFully(c0Var.f98765a, 0, 4);
        boolean zG = c0Var.g();
        int iH = c0Var.h(7);
        int iH2 = c0Var.h(24) + 4;
        if (iH == 0) {
            aVar.f96676a = h(sVar);
            return zG;
        }
        b0 b0Var = aVar.f96676a;
        if (b0Var == null) {
            throw new IllegalArgumentException();
        }
        if (iH == 3) {
            aVar.f96676a = b0Var.b(f(sVar, iH2));
            return zG;
        }
        if (iH == 4) {
            aVar.f96676a = b0Var.c(j(sVar, iH2));
            return zG;
        }
        if (iH != 6) {
            sVar.skipFully(iH2);
            return zG;
        }
        q9.d0 d0Var = new q9.d0(iH2);
        sVar.readFully(d0Var.e(), 0, iH2);
        d0Var.X(4);
        aVar.f96676a = b0Var.a(ImmutableList.of(ab.a.b(d0Var)));
        return zG;
    }

    private static b0.a f(s sVar, int i10) {
        q9.d0 d0Var = new q9.d0(i10);
        sVar.readFully(d0Var.e(), 0, i10);
        return g(d0Var);
    }

    public static b0.a g(q9.d0 d0Var) {
        d0Var.X(1);
        int iK = d0Var.K();
        long jF = ((long) d0Var.f()) + ((long) iK);
        int i10 = iK / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long jA = d0Var.A();
            if (jA == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = jA;
            jArrCopyOf2[i11] = d0Var.A();
            d0Var.X(2);
            i11++;
        }
        d0Var.X((int) (jF - ((long) d0Var.f())));
        return new b0.a(jArrCopyOf, jArrCopyOf2);
    }

    private static b0 h(s sVar) {
        byte[] bArr = new byte[38];
        sVar.readFully(bArr, 0, 38);
        return new b0(bArr, 4);
    }

    public static void i(s sVar) throws n9.x {
        q9.d0 d0Var = new q9.d0(4);
        sVar.readFully(d0Var.e(), 0, 4);
        if (d0Var.J() != 1716281667) {
            throw n9.x.a("Failed to read FLAC stream marker.", null);
        }
    }

    private static List j(s sVar, int i10) {
        q9.d0 d0Var = new q9.d0(i10);
        sVar.readFully(d0Var.e(), 0, i10);
        d0Var.X(4);
        return Arrays.asList(v0.k(d0Var, false, false).f96658b);
    }
}
