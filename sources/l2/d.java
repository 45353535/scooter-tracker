package l2;

import android.content.SharedPreferences;
import com.facebook.GraphRequest;
import com.facebook.a0;
import com.facebook.b0;
import com.facebook.d0;
import com.facebook.internal.r;
import com.facebook.internal.z;
import com.facebook.s;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f93896a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f93897b = d.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f93898c;

    private d() {
    }

    public static final void b() {
        try {
            GraphRequest graphRequest = new GraphRequest(null, s.n() + "/cloudbridge_settings", null, b0.GET, new GraphRequest.b() { // from class: l2.c
                @Override // com.facebook.GraphRequest.b
                public final void a(a0 a0Var) {
                    d.c(a0Var);
                }
            }, null, 32, null);
            r.a aVar = r.f19964e;
            d0 d0Var = d0.APP_EVENTS;
            String str = f93897b;
            Intrinsics.checkNotNull(str, "null cannot be cast to non-null type kotlin.String");
            aVar.c(d0Var, str, " \n\nCreating Graph Request: \n=============\n%s\n\n ", graphRequest);
            graphRequest.l();
        } catch (JSONException e10) {
            r.a aVar2 = r.f19964e;
            d0 d0Var2 = d0.APP_EVENTS;
            String str2 = f93897b;
            Intrinsics.checkNotNull(str2, "null cannot be cast to non-null type kotlin.String");
            aVar2.c(d0Var2, str2, " \n\nGraph Request Exception: \n=============\n%s\n\n ", lf.c.b(e10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(a0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        f93896a.d(response);
    }

    public static final Map e() {
        if (e3.a.d(d.class)) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = s.m().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
            if (sharedPreferences == null) {
                return null;
            }
            o oVar = o.DATASETID;
            String string = sharedPreferences.getString(oVar.g(), null);
            o oVar2 = o.URL;
            String string2 = sharedPreferences.getString(oVar2.g(), null);
            o oVar3 = o.ACCESSKEY;
            String string3 = sharedPreferences.getString(oVar3.g(), null);
            if (string != null && !StringsKt.y0(string) && string2 != null && !StringsKt.y0(string2) && string3 != null && !StringsKt.y0(string3)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(oVar2.g(), string2);
                linkedHashMap.put(oVar.g(), string);
                linkedHashMap.put(oVar3.g(), string3);
                r.f19964e.c(d0.APP_EVENTS, f93897b.toString(), " \n\nLoading Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", string, string2, string3);
                return linkedHashMap;
            }
            return null;
        } catch (Throwable th2) {
            e3.a.b(th2, d.class);
            return null;
        }
    }

    public final void d(a0 response) {
        Object obj;
        boolean zBooleanValue = false;
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.b() != null) {
            r.a aVar = r.f19964e;
            d0 d0Var = d0.APP_EVENTS;
            String str = f93897b;
            Intrinsics.checkNotNull(str, "null cannot be cast to non-null type kotlin.String");
            aVar.c(d0Var, str, " \n\nGraph Response Error: \n================\nResponse Error: %s\nResponse Error Exception: %s\n\n ", response.b().toString(), String.valueOf(response.b().getException()));
            Map mapE = e();
            if (mapE != null) {
                URL url = new URL(String.valueOf(mapE.get(o.URL.g())));
                g.d(String.valueOf(mapE.get(o.DATASETID.g())), url.getProtocol() + "://" + url.getHost(), String.valueOf(mapE.get(o.ACCESSKEY.g())));
                f93898c = true;
                return;
            }
            return;
        }
        r.a aVar2 = r.f19964e;
        d0 d0Var2 = d0.APP_EVENTS;
        String TAG = f93897b;
        Intrinsics.checkNotNull(TAG, "null cannot be cast to non-null type kotlin.String");
        aVar2.c(d0Var2, TAG, " \n\nGraph Response Received: \n================\n%s\n\n ", response);
        JSONObject jSONObjectC = response.c();
        if (jSONObjectC != null) {
            try {
                obj = jSONObjectC.get("data");
            } catch (NullPointerException e10) {
                r.a aVar3 = r.f19964e;
                d0 d0Var3 = d0.APP_EVENTS;
                String TAG2 = f93897b;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                aVar3.c(d0Var3, TAG2, "CloudBridge Settings API response is not a valid json: \n%s ", lf.c.b(e10));
                return;
            } catch (JSONException e11) {
                r.a aVar4 = r.f19964e;
                d0 d0Var4 = d0.APP_EVENTS;
                String TAG3 = f93897b;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                aVar4.c(d0Var4, TAG3, "CloudBridge Settings API response is not a valid json: \n%s ", lf.c.b(e11));
                return;
            }
        } else {
            obj = null;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONArray");
        Map mapN = z.n(new JSONObject((String) CollectionsKt.firstOrNull(z.m((JSONArray) obj))));
        String str2 = (String) mapN.get(o.URL.g());
        String str3 = (String) mapN.get(o.DATASETID.g());
        String str4 = (String) mapN.get(o.ACCESSKEY.g());
        if (str2 == null || str3 == null || str4 == null) {
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            aVar2.b(d0Var2, TAG, "CloudBridge Settings API response doesn't have valid data");
            return;
        }
        try {
            g.d(str3, str2, str4);
            g(mapN);
            o oVar = o.ENABLED;
            if (mapN.get(oVar.g()) != null) {
                Object obj2 = mapN.get(oVar.g());
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                zBooleanValue = ((Boolean) obj2).booleanValue();
            }
            f93898c = zBooleanValue;
        } catch (MalformedURLException e12) {
            r.a aVar5 = r.f19964e;
            d0 d0Var5 = d0.APP_EVENTS;
            String TAG4 = f93897b;
            Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            aVar5.c(d0Var5, TAG4, "CloudBridge Settings API response doesn't have valid url\n %s ", lf.c.b(e12));
        }
    }

    public final boolean f() {
        return f93898c;
    }

    public final void g(Map map) {
        SharedPreferences sharedPreferences = s.m().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
        if (sharedPreferences == null) {
            return;
        }
        if (map == null) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.clear();
            editorEdit.apply();
            return;
        }
        o oVar = o.DATASETID;
        Object obj = map.get(oVar.g());
        o oVar2 = o.URL;
        Object obj2 = map.get(oVar2.g());
        o oVar3 = o.ACCESSKEY;
        Object obj3 = map.get(oVar3.g());
        if (obj == null || obj2 == null || obj3 == null) {
            return;
        }
        SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
        editorEdit2.putString(oVar.g(), obj.toString());
        editorEdit2.putString(oVar2.g(), obj2.toString());
        editorEdit2.putString(oVar3.g(), obj3.toString());
        editorEdit2.apply();
        r.f19964e.c(d0.APP_EVENTS, f93897b.toString(), " \n\nSaving Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", obj, obj2, obj3);
    }
}
