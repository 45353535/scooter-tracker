package com.mbridge.msdk.reward.adapter;

import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.system.NoProGuard;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class RewardUnitCacheManager implements NoProGuard {
    private static final String TAG = "RewardUnitCacheManager";
    private ConcurrentHashMap<String, com.mbridge.msdk.videocommon.setting.c> rewardUnitSettings;

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final RewardUnitCacheManager f50075a = new RewardUnitCacheManager();
    }

    public static RewardUnitCacheManager getInstance() {
        return b.f50075a;
    }

    public void add(String str, String str2, com.mbridge.msdk.videocommon.setting.c cVar) {
        try {
            String str3 = str + "_" + str2;
            if (cVar != null && this.rewardUnitSettings.containsKey(str3)) {
                this.rewardUnitSettings.remove(str3);
            }
            this.rewardUnitSettings.put(str3, cVar);
        } catch (Exception e10) {
            q0.b(TAG, e10.getMessage());
        }
    }

    public com.mbridge.msdk.videocommon.setting.c get(String str, String str2) {
        try {
            try {
                return this.rewardUnitSettings.remove(str + "_" + str2);
            } catch (Exception e10) {
                q0.b(TAG, e10.getMessage());
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    private RewardUnitCacheManager() {
        this.rewardUnitSettings = new ConcurrentHashMap<>();
    }
}
