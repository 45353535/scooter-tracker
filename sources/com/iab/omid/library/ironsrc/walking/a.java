package com.iab.omid.library.ironsrc.walking;

import android.view.View;
import com.iab.omid.library.ironsrc.internal.e;
import com.iab.omid.library.ironsrc.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f35376a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0403a> f35377b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f35378c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f35379d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f35380e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f35381f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f35382g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f35383h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f35384i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f35385j;

    /* JADX INFO: renamed from: com.iab.omid.library.ironsrc.walking.a$a, reason: collision with other inner class name */
    public static class C0403a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f35386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f35387b = new ArrayList<>();

        public C0403a(e eVar, String str) {
            this.f35386a = eVar;
            a(str);
        }

        public e a() {
            return this.f35386a;
        }

        public ArrayList<String> b() {
            return this.f35387b;
        }

        public void a(String str) {
            this.f35387b.add(str);
        }
    }

    public View a(String str) {
        return this.f35378c.get(str);
    }

    public C0403a b(View view) {
        C0403a c0403a = this.f35377b.get(view);
        if (c0403a != null) {
            this.f35377b.remove(view);
        }
        return c0403a;
    }

    public String c(View view) {
        if (this.f35376a.size() == 0) {
            return null;
        }
        String str = this.f35376a.get(view);
        if (str != null) {
            this.f35376a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        return this.f35379d.contains(view) ? c.PARENT_VIEW : this.f35385j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.ironsrc.internal.c cVarC = com.iab.omid.library.ironsrc.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.ironsrc.adsession.a aVar : cVarC.a()) {
                View viewC = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        boolean zE = h.e(viewC);
                        if (zE) {
                            this.f35383h.add(adSessionId);
                        }
                        String strA = a(viewC, zE);
                        if (strA == null) {
                            this.f35380e.add(adSessionId);
                            this.f35376a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f35381f.add(adSessionId);
                            this.f35378c.put(adSessionId, viewC);
                            this.f35382g.put(adSessionId, strA);
                        }
                    } else {
                        this.f35381f.add(adSessionId);
                        this.f35382g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f35384i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f35384i.containsKey(view)) {
            return this.f35384i.get(view);
        }
        Map<View, Boolean> map = this.f35384i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.f35382g.get(str);
    }

    public HashSet<String> c() {
        return this.f35380e;
    }

    public void d() {
        this.f35385j = true;
    }

    public boolean e(View view) {
        if (!this.f35384i.containsKey(view)) {
            return true;
        }
        this.f35384i.put(view, Boolean.TRUE);
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
        this.f35379d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f35381f;
    }

    public boolean c(String str) {
        return this.f35383h.contains(str);
    }

    public void a() {
        this.f35376a.clear();
        this.f35377b.clear();
        this.f35378c.clear();
        this.f35379d.clear();
        this.f35380e.clear();
        this.f35381f.clear();
        this.f35382g.clear();
        this.f35385j = false;
        this.f35383h.clear();
    }

    private void a(com.iab.omid.library.ironsrc.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.ironsrc.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0403a c0403a = this.f35377b.get(view);
        if (c0403a != null) {
            c0403a.a(aVar.getAdSessionId());
        } else {
            this.f35377b.put(view, new C0403a(eVar, aVar.getAdSessionId()));
        }
    }
}
