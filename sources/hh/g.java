package hh;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import vh.h;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f73611c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f73612d = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f73613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final uh.c f73614b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f73615a = new ArrayList();

        public final g a() {
            return new g(CollectionsKt.toSet(this.f73615a), null, 2, 0 == true ? 1 : 0);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Certificate certificate) {
            Intrinsics.checkNotNullParameter(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + b((X509Certificate) certificate).d();
        }

        public final vh.h b(X509Certificate x509Certificate) {
            Intrinsics.checkNotNullParameter(x509Certificate, "<this>");
            h.a aVar = vh.h.f106840e;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
            return h.a.g(aVar, encoded, 0, 0, 3, null).J();
        }

        private b() {
        }
    }

    static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f73617g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f73618h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List list, String str) {
            super(0);
            this.f73617g = list;
            this.f73618h = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List invoke() {
            List listA;
            uh.c cVarD = g.this.d();
            if (cVarD == null || (listA = cVarD.a(this.f73617g, this.f73618h)) == null) {
                listA = this.f73617g;
            }
            List<Certificate> list = listA;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (Certificate certificate : list) {
                Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public g(Set pins, uh.c cVar) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f73613a = pins;
        this.f73614b = cVar;
    }

    public final void a(String hostname, List peerCertificates) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
        b(hostname, new c(peerCertificates, hostname));
    }

    public final void b(String hostname, Function0 cleanedPeerCertificatesFn) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List listC = c(hostname);
        if (listC.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : list) {
            Iterator it = listC.iterator();
            if (it.hasNext()) {
                androidx.privacysandbox.ads.adservices.topics.a.a(it.next());
                throw null;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Certificate pinning failure!");
        sb2.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb2.append("\n    ");
            sb2.append(f73611c.a(x509Certificate2));
            sb2.append(": ");
            sb2.append(x509Certificate2.getSubjectDN().getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(hostname);
        sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        Iterator it2 = listC.iterator();
        while (it2.hasNext()) {
            androidx.privacysandbox.ads.adservices.topics.a.a(it2.next());
            sb2.append("\n    ");
            sb2.append((Object) null);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string);
    }

    public final List c(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Set set = this.f73613a;
        List listEmptyList = CollectionsKt.emptyList();
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            return listEmptyList;
        }
        androidx.privacysandbox.ads.adservices.topics.a.a(it.next());
        throw null;
    }

    public final uh.c d() {
        return this.f73614b;
    }

    public final g e(uh.c certificateChainCleaner) {
        Intrinsics.checkNotNullParameter(certificateChainCleaner, "certificateChainCleaner");
        return Intrinsics.areEqual(this.f73614b, certificateChainCleaner) ? this : new g(this.f73613a, certificateChainCleaner);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(gVar.f73613a, this.f73613a) && Intrinsics.areEqual(gVar.f73614b, this.f73614b);
    }

    public int hashCode() {
        int iHashCode = (1517 + this.f73613a.hashCode()) * 41;
        uh.c cVar = this.f73614b;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public /* synthetic */ g(Set set, uh.c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i10 & 2) != 0 ? null : cVar);
    }
}
