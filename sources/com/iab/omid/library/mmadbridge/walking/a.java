package com.iab.omid.library.mmadbridge.walking;

import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.mmadbridge.internal.e;
import com.iab.omid.library.mmadbridge.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f35511a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0407a> f35512b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f35513c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f35514d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f35515e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f35516f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f35517g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f35518h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f35519i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f35520j;

    /* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.walking.a$a, reason: collision with other inner class name */
    public static class C0407a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f35521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f35522b = new ArrayList<>();

        public C0407a(e eVar, String str) {
            this.f35521a = eVar;
            a(str);
        }

        public e a() {
            return this.f35521a;
        }

        public ArrayList<String> b() {
            return this.f35522b;
        }

        public void a(String str) {
            this.f35522b.add(str);
        }
    }

    public View a(String str) {
        return this.f35513c.get(str);
    }

    public C0407a b(View view) {
        C0407a c0407a = this.f35512b.get(view);
        if (c0407a != null) {
            this.f35512b.remove(view);
        }
        return c0407a;
    }

    public String c(View view) {
        if (this.f35511a.size() == 0) {
            return null;
        }
        String str = this.f35511a.get(view);
        if (str != null) {
            this.f35511a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        return this.f35514d.contains(view) ? c.PARENT_VIEW : this.f35520j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.mmadbridge.internal.c cVarC = com.iab.omid.library.mmadbridge.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.mmadbridge.adsession.a aVar : cVarC.a()) {
                View viewC = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        boolean zE = h.e(viewC);
                        if (zE) {
                            this.f35518h.add(adSessionId);
                        }
                        String strA = a(viewC, zE);
                        if (strA == null) {
                            this.f35515e.add(adSessionId);
                            this.f35511a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f35516f.add(adSessionId);
                            this.f35513c.put(adSessionId, viewC);
                            this.f35517g.put(adSessionId, strA);
                        }
                    } else {
                        this.f35516f.add(adSessionId);
                        this.f35517g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f35519i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f35519i.containsKey(view)) {
            return this.f35519i.get(view);
        }
        Map<View, Boolean> map = this.f35519i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.f35517g.get(str);
    }

    public HashSet<String> c() {
        return this.f35515e;
    }

    public void d() {
        this.f35520j = true;
    }

    public boolean e(View view) {
        if (!this.f35519i.containsKey(view)) {
            return true;
        }
        this.f35519i.put(view, Boolean.TRUE);
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
        this.f35514d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f35516f;
    }

    @VisibleForTesting
    public boolean c(String str) {
        return this.f35518h.contains(str);
    }

    public void a() {
        this.f35511a.clear();
        this.f35512b.clear();
        this.f35513c.clear();
        this.f35514d.clear();
        this.f35515e.clear();
        this.f35516f.clear();
        this.f35517g.clear();
        this.f35520j = false;
        this.f35518h.clear();
    }

    private void a(com.iab.omid.library.mmadbridge.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.mmadbridge.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0407a c0407a = this.f35512b.get(view);
        if (c0407a != null) {
            c0407a.a(aVar.getAdSessionId());
        } else {
            this.f35512b.put(view, new C0407a(eVar, aVar.getAdSessionId()));
        }
    }
}
