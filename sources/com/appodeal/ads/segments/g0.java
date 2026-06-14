package com.appodeal.ads.segments;

import android.content.Context;
import android.os.Build;
import com.adjust.sdk.purchase.ADJPConstants;
import com.amazon.device.ads.DTBMetricsConfiguration;
import com.appodeal.ads.j2;
import com.appodeal.ads.jc;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.o6;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.Version;
import com.ironsource.X3;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static g0 f14471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f14472d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ArrayList f14473e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.appodeal.ads.storage.e0 f14474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final HashMap f14475g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f14476a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14477b = false;

    static {
        com.appodeal.ads.storage.e0 e0Var = com.appodeal.ads.storage.e0.f14799b;
        f14474f = e0Var;
        HashMap map = new HashMap();
        f14475g = map;
        map.put("country", new t() { // from class: com.appodeal.ads.segments.v
            @Override // com.appodeal.ads.segments.t
            public final Object a(Context context, g0 g0Var) {
                return g0.a(context, g0Var);
            }
        });
        map.put("app_version", new t() { // from class: com.appodeal.ads.segments.y
            @Override // com.appodeal.ads.segments.t
            public final Object a(Context context, g0 g0Var) {
                return g0.e(context, g0Var);
            }
        });
        map.put("app", new t() { // from class: com.appodeal.ads.segments.z
            @Override // com.appodeal.ads.segments.t
            public final Object a(Context context, g0 g0Var) {
                return g0.g(context, g0Var);
            }
        });
        map.put(ADJPConstants.KEY_SDK_VERSION, new t() { // from class: com.appodeal.ads.segments.a0
            @Override // com.appodeal.ads.segments.t
            public final Object a(Context context, g0 g0Var) {
                return g0.h(context, g0Var);
            }
        });
        map.put(CommonUrlParts.OS_VERSION, new t() { // from class: com.appodeal.ads.segments.b0
            @Override // com.appodeal.ads.segments.t
            public final Object a(Context context, g0 g0Var) {
                return g0.i(context, g0Var);
            }
        });
        map.put("session_count", new t() { // from class: com.appodeal.ads.segments.c0
            @Override // com.appodeal.ads.segments.t
            public final Object a(Context context, g0 g0Var) {
                return g0.j(context, g0Var);
            }
        });
        map.put("average_session_length", new t() { // from class: com.appodeal.ads.segments.d0
            @Override // com.appodeal.ads.segments.t
            public final Object a(Context context, g0 g0Var) {
                return g0.k(context, g0Var);
            }
        });
        map.put("connection_type", new t() { // from class: com.appodeal.ads.segments.e0
            @Override // com.appodeal.ads.segments.t
            public final Object a(Context context, g0 g0Var) {
                return g0.l(context, g0Var);
            }
        });
        map.put("bought_inapps", new t() { // from class: com.appodeal.ads.segments.f0
            @Override // com.appodeal.ads.segments.t
            public final Object a(Context context, g0 g0Var) {
                return g0.m(context, g0Var);
            }
        });
        map.put("inapp_amount", new t() { // from class: com.appodeal.ads.segments.w
            @Override // com.appodeal.ads.segments.t
            public final Object a(Context context, g0 g0Var) {
                return g0.n(context, g0Var);
            }
        });
        map.put(CommonUrlParts.DEVICE_TYPE, new t() { // from class: com.appodeal.ads.segments.x
            @Override // com.appodeal.ads.segments.t
            public final Object a(Context context, g0 g0Var) {
                return g0.f(context, g0Var);
            }
        });
        map.put("session_time", new u());
        map.put("part_of_audience", new n(e0Var));
    }

    public static Object a(Context context, g0 g0Var) {
        return o6.a().f14248d;
    }

    public static void b(String str, Object obj) {
        f14472d.put(str, obj);
        Iterator it = f14473e.iterator();
        while (it.hasNext()) {
            ((s) it.next()).a();
        }
    }

    public static boolean c(Context context, int i10, r[] rVarArr) {
        if (context != null && i10 != 0 && rVarArr != null) {
            int iA = jc.a(i10);
            if (iA != 0) {
                if (iA != 1) {
                    return false;
                }
                if (rVarArr.length != 0) {
                    for (r rVar : rVarArr) {
                        if (!rVar.a(context)) {
                        }
                    }
                    return false;
                }
                return true;
            }
            for (r rVar2 : rVarArr) {
                if (!rVar2.a(context)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static r[] d(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("restrictions");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
            return null;
        }
        r[] rVarArr = new r[jSONArrayOptJSONArray.length()];
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            try {
                rVarArr[i10] = new r(jSONArrayOptJSONArray.optJSONObject(i10));
            } catch (JSONException e10) {
                Log.log(e10);
            }
        }
        return rVarArr;
    }

    public static /* synthetic */ Object e(Context context, g0 g0Var) {
        return new Version(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName);
    }

    public static /* synthetic */ Object f(Context context, g0 g0Var) {
        return j2.C(context) ? "tablet" : "phone";
    }

    public static Object g(Context context, g0 g0Var) {
        return f14474f.f14800a.c();
    }

    public static /* synthetic */ Object h(Context context, g0 g0Var) {
        return new com.appodeal.ads.utils.i(Constants.SDK_VERSION);
    }

    public static /* synthetic */ Object i(Context context, g0 g0Var) {
        return new Version(Build.VERSION.RELEASE);
    }

    public static Object j(Context context, g0 g0Var) {
        com.appodeal.ads.utils.session.f fVarF = com.appodeal.ads.utils.session.r.f15109b.f15110a.f();
        return Integer.valueOf(fVarF == null ? 0 : fVarF.f15073a.f15052a);
    }

    public static Object k(Context context, g0 g0Var) {
        com.appodeal.ads.utils.session.f fVarF = com.appodeal.ads.utils.session.r.f15109b.f15110a.f();
        return Long.valueOf(fVarF == null ? 0L : fVarF.d());
    }

    public static /* synthetic */ Object l(Context context, g0 g0Var) {
        String type = j2.h(context).getType();
        return type != null ? type.equals(DTBMetricsConfiguration.APSMETRICS_LEVEL2_KEY) ? DTBMetricsConfiguration.APSMETRICS_LEVEL2_KEY : type.equals(X3.f42018b) ? X3.f42018b : "other" : "other";
    }

    public static Object m(Context context, g0 g0Var) {
        return Boolean.valueOf(g0Var.f14477b);
    }

    public static Object n(Context context, g0 g0Var) {
        return Float.valueOf(g0Var.f14476a);
    }
}
