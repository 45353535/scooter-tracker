package com.applovin.impl;

import android.os.SystemClock;
import com.applovin.mediation.MaxAdFormat;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class b5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f8432b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f8433c = new Object();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8434a;

        static {
            int[] iArr = new int[b.values().length];
            f8434a = iArr;
            try {
                iArr[b.AD_FORMAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8434a[b.AD_UNIT_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8434a[b.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum b {
        AD_FORMAT,
        AD_UNIT_ID,
        ALL
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c5 f8439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f8440b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f8441c;

        /* synthetic */ c(c5 c5Var, long j10, a aVar) {
            this(c5Var, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d() {
            return SystemClock.elapsedRealtime() - this.f8441c > this.f8440b;
        }

        protected boolean a(Object obj) {
            return obj instanceof c;
        }

        public c5 c() {
            return this.f8439a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.a((Object) this) || b() != cVar.b() || a() != cVar.a()) {
                return false;
            }
            c5 c5VarC = c();
            c5 c5VarC2 = cVar.c();
            return c5VarC != null ? c5VarC.equals(c5VarC2) : c5VarC2 == null;
        }

        public int hashCode() {
            long jB = b();
            long jA = a();
            c5 c5VarC = c();
            return ((((((int) (jB ^ (jB >>> 32))) + 59) * 59) + ((int) ((jA >>> 32) ^ jA))) * 59) + (c5VarC == null ? 43 : c5VarC.hashCode());
        }

        public String toString() {
            return "SignalCacheManager.SignalWrapper(signal=" + c() + ", expirationTimeMillis=" + b() + ", cacheTimestampMillis=" + a() + ")";
        }

        private c(c5 c5Var, long j10) {
            this.f8439a = c5Var;
            this.f8440b = j10;
            this.f8441c = SystemClock.elapsedRealtime();
        }

        public long b() {
            return this.f8440b;
        }

        public long a() {
            return this.f8441c;
        }
    }

    public b5(com.applovin.impl.sdk.k kVar) {
        this.f8431a = kVar;
    }

    public void a(c5 c5Var, d5 d5Var, String str, MaxAdFormat maxAdFormat) {
        if (c5Var == null) {
            return;
        }
        long jV = d5Var.v();
        if (jV <= 0) {
            return;
        }
        this.f8431a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f8431a.O().a("SignalCacheManager", "Caching signal for: " + d5Var);
        }
        String strA = a(d5Var, str, maxAdFormat);
        c cVar = new c(c5Var, jV, null);
        synchronized (this.f8433c) {
            this.f8432b.put(strA, cVar);
        }
    }

    public c5 b(d5 d5Var, String str, MaxAdFormat maxAdFormat) {
        String strA = a(d5Var, str, maxAdFormat);
        synchronized (this.f8433c) {
            try {
                c cVar = (c) this.f8432b.get(strA);
                if (cVar == null) {
                    return null;
                }
                if (cVar.d()) {
                    this.f8432b.remove(strA);
                    return null;
                }
                this.f8431a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8431a.O().a("SignalCacheManager", "Returning cached signal for: " + d5Var);
                }
                return cVar.f8439a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private String a(d5 d5Var, String str, MaxAdFormat maxAdFormat) {
        String strC = d5Var.c();
        int i10 = a.f8434a[d5Var.t().ordinal()];
        if (i10 == 1) {
            return strC + "_" + maxAdFormat.getLabel();
        }
        if (i10 != 2) {
            return strC;
        }
        return strC + "_" + str;
    }
}
