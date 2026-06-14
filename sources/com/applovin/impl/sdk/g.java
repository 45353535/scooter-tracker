package com.applovin.impl.sdk;

import com.applovin.impl.y2;
import com.ironsource.C4424m2;
import com.my.target.common.menu.MenuActionType;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f10622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f10623b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f10624c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f10625d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f10626e = new Object();

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f10627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f10628b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f10629c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f10630d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f10631e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f10632f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f10633g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f10634h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final ArrayDeque f10635i;

        public String b() {
            return this.f10630d;
        }

        public String c() {
            return this.f10629c;
        }

        public String d() {
            return this.f10631e;
        }

        public String e() {
            return this.f10632f;
        }

        public String f() {
            return this.f10633g;
        }

        public String g() {
            return this.f10628b;
        }

        public String h() {
            return this.f10632f;
        }

        public c i() {
            return (c) this.f10635i.getLast();
        }

        public String toString() {
            return "AdInfo{state='" + i() + "', adUnitId='" + this.f10627a + "', format='" + this.f10628b + "', adapterName='" + this.f10629c + "', adapterClass='" + this.f10630d + "', adapterVersion='" + this.f10631e + "', bCode='" + this.f10632f + "', creativeId='" + this.f10633g + "', updated=" + this.f10634h + '}';
        }

        private b(y2 y2Var, c cVar) {
            this.f10635i = new ArrayDeque();
            this.f10627a = y2Var.getAdUnitId();
            this.f10628b = y2Var.getFormat().getLabel();
            this.f10629c = y2Var.c();
            this.f10630d = y2Var.b();
            this.f10631e = y2Var.z();
            this.f10632f = y2Var.B();
            this.f10633g = y2Var.getCreativeId();
            a(cVar);
        }

        public String a() {
            return this.f10627a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(c cVar) {
            this.f10634h = System.currentTimeMillis();
            this.f10635i.add(cVar);
        }
    }

    public enum c {
        LOADING("loading"),
        LOAD("load"),
        SHOW(C4424m2.f43623v),
        HIDE(MenuActionType.HIDE),
        CLICK("click"),
        DESTROY("destroy"),
        SHOW_ERROR("show_error");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f10644a;

        c(String str) {
            this.f10644a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f10644a;
        }
    }

    public interface d {
        void a(b bVar);
    }

    g(k kVar) {
        this.f10622a = kVar;
        a();
    }

    public void a(y2 y2Var, c cVar) {
        synchronized (this.f10626e) {
            try {
                String strB = y2Var.B();
                b bVar = (b) this.f10625d.get(strB);
                if (bVar == null) {
                    if (cVar == c.DESTROY) {
                        return;
                    }
                    bVar = new b(y2Var, cVar);
                    this.f10625d.put(strB, bVar);
                } else if (bVar.i() == cVar) {
                    return;
                } else {
                    bVar.a(cVar);
                }
                if (cVar == c.DESTROY) {
                    this.f10625d.remove(strB);
                }
                a(bVar, cVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a() {
        synchronized (this.f10624c) {
            try {
                for (c cVar : c.values()) {
                    this.f10623b.put(cVar, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(d dVar, Set set) {
        synchronized (this.f10624c) {
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    a((c) it.next()).add(dVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(d dVar) {
        synchronized (this.f10624c) {
            try {
                Iterator it = this.f10623b.keySet().iterator();
                while (it.hasNext()) {
                    a((c) it.next()).remove(dVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private Set a(c cVar) {
        synchronized (this.f10624c) {
            try {
                Set set = (Set) this.f10623b.get(cVar);
                if (com.applovin.impl.l1.a(set)) {
                    return set;
                }
                return new HashSet();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void a(b bVar, c cVar) {
        synchronized (this.f10624c) {
            try {
                Iterator it = a(cVar).iterator();
                while (it.hasNext()) {
                    ((d) it.next()).a(bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
