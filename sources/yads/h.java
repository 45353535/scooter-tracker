package yads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f111412b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f111413c;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        int iA;
        int i10 = this.f111412b;
        if (i10 == 4) {
            throw new IllegalStateException();
        }
        int iA2 = pf0.a(i10);
        if (iA2 == 0) {
            return true;
        }
        if (iA2 != 2) {
            this.f111412b = 4;
            g03 g03Var = (g03) this;
            int i11 = g03Var.f111018g;
            while (true) {
                int i12 = g03Var.f111018g;
                if (i12 == -1) {
                    g03Var.f111412b = 3;
                    string = null;
                    break;
                }
                iA = g03Var.f111020i.f111429a.a(g03Var.f111015d, i12);
                if (iA == -1) {
                    iA = g03Var.f111015d.length();
                    g03Var.f111018g = -1;
                } else {
                    g03Var.f111018g = iA + 1;
                }
                int i13 = g03Var.f111018g;
                if (i13 == i11) {
                    int i14 = i13 + 1;
                    g03Var.f111018g = i14;
                    if (i14 > g03Var.f111015d.length()) {
                        g03Var.f111018g = -1;
                    }
                } else {
                    while (i11 < iA && g03Var.f111016e.a(g03Var.f111015d.charAt(i11))) {
                        i11++;
                    }
                    while (iA > i11 && g03Var.f111016e.a(g03Var.f111015d.charAt(iA - 1))) {
                        iA--;
                    }
                    if (!g03Var.f111017f || i11 != iA) {
                        break;
                    }
                    i11 = g03Var.f111018g;
                }
            }
            int i15 = g03Var.f111019h;
            if (i15 == 1) {
                iA = g03Var.f111015d.length();
                g03Var.f111018g = -1;
                while (iA > i11 && g03Var.f111016e.a(g03Var.f111015d.charAt(iA - 1))) {
                    iA--;
                }
            } else {
                g03Var.f111019h = i15 - 1;
            }
            string = g03Var.f111015d.subSequence(i11, iA).toString();
            this.f111413c = string;
            if (this.f111412b != 3) {
                this.f111412b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f111412b = 2;
        String str = this.f111413c;
        this.f111413c = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
