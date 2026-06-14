package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes6.dex */
public class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m4 f11192a = new m4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TreeSet f11193b = new TreeSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f11194c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11196e;

    public w2(MaxAdPlacerSettings maxAdPlacerSettings) {
        a(maxAdPlacerSettings);
    }

    private void a(MaxAdPlacerSettings maxAdPlacerSettings) {
        if (!maxAdPlacerSettings.hasValidPositioning()) {
            com.applovin.impl.sdk.o.h("MaxAdPlacerData", "No positioning info was provided with ad placer settings. You must set at least (1) one or more fixed positions or (2) a repeating interval greater than or equal to 2 for the ad placer to determine where to position ads.");
            return;
        }
        this.f11192a.addAll(maxAdPlacerSettings.getFixedPositions());
        if (!maxAdPlacerSettings.isRepeatingEnabled()) {
            return;
        }
        int repeatingInterval = maxAdPlacerSettings.getRepeatingInterval();
        if (this.f11192a.isEmpty()) {
            this.f11192a.add(Integer.valueOf(repeatingInterval - 1));
        }
        int iIntValue = ((Integer) this.f11192a.a()).intValue();
        while (true) {
            iIntValue += repeatingInterval;
            if (this.f11192a.size() >= maxAdPlacerSettings.getMaxAdCount()) {
                return;
            } else {
                this.f11192a.add(Integer.valueOf(iIntValue));
            }
        }
    }

    public Collection b() {
        return new TreeSet((SortedSet) this.f11193b);
    }

    public int c() {
        int i10 = this.f11195d;
        if (i10 != -1 && this.f11196e != -1) {
            while (i10 <= this.f11196e) {
                if (g(i10) && !h(i10)) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    public int d(int i10) {
        if (g(i10)) {
            return -1;
        }
        return i10 - a(i10, true);
    }

    public Collection e(int i10) {
        return new TreeSet((SortedSet) this.f11193b.tailSet(Integer.valueOf(i10), false));
    }

    public void f(int i10) {
        int iB = this.f11192a.b(Integer.valueOf(i10));
        for (int size = this.f11192a.size() - 1; size >= iB; size--) {
            Integer num = (Integer) this.f11192a.a(size);
            int iIntValue = num.intValue() + 1;
            a(num.intValue(), iIntValue);
            this.f11192a.a(size, Integer.valueOf(iIntValue));
        }
    }

    public boolean g(int i10) {
        return this.f11192a.contains(Integer.valueOf(i10));
    }

    public boolean h(int i10) {
        return this.f11193b.contains(Integer.valueOf(i10));
    }

    public void i(int i10) {
        int iB = this.f11192a.b(Integer.valueOf(i10));
        if (g(i10)) {
            this.f11194c.remove(Integer.valueOf(i10));
            this.f11193b.remove(Integer.valueOf(i10));
            this.f11192a.b(iB);
        }
        while (iB < this.f11192a.size()) {
            Integer num = (Integer) this.f11192a.a(iB);
            int iIntValue = num.intValue() - 1;
            a(num.intValue(), iIntValue);
            this.f11192a.a(iB, Integer.valueOf(iIntValue));
            iB++;
        }
    }

    public int b(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 + a(i10 - 1, false);
    }

    public void b(int i10, int i11) {
        i(i10);
        f(i11);
    }

    public void c(int i10, int i11) {
        this.f11195d = i10;
        this.f11196e = i11;
    }

    public int c(int i10) {
        return i10 + a(i10, false);
    }

    public MaxAd a(int i10) {
        return (MaxAd) this.f11194c.get(Integer.valueOf(i10));
    }

    public void a(MaxAd maxAd, int i10) {
        this.f11194c.put(Integer.valueOf(i10), maxAd);
        this.f11193b.add(Integer.valueOf(i10));
    }

    public void a() {
        this.f11194c.clear();
        this.f11193b.clear();
    }

    public void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            this.f11194c.remove(num);
            this.f11193b.remove(num);
        }
    }

    private void a(int i10, int i11) {
        if (this.f11194c.containsKey(Integer.valueOf(i10))) {
            this.f11194c.put(Integer.valueOf(i11), (MaxAd) this.f11194c.get(Integer.valueOf(i10)));
            this.f11193b.add(Integer.valueOf(i11));
            this.f11194c.remove(Integer.valueOf(i10));
            this.f11193b.remove(Integer.valueOf(i10));
        }
    }

    private int a(int i10, boolean z10) {
        int iC = this.f11192a.c(Integer.valueOf(i10));
        if (!z10) {
            int i11 = i10 + iC;
            while (iC < this.f11192a.size() && i11 >= ((Integer) this.f11192a.a(iC)).intValue()) {
                i11++;
                iC++;
            }
        }
        return iC;
    }
}
