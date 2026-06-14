package com.mbridge.msdk.reward.controller;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.directory.e;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f50437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f50438b;

    public c(Context context, String str) {
        this.f50437a = context;
        this.f50438b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListC;
        if (this.f50437a == null || TextUtils.isEmpty(this.f50438b)) {
            return;
        }
        try {
            com.mbridge.msdk.reward.report.a.a(this.f50437a, this.f50438b);
            o0.a();
            o0.a(e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_RES));
            o0.a(e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_HTML));
            com.mbridge.msdk.videocommon.setting.b.b().b(this.f50438b);
            if (s0.a().a("c_d_v_w_i", false) || TextUtils.isEmpty(this.f50438b) || (copyOnWriteArrayListC = com.mbridge.msdk.videocommon.cache.a.a().c(this.f50438b, 1)) == null || copyOnWriteArrayListC.size() <= 0) {
                return;
            }
            com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(this.f50437a, this.f50438b, copyOnWriteArrayListC, 94, (com.mbridge.msdk.videocommon.listener.a) null);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoControllerInitTask", "initRewardVideoController task ", e10);
            }
        }
    }
}
