package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f22449b;

    public e(int i10, List list) {
        this.f22448a = i10;
        if (!a(32) && list.isEmpty()) {
            list = Collections.singletonList(com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, "application/cea-608", 0, null, -1, null, Long.MAX_VALUE, Collections.EMPTY_LIST));
        }
        this.f22449b = list;
    }

    public final f0 a(int i10, d0 d0Var) {
        if (i10 == 2) {
            return new s(new j());
        }
        if (i10 == 3 || i10 == 4) {
            return new s(new q(d0Var.f22445a));
        }
        if (i10 == 15) {
            if (a(2)) {
                return null;
            }
            return new s(new d(false, d0Var.f22445a));
        }
        if (i10 == 21) {
            return new s(new p());
        }
        if (i10 == 27) {
            if (a(4)) {
                return null;
            }
            return new s(new m(a(d0Var), a(1), a(8)));
        }
        if (i10 == 36) {
            return new s(new o(a(d0Var)));
        }
        if (i10 == 89) {
            return new s(new g(d0Var.f22446b));
        }
        if (i10 != 138) {
            if (i10 != 129) {
                if (i10 != 130) {
                    if (i10 == 134) {
                        if (a(16)) {
                            return null;
                        }
                        return new w(new y());
                    }
                    if (i10 != 135) {
                        return null;
                    }
                }
            }
            return new s(new b(d0Var.f22445a));
        }
        return new s(new f(d0Var.f22445a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final x a(d0 d0Var) {
        int i10;
        String str;
        if (a(32)) {
            return new x(this.f22449b);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(d0Var.f22447c);
        ArrayList arrayList = this.f22449b;
        while (nVar.f23136c - nVar.f23135b > 0) {
            int iJ = nVar.j();
            int iJ2 = nVar.f23135b + nVar.j();
            if (iJ == 134) {
                arrayList = new ArrayList();
                int iJ3 = nVar.j() & 31;
                for (int i11 = 0; i11 < iJ3; i11++) {
                    String strB = nVar.b(3);
                    int iJ4 = nVar.j();
                    if ((iJ4 & 128) != 0) {
                        i10 = iJ4 & 63;
                        str = "application/cea-708";
                    } else {
                        i10 = 1;
                        str = "application/cea-608";
                    }
                    arrayList.add(com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, str, 0, strB, i10, null, Long.MAX_VALUE, Collections.EMPTY_LIST));
                    nVar.e(nVar.f23135b + 2);
                }
            }
            nVar.e(iJ2);
            arrayList = arrayList;
        }
        return new x(arrayList);
    }

    public final boolean a(int i10) {
        return (i10 & this.f22448a) != 0;
    }
}
