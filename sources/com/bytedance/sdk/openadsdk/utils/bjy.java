package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.fs;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class bjy implements com.bytedance.sdk.openadsdk.oem.qdl {
    private static boolean lnr;
    private static final bjy qdl = new bjy();

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static com.bytedance.sdk.openadsdk.component.reward.qdl.qdl f17844ud;

    public static void qdl(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        com.bytedance.sdk.openadsdk.core.model.koa koaVarGjm = qdlVar.f17090ud.gjm();
        if (koaVarGjm == null || !koaVarGjm.wd()) {
            return;
        }
        f17844ud = qdlVar;
        IPMiBroadcastReceiver iPMiBroadcastReceiverQdl = IPMiBroadcastReceiver.qdl(qdlVar.om);
        if (iPMiBroadcastReceiverQdl != null) {
            iPMiBroadcastReceiverQdl.qdl(qdl);
        }
    }

    public static void ud() {
        lnr = true;
    }

    public static void qdl() {
        if (f17844ud == null) {
            return;
        }
        f17844ud = null;
        IPMiBroadcastReceiver iPMiBroadcastReceiverQdl = IPMiBroadcastReceiver.qdl(com.bytedance.sdk.openadsdk.core.yt.qdl());
        if (iPMiBroadcastReceiverQdl != null) {
            iPMiBroadcastReceiverQdl.qdl();
        }
        lnr = false;
    }

    @Override // com.bytedance.sdk.openadsdk.oem.qdl
    public void qdl(String str, final int i10) {
        com.bytedance.sdk.openadsdk.core.model.mo moVarFhs;
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = f17844ud;
        if (qdlVar == null || (moVarFhs = qdlVar.f17090ud.fhs()) == null) {
            return;
        }
        String strLnr = moVarFhs.lnr();
        if (TextUtils.isEmpty(strLnr) || !strLnr.equals(str)) {
            return;
        }
        fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.bjy.1
            @Override // java.lang.Runnable
            public void run() {
                int i11;
                if (bjy.f17844ud == null || (i11 = i10) <= 0 || i11 > 5) {
                    return;
                }
                boolean z10 = true;
                boolean z11 = i11 == 1;
                if (bjy.lnr) {
                    bjy.f17844ud.f17091wc.car();
                    HashMap map = new HashMap();
                    map.put("click_scence", 4);
                    com.bytedance.sdk.openadsdk.mml.lnr.qdl("click", bjy.f17844ud.f17090ud, new fs.qdl().qdl(), bjy.f17844ud.mzz, true, (Map<String, Object>) map, 1);
                } else {
                    z10 = z11;
                }
                if (z10) {
                    bjy.qdl();
                }
            }
        });
    }
}
