package com.iab.omid.library.amazon.walking;

import android.view.View;
import com.iab.omid.library.amazon.internal.e;
import com.iab.omid.library.amazon.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f34190a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0367a> f34191b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f34192c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f34193d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f34194e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f34195f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f34196g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<View, Boolean> f34197h = new WeakHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f34198i;

    /* JADX INFO: renamed from: com.iab.omid.library.amazon.walking.a$a, reason: collision with other inner class name */
    public static class C0367a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f34199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f34200b = new ArrayList<>();

        public C0367a(e eVar, String str) {
            this.f34199a = eVar;
            a(str);
        }

        public e a() {
            return this.f34199a;
        }

        public ArrayList<String> b() {
            return this.f34200b;
        }

        public void a(String str) {
            this.f34200b.add(str);
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f34197h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f34197h.containsKey(view)) {
            return this.f34197h.get(view);
        }
        Map<View, Boolean> map = this.f34197h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public View a(String str) {
        return this.f34192c.get(str);
    }

    public C0367a c(View view) {
        C0367a c0367a = this.f34191b.get(view);
        if (c0367a != null) {
            this.f34191b.remove(view);
        }
        return c0367a;
    }

    public String d(View view) {
        if (this.f34190a.size() == 0) {
            return null;
        }
        String str = this.f34190a.get(view);
        if (str != null) {
            this.f34190a.remove(view);
        }
        return str;
    }

    public c e(View view) {
        return this.f34193d.contains(view) ? c.PARENT_VIEW : this.f34198i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public boolean f(View view) {
        if (!this.f34197h.containsKey(view)) {
            return true;
        }
        this.f34197h.put(view, Boolean.TRUE);
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
        this.f34193d.addAll(hashSet);
        return null;
    }

    public String b(String str) {
        return this.f34196g.get(str);
    }

    public HashSet<String> c() {
        return this.f34194e;
    }

    public void d() {
        this.f34198i = true;
    }

    public void e() {
        com.iab.omid.library.amazon.internal.c cVarC = com.iab.omid.library.amazon.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.amazon.adsession.a aVar : cVarC.a()) {
                View viewC = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        String strA = a(viewC);
                        if (strA == null) {
                            this.f34194e.add(adSessionId);
                            this.f34190a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f34195f.add(adSessionId);
                            this.f34192c.put(adSessionId, viewC);
                            this.f34196g.put(adSessionId, strA);
                        }
                    } else {
                        this.f34195f.add(adSessionId);
                        this.f34196g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void a() {
        this.f34190a.clear();
        this.f34191b.clear();
        this.f34192c.clear();
        this.f34193d.clear();
        this.f34194e.clear();
        this.f34195f.clear();
        this.f34196g.clear();
        this.f34198i = false;
    }

    public HashSet<String> b() {
        return this.f34195f;
    }

    private void a(com.iab.omid.library.amazon.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.amazon.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0367a c0367a = this.f34191b.get(view);
        if (c0367a != null) {
            c0367a.a(aVar.getAdSessionId());
        } else {
            this.f34191b.put(view, new C0367a(eVar, aVar.getAdSessionId()));
        }
    }
}
