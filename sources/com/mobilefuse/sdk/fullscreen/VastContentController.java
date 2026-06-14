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
public class VastContentController extends BaseContentController {
    private FrameLayout adContainer;
    private LinearLayout contentContainer;

    public VastContentController(AdController adController, MobileFuseFullscreenActivity mobileFuseFullscreenActivity, BaseContentController.ContentListener contentListener) throws Throwable {
        super(adController, mobileFuseFullscreenActivity, contentListener);
    }

    @Override // com.mobilefuse.sdk.fullscreen.BaseContentController
    public void init(FrameLayout frameLayout) throws Throwable {
        this.contentContainer = (LinearLayout) this.activity.getLayoutInflater().inflate(R.layout.mobilefuse_vast_fullscreen_content, (ViewGroup) null);
        frameLayout.addView(this.contentContainer, new FrameLayout.LayoutParams(-1, -1));
        this.adContainer = (FrameLayout) this.contentContainer.findViewById(R.id.adContainer);
        View viewShowInlineAd = this.adController.showInlineAd();
        if (viewShowInlineAd == null) {
            this.contentListener.onAdError();
        } else {
            this.adContainer.addView(viewShowInlineAd);
        }
    }

    @Override // com.mobilefuse.sdk.fullscreen.BaseContentController
    public void onActivityDestroy() throws Throwable {
        this.adController.onActivityDestroy();
        super.onActivityDestroy();
    }

    @Override // com.mobilefuse.sdk.fullscreen.BaseContentController
    public void onActivityPause() throws Throwable {
        this.adController.onActivityPause();
        super.onActivityPause();
    }

    @Override // com.mobilefuse.sdk.fullscreen.BaseContentController
    public void onActivityResume() throws Throwable {
        this.adController.onActivityResume();
        super.onActivityResume();
    }

    @Override // com.mobilefuse.sdk.fullscreen.BaseContentController
    public void onActivityStart() throws Throwable {
        this.adController.onActivityStart();
        super.onActivityStart();
    }

    @Override // com.mobilefuse.sdk.fullscreen.BaseContentController
    public void onActivityStop() throws Throwable {
        this.adController.onActivityStop();
        super.onActivityStop();
    }
}
