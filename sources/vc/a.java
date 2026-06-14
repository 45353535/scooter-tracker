package vc;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import jd.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pd.a0;
import pd.f0;
import pd.h;
import pd.k;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements vc.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1319a f106475b = new C1319a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f106476a = new k();

    /* JADX INFO: renamed from: vc.a$a, reason: collision with other inner class name */
    public static final class C1319a {
        public /* synthetic */ C1319a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1319a() {
        }
    }

    private static final class b implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f106477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final h f106478b;

        public b(Uri baseUri, h hVar) {
            Intrinsics.checkNotNullParameter(baseUri, "baseUri");
            this.f106477a = baseUri;
            this.f106478b = hVar;
        }

        public void b(boolean z10) {
            if (z10) {
                j.f(this.f106477a.getQueryParameter("fallbackTrackingUrl"));
            }
            jd.h.f(Boolean.valueOf(z10), this.f106478b);
        }

        @Override // pd.h
        public /* bridge */ /* synthetic */ void execute(Object obj) {
            b(((Boolean) obj).booleanValue());
        }
    }

    private static final class c implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f106479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final h f106480b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Context f106481c;

        public c(Context context, Uri baseUri, h hVar) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(baseUri, "baseUri");
            this.f106479a = baseUri;
            this.f106480b = hVar;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            this.f106481c = applicationContext;
        }

        public void b(boolean z10) {
            if (z10) {
                j.f(this.f106479a.getQueryParameter("primaryTrackingUrl"));
                jd.h.f(Boolean.TRUE, this.f106480b);
                return;
            }
            String queryParameter = this.f106479a.getQueryParameter("fallbackUrl");
            if (queryParameter == null || queryParameter.length() == 0) {
                jd.h.f(Boolean.FALSE, this.f106480b);
                return;
            }
            Uri uriM = f0.m(queryParameter);
            if (uriM == null) {
                jd.h.f(Boolean.FALSE, this.f106480b);
            } else {
                j.a(this.f106481c, uriM, new b(this.f106479a, this.f106480b));
            }
        }

        @Override // pd.h
        public /* bridge */ /* synthetic */ void execute(Object obj) {
            b(((Boolean) obj).booleanValue());
        }
    }

    @Override // vc.c
    public /* synthetic */ void a(Context context, String str, h hVar) {
        vc.b.a(this, context, str, hVar);
    }

    @Override // vc.c
    public void b(Context context, Uri uri, h hVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        String queryParameter = uri.getQueryParameter("primaryUrl");
        if (TextUtils.isEmpty(queryParameter)) {
            b9.e.b("BMDeeplinkProcessor", "processUrl (primaryUrl is null or empty)", new Object[0]);
            jd.h.f(Boolean.FALSE, hVar);
            return;
        }
        Uri uriM = f0.m(queryParameter);
        if (uriM == null) {
            b9.e.b("BMDeeplinkProcessor", "processUrl (primaryUri is null)", new Object[0]);
            jd.h.f(Boolean.FALSE, hVar);
        } else {
            if (!Intrinsics.areEqual(uri.getHost(), "inlineinstalls")) {
                j.a(context, uriM, new c(context, uri, hVar));
                return;
            }
            k kVar = this.f106476a;
            Context contextA = a0.f98216a.a();
            if (contextA == null) {
                contextA = context;
            }
            jd.h.f(Boolean.valueOf(kVar.a(contextA, uriM)), new c(context, uri, hVar));
        }
    }

    @Override // vc.c
    public boolean a(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return Intrinsics.areEqual("bmlink", uri.getScheme());
    }
}
