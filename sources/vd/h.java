package vd;

import android.net.Uri;
import java.net.HttpURLConnection;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f106536a = new h();

    private h() {
    }

    public static final String a(String url, Map queryParameters) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(queryParameters, "queryParameters");
        if (queryParameters.isEmpty()) {
            return url;
        }
        Uri.Builder builderBuildUpon = Uri.parse(url).buildUpon();
        for (Map.Entry entry : queryParameters.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String string = builderBuildUpon.build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "parse(url).buildUpon().a…     }.build().toString()");
        return string;
    }

    public static final void b(HttpURLConnection httpURLConnection) {
        i.a(httpURLConnection);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6 A[Catch: all -> 0x0036, Exception -> 0x00c8, TRY_LEAVE, TryCatch #2 {Exception -> 0x00c8, blocks: (B:23:0x006c, B:28:0x0089, B:35:0x009e, B:38:0x00a4, B:39:0x00a7, B:41:0x00b6), top: B:62:0x006c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd A[Catch: all -> 0x0036, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0036, blocks: (B:4:0x0022, B:7:0x002b, B:11:0x0039, B:13:0x0041, B:16:0x0049, B:18:0x0053, B:21:0x0061, B:23:0x006c, B:28:0x0089, B:35:0x009e, B:38:0x00a4, B:39:0x00a7, B:41:0x00b6, B:44:0x00bd, B:50:0x00cf, B:47:0x00c8, B:53:0x00d6), top: B:61:0x0022, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String c(java.lang.String r12, int r13) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vd.h.c(java.lang.String, int):java.lang.String");
    }

    public static /* synthetic */ String d(String str, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 500;
        }
        return c(str, i10);
    }
}
