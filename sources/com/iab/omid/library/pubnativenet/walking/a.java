package com.iab.omid.library.pubnativenet.walking;

import android.view.View;
import com.iab.omid.library.pubnativenet.internal.e;
import com.iab.omid.library.pubnativenet.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f35922a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0420a> f35923b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f35924c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f35925d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f35926e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f35927f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f35928g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f35929h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f35930i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f35931j;

    /* JADX INFO: renamed from: com.iab.omid.library.pubnativenet.walking.a$a, reason: collision with other inner class name */
    public static class C0420a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f35932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f35933b = new ArrayList<>();

        public C0420a(e eVar, String str) {
            this.f35932a = eVar;
            a(str);
        }

        public e a() {
            return this.f35932a;
        }

        public ArrayList<String> b() {
            return this.f35933b;
        }

        public void a(String str) {
            this.f35933b.add(str);
        }
    }

    public View a(String str) {
        return this.f35924c.get(str);
    }

    public C0420a b(View view) {
        C0420a c0420a = this.f35923b.get(view);
        if (c0420a != null) {
            this.f35923b.remove(view);
        }
        return c0420a;
    }

    public String c(View view) {
        if (this.f35922a.size() == 0) {
            return null;
        }
        String str = this.f35922a.get(view);
        if (str != null) {
            this.f35922a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        return this.f35925d.contains(view) ? c.PARENT_VIEW : this.f35931j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.pubnativenet.internal.c cVarC = com.iab.omid.library.pubnativenet.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.pubnativenet.adsession.a aVar : cVarC.a()) {
                View viewC = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        boolean zE = h.e(viewC);
                        if (zE) {
                            this.f35929h.add(adSessionId);
                        }
                        String strA = a(viewC, zE);
                        if (strA == null) {
                            this.f35926e.add(adSessionId);
                            this.f35922a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f35927f.add(adSessionId);
                            this.f35924c.put(adSessionId, viewC);
                            this.f35928g.put(adSessionId, strA);
                        }
                    } else {
                        this.f35927f.add(adSessionId);
                        this.f35928g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f35930i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f35930i.containsKey(view)) {
            return this.f35930i.get(view);
        }
        Map<View, Boolean> map = this.f35930i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.f35928g.get(str);
    }

    public HashSet<String> c() {
        return this.f35926e;
    }

    public void d() {
        this.f35931j = true;
    }

    public boolean e(View view) {
        if (!this.f35930i.containsKey(view)) {
            return true;
        }
        this.f35930i.put(view, Boolean.TRUE);
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
        this.f35925d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f35927f;
    }

    public boolean c(String str) {
        return this.f35929h.contains(str);
    }

    public void a() {
        this.f35922a.clear();
        this.f35923b.clear();
        this.f35924c.clear();
        this.f35925d.clear();
        this.f35926e.clear();
        this.f35927f.clear();
        this.f35928g.clear();
        this.f35931j = false;
        this.f35929h.clear();
    }

    private void a(com.iab.omid.library.pubnativenet.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.pubnativenet.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0420a c0420a = this.f35923b.get(view);
        if (c0420a != null) {
            c0420a.a(aVar.getAdSessionId());
        } else {
            this.f35923b.put(view, new C0420a(eVar, aVar.getAdSessionId()));
        }
    }
}
