package com.iab.omid.library.bytedance2.walking;

import android.view.View;
import com.iab.omid.library.bytedance2.internal.e;
import com.iab.omid.library.bytedance2.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f34711a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0382a> f34712b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f34713c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f34714d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f34715e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f34716f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f34717g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<View, Boolean> f34718h = new WeakHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f34719i;

    /* JADX INFO: renamed from: com.iab.omid.library.bytedance2.walking.a$a, reason: collision with other inner class name */
    public static class C0382a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f34720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f34721b = new ArrayList<>();

        public C0382a(e eVar, String str) {
            this.f34720a = eVar;
            a(str);
        }

        public e a() {
            return this.f34720a;
        }

        public ArrayList<String> b() {
            return this.f34721b;
        }

        public void a(String str) {
            this.f34721b.add(str);
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f34718h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f34718h.containsKey(view)) {
            return this.f34718h.get(view);
        }
        Map<View, Boolean> map = this.f34718h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public View a(String str) {
        return this.f34713c.get(str);
    }

    public C0382a c(View view) {
        C0382a c0382a = this.f34712b.get(view);
        if (c0382a != null) {
            this.f34712b.remove(view);
        }
        return c0382a;
    }

    public String d(View view) {
        if (this.f34711a.size() == 0) {
            return null;
        }
        String str = this.f34711a.get(view);
        if (str != null) {
            this.f34711a.remove(view);
        }
        return str;
    }

    public c e(View view) {
        return this.f34714d.contains(view) ? c.PARENT_VIEW : this.f34719i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public boolean f(View view) {
        if (!this.f34718h.containsKey(view)) {
            return true;
        }
        this.f34718h.put(view, Boolean.TRUE);
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
        this.f34714d.addAll(hashSet);
        return null;
    }

    public String b(String str) {
        return this.f34717g.get(str);
    }

    public HashSet<String> c() {
        return this.f34715e;
    }

    public void d() {
        this.f34719i = true;
    }

    public void e() {
        com.iab.omid.library.bytedance2.internal.c cVarC = com.iab.omid.library.bytedance2.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.bytedance2.adsession.a aVar : cVarC.a()) {
                View viewC = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        String strA = a(viewC);
                        if (strA == null) {
                            this.f34715e.add(adSessionId);
                            this.f34711a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f34716f.add(adSessionId);
                            this.f34713c.put(adSessionId, viewC);
                            this.f34717g.put(adSessionId, strA);
                        }
                    } else {
                        this.f34716f.add(adSessionId);
                        this.f34717g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void a() {
        this.f34711a.clear();
        this.f34712b.clear();
        this.f34713c.clear();
        this.f34714d.clear();
        this.f34715e.clear();
        this.f34716f.clear();
        this.f34717g.clear();
        this.f34719i = false;
    }

    public HashSet<String> b() {
        return this.f34716f;
    }

    private void a(com.iab.omid.library.bytedance2.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.bytedance2.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0382a c0382a = this.f34712b.get(view);
        if (c0382a != null) {
            c0382a.a(aVar.getAdSessionId());
        } else {
            this.f34712b.put(view, new C0382a(eVar, aVar.getAdSessionId()));
        }
    }
}
