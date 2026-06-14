package com.iab.omid.library.fyber.walking;

import android.view.View;
import com.iab.omid.library.fyber.internal.e;
import com.iab.omid.library.fyber.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f35100a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0394a> f35101b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f35102c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f35103d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f35104e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f35105f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f35106g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f35107h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f35108i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f35109j;

    /* JADX INFO: renamed from: com.iab.omid.library.fyber.walking.a$a, reason: collision with other inner class name */
    public static class C0394a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f35110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f35111b = new ArrayList<>();

        public C0394a(e eVar, String str) {
            this.f35110a = eVar;
            a(str);
        }

        public e a() {
            return this.f35110a;
        }

        public ArrayList<String> b() {
            return this.f35111b;
        }

        public void a(String str) {
            this.f35111b.add(str);
        }
    }

    public View a(String str) {
        return this.f35102c.get(str);
    }

    public C0394a b(View view) {
        C0394a c0394a = this.f35101b.get(view);
        if (c0394a != null) {
            this.f35101b.remove(view);
        }
        return c0394a;
    }

    public String c(View view) {
        if (this.f35100a.size() == 0) {
            return null;
        }
        String str = this.f35100a.get(view);
        if (str != null) {
            this.f35100a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        return this.f35103d.contains(view) ? c.PARENT_VIEW : this.f35109j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.fyber.internal.c cVarC = com.iab.omid.library.fyber.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.fyber.adsession.a aVar : cVarC.a()) {
                View viewE = aVar.e();
                if (aVar.h()) {
                    String strC = aVar.c();
                    if (viewE != null) {
                        boolean zE = h.e(viewE);
                        if (zE) {
                            this.f35107h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f35104e.add(strC);
                            this.f35100a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f35105f.add(strC);
                            this.f35102c.put(strC, viewE);
                            this.f35106g.put(strC, strA);
                        }
                    } else {
                        this.f35105f.add(strC);
                        this.f35106g.put(strC, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f35108i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f35108i.containsKey(view)) {
            return this.f35108i.get(view);
        }
        Map<View, Boolean> map = this.f35108i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.f35106g.get(str);
    }

    public HashSet<String> c() {
        return this.f35104e;
    }

    public void d() {
        this.f35109j = true;
    }

    public boolean e(View view) {
        if (!this.f35108i.containsKey(view)) {
            return true;
        }
        this.f35108i.put(view, Boolean.TRUE);
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
        this.f35103d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f35105f;
    }

    public boolean c(String str) {
        return this.f35107h.contains(str);
    }

    public void a() {
        this.f35100a.clear();
        this.f35101b.clear();
        this.f35102c.clear();
        this.f35103d.clear();
        this.f35104e.clear();
        this.f35105f.clear();
        this.f35106g.clear();
        this.f35109j = false;
        this.f35107h.clear();
    }

    private void a(com.iab.omid.library.fyber.adsession.a aVar) {
        Iterator<e> it = aVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.fyber.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0394a c0394a = this.f35101b.get(view);
        if (c0394a != null) {
            c0394a.a(aVar.c());
        } else {
            this.f35101b.put(view, new C0394a(eVar, aVar.c()));
        }
    }
}
