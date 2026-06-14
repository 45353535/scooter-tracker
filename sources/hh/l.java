package hh;

import com.ironsource.mediationsdk.logger.IronSourceError;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f73693e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final i[] f73694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final i[] f73695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l f73696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l f73697i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final l f73698j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final l f73699k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f73700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f73701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f73702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f73703d;

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static {
        i iVar = i.f73664o1;
        i iVar2 = i.f73667p1;
        i iVar3 = i.f73670q1;
        i iVar4 = i.f73622a1;
        i iVar5 = i.f73634e1;
        i iVar6 = i.f73625b1;
        i iVar7 = i.f73637f1;
        i iVar8 = i.f73655l1;
        i iVar9 = i.f73652k1;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9};
        f73694f = iVarArr;
        i[] iVarArr2 = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, i.L0, i.M0, i.f73648j0, i.f73651k0, i.H, i.L, i.f73653l};
        f73695g = iVarArr2;
        a aVarB = new a(true).b((i[]) Arrays.copyOf(iVarArr, iVarArr.length));
        e0 e0Var = e0.TLS_1_3;
        e0 e0Var2 = e0.TLS_1_2;
        f73696h = aVarB.e(e0Var, e0Var2).d(true).a();
        f73697i = new a(true).b((i[]) Arrays.copyOf(iVarArr2, iVarArr2.length)).e(e0Var, e0Var2).d(true).a();
        f73698j = new a(true).b((i[]) Arrays.copyOf(iVarArr2, iVarArr2.length)).e(e0Var, e0Var2, e0.TLS_1_1, e0.TLS_1_0).d(true).a();
        f73699k = new a(false).a();
    }

    public l(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f73700a = z10;
        this.f73701b = z11;
        this.f73702c = strArr;
        this.f73703d = strArr2;
    }

    private final l g(SSLSocket sSLSocket, boolean z10) {
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        if (this.f73702c != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            Intrinsics.checkNotNullExpressionValue(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = ih.d.E(enabledCipherSuites, this.f73702c, i.f73623b.c());
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f73703d != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(enabledProtocols, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = ih.d.E(enabledProtocols, this.f73703d, mf.a.g());
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(supportedCipherSuites, "supportedCipherSuites");
        int iX = ih.d.x(supportedCipherSuites, "TLS_FALLBACK_SCSV", i.f73623b.c());
        if (z10 && iX != -1) {
            Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[iX];
            Intrinsics.checkNotNullExpressionValue(str, "supportedCipherSuites[indexOfFallbackScsv]");
            cipherSuitesIntersection = ih.d.o(cipherSuitesIntersection, str);
        }
        a aVar = new a(this);
        Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
        a aVarC = aVar.c((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        Intrinsics.checkNotNullExpressionValue(tlsVersionsIntersection, "tlsVersionsIntersection");
        return aVarC.f((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length)).a();
    }

    public final void c(SSLSocket sslSocket, boolean z10) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        l lVarG = g(sslSocket, z10);
        if (lVarG.i() != null) {
            sslSocket.setEnabledProtocols(lVarG.f73703d);
        }
        if (lVarG.d() != null) {
            sslSocket.setEnabledCipherSuites(lVarG.f73702c);
        }
    }

    public final List d() {
        String[] strArr = this.f73702c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(i.f73623b.b(str));
        }
        return CollectionsKt.toList(arrayList);
    }

    public final boolean e(SSLSocket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        if (!this.f73700a) {
            return false;
        }
        String[] strArr = this.f73703d;
        if (strArr != null && !ih.d.u(strArr, socket.getEnabledProtocols(), mf.a.g())) {
            return false;
        }
        String[] strArr2 = this.f73702c;
        return strArr2 == null || ih.d.u(strArr2, socket.getEnabledCipherSuites(), i.f73623b.c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z10 = this.f73700a;
        l lVar = (l) obj;
        if (z10 != lVar.f73700a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f73702c, lVar.f73702c) && Arrays.equals(this.f73703d, lVar.f73703d) && this.f73701b == lVar.f73701b);
    }

    public final boolean f() {
        return this.f73700a;
    }

    public final boolean h() {
        return this.f73701b;
    }

    public int hashCode() {
        if (!this.f73700a) {
            return 17;
        }
        String[] strArr = this.f73702c;
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f73703d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f73701b ? 1 : 0);
    }

    public final List i() {
        String[] strArr = this.f73703d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(e0.f73603c.a(str));
        }
        return CollectionsKt.toList(arrayList);
    }

    public String toString() {
        if (!this.f73700a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(d(), "[all enabled]") + ", tlsVersions=" + Objects.toString(i(), "[all enabled]") + ", supportsTlsExtensions=" + this.f73701b + ')';
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f73704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String[] f73705b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String[] f73706c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f73707d;

        public a(boolean z10) {
            this.f73704a = z10;
        }

        public final l a() {
            return new l(this.f73704a, this.f73707d, this.f73705b, this.f73706c);
        }

        public final a b(i... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.f73704a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (i iVar : cipherSuites) {
                arrayList.add(iVar.c());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return c((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final a c(String... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.f73704a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.f73705b = (String[]) cipherSuites.clone();
            return this;
        }

        public final a d(boolean z10) {
            if (!this.f73704a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections");
            }
            this.f73707d = z10;
            return this;
        }

        public final a e(e0... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.f73704a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (e0 e0Var : tlsVersions) {
                arrayList.add(e0Var.g());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return f((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final a f(String... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.f73704a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f73706c = (String[]) tlsVersions.clone();
            return this;
        }

        public a(l connectionSpec) {
            Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
            this.f73704a = connectionSpec.f();
            this.f73705b = connectionSpec.f73702c;
            this.f73706c = connectionSpec.f73703d;
            this.f73707d = connectionSpec.h();
        }
    }
}
