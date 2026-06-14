package com.adjust.sdk;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
class FirstSessionDelayManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivityHandler f7062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f7063b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7064c = 0;

    public FirstSessionDelayManager(ActivityHandler activityHandler) {
        this.f7062a = activityHandler;
    }

    public final void a(Runnable runnable, String str) {
        if (this.f7064c != 3) {
            runnable.run();
            return;
        }
        this.f7062a.getAdjustConfig().getLogger().debug("Enqueuing \"" + str + "\" action to be executed after first session delay ends", new Object[0]);
        this.f7063b.add(runnable);
    }

    public final void a(String str, IRunActivityHandler iRunActivityHandler) {
        if (this.f7064c == 3) {
            this.f7062a.getAdjustConfig().getLogger().debug("Enqueuing \"" + str + "\" action to be executed after first session delay ends", new Object[0]);
            this.f7062a.getAdjustConfig().preLaunchActions.preLaunchActionsArray.add(iRunActivityHandler);
            return;
        }
        iRunActivityHandler.run(this.f7062a);
    }
}
