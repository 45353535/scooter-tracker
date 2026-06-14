package vd;

import java.net.HttpURLConnection;
import java.net.URL;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {
    public static final void a(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return;
        }
        try {
            httpURLConnection.disconnect();
            Unit unit = Unit.f93236a;
        } catch (Throwable unused) {
        }
    }

    public static final boolean b(URL url) {
        Intrinsics.checkNotNullParameter(url, "<this>");
        return Intrinsics.areEqual("http", url.getProtocol()) || Intrinsics.areEqual("https", url.getProtocol());
    }
}
