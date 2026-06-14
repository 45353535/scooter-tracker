package com.mbridge.msdk.setting.net;

import android.content.Context;
import com.ironsource.N6;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.net.wrapper.e;
import com.mbridge.msdk.foundation.tools.g;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: loaded from: classes10.dex */
public class d {
    public static void a(Context context, e eVar) {
        if (eVar == null) {
            return;
        }
        try {
            eVar.a(N6.V0, g.d());
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("SettingRequestDiff", e10.getMessage());
            }
        }
    }
}
