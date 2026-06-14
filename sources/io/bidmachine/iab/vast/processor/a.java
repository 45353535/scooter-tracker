package io.bidmachine.iab.vast.processor;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Pair;
import b9.u;
import e9.n;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class a extends io.bidmachine.iab.vast.processor.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f80435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f80436c;

    private class b implements Comparator {
        private b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Pair pair, Pair pair2) {
            int iZ = ((n) pair.second).Z() * ((n) pair.second).X();
            int iZ2 = ((n) pair2.second).Z() * ((n) pair2.second).X();
            int iAbs = Math.abs(iZ - a.this.f80435b);
            int iAbs2 = Math.abs(iZ2 - a.this.f80435b);
            c9.e.a("DefaultMediaPicker", "AreaComparator: obj1 - %d, obj2 - %d", Integer.valueOf(iAbs), Integer.valueOf(iAbs2));
            if (iAbs < iAbs2) {
                return -1;
            }
            return iAbs > iAbs2 ? 1 : 0;
        }
    }

    public a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        d(displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.f80436c = u.u(context);
    }

    private Pair c(List list) {
        c9.e.a("DefaultMediaPicker", "getBestMatch", new Object[0]);
        Iterator it = list.iterator();
        Pair pair = null;
        while (it.hasNext()) {
            Pair pair2 = (Pair) it.next();
            if (g((n) pair2.second)) {
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

    private void d(int i10, int i11) {
        this.f80435b = i10 * i11;
    }

    @Override // io.bidmachine.iab.vast.processor.b
    public Pair a(List list) {
        if (list == null) {
            return null;
        }
        Collections.sort(list, new b());
        return c(list);
    }

    protected boolean g(n nVar) {
        String strY = nVar.Y();
        return strY != null && strY.matches("video/.*(?i)(mp4|3gpp|mp2t|webm|matroska)");
    }

    protected boolean h(n nVar) {
        return (nVar.Z() > nVar.X()) == this.f80436c;
    }
}
