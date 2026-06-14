package f1;

import android.content.Context;
import android.webkit.WebSettings;
import f1.z2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ld implements ag {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ld f70416c = new ld();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f70417d = "Invalid user-agent value";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ag f70418b = xe.b();

    public final String a() {
        return f70417d;
    }

    public final void b(Context context) {
        String defaultUserAgent;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            defaultUserAgent = System.getProperty("http.agent");
        } catch (Exception e10) {
            c(e10.toString());
            defaultUserAgent = "";
        }
        try {
            defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        } catch (Exception e11) {
            c(e11.toString());
        }
        if (defaultUserAgent != null) {
            f70417d = defaultUserAgent;
        }
    }

    public final void c(String str) {
        try {
            e((y0) new oc(z2.f.f71725c, str, null, null, null, 28, null));
        } catch (Exception e10) {
            eg.i("sendUserAgentErrorTracking", e10);
        }
    }

    @Override // f1.ag
    public y0 e(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f70418b.e(y0Var);
    }

    @Override // f1.Cif
    public void l(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f70418b.l(type, location);
    }

    @Override // f1.ag
    public xc m(xc xcVar) {
        Intrinsics.checkNotNullParameter(xcVar, "<this>");
        return this.f70418b.m(xcVar);
    }

    @Override // f1.ag
    public u n(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        return this.f70418b.n(uVar);
    }

    @Override // f1.ag
    public y0 p(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f70418b.p(y0Var);
    }

    @Override // f1.ag
    public y0 u(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f70418b.u(y0Var);
    }

    @Override // f1.Cif
    /* JADX INFO: renamed from: e */
    public void mo4436e(y0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f70418b.mo4436e(event);
    }
}
