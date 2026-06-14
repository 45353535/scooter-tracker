package jd;

import android.content.Context;
import android.net.Uri;
import ic.q;
import ic.y;
import java.util.List;
import jd.c;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pd.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f85818a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final q f85819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final vc.c f85820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final vc.c f85821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final List f85822e;

    static {
        q qVar = new q();
        f85819b = qVar;
        io.bidmachine.iab.mraid.m mVar = new io.bidmachine.iab.mraid.m();
        y yVar = new y();
        vc.d dVar = new vc.d(mVar, qVar);
        f85820c = dVar;
        vc.e eVar = new vc.e(mVar, yVar);
        f85821d = eVar;
        f85822e = CollectionsKt.listOf((Object[]) new vc.c[]{dVar, eVar, new vc.a()});
    }

    private j() {
    }

    public static final void a(Context context, Uri uri, pd.h hVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        f85819b.e(context, uri, hVar);
    }

    public static final void b(Context context, String url, pd.h hVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        f85820c.a(context, url, hVar);
    }

    public static final void c(Context context, String url, pd.h hVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Uri uriD = d(url);
        for (vc.c cVar : f85822e) {
            if (cVar.a(uriD)) {
                cVar.b(context, uriD, hVar);
                return;
            }
        }
        a(context, uriD, hVar);
    }

    public static final Uri d(String url) {
        Uri uriM;
        Intrinsics.checkNotNullParameter(url, "url");
        Uri uri = Uri.parse(url);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(url)");
        String scheme = uri.getScheme();
        if ((scheme == null || scheme.length() == 0) && !StringsKt.a0(url, "/", false, 2, null) && (uriM = f0.m(url)) != null) {
            String scheme2 = uriM.getScheme();
            if (scheme2 == null || scheme2.length() <= 0) {
                String string = uriM.toString();
                Intrinsics.checkNotNullExpressionValue(string, "newUri.toString()");
                if (StringsKt.a0(string, "/", false, 2, null)) {
                }
            }
            return uriM;
        }
        return uri;
    }

    public static final void e(Context context, String url, pd.h hVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        f85821d.a(context, url, hVar);
    }

    public static final void f(String str) {
        String strN = f0.n(str);
        if (strN == null || strN.length() <= 0) {
            return;
        }
        new c.a(strN, c.e.Get).f(ec.a.c()).c();
    }
}
