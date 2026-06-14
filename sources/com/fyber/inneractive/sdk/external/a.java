package com.fyber.inneractive.sdk.external;

import android.content.Context;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements IAConfigManager.OnConfigurationReadyAndValidListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f20602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OnFyberMarketplaceInitializedListener f20603b;

    public a(Context context, OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener) {
        this.f20602a = context;
        this.f20603b = onFyberMarketplaceInitializedListener;
    }

    @Override // com.fyber.inneractive.sdk.config.IAConfigManager.OnConfigurationReadyAndValidListener
    public final void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z10, Exception exc) {
        if (this.f20602a.getApplicationContext() != null) {
            IAConfigManager.removeListener(this);
            InneractiveAdManager.f20573e = null;
            if (z10) {
                InneractiveAdManager.a(this.f20603b, OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY, null);
            } else {
                InneractiveAdManager.a(this.f20603b, exc instanceof InvalidAppIdException ? OnFyberMarketplaceInitializedListener.FyberInitStatus.INVALID_APP_ID : OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED, exc.getLocalizedMessage());
            }
            if (d.f20606a.f20574a == null || !IAConfigManager.d() || d.f20606a.f20577d) {
                return;
            }
            d.f20606a.f20577d = true;
            new w(u.IA_IAB_GDPR_TCF_PURPOSE_1_DISABLED).a((String) null);
        }
    }
}
