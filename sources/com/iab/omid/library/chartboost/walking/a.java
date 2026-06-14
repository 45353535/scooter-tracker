package com.iab.omid.library.chartboost.walking;

import android.view.View;
import com.iab.omid.library.chartboost.internal.e;
import com.iab.omid.library.chartboost.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f34851a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0387a> f34852b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f34853c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f34854d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f34855e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f34856f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f34857g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f34858h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f34859i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f34860j;

    /* JADX INFO: renamed from: com.iab.omid.library.chartboost.walking.a$a, reason: collision with other inner class name */
    public static class C0387a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f34861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f34862b = new ArrayList<>();

        public C0387a(e eVar, String str) {
            this.f34861a = eVar;
            a(str);
        }

        public e a() {
            return this.f34861a;
        }

        public ArrayList<String> b() {
            return this.f34862b;
        }

        public void a(String str) {
            this.f34862b.add(str);
        }
    }

    public View a(String str) {
        return this.f34853c.get(str);
    }

    public C0387a b(View view) {
        C0387a c0387a = this.f34852b.get(view);
        if (c0387a != null) {
            this.f34852b.remove(view);
        }
        return c0387a;
    }

    public String c(View view) {
        if (this.f34851a.size() == 0) {
            return null;
        }
        String str = this.f34851a.get(view);
        if (str != null) {
            this.f34851a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        return this.f34854d.contains(view) ? c.PARENT_VIEW : this.f34860j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.chartboost.internal.c cVarC = com.iab.omid.library.chartboost.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.chartboost.adsession.a aVar : cVarC.a()) {
                View viewE = aVar.e();
                if (aVar.h()) {
                    String strC = aVar.c();
                    if (viewE != null) {
                        boolean zE = h.e(viewE);
                        if (zE) {
                            this.f34858h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f34855e.add(strC);
                            this.f34851a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f34856f.add(strC);
                            this.f34853c.put(strC, viewE);
                            this.f34857g.put(strC, strA);
                        }
                    } else {
                        this.f34856f.add(strC);
                        this.f34857g.put(strC, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f34859i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f34859i.containsKey(view)) {
            return this.f34859i.get(view);
        }
        Map<View, Boolean> map = this.f34859i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.f34857g.get(str);
    }

    public HashSet<String> c() {
        return this.f34855e;
    }

    public void d() {
        this.f34860j = true;
    }

    public boolean e(View view) {
        if (!this.f34859i.containsKey(view)) {
            return true;
        }
        this.f34859i.put(view, Boolean.TRUE);
        return false;
    }

    private String a(View view, boolean z10) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (a(view).booleanValue() && !z10) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String strA = h.a(view);
            if (strA != null) {
                return strA;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f34854d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f34856f;
    }

    public boolean c(String str) {
        return this.f34858h.contains(str);
    }

    public void a() {
        this.f34851a.clear();
        this.f34852b.clear();
        this.f34853c.clear();
        this.f34854d.clear();
        this.f34855e.clear();
        this.f34856f.clear();
        this.f34857g.clear();
        this.f34860j = false;
        this.f34858h.clear();
    }

    private void a(com.iab.omid.library.chartboost.adsession.a aVar) {
        Iterator<e> it = aVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.chartboost.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0387a c0387a = this.f34852b.get(view);
        if (c0387a != null) {
            c0387a.a(aVar.c());
        } else {
            this.f34852b.put(view, new C0387a(eVar, aVar.c()));
        }
    }
}
