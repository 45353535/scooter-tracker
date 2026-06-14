package com.applovin.impl.sdk;

import com.applovin.impl.y2;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f10919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f10920b = new HashMap(5);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f10921c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f10922d = DesugarCollections.synchronizedMap(new HashMap(5));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f10923e = DesugarCollections.synchronizedMap(new HashMap(5));

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f10924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f10925b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f10926c;

        public a(String str, String str2, String str3) {
            this.f10924a = str;
            this.f10925b = str2;
            this.f10926c = str3;
        }

        protected boolean a(Object obj) {
            return obj instanceof a;
        }

        public String b() {
            return this.f10924a;
        }

        public String c() {
            return this.f10926c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a(this)) {
                return false;
            }
            String strB = b();
            String strB2 = aVar.b();
            if (strB != null ? !strB.equals(strB2) : strB2 != null) {
                return false;
            }
            String strA = a();
            String strA2 = aVar.a();
            if (strA != null ? !strA.equals(strA2) : strA2 != null) {
                return false;
            }
            String strC = c();
            String strC2 = aVar.c();
            return strC != null ? strC.equals(strC2) : strC2 == null;
        }

        public int hashCode() {
            String strB = b();
            int iHashCode = strB == null ? 43 : strB.hashCode();
            String strA = a();
            int iHashCode2 = ((iHashCode + 59) * 59) + (strA == null ? 43 : strA.hashCode());
            String strC = c();
            return (iHashCode2 * 59) + (strC != null ? strC.hashCode() : 43);
        }

        public String toString() {
            return "MediationWaterfallWinnerTracker.WinningAd(bCode=" + b() + ", adapterName=" + a() + ", networkName=" + c() + ")";
        }

        public String a() {
            return this.f10925b;
        }
    }

    p(k kVar) {
        this.f10919a = kVar.O();
    }

    public String a(String str) {
        return (String) this.f10923e.get(str);
    }

    public void b(y2 y2Var) {
        this.f10922d.put(y2Var.getAdUnitId(), y2Var.Q());
    }

    public void c(y2 y2Var) {
        synchronized (this.f10921c) {
            try {
                if (o.a()) {
                    this.f10919a.a("MediationWaterfallWinnerTracker", "Tracking winning ad: " + y2Var);
                }
                this.f10920b.put(y2Var.getAdUnitId(), new a(y2Var.B(), y2Var.c(), y2Var.getNetworkName()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f10923e.put(y2Var.getAdUnitId(), y2Var.Q());
    }

    public void a(y2 y2Var) {
        synchronized (this.f10921c) {
            try {
                String adUnitId = y2Var.getAdUnitId();
                a aVar = (a) this.f10920b.get(adUnitId);
                if (aVar == null) {
                    if (o.a()) {
                        this.f10919a.a("MediationWaterfallWinnerTracker", "No previous winner to clear.");
                    }
                    return;
                }
                if (y2Var.B().equals(aVar.b())) {
                    if (o.a()) {
                        this.f10919a.a("MediationWaterfallWinnerTracker", "Clearing previous winning ad: " + aVar);
                    }
                    this.f10920b.remove(adUnitId);
                } else if (o.a()) {
                    this.f10919a.a("MediationWaterfallWinnerTracker", "Previous winner not cleared for ad: " + y2Var + " , since it could have already been updated with a new ad: " + aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String b(String str) {
        return (String) this.f10922d.get(str);
    }

    public a c(String str) {
        a aVar;
        synchronized (this.f10921c) {
            aVar = (a) this.f10920b.get(str);
        }
        return aVar;
    }
}
