package com.iab.omid.library.mobilefuse.walking;

import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.mobilefuse.internal.e;
import com.iab.omid.library.mobilefuse.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f35646a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0411a> f35647b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f35648c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f35649d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f35650e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f35651f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f35652g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f35653h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f35654i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f35655j;

    /* JADX INFO: renamed from: com.iab.omid.library.mobilefuse.walking.a$a, reason: collision with other inner class name */
    public static class C0411a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f35656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f35657b = new ArrayList<>();

        public C0411a(e eVar, String str) {
            this.f35656a = eVar;
            a(str);
        }

        public e a() {
            return this.f35656a;
        }

        public ArrayList<String> b() {
            return this.f35657b;
        }

        public void a(String str) {
            this.f35657b.add(str);
        }
    }

    public View a(String str) {
        return this.f35648c.get(str);
    }

    public C0411a b(View view) {
        C0411a c0411a = this.f35647b.get(view);
        if (c0411a != null) {
            this.f35647b.remove(view);
        }
        return c0411a;
    }

    public String c(View view) {
        if (this.f35646a.size() == 0) {
            return null;
        }
        String str = this.f35646a.get(view);
        if (str != null) {
            this.f35646a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        return this.f35649d.contains(view) ? c.PARENT_VIEW : this.f35655j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.mobilefuse.internal.c cVarC = com.iab.omid.library.mobilefuse.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.mobilefuse.adsession.a aVar : cVarC.a()) {
                View viewC = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        boolean zE = h.e(viewC);
                        if (zE) {
                            this.f35653h.add(adSessionId);
                        }
                        String strA = a(viewC, zE);
                        if (strA == null) {
                            this.f35650e.add(adSessionId);
                            this.f35646a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f35651f.add(adSessionId);
                            this.f35648c.put(adSessionId, viewC);
                            this.f35652g.put(adSessionId, strA);
                        }
                    } else {
                        this.f35651f.add(adSessionId);
                        this.f35652g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f35654i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f35654i.containsKey(view)) {
            return this.f35654i.get(view);
        }
        Map<View, Boolean> map = this.f35654i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.f35652g.get(str);
    }

    public HashSet<String> c() {
        return this.f35650e;
    }

    public void d() {
        this.f35655j = true;
    }

    public boolean e(View view) {
        if (!this.f35654i.containsKey(view)) {
            return true;
        }
        this.f35654i.put(view, Boolean.TRUE);
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
        this.f35649d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f35651f;
    }

    @VisibleForTesting
    public boolean c(String str) {
        return this.f35653h.contains(str);
    }

    public void a() {
        this.f35646a.clear();
        this.f35647b.clear();
        this.f35648c.clear();
        this.f35649d.clear();
        this.f35650e.clear();
        this.f35651f.clear();
        this.f35652g.clear();
        this.f35655j = false;
        this.f35653h.clear();
    }

    private void a(com.iab.omid.library.mobilefuse.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.mobilefuse.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0411a c0411a = this.f35647b.get(view);
        if (c0411a != null) {
            c0411a.a(aVar.getAdSessionId());
        } else {
            this.f35647b.put(view, new C0411a(eVar, aVar.getAdSessionId()));
        }
    }
}
