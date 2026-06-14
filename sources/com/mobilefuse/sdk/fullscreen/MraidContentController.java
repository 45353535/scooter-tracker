package com.mobilefuse.sdk.fullscreen;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.mobilefuse.sdk.AdController;
import com.mobilefuse.sdk.MobileFuseFullscreenActivity;
import com.mobilefuse.sdk.core.R;
import com.mobilefuse.sdk.fullscreen.BaseContentController;

/* JADX INFO: loaded from: classes10.dex */
public class MraidContentController extends BaseContentController {
    private FrameLayout adViewContainer;
    private LinearLayout contentContainer;

    public MraidContentController(AdController adController, MobileFuseFullscreenActivity mobileFuseFullscreenActivity, BaseContentController.ContentListener contentListener) throws Throwable {
        super(adController, mobileFuseFullscreenActivity, contentListener);
    }

    private void closeAd() throws Throwable {
        this.adController.closeFullscreenAd();
    }

    @Override // com.mobilefuse.sdk.fullscreen.BaseContentController
    public void init(FrameLayout frameLayout) throws Throwable {
        this.contentContainer = (LinearLayout) this.activity.getLayoutInflater().inflate(R.layout.mobilefuse_mraid_fullscreen_content, (ViewGroup) null);
        frameLayout.addView(this.contentContainer, new FrameLayout.LayoutParams(-1, -1));
        this.adViewContainer = (FrameLayout) this.contentContainer.findViewById(R.id.adViewContainer);
        View viewShowInlineAd = this.adController.showInlineAd();
        if (viewShowInlineAd == null) {
            this.contentListener.onAdError();
        } else {
            this.adViewContainer.addView(viewShowInlineAd);
        }
    }

    @Override // com.mobilefuse.sdk.fullscreen.BaseContentController
    public void onActivityDestroy() throws Throwable {
        this.adController.onActivityDestroy();
        super.onActivityDestroy();
    }
}
