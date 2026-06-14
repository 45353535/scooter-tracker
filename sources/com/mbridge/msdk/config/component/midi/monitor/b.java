package com.mbridge.msdk.config.component.midi.monitor;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: loaded from: classes10.dex */
public class b {
    public void a(String str, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        try {
            new com.mbridge.msdk.config.component.common.kit.a().a(str, aVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("OMSDKPlayerMonitor", e10.getMessage(), e10);
            }
        }
    }
}
