package com.iab.omid.library.unity3d.walking;

import android.view.View;
import com.iab.omid.library.unity3d.internal.e;
import com.iab.omid.library.unity3d.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f36308a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0432a> f36309b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f36310c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f36311d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f36312e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f36313f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f36314g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<View, Boolean> f36315h = new WeakHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f36316i;

    /* JADX INFO: renamed from: com.iab.omid.library.unity3d.walking.a$a, reason: collision with other inner class name */
    public static class C0432a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f36317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f36318b = new ArrayList<>();

        public C0432a(e eVar, String str) {
            this.f36317a = eVar;
            a(str);
        }

        public e a() {
            return this.f36317a;
        }

        public ArrayList<String> b() {
            return this.f36318b;
        }

        public void a(String str) {
            this.f36318b.add(str);
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f36315h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f36315h.containsKey(view)) {
            return this.f36315h.get(view);
        }
        Map<View, Boolean> map = this.f36315h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public View a(String str) {
        return this.f36310c.get(str);
    }

    public C0432a c(View view) {
        C0432a c0432a = this.f36309b.get(view);
        if (c0432a != null) {
            this.f36309b.remove(view);
        }
        return c0432a;
    }

    public String d(View view) {
        if (this.f36308a.size() == 0) {
            return null;
        }
        String str = this.f36308a.get(view);
        if (str != null) {
            this.f36308a.remove(view);
        }
        return str;
    }

    public c e(View view) {
        return this.f36311d.contains(view) ? c.PARENT_VIEW : this.f36316i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public boolean f(View view) {
        if (!this.f36315h.containsKey(view)) {
            return true;
        }
        this.f36315h.put(view, Boolean.TRUE);
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
        this.f36311d.addAll(hashSet);
        return null;
    }

    public String b(String str) {
        return this.f36314g.get(str);
    }

    public HashSet<String> c() {
        return this.f36312e;
    }

    public void d() {
        this.f36316i = true;
    }

    public void e() {
        com.iab.omid.library.unity3d.internal.c cVarC = com.iab.omid.library.unity3d.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.unity3d.adsession.a aVar : cVarC.a()) {
                View viewC = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        String strA = a(viewC);
                        if (strA == null) {
                            this.f36312e.add(adSessionId);
                            this.f36308a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f36313f.add(adSessionId);
                            this.f36310c.put(adSessionId, viewC);
                            this.f36314g.put(adSessionId, strA);
                        }
                    } else {
                        this.f36313f.add(adSessionId);
                        this.f36314g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void a() {
        this.f36308a.clear();
        this.f36309b.clear();
        this.f36310c.clear();
        this.f36311d.clear();
        this.f36312e.clear();
        this.f36313f.clear();
        this.f36314g.clear();
        this.f36316i = false;
    }

    public HashSet<String> b() {
        return this.f36313f;
    }

    private void a(com.iab.omid.library.unity3d.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.unity3d.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0432a c0432a = this.f36309b.get(view);
        if (c0432a != null) {
            c0432a.a(aVar.getAdSessionId());
        } else {
            this.f36309b.put(view, new C0432a(eVar, aVar.getAdSessionId()));
        }
    }
}
