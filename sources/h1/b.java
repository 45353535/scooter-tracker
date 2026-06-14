package h1;

import f1.eg;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f72867a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f72868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f72869c;

    public static final boolean c() {
        return f72869c;
    }

    public final String a(String urlString) {
        String str;
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        URL urlE = e(urlString);
        if (urlE == null) {
            return "";
        }
        try {
            str = urlE.getProtocol() + "://" + urlE.getHost();
        } catch (Exception e10) {
            eg.d("getEndpointFromUrl: " + urlString + " : " + e10, null);
            str = "";
        }
        return str == null ? "" : str;
    }

    public final String b(String endpoint, String str) {
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        String str2 = f72868b;
        if (str2 != null && str2.length() != 0) {
            eg.o("normalizedUrl: " + endpoint + " to: " + f72868b, null);
            endpoint = f72868b;
            Intrinsics.checkNotNull(endpoint);
        }
        if (str == null || str.length() == 0) {
            str = "";
        } else if (!StringsKt.a0(str, "/", false, 2, null)) {
            str = "/" + str;
        }
        return endpoint + str;
    }

    public final String d(String urlString) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        URL urlE = e(urlString);
        String path = null;
        if (urlE != null) {
            try {
                path = urlE.getPath();
            } catch (Exception e10) {
                eg.d("getPathFromUrl: " + urlString + " : " + e10, null);
                path = "";
            }
        }
        return path == null ? "" : path;
    }

    public final URL e(String urlString) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        if (urlString.length() > 0) {
            try {
                return new URL(urlString);
            } catch (Exception e10) {
                eg.d("stringToURL: " + urlString + " : " + e10, null);
            }
        }
        return null;
    }
}
