package ma;

import java.nio.ByteBuffer;
import java.util.List;
import r9.g;

/* JADX INFO: loaded from: classes12.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g.e f94525a;

    a() {
    }

    private boolean a(g.d dVar, boolean z10) {
        g.e eVar;
        g.b bVarB;
        int i10 = dVar.f99323a;
        if (i10 == 2 || i10 == 15) {
            return true;
        }
        if (i10 != 3 || z10) {
            return ((i10 != 6 && i10 != 3) || (eVar = this.f94525a) == null || (bVarB = g.b.b(eVar, dVar)) == null || bVarB.a()) ? false : true;
        }
        return false;
    }

    private void e(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((g.d) list.get(i10)).f99323a == 1) {
                this.f94525a = g.e.a((g.d) list.get(i10));
            }
        }
    }

    public void b(ByteBuffer byteBuffer) {
        e(r9.g.e(byteBuffer));
    }

    public void c() {
        this.f94525a = null;
    }

    public int d(ByteBuffer byteBuffer, boolean z10) {
        List listE = r9.g.e(byteBuffer);
        e(listE);
        int size = listE.size() - 1;
        int i10 = 0;
        while (size >= 0 && a((g.d) listE.get(size), z10)) {
            if (((g.d) listE.get(size)).f99323a == 6 || ((g.d) listE.get(size)).f99323a == 3) {
                i10++;
            }
            size--;
        }
        return (i10 > 1 || size + 1 >= 8) ? byteBuffer.limit() : size >= 0 ? ((g.d) listE.get(size)).f99324b.limit() : byteBuffer.position();
    }
}
