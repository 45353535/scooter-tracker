package com.mbridge.msdk.videocommon.download;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AtomicBoolean f53223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicBoolean f53224b;

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final j f53225a = new j();
    }

    public static j a() {
        return b.f53225a;
    }

    public boolean b(int i10) {
        if (MBridgeConstans.DEBUG) {
            q0.c("RewardVideoRefactorManager", "isRewardVideoRefactor adType: " + i10 + ", key: REWARD_VIDEO_REFACTOR_FOR_LOAD");
        }
        if (i10 != 94 && i10 != 287) {
            return false;
        }
        AtomicBoolean atomicBoolean = this.f53223a;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        try {
            this.f53223a = new AtomicBoolean(s0.a().a("r_v_r_f_l", false));
        } catch (Exception e10) {
            this.f53223a = new AtomicBoolean(false);
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoRefactorManager", "isRewardVideoRefactor error: " + e10.getMessage());
            }
        }
        return this.f53223a.get();
    }

    private j() {
    }

    public boolean a(int i10) {
        if (MBridgeConstans.DEBUG) {
            q0.c("RewardVideoRefactorManager", "isRewardVideoRefactor adType: " + i10 + ", key: REWARD_VIDEO_REFACTOR_FOR_CAMPAIGN_REQUEST");
        }
        if (i10 != 94 && i10 != 287) {
            return false;
        }
        AtomicBoolean atomicBoolean = this.f53224b;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        try {
            this.f53224b = new AtomicBoolean(s0.a().a("r_v_r_f_c_r", false));
        } catch (Exception e10) {
            this.f53224b = new AtomicBoolean(false);
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoRefactorManager", "isRewardVideoRefactor error: " + e10.getMessage());
            }
        }
        return this.f53224b.get();
    }
}
