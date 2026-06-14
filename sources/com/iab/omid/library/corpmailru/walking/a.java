package com.iab.omid.library.corpmailru.walking;

import android.view.View;
import com.iab.omid.library.corpmailru.d.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f34966a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0390a> f34967b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f34968c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f34969d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f34970e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f34971f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f34972g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f34973h;

    /* JADX INFO: renamed from: com.iab.omid.library.corpmailru.walking.a$a, reason: collision with other inner class name */
    public static class C0390a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.iab.omid.library.corpmailru.b.c f34974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f34975b = new ArrayList<>();

        public C0390a(com.iab.omid.library.corpmailru.b.c cVar, String str) {
            this.f34974a = cVar;
            a(str);
        }

        public com.iab.omid.library.corpmailru.b.c a() {
            return this.f34974a;
        }

        public ArrayList<String> b() {
            return this.f34975b;
        }

        public void a(String str) {
            this.f34975b.add(str);
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
        this.f34969d.addAll(hashSet);
        return null;
    }

    public String a(View view) {
        if (this.f34966a.size() == 0) {
            return null;
        }
        String str = this.f34966a.get(view);
        if (str != null) {
            this.f34966a.remove(view);
        }
        return str;
    }

    public View b(String str) {
        return this.f34968c.get(str);
    }

    public c c(View view) {
        return this.f34969d.contains(view) ? c.PARENT_VIEW : this.f34973h ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        this.f34973h = true;
    }

    public String a(String str) {
        return this.f34972g.get(str);
    }

    public C0390a b(View view) {
        C0390a c0390a = this.f34967b.get(view);
        if (c0390a != null) {
            this.f34967b.remove(view);
        }
        return c0390a;
    }

    public void c() {
        com.iab.omid.library.corpmailru.b.a aVarA = com.iab.omid.library.corpmailru.b.a.a();
        if (aVarA != null) {
            for (com.iab.omid.library.corpmailru.adsession.a aVar : aVarA.c()) {
                View viewD = aVar.d();
                if (aVar.e()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewD != null) {
                        String strD = d(viewD);
                        if (strD == null) {
                            this.f34970e.add(adSessionId);
                            this.f34966a.put(viewD, adSessionId);
                            a(aVar);
                        } else {
                            this.f34971f.add(adSessionId);
                            this.f34968c.put(adSessionId, viewD);
                            this.f34972g.put(adSessionId, strD);
                        }
                    } else {
                        this.f34971f.add(adSessionId);
                        this.f34972g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void d() {
        this.f34966a.clear();
        this.f34967b.clear();
        this.f34968c.clear();
        this.f34969d.clear();
        this.f34970e.clear();
        this.f34971f.clear();
        this.f34972g.clear();
        this.f34973h = false;
    }

    public HashSet<String> a() {
        return this.f34970e;
    }

    public HashSet<String> b() {
        return this.f34971f;
    }

    private void a(com.iab.omid.library.corpmailru.adsession.a aVar) {
        Iterator<com.iab.omid.library.corpmailru.b.c> it = aVar.a().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(com.iab.omid.library.corpmailru.b.c cVar, com.iab.omid.library.corpmailru.adsession.a aVar) {
        View view = cVar.a().get();
        if (view == null) {
            return;
        }
        C0390a c0390a = this.f34967b.get(view);
        if (c0390a != null) {
            c0390a.a(aVar.getAdSessionId());
        } else {
            this.f34967b.put(view, new C0390a(cVar, aVar.getAdSessionId()));
        }
    }
}
