package yads;

import com.amazon.device.ads.DTBMetricsConfiguration;
import kotlin.Result;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class s7 {
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static yads.d8 a(org.json.JSONObject r19) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.s7.a(org.json.JSONObject):yads.d8");
    }

    public static String a(d8 d8Var) {
        if (d8Var == null) {
            return null;
        }
        kotlinx.serialization.json.c0 c0Var = new kotlinx.serialization.json.c0();
        kotlinx.serialization.json.i.b(c0Var, "isEnabled", Boolean.valueOf(d8Var.f109822a));
        kotlinx.serialization.json.i.b(c0Var, "isInDebug", Boolean.valueOf(d8Var.f109823b));
        kotlinx.serialization.json.i.d(c0Var, DTBMetricsConfiguration.APSMETRICS_APIKEY, d8Var.f109824c);
        kotlinx.serialization.json.i.c(c0Var, "validationTimeoutInSec", Long.valueOf(d8Var.f109825d));
        kotlinx.serialization.json.i.c(c0Var, "usagePercent", Integer.valueOf(d8Var.f109826e));
        kotlinx.serialization.json.i.b(c0Var, "willBlockAdOnInternalError", Boolean.valueOf(d8Var.f109827f));
        kotlinx.serialization.json.i.e(c0Var, "enabledAdUnits", new p7(d8Var));
        kotlinx.serialization.json.i.f(c0Var, "adNetworksCustomParameters", new r7(d8Var));
        return c0Var.a().toString();
    }

    public static d8 a(String str) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            objB = Result.b(a(new JSONObject(str)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        if (Result.g(objB) != null) {
            boolean z10 = lb1.f113032a;
        }
        if (Result.i(objB)) {
            objB = null;
        }
        return (d8) objB;
    }
}
