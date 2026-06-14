package com.mobilefuse.sdk.fullscreen;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.mobilefuse.sdk.AdController;
import com.mobilefuse.sdk.MobileFuseFullscreenActivity;
import com.mobilefuse.sdk.core.R;
import com.mobilefuse.sdk.fullscreen.BaseContentController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/mobilefuse/sdk/fullscreen/StoryboardContentController;", "Lcom/mobilefuse/sdk/fullscreen/BaseContentController;", "adController", "Lcom/mobilefuse/sdk/AdController;", "activity", "Lcom/mobilefuse/sdk/MobileFuseFullscreenActivity;", "contentListener", "Lcom/mobilefuse/sdk/fullscreen/BaseContentController$ContentListener;", "(Lcom/mobilefuse/sdk/AdController;Lcom/mobilefuse/sdk/MobileFuseFullscreenActivity;Lcom/mobilefuse/sdk/fullscreen/BaseContentController$ContentListener;)V", "adContainer", "Landroid/widget/FrameLayout;", "contentContainer", "Landroid/widget/LinearLayout;", "init", "", "mainContainer", "onActivityDestroy", "onActivityPause", "onActivityResume", "onActivityStart", "onActivityStop", "onError", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final class StoryboardContentController extends BaseContentController {
    private FrameLayout adContainer;
    private LinearLayout contentContainer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryboardContentController(@NotNull AdController adController, @NotNull MobileFuseFullscreenActivity activity, @NotNull BaseContentController.ContentListener contentListener) {
        super(adController, activity, contentListener);
        Intrinsics.checkNotNullParameter(adController, "adController");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(contentListener, "contentListener");
    }

    private final void onError() throws Throwable {
        this.contentListener.onAdError();
    }

    @Override // com.mobilefuse.sdk.fullscreen.BaseContentController
    public void init(@Nullable FrameLayout mainContainer) throws Throwable {
        if (mainContainer == null) {
            onError();
            return;
        }
        MobileFuseFullscreenActivity activity = this.activity;
        Intrinsics.checkNotNullExpressionValue(activity, "activity");
        View viewInflate = activity.getLayoutInflater().inflate(R.layout.mobilefuse_mraid_fullscreen_content, (ViewGroup) null);
        if (viewInflate == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        this.contentContainer = linearLayout;
        FrameLayout frameLayout = (FrameLayout) linearLayout.findViewById(R.id.adViewContainer);
        this.adContainer = frameLayout;
        if (this.contentContainer == null || frameLayout == null) {
            onError();
            return;
        }
        mainContainer.addView(this.contentContainer, new FrameLayout.LayoutParams(-1, -1));
        View viewShowInlineAd = this.adController.showInlineAd();
        if (viewShowInlineAd == null) {
            onError();
            return;
        }
        FrameLayout frameLayout2 = this.adContainer;
        if (frameLayout2 != null) {
            frameLayout2.addView(viewShowInlineAd);
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
