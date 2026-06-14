package v2;

import android.content.Context;
import com.facebook.d0;
import com.facebook.internal.r;
import com.facebook.internal.z;
import java.util.Iterator;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f105700a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f105701b = MapsKt.hashMapOf(TuplesKt.to(a.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL"), TuplesKt.to(a.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS"));

    public enum a {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS
    }

    private i() {
    }

    public static final JSONObject a(a activityType, com.facebook.internal.a aVar, String str, boolean z10, Context context) throws JSONException {
        Intrinsics.checkNotNullParameter(activityType, "activityType");
        Intrinsics.checkNotNullParameter(context, "context");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", f105701b.get(activityType));
        String strD = com.facebook.appevents.o.f19698b.d();
        if (strD != null) {
            jSONObject.put("app_user_id", strD);
        }
        z.m0(jSONObject, aVar, str, z10, context);
        try {
            z.n0(jSONObject, context);
        } catch (Exception e10) {
            r.f19964e.c(d0.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e10.toString());
        }
        JSONObject jSONObjectA = z.A();
        if (jSONObjectA != null) {
            Iterator<String> itKeys = jSONObjectA.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, jSONObjectA.get(next));
            }
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
