package com.mobilefuse.sdk.fullscreen;

import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.mobilefuse.sdk.AdController;
import com.mobilefuse.sdk.MobileFuseFullscreenActivity;
import com.mobilefuse.sdk.StabilityHelper;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BaseContentController {
    protected MobileFuseFullscreenActivity activity;
    protected AdController adController;

    @NonNull
    protected final ContentListener contentListener;

    public interface ContentListener {
        void onAdClicked() throws Throwable;

        void onAdClosed() throws Throwable;

        void onAdError() throws Throwable;
    }

    public BaseContentController(AdController adController, MobileFuseFullscreenActivity mobileFuseFullscreenActivity, final ContentListener contentListener) throws Throwable {
        this.adController = adController;
        this.activity = mobileFuseFullscreenActivity;
        this.contentListener = contentListener;
        adController.setFullscreenAdBridge(new AdController.FullscreenAdBridge() { // from class: com.mobilefuse.sdk.fullscreen.a
            @Override // com.mobilefuse.sdk.AdController.FullscreenAdBridge
            public final void onAdClosed() {
                BaseContentController.a(this.f53372a, contentListener);
            }
        });
    }

    public static /* synthetic */ void a(BaseContentController baseContentController, ContentListener contentListener) {
        baseContentController.getClass();
        try {
            contentListener.onAdClosed();
        } catch (Throwable th2) {
            StabilityHelper.logException(baseContentController, th2);
        }
    }

    public abstract void init(FrameLayout frameLayout) throws Throwable;

    public void onActivityDestroy() throws Throwable {
    }

    public void onActivityPause() throws Throwable {
    }

    public void onActivityResume() throws Throwable {
    }

    public void onActivityStart() throws Throwable {
    }

    public void onActivityStop() throws Throwable {
    }
}
