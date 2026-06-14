package com.iab.omid.library.appodeal.walking;

import android.view.View;
import com.iab.omid.library.appodeal.internal.e;
import com.iab.omid.library.appodeal.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f34460a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0375a> f34461b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f34462c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f34463d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f34464e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f34465f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f34466g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f34467h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f34468i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f34469j;

    /* JADX INFO: renamed from: com.iab.omid.library.appodeal.walking.a$a, reason: collision with other inner class name */
    public static class C0375a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f34470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f34471b = new ArrayList<>();

        public C0375a(e eVar, String str) {
            this.f34470a = eVar;
            a(str);
        }

        public e a() {
            return this.f34470a;
        }

        public ArrayList<String> b() {
            return this.f34471b;
        }

        public void a(String str) {
            this.f34471b.add(str);
        }
    }

    public View a(String str) {
        return this.f34462c.get(str);
    }

    public C0375a b(View view) {
        C0375a c0375a = this.f34461b.get(view);
        if (c0375a != null) {
            this.f34461b.remove(view);
        }
        return c0375a;
    }

    public String c(View view) {
        if (this.f34460a.size() == 0) {
            return null;
        }
        String str = this.f34460a.get(view);
        if (str != null) {
            this.f34460a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        return this.f34463d.contains(view) ? c.PARENT_VIEW : this.f34469j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.appodeal.internal.c cVarC = com.iab.omid.library.appodeal.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.appodeal.adsession.a aVar : cVarC.a()) {
                View viewE = aVar.e();
                if (aVar.h()) {
                    String strC = aVar.c();
                    if (viewE != null) {
                        boolean zE = h.e(viewE);
                        if (zE) {
                            this.f34467h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f34464e.add(strC);
                            this.f34460a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f34465f.add(strC);
                            this.f34462c.put(strC, viewE);
                            this.f34466g.put(strC, strA);
                        }
                    } else {
                        this.f34465f.add(strC);
                        this.f34466g.put(strC, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f34468i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f34468i.containsKey(view)) {
            return this.f34468i.get(view);
        }
        Map<View, Boolean> map = this.f34468i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.f34466g.get(str);
    }

    public HashSet<String> c() {
        return this.f34464e;
    }

    public void d() {
        this.f34469j = true;
    }

    public boolean e(View view) {
        if (!this.f34468i.containsKey(view)) {
            return true;
        }
        this.f34468i.put(view, Boolean.TRUE);
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
        this.f34463d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f34465f;
    }

    public boolean c(String str) {
        return this.f34467h.contains(str);
    }

    public void a() {
        this.f34460a.clear();
        this.f34461b.clear();
        this.f34462c.clear();
        this.f34463d.clear();
        this.f34464e.clear();
        this.f34465f.clear();
        this.f34466g.clear();
        this.f34469j = false;
        this.f34467h.clear();
    }

    private void a(com.iab.omid.library.appodeal.adsession.a aVar) {
        Iterator<e> it = aVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.appodeal.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0375a c0375a = this.f34461b.get(view);
        if (c0375a != null) {
            c0375a.a(aVar.c());
        } else {
            this.f34461b.put(view, new C0375a(eVar, aVar.c()));
        }
    }
}
