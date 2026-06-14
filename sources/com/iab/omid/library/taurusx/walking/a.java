package com.iab.omid.library.taurusx.walking;

import android.view.View;
import com.iab.omid.library.taurusx.internal.e;
import com.iab.omid.library.taurusx.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f36180a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0428a> f36181b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f36182c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f36183d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f36184e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f36185f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f36186g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<View, Boolean> f36187h = new WeakHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f36188i;

    /* JADX INFO: renamed from: com.iab.omid.library.taurusx.walking.a$a, reason: collision with other inner class name */
    public static class C0428a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f36189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f36190b = new ArrayList<>();

        public C0428a(e eVar, String str) {
            this.f36189a = eVar;
            a(str);
        }

        public e a() {
            return this.f36189a;
        }

        public ArrayList<String> b() {
            return this.f36190b;
        }

        public void a(String str) {
            this.f36190b.add(str);
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f36187h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f36187h.containsKey(view)) {
            return this.f36187h.get(view);
        }
        Map<View, Boolean> map = this.f36187h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public View a(String str) {
        return this.f36182c.get(str);
    }

    public C0428a c(View view) {
        C0428a c0428a = this.f36181b.get(view);
        if (c0428a != null) {
            this.f36181b.remove(view);
        }
        return c0428a;
    }

    public String d(View view) {
        if (this.f36180a.size() == 0) {
            return null;
        }
        String str = this.f36180a.get(view);
        if (str != null) {
            this.f36180a.remove(view);
        }
        return str;
    }

    public c e(View view) {
        return this.f36183d.contains(view) ? c.PARENT_VIEW : this.f36188i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public boolean f(View view) {
        if (!this.f36187h.containsKey(view)) {
            return true;
        }
        this.f36187h.put(view, Boolean.TRUE);
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
        this.f36183d.addAll(hashSet);
        return null;
    }

    public String b(String str) {
        return this.f36186g.get(str);
    }

    public HashSet<String> c() {
        return this.f36184e;
    }

    public void d() {
        this.f36188i = true;
    }

    public void e() {
        com.iab.omid.library.taurusx.internal.c cVarC = com.iab.omid.library.taurusx.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.taurusx.adsession.a aVar : cVarC.a()) {
                View viewC = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        String strA = a(viewC);
                        if (strA == null) {
                            this.f36184e.add(adSessionId);
                            this.f36180a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f36185f.add(adSessionId);
                            this.f36182c.put(adSessionId, viewC);
                            this.f36186g.put(adSessionId, strA);
                        }
                    } else {
                        this.f36185f.add(adSessionId);
                        this.f36186g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void a() {
        this.f36180a.clear();
        this.f36181b.clear();
        this.f36182c.clear();
        this.f36183d.clear();
        this.f36184e.clear();
        this.f36185f.clear();
        this.f36186g.clear();
        this.f36188i = false;
    }

    public HashSet<String> b() {
        return this.f36185f;
    }

    private void a(com.iab.omid.library.taurusx.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.taurusx.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0428a c0428a = this.f36181b.get(view);
        if (c0428a != null) {
            c0428a.a(aVar.getAdSessionId());
        } else {
            this.f36181b.put(view, new C0428a(eVar, aVar.getAdSessionId()));
        }
    }
}
