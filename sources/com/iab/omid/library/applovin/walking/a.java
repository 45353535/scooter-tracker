package com.iab.omid.library.applovin.walking;

import android.view.View;
import com.iab.omid.library.applovin.internal.e;
import com.iab.omid.library.applovin.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f34324a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0371a> f34325b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f34326c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f34327d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f34328e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f34329f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f34330g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f34331h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f34332i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f34333j;

    /* JADX INFO: renamed from: com.iab.omid.library.applovin.walking.a$a, reason: collision with other inner class name */
    public static class C0371a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f34334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f34335b = new ArrayList<>();

        public C0371a(e eVar, String str) {
            this.f34334a = eVar;
            a(str);
        }

        public e a() {
            return this.f34334a;
        }

        public ArrayList<String> b() {
            return this.f34335b;
        }

        public void a(String str) {
            this.f34335b.add(str);
        }
    }

    public View a(String str) {
        return this.f34326c.get(str);
    }

    public C0371a b(View view) {
        C0371a c0371a = this.f34325b.get(view);
        if (c0371a != null) {
            this.f34325b.remove(view);
        }
        return c0371a;
    }

    public String c(View view) {
        if (this.f34324a.size() == 0) {
            return null;
        }
        String str = this.f34324a.get(view);
        if (str != null) {
            this.f34324a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        return this.f34327d.contains(view) ? c.PARENT_VIEW : this.f34333j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.applovin.internal.c cVarC = com.iab.omid.library.applovin.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.applovin.adsession.a aVar : cVarC.a()) {
                View viewE = aVar.e();
                if (aVar.h()) {
                    String strC = aVar.c();
                    if (viewE != null) {
                        boolean zE = h.e(viewE);
                        if (zE) {
                            this.f34331h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f34328e.add(strC);
                            this.f34324a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f34329f.add(strC);
                            this.f34326c.put(strC, viewE);
                            this.f34330g.put(strC, strA);
                        }
                    } else {
                        this.f34329f.add(strC);
                        this.f34330g.put(strC, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f34332i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f34332i.containsKey(view)) {
            return this.f34332i.get(view);
        }
        Map<View, Boolean> map = this.f34332i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.f34330g.get(str);
    }

    public HashSet<String> c() {
        return this.f34328e;
    }

    public void d() {
        this.f34333j = true;
    }

    public boolean e(View view) {
        if (!this.f34332i.containsKey(view)) {
            return true;
        }
        this.f34332i.put(view, Boolean.TRUE);
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
        this.f34327d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f34329f;
    }

    public boolean c(String str) {
        return this.f34331h.contains(str);
    }

    public void a() {
        this.f34324a.clear();
        this.f34325b.clear();
        this.f34326c.clear();
        this.f34327d.clear();
        this.f34328e.clear();
        this.f34329f.clear();
        this.f34330g.clear();
        this.f34333j = false;
        this.f34331h.clear();
    }

    private void a(com.iab.omid.library.applovin.adsession.a aVar) {
        Iterator<e> it = aVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.applovin.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0371a c0371a = this.f34325b.get(view);
        if (c0371a != null) {
            c0371a.a(aVar.c());
        } else {
            this.f34325b.put(view, new C0371a(eVar, aVar.c()));
        }
    }
}
