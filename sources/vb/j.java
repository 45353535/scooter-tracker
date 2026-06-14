package vb;

import android.util.SparseArray;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.SignedBytes;
import io.bidmachine.media3.common.a;
import java.util.ArrayList;
import java.util.List;
import vb.l0;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements l0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f106180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f106181b;

    public j(int i10) {
        this(i10, ImmutableList.of());
    }

    private g0 b(l0.b bVar) {
        return new g0(d(bVar), "video/mp2t");
    }

    private n0 c(l0.b bVar) {
        return new n0(d(bVar), "video/mp2t");
    }

    private List d(l0.b bVar) {
        String str;
        int i10;
        if (e(32)) {
            return this.f106181b;
        }
        q9.d0 d0Var = new q9.d0(bVar.f106242e);
        List arrayList = this.f106181b;
        while (d0Var.a() > 0) {
            int iH = d0Var.H();
            int iF = d0Var.f() + d0Var.H();
            if (iH == 134) {
                arrayList = new ArrayList();
                int iH2 = d0Var.H() & 31;
                for (int i11 = 0; i11 < iH2; i11++) {
                    String strE = d0Var.E(3);
                    int iH3 = d0Var.H();
                    boolean z10 = (iH3 & 128) != 0;
                    if (z10) {
                        i10 = iH3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte bH = (byte) d0Var.H();
                    d0Var.X(1);
                    arrayList.add(new a.b().u0(str).j0(strE).O(i10).g0(z10 ? q9.i.e((bH & SignedBytes.MAX_POWER_OF_TWO) != 0) : null).N());
                }
            }
            d0Var.W(iF);
        }
        return arrayList;
    }

    private boolean e(int i10) {
        return (i10 & this.f106180a) != 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0059  */
    @Override // vb.l0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public vb.l0 a(int r6, vb.l0.b r7) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vb.j.a(int, vb.l0$b):vb.l0");
    }

    @Override // vb.l0.c
    public SparseArray createInitialPayloadReaders() {
        return new SparseArray();
    }

    public j(int i10, List list) {
        this.f106180a = i10;
        this.f106181b = list;
    }
}
