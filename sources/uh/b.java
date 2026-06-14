package uh;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f105670a;

    public b(X509Certificate... caCerts) {
        Intrinsics.checkNotNullParameter(caCerts, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : caCerts) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Intrinsics.checkNotNullExpressionValue(subjectX500Principal, "caCert.subjectX500Principal");
            Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, linkedHashSet);
            }
            ((Set) linkedHashSet).add(x509Certificate);
        }
        this.f105670a = linkedHashMap;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof b) && Intrinsics.areEqual(((b) obj).f105670a, this.f105670a);
        }
        return true;
    }

    @Override // uh.e
    public X509Certificate findByIssuerAndSignature(X509Certificate cert) {
        Intrinsics.checkNotNullParameter(cert, "cert");
        Set set = (Set) this.f105670a.get(cert.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            try {
                cert.verify(((X509Certificate) next).getPublicKey());
                obj = next;
                break;
            } catch (Exception unused) {
            }
        }
        return (X509Certificate) obj;
    }

    public int hashCode() {
        return this.f105670a.hashCode();
    }
}
