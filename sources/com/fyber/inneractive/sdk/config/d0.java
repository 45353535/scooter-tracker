package com.fyber.inneractive.sdk.config;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IAConfigManager f20341a;

    public d0(IAConfigManager iAConfigManager) {
        this.f20341a = iAConfigManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAConfigManager iAConfigManager = this.f20341a;
        if (iAConfigManager.f20310p == null) {
            iAConfigManager.f20310p = j.a(iAConfigManager.f20300f);
        }
        com.fyber.inneractive.sdk.util.r.f23896b.post(new c0(this));
    }
}
