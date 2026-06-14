package uh;

import androidx.webkit.ProxyConfig;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import vh.n0;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements HostnameVerifier {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f105672b = new d();

    private d() {
    }

    private final String b(String str) {
        if (!d(str)) {
            return str;
        }
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = str.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    private final List c(X509Certificate x509Certificate, int i10) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && Intrinsics.areEqual(list.get(0), Integer.valueOf(i10)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return CollectionsKt.emptyList();
        }
    }

    private final boolean d(String str) {
        return str.length() == ((int) n0.b(str, 0, 0, 3, null));
    }

    private final boolean f(String str, String str2) {
        if (str != null && str.length() != 0 && !StringsKt.a0(str, ".", false, 2, null) && !StringsKt.M(str, "..", false, 2, null) && str2 != null && str2.length() != 0 && !StringsKt.a0(str2, ".", false, 2, null) && !StringsKt.M(str2, "..", false, 2, null)) {
            if (!StringsKt.M(str, ".", false, 2, null)) {
                str = str + '.';
            }
            String str3 = str;
            if (!StringsKt.M(str2, ".", false, 2, null)) {
                str2 = str2 + '.';
            }
            String strB = b(str2);
            if (!StringsKt.g0(strB, ProxyConfig.MATCH_ALL_SCHEMES, false, 2, null)) {
                return Intrinsics.areEqual(str3, strB);
            }
            if (!StringsKt.a0(strB, "*.", false, 2, null) || StringsKt.u0(strB, '*', 1, false, 4, null) != -1 || str3.length() < strB.length() || Intrinsics.areEqual("*.", strB)) {
                return false;
            }
            String strSubstring = strB.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            if (!StringsKt.M(str3, strSubstring, false, 2, null)) {
                return false;
            }
            int length = str3.length() - strSubstring.length();
            return length <= 0 || StringsKt.B0(str3, '.', length + (-1), false, 4, null) == -1;
        }
        return false;
    }

    private final boolean g(String str, X509Certificate x509Certificate) {
        String strB = b(str);
        List listC = c(x509Certificate, 2);
        if ((listC instanceof Collection) && listC.isEmpty()) {
            return false;
        }
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            if (f105672b.f(strB, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean h(String str, X509Certificate x509Certificate) {
        String strE = ih.a.e(str);
        List listC = c(x509Certificate, 7);
        if ((listC instanceof Collection) && listC.isEmpty()) {
            return false;
        }
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(strE, ih.a.e((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    public final List a(X509Certificate certificate) {
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        return CollectionsKt.plus((Collection) c(certificate, 7), (Iterable) c(certificate, 2));
    }

    public final boolean e(String host, X509Certificate certificate) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        return ih.d.i(host) ? h(host, certificate) : g(host, certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String host, SSLSession session) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(session, "session");
        if (!d(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return e(host, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
