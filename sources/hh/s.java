package hh;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
public final class s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f73738e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0 f73739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f73740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f73741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f73742d;

    public static final class a {

        /* JADX INFO: renamed from: hh.s$a$a, reason: collision with other inner class name */
        static final class C0913a extends Lambda implements Function0 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ List f73743f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0913a(List list) {
                super(0);
                this.f73743f = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List invoke() {
                return this.f73743f;
            }
        }

        static final class b extends Lambda implements Function0 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ List f73744f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(List list) {
                super(0);
                this.f73744f = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List invoke() {
                return this.f73744f;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final List c(Certificate[] certificateArr) {
            return certificateArr != null ? ih.d.w(Arrays.copyOf(certificateArr, certificateArr.length)) : CollectionsKt.emptyList();
        }

        public final s a(e0 tlsVersion, i cipherSuite, List peerCertificates, List localCertificates) {
            Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
            Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
            Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
            Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
            return new s(tlsVersion, cipherSuite, ih.d.T(localCertificates), new C0913a(ih.d.T(peerCertificates)));
        }

        public final s b(SSLSession sSLSession) throws IOException {
            List listEmptyList;
            Intrinsics.checkNotNullParameter(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (Intrinsics.areEqual(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : Intrinsics.areEqual(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            i iVarB = i.f73623b.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if (Intrinsics.areEqual("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            e0 e0VarA = e0.f73603c.a(protocol);
            try {
                listEmptyList = c(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listEmptyList = CollectionsKt.emptyList();
            }
            return new s(e0VarA, iVarB, c(sSLSession.getLocalCertificates()), new b(listEmptyList));
        }

        private a() {
        }
    }

    static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f73745f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0 function0) {
            super(0);
            this.f73745f = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List invoke() {
            try {
                return (List) this.f73745f.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return CollectionsKt.emptyList();
            }
        }
    }

    public s(e0 tlsVersion, i cipherSuite, List localCertificates, Function0 peerCertificatesFn) {
        Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
        Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
        Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
        Intrinsics.checkNotNullParameter(peerCertificatesFn, "peerCertificatesFn");
        this.f73739a = tlsVersion;
        this.f73740b = cipherSuite;
        this.f73741c = localCertificates;
        this.f73742d = lf.i.a(new b(peerCertificatesFn));
    }

    private final String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        Intrinsics.checkNotNullExpressionValue(type, "type");
        return type;
    }

    public final i a() {
        return this.f73740b;
    }

    public final List c() {
        return this.f73741c;
    }

    public final List d() {
        return (List) this.f73742d.getValue();
    }

    public final e0 e() {
        return this.f73739a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return sVar.f73739a == this.f73739a && Intrinsics.areEqual(sVar.f73740b, this.f73740b) && Intrinsics.areEqual(sVar.d(), d()) && Intrinsics.areEqual(sVar.f73741c, this.f73741c);
    }

    public int hashCode() {
        return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f73739a.hashCode()) * 31) + this.f73740b.hashCode()) * 31) + d().hashCode()) * 31) + this.f73741c.hashCode();
    }

    public String toString() {
        List listD = d();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listD, 10));
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(b((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Handshake{tlsVersion=");
        sb2.append(this.f73739a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f73740b);
        sb2.append(" peerCertificates=");
        sb2.append(string);
        sb2.append(" localCertificates=");
        List list = this.f73741c;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(b((Certificate) it2.next()));
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
