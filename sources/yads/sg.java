package yads;

import com.appsflyer.BuildConfig;
import io.appmetrica.analytics.AppMetrica;

/* JADX INFO: loaded from: classes4.dex */
public final class sg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f115789c = "Incorrect AppMetrica Integration. The minimum supported version of AppMetrica SDK is 7.13.0 (inclusive) and the maximum supported version is 8.0.0 (exclusive). Please, check your AppMetrica integration.";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f115790d = "Incorrect AppMetrica Version. The minimum supported version of AppMetrica SDK is 7.13.0 (inclusive) and the maximum supported version is 8.0.0 (exclusive). And the current version of AppMetrica SDK is ";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final db3 f115791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xg f115792b;

    public /* synthetic */ sg() {
        this(new db3(), ig.f111989a);
    }

    public final void a() {
        String libraryVersion;
        this.f115792b.getClass();
        try {
            libraryVersion = AppMetrica.getLibraryVersion();
        } catch (Throwable unused) {
            boolean z10 = lb1.f113032a;
            libraryVersion = null;
        }
        if (libraryVersion == null) {
            String str = f115789c;
            throw new fa1(str, str);
        }
        this.f115791a.getClass();
        cb3 cb3VarA = db3.a("7.13.0");
        if (cb3VarA == null) {
            return;
        }
        this.f115791a.getClass();
        cb3 cb3VarA2 = db3.a(BuildConfig.BILLING_LIBRARY_VERSION);
        if (cb3VarA2 == null) {
            return;
        }
        this.f115791a.getClass();
        cb3 cb3VarA3 = db3.a(libraryVersion);
        if (cb3VarA3 == null || cb3VarA3.compareTo(cb3VarA) < 0 || cb3VarA3.compareTo(cb3VarA2) >= 0) {
            String strA = a(libraryVersion);
            throw new fa1(strA, strA);
        }
    }

    public sg(db3 db3Var, xg xgVar) {
        this.f115791a = db3Var;
        this.f115792b = xgVar;
    }

    public static String a(String str) {
        return f115790d + str;
    }
}
