package com.my.target;

import android.app.UiModeManager;
import android.content.Context;
import com.my.target.common.MyTargetConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class s0 extends c2 {
    public static boolean a(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 3;
    }

    public Map a(MyTargetConfig myTargetConfig, Context context) {
        HashMap map = new HashMap();
        if (a(context)) {
            map.put("isc", "1");
        }
        return map;
    }
}
