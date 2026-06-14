package com.iab.omid.library.bigosg.walking;

import android.view.View;
import com.iab.omid.library.bigosg.d.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f34583a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0378a> f34584b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f34585c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f34586d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f34587e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f34588f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f34589g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f34590h;

    /* JADX INFO: renamed from: com.iab.omid.library.bigosg.walking.a$a, reason: collision with other inner class name */
    public static class C0378a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.iab.omid.library.bigosg.b.c f34591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f34592b = new ArrayList<>();

        public C0378a(com.iab.omid.library.bigosg.b.c cVar, String str) {
            this.f34591a = cVar;
            a(str);
        }

        public com.iab.omid.library.bigosg.b.c a() {
            return this.f34591a;
        }

        public ArrayList<String> b() {
            return this.f34592b;
        }

        public void a(String str) {
            this.f34592b.add(str);
        }
    }

    private String d(View view) {
        if (!view.hasWindowFocus()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String strE = f.e(view);
            if (strE != null) {
                return strE;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f34586d.addAll(hashSet);
        return null;
    }

    public String a(View view) {
        if (this.f34583a.size() == 0) {
            return null;
        }
        String str = this.f34583a.get(view);
        if (str != null) {
            this.f34583a.remove(view);
        }
        return str;
    }

    public View b(String str) {
        return this.f34585c.get(str);
    }

    public c c(View view) {
        return this.f34586d.contains(view) ? c.PARENT_VIEW : this.f34590h ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        this.f34590h = true;
    }

    public String a(String str) {
        return this.f34589g.get(str);
    }

    public C0378a b(View view) {
        C0378a c0378a = this.f34584b.get(view);
        if (c0378a != null) {
            this.f34584b.remove(view);
        }
        return c0378a;
    }

    public void c() {
        com.iab.omid.library.bigosg.b.a aVarA = com.iab.omid.library.bigosg.b.a.a();
        if (aVarA != null) {
            for (com.iab.omid.library.bigosg.adsession.a aVar : aVarA.c()) {
                View viewD = aVar.d();
                if (aVar.e()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewD != null) {
                        String strD = d(viewD);
                        if (strD == null) {
                            this.f34587e.add(adSessionId);
                            this.f34583a.put(viewD, adSessionId);
                            a(aVar);
                        } else {
                            this.f34588f.add(adSessionId);
                            this.f34585c.put(adSessionId, viewD);
                            this.f34589g.put(adSessionId, strD);
                        }
                    } else {
                        this.f34588f.add(adSessionId);
                        this.f34589g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void d() {
        this.f34583a.clear();
        this.f34584b.clear();
        this.f34585c.clear();
        this.f34586d.clear();
        this.f34587e.clear();
        this.f34588f.clear();
        this.f34589g.clear();
        this.f34590h = false;
    }

    public HashSet<String> a() {
        return this.f34587e;
    }

    public HashSet<String> b() {
        return this.f34588f;
    }

    private void a(com.iab.omid.library.bigosg.adsession.a aVar) {
        Iterator<com.iab.omid.library.bigosg.b.c> it = aVar.a().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(com.iab.omid.library.bigosg.b.c cVar, com.iab.omid.library.bigosg.adsession.a aVar) {
        View view = cVar.a().get();
        if (view == null) {
            return;
        }
        C0378a c0378a = this.f34584b.get(view);
        if (c0378a != null) {
            c0378a.a(aVar.getAdSessionId());
        } else {
            this.f34584b.put(view, new C0378a(cVar, aVar.getAdSessionId()));
        }
    }
}
