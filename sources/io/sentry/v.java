package io.sentry;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.URI;

/* JADX INFO: loaded from: classes3.dex */
final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f84326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f84327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f84328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f84329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final URI f84330e;

    v(String str) {
        try {
            io.sentry.util.w.c(str, "The DSN is required.");
            URI uriNormalize = new URI(str).normalize();
            String scheme = uriNormalize.getScheme();
            if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                throw new IllegalArgumentException("Invalid DSN scheme: " + scheme);
            }
            String userInfo = uriNormalize.getUserInfo();
            if (userInfo == null || userInfo.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            String[] strArrSplit = userInfo.split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1);
            String str2 = strArrSplit[0];
            this.f84329d = str2;
            if (str2 == null || str2.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            this.f84328c = strArrSplit.length > 1 ? strArrSplit[1] : null;
            String path = uriNormalize.getPath();
            path = path.endsWith("/") ? path.substring(0, path.length() - 1) : path;
            int iLastIndexOf = path.lastIndexOf("/") + 1;
            String strSubstring = path.substring(0, iLastIndexOf);
            if (!strSubstring.endsWith("/")) {
                strSubstring = strSubstring + "/";
            }
            this.f84327b = strSubstring;
            String strSubstring2 = path.substring(iLastIndexOf);
            this.f84326a = strSubstring2;
            if (strSubstring2.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: A Project Id is required.");
            }
            String str3 = strSubstring;
            this.f84330e = new URI(scheme, null, uriNormalize.getHost(), uriNormalize.getPort(), str3 + "api/" + strSubstring2, null, null);
        } catch (Throwable th2) {
            throw new IllegalArgumentException(th2);
        }
    }

    public String a() {
        return this.f84329d;
    }

    public String b() {
        return this.f84328c;
    }

    URI c() {
        return this.f84330e;
    }
}
