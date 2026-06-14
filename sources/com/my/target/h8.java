package com.my.target;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.my.target.common.MyTargetConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class h8 extends c2 {
    public synchronized Map a(MyTargetConfig myTargetConfig, Context context) {
        HashMap map = new HashMap();
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                map.put("connection", activeNetworkInfo.getTypeName());
                a(map, activeNetworkInfo);
                return map;
            }
        } catch (Throwable unused) {
            gb.a("NetworkInfoDataProvider: No permissions for access to network state");
        }
        return map;
    }

    public final void a(Map map, NetworkInfo networkInfo) {
        if (networkInfo.getType() == 0) {
            map.put("connection_type", networkInfo.getSubtypeName() != null ? networkInfo.getSubtypeName() : "");
        } else {
            map.put("connection_type", networkInfo.getTypeName() != null ? networkInfo.getTypeName() : "");
        }
    }
}
