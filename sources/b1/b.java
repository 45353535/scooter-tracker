package b1;

import android.content.Context;
import android.content.SharedPreferences;
import d1.f;
import e1.c;
import f1.db;
import f1.eg;
import f1.h5;
import f1.j;
import f1.rd;
import f1.yb;
import java.util.UUID;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f5785a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f5786b;

    private b() {
    }

    public static final void b(Context context, j1.d dataUseConsent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataUseConsent, "dataUseConsent");
        f5785a.f(context);
        rd rdVar = rd.f70996b;
        if (rdVar.i()) {
            rdVar.k().a().d(dataUseConsent);
        }
    }

    public static final j1.d c(Context context, String privacyStandard) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(privacyStandard, "privacyStandard");
        f5785a.f(context);
        rd rdVar = rd.f70996b;
        if (rdVar.i()) {
            return rdVar.k().a().b(privacyStandard);
        }
        return null;
    }

    public static final String d() {
        return f5786b;
    }

    public static final String e() {
        return "9.10.2";
    }

    private final void f(final Context context) {
        rd rdVar = rd.f70996b;
        if (rdVar.i()) {
            return;
        }
        rdVar.b(context);
        rdVar.g().b().execute(new Runnable() { // from class: b1.a
            @Override // java.lang.Runnable
            public final void run() {
                b.g(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Context context) {
        Intrinsics.checkNotNullParameter(context, "$context");
        f5785a.i(context);
    }

    public static final boolean h() {
        rd rdVar = rd.f70996b;
        if (!rdVar.i() || !rdVar.n()) {
            return false;
        }
        try {
            return rdVar.m().b().m();
        } catch (Exception unused) {
            return false;
        }
    }

    private final void i(Context context) {
        synchronized (this) {
            try {
                if (f5786b == null) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("cbPrefs", 0);
                    String string = sharedPreferences.getString("ChartboostInstanceId", null);
                    if (string == null || string.length() == 0) {
                        string = UUID.randomUUID().toString();
                        Intrinsics.checkNotNull(sharedPreferences);
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putString("ChartboostInstanceId", string);
                        editorEdit.apply();
                    }
                    f5786b = string;
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final void j(d level) {
        Intrinsics.checkNotNullParameter(level, "level");
        eg.f69748b = level;
    }

    public static final synchronized void k(Context context, String appId, String appSignature, f onStarted) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appSignature, "appSignature");
        Intrinsics.checkNotNullParameter(onStarted, "onStarted");
        if (h()) {
            eg.m("Chartboost startWithAppId skipped due to SDK already being initialized. This method only needs to be called once per app session.", null, 2, null);
            onStarted.a(null);
            return;
        }
        f5785a.f(context);
        h5 h5Var = new h5(context);
        Object objD = h5Var.d();
        h5Var.a();
        if (Result.i(objD)) {
            Throwable thG = Result.g(objD);
            e1.c eVar = thG instanceof e1.c ? (e1.c) thG : null;
            if (eVar == null) {
                eVar = new c.b.e("Precondition check failed.", null);
            }
            eg.j("Chartboost startWithAppId failed due to preconditions not being met. Check the logs for more information.", null, 2, null);
            rd.f70996b.m().c().c(appId, appSignature, onStarted, eVar);
            return;
        }
        j.f70133a.b(context);
        rd rdVar = rd.f70996b;
        if (rdVar.i()) {
            if (!h()) {
                rdVar.c(appId, appSignature);
                yb.f71635a.c(rdVar.d().g(), rdVar.d().j());
            }
            rdVar.b().a();
            db.b(rdVar.m().c(), appId, appSignature, onStarted, null, 8, null);
        } else {
            rdVar.m().c().c(appId, appSignature, onStarted, new c.b.a("Dependency Injection container not initialized.", null));
        }
    }
}
