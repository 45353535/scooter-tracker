package eb;

import java.nio.ByteBuffer;
import n9.v;
import q9.c0;
import q9.d0;
import q9.j0;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends xa.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f69012a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0 f69013b = new c0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j0 f69014c;

    @Override // xa.c
    protected v b(xa.b bVar, ByteBuffer byteBuffer) {
        j0 j0Var = this.f69014c;
        if (j0Var == null || bVar.f108164k != j0Var.f()) {
            j0 j0Var2 = new j0(bVar.f104990g);
            this.f69014c = j0Var2;
            j0Var2.a(bVar.f104990g - bVar.f108164k);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f69012a.U(bArrArray, iLimit);
        this.f69013b.o(bArrArray, iLimit);
        this.f69013b.r(39);
        long jH = (((long) this.f69013b.h(1)) << 32) | ((long) this.f69013b.h(32));
        this.f69013b.r(20);
        int iH = this.f69013b.h(12);
        int iH2 = this.f69013b.h(8);
        this.f69012a.X(14);
        v.a aVarB = iH2 != 0 ? iH2 != 255 ? iH2 != 4 ? iH2 != 5 ? iH2 != 6 ? null : g.b(this.f69012a, jH, this.f69014c) : d.b(this.f69012a, jH, this.f69014c) : f.b(this.f69012a) : a.b(this.f69012a, iH, jH) : new e();
        return aVarB == null ? new v(new v.a[0]) : new v(aVarB);
    }
}
