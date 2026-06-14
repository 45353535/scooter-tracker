package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final g[] f51559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final g[] f51560f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j f51561g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j f51562h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j f51563i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final j f51564j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f51565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final boolean f51566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String[] f51567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String[] f51568d;

    static {
        g gVar = g.f51160n1;
        g gVar2 = g.f51163o1;
        g gVar3 = g.f51166p1;
        g gVar4 = g.f51169q1;
        g gVar5 = g.f51172r1;
        g gVar6 = g.Z0;
        g gVar7 = g.f51130d1;
        g gVar8 = g.f51121a1;
        g gVar9 = g.f51133e1;
        g gVar10 = g.f51151k1;
        g gVar11 = g.f51148j1;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11};
        f51559e = gVarArr;
        g[] gVarArr2 = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11, g.K0, g.L0, g.f51144i0, g.f51147j0, g.G, g.K, g.f51149k};
        f51560f = gVarArr2;
        a aVarA = new a(true).a(gVarArr);
        d0 d0Var = d0.TLS_1_3;
        d0 d0Var2 = d0.TLS_1_2;
        f51561g = aVarA.a(d0Var, d0Var2).a(true).a();
        a aVarA2 = new a(true).a(gVarArr2);
        d0 d0Var3 = d0.TLS_1_0;
        f51562h = aVarA2.a(d0Var, d0Var2, d0.TLS_1_1, d0Var3).a(true).a();
        f51563i = new a(true).a(gVarArr2).a(d0Var3).a(true).a();
        f51564j = new a(false).a();
    }

    j(a aVar) {
        this.f51565a = aVar.f51569a;
        this.f51567c = aVar.f51570b;
        this.f51568d = aVar.f51571c;
        this.f51566b = aVar.f51572d;
    }

    public List<g> a() {
        String[] strArr = this.f51567c;
        if (strArr != null) {
            return g.a(strArr);
        }
        return null;
    }

    public boolean b() {
        return this.f51565a;
    }

    public boolean c() {
        return this.f51566b;
    }

    public List<d0> d() {
        String[] strArr = this.f51568d;
        if (strArr != null) {
            return d0.a(strArr);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        j jVar = (j) obj;
        boolean z10 = this.f51565a;
        if (z10 != jVar.f51565a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f51567c, jVar.f51567c) && Arrays.equals(this.f51568d, jVar.f51568d) && this.f51566b == jVar.f51566b);
    }

    public int hashCode() {
        if (this.f51565a) {
            return ((((Arrays.hashCode(this.f51567c) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.f51568d)) * 31) + (!this.f51566b ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f51565a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + (this.f51567c != null ? a().toString() : "[all enabled]") + ", tlsVersions=" + (this.f51568d != null ? d().toString() : "[all enabled]") + ", supportsTlsExtensions=" + this.f51566b + ")";
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f51569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String[] f51570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String[] f51571c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f51572d;

        a(boolean z10) {
            this.f51569a = z10;
        }

        public a a(g... gVarArr) {
            if (!this.f51569a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[gVarArr.length];
            for (int i10 = 0; i10 < gVarArr.length; i10++) {
                strArr[i10] = gVarArr[i10].f51189a;
            }
            return a(strArr);
        }

        public a b(String... strArr) {
            if (!this.f51569a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f51571c = (String[]) strArr.clone();
            return this;
        }

        public a(j jVar) {
            this.f51569a = jVar.f51565a;
            this.f51570b = jVar.f51567c;
            this.f51571c = jVar.f51568d;
            this.f51572d = jVar.f51566b;
        }

        public a a(String... strArr) {
            if (this.f51569a) {
                if (strArr.length != 0) {
                    this.f51570b = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a a(d0... d0VarArr) {
            if (this.f51569a) {
                String[] strArr = new String[d0VarArr.length];
                for (int i10 = 0; i10 < d0VarArr.length; i10++) {
                    strArr[i10] = d0VarArr[i10].f51111a;
                }
                return b(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public a a(boolean z10) {
            if (this.f51569a) {
                this.f51572d = z10;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public j a() {
            return new j(this);
        }
    }

    private j b(SSLSocket sSLSocket, boolean z10) {
        String[] strArrA = this.f51567c != null ? com.mbridge.msdk.thrid.okhttp.internal.c.a(g.f51122b, sSLSocket.getEnabledCipherSuites(), this.f51567c) : sSLSocket.getEnabledCipherSuites();
        String[] strArrA2 = this.f51568d != null ? com.mbridge.msdk.thrid.okhttp.internal.c.a(com.mbridge.msdk.thrid.okhttp.internal.c.f51217q, sSLSocket.getEnabledProtocols(), this.f51568d) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int iA = com.mbridge.msdk.thrid.okhttp.internal.c.a(g.f51122b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z10 && iA != -1) {
            strArrA = com.mbridge.msdk.thrid.okhttp.internal.c.a(strArrA, supportedCipherSuites[iA]);
        }
        return new a(this).a(strArrA).b(strArrA2).a();
    }

    void a(SSLSocket sSLSocket, boolean z10) {
        j jVarB = b(sSLSocket, z10);
        String[] strArr = jVarB.f51568d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = jVarB.f51567c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    public boolean a(SSLSocket sSLSocket) {
        if (!this.f51565a) {
            return false;
        }
        String[] strArr = this.f51568d;
        if (strArr != null && !com.mbridge.msdk.thrid.okhttp.internal.c.b(com.mbridge.msdk.thrid.okhttp.internal.c.f51217q, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f51567c;
        return strArr2 == null || com.mbridge.msdk.thrid.okhttp.internal.c.b(g.f51122b, strArr2, sSLSocket.getEnabledCipherSuites());
    }
}
