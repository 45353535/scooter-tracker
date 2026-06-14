package com.iab.omid.library.startio.walking;

import android.view.View;
import com.iab.omid.library.startio.internal.e;
import com.iab.omid.library.startio.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f36052a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0424a> f36053b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f36054c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f36055d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f36056e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f36057f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f36058g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<View, Boolean> f36059h = new WeakHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f36060i;

    /* JADX INFO: renamed from: com.iab.omid.library.startio.walking.a$a, reason: collision with other inner class name */
    public static class C0424a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f36061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f36062b = new ArrayList<>();

        public C0424a(e eVar, String str) {
            this.f36061a = eVar;
            a(str);
        }

        public e a() {
            return this.f36061a;
        }

        public ArrayList<String> b() {
            return this.f36062b;
        }

        public void a(String str) {
            this.f36062b.add(str);
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f36059h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f36059h.containsKey(view)) {
            return this.f36059h.get(view);
        }
        Map<View, Boolean> map = this.f36059h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public View a(String str) {
        return this.f36054c.get(str);
    }

    public C0424a c(View view) {
        C0424a c0424a = this.f36053b.get(view);
        if (c0424a != null) {
            this.f36053b.remove(view);
        }
        return c0424a;
    }

    public String d(View view) {
        if (this.f36052a.size() == 0) {
            return null;
        }
        String str = this.f36052a.get(view);
        if (str != null) {
            this.f36052a.remove(view);
        }
        return str;
    }

    public c e(View view) {
        return this.f36055d.contains(view) ? c.PARENT_VIEW : this.f36060i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public boolean f(View view) {
        if (!this.f36059h.containsKey(view)) {
            return true;
        }
        this.f36059h.put(view, Boolean.TRUE);
        return false;
    }

    private String a(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (b(view).booleanValue()) {
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
        this.f36055d.addAll(hashSet);
        return null;
    }

    public String b(String str) {
        return this.f36058g.get(str);
    }

    public HashSet<String> c() {
        return this.f36056e;
    }

    public void d() {
        this.f36060i = true;
    }

    public void e() {
        com.iab.omid.library.startio.internal.c cVarC = com.iab.omid.library.startio.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.startio.adsession.a aVar : cVarC.a()) {
                View viewC = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        String strA = a(viewC);
                        if (strA == null) {
                            this.f36056e.add(adSessionId);
                            this.f36052a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f36057f.add(adSessionId);
                            this.f36054c.put(adSessionId, viewC);
                            this.f36058g.put(adSessionId, strA);
                        }
                    } else {
                        this.f36057f.add(adSessionId);
                        this.f36058g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void a() {
        this.f36052a.clear();
        this.f36053b.clear();
        this.f36054c.clear();
        this.f36055d.clear();
        this.f36056e.clear();
        this.f36057f.clear();
        this.f36058g.clear();
        this.f36060i = false;
    }

    public HashSet<String> b() {
        return this.f36057f;
    }

    private void a(com.iab.omid.library.startio.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.startio.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0424a c0424a = this.f36053b.get(view);
        if (c0424a != null) {
            c0424a.a(aVar.getAdSessionId());
        } else {
            this.f36053b.put(view, new C0424a(eVar, aVar.getAdSessionId()));
        }
    }
}
