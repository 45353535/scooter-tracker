package wb;

import android.util.Pair;
import androidx.collection.SieveCacheKt;
import n9.x;
import oa.s;
import q9.d0;
import q9.o0;
import q9.u;

/* JADX INFO: loaded from: classes12.dex */
abstract class d {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f107873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f107874b;

        private a(int i10, long j10) {
            this.f107873a = i10;
            this.f107874b = j10;
        }

        public static a a(s sVar, d0 d0Var) {
            sVar.peekFully(d0Var.e(), 0, 8);
            d0Var.W(0);
            return new a(d0Var.q(), d0Var.x());
        }
    }

    public static boolean a(s sVar) {
        d0 d0Var = new d0(8);
        int i10 = a.a(sVar, d0Var).f107873a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        sVar.peekFully(d0Var.e(), 0, 4);
        d0Var.W(0);
        int iQ = d0Var.q();
        if (iQ == 1463899717) {
            return true;
        }
        u.c("WavHeaderReader", "Unsupported form type: " + iQ);
        return false;
    }

    public static c b(s sVar) throws x {
        byte[] bArr;
        d0 d0Var = new d0(16);
        a aVarD = d(1718449184, sVar, d0Var);
        q9.a.g(aVarD.f107874b >= 16);
        sVar.peekFully(d0Var.e(), 0, 16);
        d0Var.W(0);
        int iZ = d0Var.z();
        int iZ2 = d0Var.z();
        int iY = d0Var.y();
        int iY2 = d0Var.y();
        int iZ3 = d0Var.z();
        int iZ4 = d0Var.z();
        int i10 = ((int) aVarD.f107874b) - 16;
        if (i10 > 0) {
            bArr = new byte[i10];
            sVar.peekFully(bArr, 0, i10);
        } else {
            bArr = o0.f98842f;
        }
        byte[] bArr2 = bArr;
        sVar.skipFully((int) (sVar.getPeekPosition() - sVar.getPosition()));
        return new c(iZ, iZ2, iY, iY2, iZ3, iZ4, bArr2);
    }

    public static long c(s sVar) {
        d0 d0Var = new d0(8);
        a aVarA = a.a(sVar, d0Var);
        if (aVarA.f107873a != 1685272116) {
            sVar.resetPeekPosition();
            return -1L;
        }
        sVar.advancePeekPosition(8);
        d0Var.W(0);
        sVar.peekFully(d0Var.e(), 0, 8);
        long jV = d0Var.v();
        sVar.skipFully(((int) aVarA.f107874b) + 8);
        return jV;
    }

    private static a d(int i10, s sVar, d0 d0Var) throws x {
        a aVarA = a.a(sVar, d0Var);
        while (aVarA.f107873a != i10) {
            u.h("WavHeaderReader", "Ignoring unknown WAV chunk: " + aVarA.f107873a);
            long j10 = aVarA.f107874b;
            long j11 = 8 + j10;
            if (j10 % 2 != 0) {
                j11 = 9 + j10;
            }
            if (j11 > SieveCacheKt.NodeLinkMask) {
                throw x.d("Chunk is too large (~2GB+) to skip; id: " + aVarA.f107873a);
            }
            sVar.skipFully((int) j11);
            aVarA = a.a(sVar, d0Var);
        }
        return aVarA;
    }

    public static Pair e(s sVar) throws x {
        sVar.resetPeekPosition();
        a aVarD = d(1684108385, sVar, new d0(8));
        sVar.skipFully(8);
        return Pair.create(Long.valueOf(sVar.getPosition()), Long.valueOf(aVarD.f107874b));
    }
}
