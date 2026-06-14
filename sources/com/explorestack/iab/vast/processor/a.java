package com.explorestack.iab.vast.processor;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Pair;
import e2.g;
import h2.n;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class a extends com.explorestack.iab.vast.processor.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f18296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f18297c;

    private class b implements Comparator {
        private b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Pair pair, Pair pair2) {
            int iA0 = ((n) pair.second).a0() * ((n) pair.second).Y();
            int iA02 = ((n) pair2.second).a0() * ((n) pair2.second).Y();
            int iAbs = Math.abs(iA0 - a.this.f18296b);
            int iAbs2 = Math.abs(iA02 - a.this.f18296b);
            f2.c.a("DefaultMediaPicker", "AreaComparator: obj1 - %d, obj2 - %d", Integer.valueOf(iAbs), Integer.valueOf(iAbs2));
            if (iAbs < iAbs2) {
                return -1;
            }
            return iAbs > iAbs2 ? 1 : 0;
        }
    }

    public a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        c(displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.f18297c = g.s(context);
    }

    private void c(int i10, int i11) {
        this.f18296b = i10 * i11;
    }

    private Pair g(List list) {
        f2.c.a("DefaultMediaPicker", "getBestMatch", new Object[0]);
        Iterator it = list.iterator();
        Pair pair = null;
        while (it.hasNext()) {
            Pair pair2 = (Pair) it.next();
            if (d((n) pair2.second)) {
                if (h((n) pair2.second)) {
                    return pair2;
                }
                if (pair == null) {
                    pair = pair2;
                }
            }
        }
        return pair;
    }

    @Override // com.explorestack.iab.vast.processor.b
    public Pair a(List list) {
        if (list == null) {
            return null;
        }
        Collections.sort(list, new b());
        return g(list);
    }

    protected boolean d(n nVar) {
        return nVar.Z().matches("video/.*(?i)(mp4|3gpp|mp2t|webm|matroska)");
    }

    protected boolean h(n nVar) {
        return (nVar.a0() > nVar.Y()) == this.f18297c;
    }
}
