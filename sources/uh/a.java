package uh;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1317a f105668c = new C1317a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f105669b;

    /* JADX INFO: renamed from: uh.a$a, reason: collision with other inner class name */
    public static final class C1317a {
        public /* synthetic */ C1317a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1317a() {
        }
    }

    public a(e trustRootIndex) {
        Intrinsics.checkNotNullParameter(trustRootIndex, "trustRootIndex");
        this.f105669b = trustRootIndex;
    }

    private final boolean b(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!Intrinsics.areEqual(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // uh.c
    public List a(List chain, String hostname) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        Intrinsics.checkNotNullExpressionValue(objRemoveFirst, "queue.removeFirst()");
        arrayList.add(objRemoveFirst);
        boolean z10 = false;
        for (int i10 = 0; i10 < 9; i10++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate x509CertificateFindByIssuerAndSignature = this.f105669b.findByIssuerAndSignature(x509Certificate);
            if (x509CertificateFindByIssuerAndSignature == null) {
                Iterator it = arrayDeque.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    Intrinsics.checkNotNull(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (b(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (!z10) {
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                return arrayList;
            }
            if (arrayList.size() > 1 || !Intrinsics.areEqual(x509Certificate, x509CertificateFindByIssuerAndSignature)) {
                arrayList.add(x509CertificateFindByIssuerAndSignature);
            }
            if (b(x509CertificateFindByIssuerAndSignature, x509CertificateFindByIssuerAndSignature)) {
                return arrayList;
            }
            z10 = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.areEqual(((a) obj).f105669b, this.f105669b);
    }

    public int hashCode() {
        return this.f105669b.hashCode();
    }
}
