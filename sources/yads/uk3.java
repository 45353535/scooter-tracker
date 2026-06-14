package yads;

import androidx.collection.SieveCacheKt;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class uk3 {
    public static boolean a(yc0 yc0Var) {
        w92 w92Var = new w92(8);
        int i10 = tk3.a(yc0Var, w92Var).f116284a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        yc0Var.b(w92Var.f117356a, 0, 4, false);
        w92Var.e(0);
        int iB = w92Var.b();
        if (iB == 1463899717) {
            return true;
        }
        uf1.b("WavHeaderReader", "Unsupported form type: " + iB);
        return false;
    }

    public static tk3 a(int i10, yc0 yc0Var, w92 w92Var) throws ba2, EOFException, InterruptedIOException {
        tk3 tk3VarA = tk3.a(yc0Var, w92Var);
        while (tk3VarA.f116284a != i10) {
            uf1.d("WavHeaderReader", "Ignoring unknown WAV chunk: " + tk3VarA.f116284a);
            long j10 = tk3VarA.f116285b + 8;
            if (j10 <= SieveCacheKt.NodeLinkMask) {
                yc0Var.a((int) j10);
                tk3VarA = tk3.a(yc0Var, w92Var);
            } else {
                throw ba2.b("Chunk is too large (~2GB+) to skip; id: " + tk3VarA.f116284a);
            }
        }
        return tk3VarA;
    }
}
