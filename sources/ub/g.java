package ub;

import android.text.TextUtils;
import java.util.ArrayList;
import lb.k;
import lb.s;
import lb.t;
import n9.x;
import q9.d0;
import q9.l;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f105413a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f105414b = new b();

    private static int b(d0 d0Var) {
        int i10 = -1;
        int iF = 0;
        while (i10 == -1) {
            iF = d0Var.f();
            String strS = d0Var.s();
            i10 = strS == null ? 0 : "STYLE".equals(strS) ? 2 : strS.startsWith("NOTE") ? 1 : 3;
        }
        d0Var.W(iF);
        return i10;
    }

    private static void c(d0 d0Var) {
        while (!TextUtils.isEmpty(d0Var.s())) {
        }
    }

    @Override // lb.t
    public void a(byte[] bArr, int i10, int i11, t.b bVar, l lVar) {
        d dVarO;
        this.f105413a.U(bArr, i11 + i10);
        this.f105413a.W(i10);
        ArrayList arrayList = new ArrayList();
        try {
            h.e(this.f105413a);
            while (!TextUtils.isEmpty(this.f105413a.s())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int iB = b(this.f105413a);
                if (iB == 0) {
                    lb.i.c(new j(arrayList2), bVar, lVar);
                    return;
                }
                if (iB == 1) {
                    c(this.f105413a);
                } else if (iB == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.f105413a.s();
                    arrayList.addAll(this.f105414b.d(this.f105413a));
                } else if (iB == 3 && (dVarO = e.o(this.f105413a, arrayList)) != null) {
                    arrayList2.add(dVarO);
                }
            }
        } catch (x e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // lb.t
    public int getCueReplacementBehavior() {
        return 1;
    }

    @Override // lb.t
    public /* synthetic */ k parseToLegacySubtitle(byte[] bArr, int i10, int i11) {
        return s.a(this, bArr, i10, i11);
    }

    @Override // lb.t
    public /* synthetic */ void reset() {
        s.b(this);
    }
}
