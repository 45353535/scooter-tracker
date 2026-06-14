package com.iab.omid.library.inmobi.walking;

import android.view.View;
import com.iab.omid.library.inmobi.internal.e;
import com.iab.omid.library.inmobi.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f35241a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0399a> f35242b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f35243c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f35244d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f35245e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f35246f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f35247g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f35248h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f35249i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f35250j;

    /* JADX INFO: renamed from: com.iab.omid.library.inmobi.walking.a$a, reason: collision with other inner class name */
    public static class C0399a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f35251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f35252b = new ArrayList<>();

        public C0399a(e eVar, String str) {
            this.f35251a = eVar;
            a(str);
        }

        public e a() {
            return this.f35251a;
        }

        public ArrayList<String> b() {
            return this.f35252b;
        }

        public void a(String str) {
            this.f35252b.add(str);
        }
    }

    public View a(String str) {
        return this.f35243c.get(str);
    }

    public C0399a b(View view) {
        C0399a c0399a = this.f35242b.get(view);
        if (c0399a != null) {
            this.f35242b.remove(view);
        }
        return c0399a;
    }

    public String c(View view) {
        if (this.f35241a.size() == 0) {
            return null;
        }
        String str = this.f35241a.get(view);
        if (str != null) {
            this.f35241a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        return this.f35244d.contains(view) ? c.PARENT_VIEW : this.f35250j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.inmobi.internal.c cVarC = com.iab.omid.library.inmobi.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.inmobi.adsession.a aVar : cVarC.a()) {
                View viewE = aVar.e();
                if (aVar.h()) {
                    String strC = aVar.c();
                    if (viewE != null) {
                        boolean zE = h.e(viewE);
                        if (zE) {
                            this.f35248h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f35245e.add(strC);
                            this.f35241a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f35246f.add(strC);
                            this.f35243c.put(strC, viewE);
                            this.f35247g.put(strC, strA);
                        }
                    } else {
                        this.f35246f.add(strC);
                        this.f35247g.put(strC, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f35249i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f35249i.containsKey(view)) {
            return this.f35249i.get(view);
        }
        Map<View, Boolean> map = this.f35249i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.f35247g.get(str);
    }

    public HashSet<String> c() {
        return this.f35245e;
    }

    public void d() {
        this.f35250j = true;
    }

    public boolean e(View view) {
        if (!this.f35249i.containsKey(view)) {
            return true;
        }
        this.f35249i.put(view, Boolean.TRUE);
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
        this.f35244d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f35246f;
    }

    public boolean c(String str) {
        return this.f35248h.contains(str);
    }

    public void a() {
        this.f35241a.clear();
        this.f35242b.clear();
        this.f35243c.clear();
        this.f35244d.clear();
        this.f35245e.clear();
        this.f35246f.clear();
        this.f35247g.clear();
        this.f35250j = false;
        this.f35248h.clear();
    }

    private void a(com.iab.omid.library.inmobi.adsession.a aVar) {
        Iterator<e> it = aVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.inmobi.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0399a c0399a = this.f35242b.get(view);
        if (c0399a != null) {
            c0399a.a(aVar.c());
        } else {
            this.f35242b.put(view, new C0399a(eVar, aVar.c()));
        }
    }
}
