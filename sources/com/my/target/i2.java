package com.my.target;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.my.target.common.MyTargetConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class i2 extends c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map f59842a;

    public static boolean a(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return !str.matches("^[0]+(-[0]+)+$");
    }

    public final void b(Map map, Context context) {
        gb.a("GoogleAIdDataProvider: Send google AId");
        String id2 = null;
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            id2 = advertisingIdInfo.getId();
            gb.a("GoogleAIdDataProvider: Google AId - " + id2);
            boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
            int i10 = !zIsLimitAdTrackingEnabled ? 1 : 0;
            gb.a("GoogleAIdDataProvider: Ad tracking enabled - " + zIsLimitAdTrackingEnabled);
            map.put("advertising_id", id2);
            map.put("advertising_tracking_enabled", i10 + "");
        } catch (Throwable th2) {
            gb.a("GoogleAIdDataProvider: Failed to send google AId - " + th2.getMessage());
        }
        if (a(id2)) {
            return;
        }
        a(map, context);
    }

    public synchronized Map a(MyTargetConfig myTargetConfig, Context context) {
        if (f0.a()) {
            gb.a("GoogleAIdDataProvider: You must not call collectData method from main thread");
            return new HashMap();
        }
        if (this.f59842a == null) {
            HashMap map = new HashMap();
            this.f59842a = map;
            b(map, context);
        }
        return new HashMap(this.f59842a);
    }

    public final void a(Map map, Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            return;
        }
        String string = Settings.Secure.getString(contentResolver, "android_id");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        map.put("android_id", string);
    }
}
