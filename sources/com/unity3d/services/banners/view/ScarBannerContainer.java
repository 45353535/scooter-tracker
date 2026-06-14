package com.unity3d.services.banners.view;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.misc.Utilities;

/* JADX INFO: loaded from: classes11.dex */
public class ScarBannerContainer extends RelativeLayout {
    private String _bannerAdId;

    public ScarBannerContainer(Context context, String str) {
        super(context);
        this._bannerAdId = str;
    }

    public static /* synthetic */ void a(ScarBannerContainer scarBannerContainer) {
        scarBannerContainer.removeAllViews();
        ViewParent parent = scarBannerContainer.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(scarBannerContainer);
        }
    }

    public void destroy() {
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.banners.view.a
            @Override // java.lang.Runnable
            public final void run() {
                ScarBannerContainer.a(this.f67981b);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        BannerBridge.didAttachScarBanner(this._bannerAdId);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BannerBridge.didDetachScarBanner(this._bannerAdId);
    }
}
