package com.iab.omid.library.pubmatic.walking;

import android.view.View;
import com.iab.omid.library.pubmatic.internal.e;
import com.iab.omid.library.pubmatic.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f35787a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0416a> f35788b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f35789c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f35790d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f35791e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f35792f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f35793g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f35794h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f35795i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f35796j;

    /* JADX INFO: renamed from: com.iab.omid.library.pubmatic.walking.a$a, reason: collision with other inner class name */
    public static class C0416a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f35797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f35798b = new ArrayList<>();

        public C0416a(e eVar, String str) {
            this.f35797a = eVar;
            a(str);
        }

        public e a() {
            return this.f35797a;
        }

        public ArrayList<String> b() {
            return this.f35798b;
        }

        public void a(String str) {
            this.f35798b.add(str);
        }
    }

    public View a(String str) {
        return this.f35789c.get(str);
    }

    public C0416a b(View view) {
        C0416a c0416a = this.f35788b.get(view);
        if (c0416a != null) {
            this.f35788b.remove(view);
        }
        return c0416a;
    }

    public String c(View view) {
        if (this.f35787a.size() == 0) {
            return null;
        }
        String str = this.f35787a.get(view);
        if (str != null) {
            this.f35787a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        return this.f35790d.contains(view) ? c.PARENT_VIEW : this.f35796j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.pubmatic.internal.c cVarC = com.iab.omid.library.pubmatic.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.pubmatic.adsession.a aVar : cVarC.a()) {
                View viewE = aVar.e();
                if (aVar.h()) {
                    String strC = aVar.c();
                    if (viewE != null) {
                        boolean zE = h.e(viewE);
                        if (zE) {
                            this.f35794h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f35791e.add(strC);
                            this.f35787a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f35792f.add(strC);
                            this.f35789c.put(strC, viewE);
                            this.f35793g.put(strC, strA);
                        }
                    } else {
                        this.f35792f.add(strC);
                        this.f35793g.put(strC, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f35795i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f35795i.containsKey(view)) {
            return this.f35795i.get(view);
        }
        Map<View, Boolean> map = this.f35795i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.f35793g.get(str);
    }

    public HashSet<String> c() {
        return this.f35791e;
    }

    public void d() {
        this.f35796j = true;
    }

    public boolean e(View view) {
        if (!this.f35795i.containsKey(view)) {
            return true;
        }
        this.f35795i.put(view, Boolean.TRUE);
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
        this.f35790d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f35792f;
    }

    public boolean c(String str) {
        return this.f35794h.contains(str);
    }

    public void a() {
        this.f35787a.clear();
        this.f35788b.clear();
        this.f35789c.clear();
        this.f35790d.clear();
        this.f35791e.clear();
        this.f35792f.clear();
        this.f35793g.clear();
        this.f35796j = false;
        this.f35794h.clear();
    }

    private void a(com.iab.omid.library.pubmatic.adsession.a aVar) {
        Iterator<e> it = aVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.pubmatic.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0416a c0416a = this.f35788b.get(view);
        if (c0416a != null) {
            c0416a.a(aVar.c());
        } else {
            this.f35788b.put(view, new C0416a(eVar, aVar.c()));
        }
    }
}
