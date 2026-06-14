package io.bidmachine;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.adjust.sdk.purchase.ADJPConstants;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
abstract class n4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Map f81838a = new ConcurrentHashMap();

    private static o4 a(AssetManager assetManager, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String strF = f(assetManager, str);
            if (TextUtils.isEmpty(strF)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(strF);
            String strOptString = jSONObject.optString("name");
            String strOptString2 = jSONObject.optString("version");
            String strOptString3 = jSONObject.optString("classpath");
            String strOptString4 = jSONObject.optString(ADJPConstants.KEY_SDK_VERSION);
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3) && !TextUtils.isEmpty(strOptString4)) {
                return new o4(strOptString, strOptString2, strOptString3, strOptString4);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private static o4 b(AssetManager assetManager, String str) {
        o4 o4VarA = a(assetManager, str);
        if (o4VarA != null) {
            f81838a.put(o4VarA.c(), o4VarA);
        }
        return o4VarA;
    }

    static void c(Context context) {
        String[] list;
        if (f81838a.isEmpty()) {
            try {
                AssetManager assets = context.getAssets();
                if (assets != null && (list = assets.list("bm_networks")) != null) {
                    for (String str : list) {
                        b(assets, str);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    static o4 d(Context context, String str) {
        Map map = f81838a;
        if (map.containsKey(str)) {
            return (o4) map.get(str);
        }
        try {
            AssetManager assets = context.getAssets();
            if (assets == null) {
                return null;
            }
            return b(assets, str + ".bmnetwork");
        } catch (Exception unused) {
            return null;
        }
    }

    static Map e(Context context) {
        Map map = f81838a;
        if (!map.isEmpty()) {
            return map;
        }
        c(context);
        return map;
    }

    private static String f(AssetManager assetManager, String str) {
        try {
            return io.bidmachine.core.h.j0(assetManager.open("bm_networks/" + str));
        } catch (Throwable th2) {
            io.bidmachine.core.a.p(th2);
            return null;
        }
    }
}
