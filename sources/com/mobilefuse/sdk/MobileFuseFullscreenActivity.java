package com.mobilefuse.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.mobilefuse.sdk.core.R;
import com.mobilefuse.sdk.fullscreen.BaseContentController;
import com.mobilefuse.sdk.fullscreen.MraidContentController;
import com.mobilefuse.sdk.fullscreen.StoryboardContentController;
import com.mobilefuse.sdk.fullscreen.VastContentController;
import com.mobilefuse.sdk.network.model.AdmMediaType;

/* JADX INFO: loaded from: classes10.dex */
public class MobileFuseFullscreenActivity extends Activity {
    private static AdController adController;
    private BaseContentController contentController;
    private FrameLayout mainContainer;
    private boolean userExplicitlyClosedAd = false;

    /* JADX INFO: renamed from: com.mobilefuse.sdk.MobileFuseFullscreenActivity$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$mobilefuse$sdk$network$model$AdmMediaType;

        static {
            int[] iArr = new int[AdmMediaType.values().length];
            $SwitchMap$com$mobilefuse$sdk$network$model$AdmMediaType = iArr;
            try {
                iArr[AdmMediaType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$mobilefuse$sdk$network$model$AdmMediaType[AdmMediaType.BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$mobilefuse$sdk$network$model$AdmMediaType[AdmMediaType.STORYBOARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeActivity() {
        finish();
    }

    private BaseContentController.ContentListener createContentListener() throws Throwable {
        return new BaseContentController.ContentListener() { // from class: com.mobilefuse.sdk.MobileFuseFullscreenActivity.1
            @Override // com.mobilefuse.sdk.fullscreen.BaseContentController.ContentListener
            public void onAdClicked() throws Throwable {
            }

            @Override // com.mobilefuse.sdk.fullscreen.BaseContentController.ContentListener
            public void onAdClosed() throws Throwable {
                MobileFuseFullscreenActivity.this.userExplicitlyClosedAd = true;
                MobileFuseFullscreenActivity.this.closeActivity();
            }

            @Override // com.mobilefuse.sdk.fullscreen.BaseContentController.ContentListener
            public void onAdError() throws Throwable {
                MobileFuseFullscreenActivity.this.closeActivity();
            }
        };
    }

    static void showAd(AdController adController2) throws Throwable {
        adController = adController2;
        Context context = adController2.getContext();
        Intent intent = new Intent(context, (Class<?>) (adController2.isTransparentBackground() ? MobileFuseFullscreenTransparentActivity.class : MobileFuseFullscreenActivity.class));
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mobilefuse_ad_fullscreen);
        try {
            this.mainContainer = (FrameLayout) findViewById(R.id.mainContainer);
            AdController adController2 = adController;
            if (adController2 == null) {
                closeActivity();
                return;
            }
            if (adController2.isDestroyed()) {
                closeActivity();
                return;
            }
            try {
                adController.setRenderingActivity(this);
                int i10 = AnonymousClass2.$SwitchMap$com$mobilefuse$sdk$network$model$AdmMediaType[adController.bidResponse.getType().ordinal()];
                if (i10 == 1) {
                    this.contentController = new VastContentController(adController, this, createContentListener());
                } else if (i10 == 2) {
                    this.contentController = new MraidContentController(adController, this, createContentListener());
                } else if (i10 == 3) {
                    this.contentController = new StoryboardContentController(adController, this, createContentListener());
                }
                this.contentController.init(this.mainContainer);
            } catch (Throwable th2) {
                StabilityHelper.logException(this, th2);
                closeActivity();
            }
        } catch (Throwable th3) {
            StabilityHelper.logException(this, th3);
            closeActivity();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        try {
            AdController adController2 = adController;
            if (!this.userExplicitlyClosedAd && adController2 != null) {
                adController2.closeFullscreenAd();
            }
            BaseContentController baseContentController = this.contentController;
            if (baseContentController != null) {
                baseContentController.onActivityDestroy();
            }
            if (adController2 != null) {
                AdService.disposeFullscreenAdLock(adController2);
            }
            adController = null;
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            BaseContentController baseContentController = this.contentController;
            if (baseContentController != null) {
                baseContentController.onActivityPause();
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        try {
            BaseContentController baseContentController = this.contentController;
            if (baseContentController != null) {
                baseContentController.onActivityResume();
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        try {
            BaseContentController baseContentController = this.contentController;
            if (baseContentController != null) {
                baseContentController.onActivityStart();
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        try {
            BaseContentController baseContentController = this.contentController;
            if (baseContentController != null) {
                baseContentController.onActivityStop();
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }
}
