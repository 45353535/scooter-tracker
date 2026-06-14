package ub;

import java.util.ArrayList;
import java.util.Collections;
import lb.k;
import lb.s;
import lb.t;
import p9.a;
import q9.d0;
import q9.l;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f105364a = new d0();

    private static p9.a b(d0 d0Var, int i10) {
        CharSequence charSequenceR = null;
        a.b bVarP = null;
        while (i10 > 0) {
            q9.a.b(i10 >= 8, "Incomplete vtt cue box header found.");
            int iQ = d0Var.q();
            int iQ2 = d0Var.q();
            int i11 = iQ - 8;
            String strI = o0.I(d0Var.e(), d0Var.f(), i11);
            d0Var.X(i11);
            i10 = (i10 - 8) - i11;
            if (iQ2 == 1937011815) {
                bVarP = e.p(strI);
            } else if (iQ2 == 1885436268) {
                charSequenceR = e.r(null, strI.trim(), Collections.EMPTY_LIST);
            }
        }
        if (charSequenceR == null) {
            charSequenceR = "";
        }
        return bVarP != null ? bVarP.o(charSequenceR).a() : e.m(charSequenceR);
    }

    @Override // lb.t
    public void a(byte[] bArr, int i10, int i11, t.b bVar, l lVar) {
        this.f105364a.U(bArr, i11 + i10);
        this.f105364a.W(i10);
        ArrayList arrayList = new ArrayList();
        while (this.f105364a.a() > 0) {
            q9.a.b(this.f105364a.a() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int iQ = this.f105364a.q();
            if (this.f105364a.q() == 1987343459) {
                arrayList.add(b(this.f105364a, iQ - 8));
            } else {
                this.f105364a.X(iQ - 8);
            }
        }
        lVar.accept(new lb.e(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // lb.t
    public int getCueReplacementBehavior() {
        return 2;
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
