package com.iab.omid.library.vungle.walking;

import android.view.View;
import com.iab.omid.library.vungle.internal.e;
import com.iab.omid.library.vungle.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f36448a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0437a> f36449b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f36450c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f36451d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f36452e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f36453f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f36454g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f36455h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f36456i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f36457j;

    /* JADX INFO: renamed from: com.iab.omid.library.vungle.walking.a$a, reason: collision with other inner class name */
    public static class C0437a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f36458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f36459b = new ArrayList<>();

        public C0437a(e eVar, String str) {
            this.f36458a = eVar;
            a(str);
        }

        public e a() {
            return this.f36458a;
        }

        public ArrayList<String> b() {
            return this.f36459b;
        }

        public void a(String str) {
            this.f36459b.add(str);
        }
    }

    public View a(String str) {
        return this.f36450c.get(str);
    }

    public C0437a b(View view) {
        C0437a c0437a = this.f36449b.get(view);
        if (c0437a != null) {
            this.f36449b.remove(view);
        }
        return c0437a;
    }

    public String c(View view) {
        if (this.f36448a.size() == 0) {
            return null;
        }
        String str = this.f36448a.get(view);
        if (str != null) {
            this.f36448a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        return this.f36451d.contains(view) ? c.PARENT_VIEW : this.f36457j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.vungle.internal.c cVarC = com.iab.omid.library.vungle.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.vungle.adsession.a aVar : cVarC.a()) {
                View viewE = aVar.e();
                if (aVar.h()) {
                    String strC = aVar.c();
                    if (viewE != null) {
                        boolean zE = h.e(viewE);
                        if (zE) {
                            this.f36455h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f36452e.add(strC);
                            this.f36448a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f36453f.add(strC);
                            this.f36450c.put(strC, viewE);
                            this.f36454g.put(strC, strA);
                        }
                    } else {
                        this.f36453f.add(strC);
                        this.f36454g.put(strC, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f36456i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f36456i.containsKey(view)) {
            return this.f36456i.get(view);
        }
        Map<View, Boolean> map = this.f36456i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.f36454g.get(str);
    }

    public HashSet<String> c() {
        return this.f36452e;
    }

    public void d() {
        this.f36457j = true;
    }

    public boolean e(View view) {
        if (!this.f36456i.containsKey(view)) {
            return true;
        }
        this.f36456i.put(view, Boolean.TRUE);
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
        this.f36451d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f36453f;
    }

    public boolean c(String str) {
        return this.f36455h.contains(str);
    }

    public void a() {
        this.f36448a.clear();
        this.f36449b.clear();
        this.f36450c.clear();
        this.f36451d.clear();
        this.f36452e.clear();
        this.f36453f.clear();
        this.f36454g.clear();
        this.f36457j = false;
        this.f36455h.clear();
    }

    private void a(com.iab.omid.library.vungle.adsession.a aVar) {
        Iterator<e> it = aVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.vungle.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0437a c0437a = this.f36449b.get(view);
        if (c0437a != null) {
            c0437a.a(aVar.c());
        } else {
            this.f36449b.put(view, new C0437a(eVar, aVar.c()));
        }
    }
}
