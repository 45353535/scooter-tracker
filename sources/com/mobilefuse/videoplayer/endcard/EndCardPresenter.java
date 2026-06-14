package com.mobilefuse.videoplayer.endcard;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.mobilefuse.sdk.CloseConfigResponse;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.videoplayer.endcard.scheduler.EndCardScheduler;
import com.mobilefuse.videoplayer.model.VastCompanion;
import com.mobilefuse.videoplayer.view.ViewCloseTrigger;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\rH\u0000¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\u001b¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u001b¢\u0006\u0004\b%\u0010$R$\u0010\u000e\u001a\u00020\r2\u0006\u0010&\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u00108R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010;R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b?\u0010)R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010C\u001a\u0004\bD\u0010E¨\u0006F"}, d2 = {"Lcom/mobilefuse/videoplayer/endcard/EndCardPresenter;", "", "Landroid/widget/FrameLayout;", "container", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/app/Activity;", "renderingActivity", "Lcom/mobilefuse/videoplayer/endcard/scheduler/EndCardScheduler;", "scheduler", "", "Lcom/mobilefuse/videoplayer/model/VastCompanion;", "companions", "", "fullscreenMode", "allowClickthroughWithoutTap", "Lcom/mobilefuse/sdk/CloseConfigResponse;", "closeConfigResponse", "Lcom/mobilefuse/videoplayer/endcard/EndCardListener;", "endCardListener", "<init>", "(Landroid/widget/FrameLayout;Landroid/content/Context;Landroid/app/Activity;Lcom/mobilefuse/videoplayer/endcard/scheduler/EndCardScheduler;Ljava/util/List;ZZLcom/mobilefuse/sdk/CloseConfigResponse;Lcom/mobilefuse/videoplayer/endcard/EndCardListener;)V", "getNextCompanion", "()Lcom/mobilefuse/videoplayer/model/VastCompanion;", "Lcom/mobilefuse/videoplayer/view/ViewCloseTrigger;", "earlierViewCloseTrigger", "Lkotlin/Function1;", "", "onEndCardRendered", "showNextEndCard", "(Lcom/mobilefuse/videoplayer/view/ViewCloseTrigger;Lkotlin/jvm/functions/Function1;)V", "fullscreen", "onFullscreenChanged$mobilefuse_video_player_release", "(Z)V", "onFullscreenChanged", "destroyCurrentEndCard", "()V", "destroy", "<set-?>", "Z", "getFullscreenMode", "()Z", "Lcom/mobilefuse/videoplayer/endcard/EndCardView;", "currentEndCard", "Lcom/mobilefuse/videoplayer/endcard/EndCardView;", "", "nextCompanionIndex", "I", "Landroid/widget/FrameLayout;", "getContainer", "()Landroid/widget/FrameLayout;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroid/app/Activity;", "getRenderingActivity", "()Landroid/app/Activity;", "Lcom/mobilefuse/videoplayer/endcard/scheduler/EndCardScheduler;", "getScheduler", "()Lcom/mobilefuse/videoplayer/endcard/scheduler/EndCardScheduler;", "Ljava/util/List;", "getCompanions", "()Ljava/util/List;", "getAllowClickthroughWithoutTap", "Lcom/mobilefuse/sdk/CloseConfigResponse;", "getCloseConfigResponse", "()Lcom/mobilefuse/sdk/CloseConfigResponse;", "Lcom/mobilefuse/videoplayer/endcard/EndCardListener;", "getEndCardListener", "()Lcom/mobilefuse/videoplayer/endcard/EndCardListener;", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public final class EndCardPresenter {
    private final boolean allowClickthroughWithoutTap;

    @Nullable
    private final CloseConfigResponse closeConfigResponse;

    @NotNull
    private final List<VastCompanion> companions;

    @NotNull
    private final FrameLayout container;

    @NotNull
    private final Context context;
    private EndCardView currentEndCard;

    @NotNull
    private final EndCardListener endCardListener;
    private boolean fullscreenMode;
    private int nextCompanionIndex;

    @Nullable
    private final Activity renderingActivity;

    @NotNull
    private final EndCardScheduler scheduler;

    public EndCardPresenter(@NotNull FrameLayout container, @NotNull Context context, @Nullable Activity activity, @NotNull EndCardScheduler scheduler, @NotNull List<VastCompanion> companions, boolean z10, boolean z11, @Nullable CloseConfigResponse closeConfigResponse, @NotNull EndCardListener endCardListener) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        Intrinsics.checkNotNullParameter(companions, "companions");
        Intrinsics.checkNotNullParameter(endCardListener, "endCardListener");
        this.container = container;
        this.context = context;
        this.renderingActivity = activity;
        this.scheduler = scheduler;
        this.companions = companions;
        this.allowClickthroughWithoutTap = z11;
        this.closeConfigResponse = closeConfigResponse;
        this.endCardListener = endCardListener;
        this.fullscreenMode = z10;
    }

    private final VastCompanion getNextCompanion() {
        if (this.nextCompanionIndex >= this.companions.size()) {
            return null;
        }
        VastCompanion vastCompanion = this.companions.get(this.nextCompanionIndex);
        this.nextCompanionIndex++;
        return vastCompanion;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showNextEndCard$default(EndCardPresenter endCardPresenter, ViewCloseTrigger viewCloseTrigger, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = new Function1<Boolean, Unit>() { // from class: com.mobilefuse.videoplayer.endcard.EndCardPresenter.showNextEndCard.1
                public final void invoke(boolean z10) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.f93236a;
                }
            };
        }
        endCardPresenter.showNextEndCard(viewCloseTrigger, function1);
    }

    public final void destroy() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            destroyCurrentEndCard();
        } catch (Throwable th2) {
            int i10 = EndCardPresenter$destroy$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    public final void destroyCurrentEndCard() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            EndCardView endCardView = this.currentEndCard;
            if (endCardView == null) {
                return;
            }
            ViewParent viewParent = null;
            this.currentEndCard = null;
            endCardView.destroy();
            ViewParent parent = endCardView.getParent();
            if (parent != null) {
                if (parent instanceof ViewGroup) {
                    viewParent = parent;
                }
                ViewGroup viewGroup = (ViewGroup) viewParent;
                if (viewGroup != null) {
                    viewGroup.removeView(endCardView);
                }
            }
        } catch (Throwable th2) {
            int i10 = EndCardPresenter$destroyCurrentEndCard$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    public final boolean getAllowClickthroughWithoutTap() {
        return this.allowClickthroughWithoutTap;
    }

    @Nullable
    public final CloseConfigResponse getCloseConfigResponse() {
        return this.closeConfigResponse;
    }

    @NotNull
    public final List<VastCompanion> getCompanions() {
        return this.companions;
    }

    @NotNull
    public final FrameLayout getContainer() {
        return this.container;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final EndCardListener getEndCardListener() {
        return this.endCardListener;
    }

    public final boolean getFullscreenMode() {
        return this.fullscreenMode;
    }

    @Nullable
    public final Activity getRenderingActivity() {
        return this.renderingActivity;
    }

    @NotNull
    public final EndCardScheduler getScheduler() {
        return this.scheduler;
    }

    public final void onFullscreenChanged$mobilefuse_video_player_release(boolean fullscreen) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            this.fullscreenMode = fullscreen;
            EndCardView endCardView = this.currentEndCard;
            if (endCardView != null) {
                if (fullscreen) {
                    endCardView.disableAutoClose();
                } else {
                    endCardView.enabledAutoClose();
                }
            }
        } catch (Throwable th2) {
            int i10 = EndCardPresenter$onFullscreenChanged$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void showNextEndCard(@org.jetbrains.annotations.NotNull final com.mobilefuse.videoplayer.view.ViewCloseTrigger r11, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r12) {
        /*
            r10 = this;
            java.lang.String r0 = "earlierViewCloseTrigger"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "onEndCardRendered"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            com.mobilefuse.sdk.exception.ExceptionHandlingStrategy r1 = com.mobilefuse.sdk.exception.ExceptionHandlingStrategy.LogAndIgnore
            r2 = 1
            com.mobilefuse.videoplayer.model.VastCompanion r6 = r10.getNextCompanion()     // Catch: java.lang.Throwable -> L86
            if (r6 != 0) goto L23
            com.mobilefuse.videoplayer.endcard.EndCardListener r11 = r10.endCardListener     // Catch: java.lang.Throwable -> L1e
            r11.onCompleted()     // Catch: java.lang.Throwable -> L1e
            java.lang.Boolean r11 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L1e
            r12.invoke(r11)     // Catch: java.lang.Throwable -> L1e
            return
        L1e:
            r0 = move-exception
            r11 = r0
            r4 = r10
            goto L89
        L23:
            com.mobilefuse.videoplayer.endcard.scheduler.EndCardScheduler r3 = r10.scheduler     // Catch: java.lang.Throwable -> L86
            int r0 = r10.nextCompanionIndex     // Catch: java.lang.Throwable -> L86
            java.util.List<com.mobilefuse.videoplayer.model.VastCompanion> r4 = r10.companions     // Catch: java.lang.Throwable -> L86
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L86
            if (r0 != r4) goto L31
            r7 = r2
            goto L33
        L31:
            r0 = 0
            r7 = r0
        L33:
            boolean r8 = r10.allowClickthroughWithoutTap     // Catch: java.lang.Throwable -> L86
            com.mobilefuse.sdk.CloseConfigResponse r9 = r10.closeConfigResponse     // Catch: java.lang.Throwable -> L86
            r4 = r10
            r5 = r11
            com.mobilefuse.videoplayer.endcard.scheduler.EndCardConfig r11 = r3.getNextEndCardConfig(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L4a
            if (r11 != 0) goto L4d
            com.mobilefuse.videoplayer.endcard.EndCardListener r11 = r4.endCardListener     // Catch: java.lang.Throwable -> L4a
            r11.onCompleted()     // Catch: java.lang.Throwable -> L4a
            java.lang.Boolean r11 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L4a
            r12.invoke(r11)     // Catch: java.lang.Throwable -> L4a
            return
        L4a:
            r0 = move-exception
        L4b:
            r11 = r0
            goto L89
        L4d:
            com.mobilefuse.videoplayer.endcard.EndCardView r0 = new com.mobilefuse.videoplayer.endcard.EndCardView     // Catch: java.lang.Throwable -> L4a
            android.content.Context r3 = r4.context     // Catch: java.lang.Throwable -> L4a
            android.app.Activity r6 = r4.renderingActivity     // Catch: java.lang.Throwable -> L4a
            com.mobilefuse.videoplayer.endcard.EndCardPresenter$showNextEndCard$$inlined$gracefullyHandleException$lambda$1 r7 = new com.mobilefuse.videoplayer.endcard.EndCardPresenter$showNextEndCard$$inlined$gracefullyHandleException$lambda$1     // Catch: java.lang.Throwable -> L4a
            r7.<init>()     // Catch: java.lang.Throwable -> L4a
            r0.<init>(r3, r6, r11, r7)     // Catch: java.lang.Throwable -> L4a
            r4.currentEndCard = r0     // Catch: java.lang.Throwable -> L4a
            kotlin.jvm.functions.Function0 r11 = r11.getAutoCloseAllowed()     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r11 = r11.invoke()     // Catch: java.lang.Throwable -> L4a
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L4a
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L4a
            if (r11 == 0) goto L70
            r0.enabledAutoClose()     // Catch: java.lang.Throwable -> L4a
        L70:
            android.widget.RelativeLayout$LayoutParams r11 = new android.widget.RelativeLayout$LayoutParams     // Catch: java.lang.Throwable -> L4a
            r3 = -1
            r11.<init>(r3, r3)     // Catch: java.lang.Throwable -> L4a
            android.widget.FrameLayout r3 = r4.container     // Catch: java.lang.Throwable -> L4a
            r3.addView(r0, r11)     // Catch: java.lang.Throwable -> L4a
            r0.renderAd(r12)     // Catch: java.lang.Throwable -> L4a
            kotlin.Unit r11 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L4a
            com.mobilefuse.sdk.exception.SuccessResult r0 = new com.mobilefuse.sdk.exception.SuccessResult     // Catch: java.lang.Throwable -> L4a
            r0.<init>(r11)     // Catch: java.lang.Throwable -> L4a
            goto L9e
        L86:
            r0 = move-exception
            r4 = r10
            goto L4b
        L89:
            int[] r0 = com.mobilefuse.videoplayer.endcard.EndCardPresenter$showNextEndCard$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1
            int r1 = r1.ordinal()
            r0 = r0[r1]
            if (r0 == r2) goto L94
            goto L99
        L94:
            java.lang.String r0 = "[Automatically caught]"
            com.mobilefuse.sdk.StabilityHelper.logException(r0, r11)
        L99:
            com.mobilefuse.sdk.exception.ErrorResult r0 = new com.mobilefuse.sdk.exception.ErrorResult
            r0.<init>(r11)
        L9e:
            boolean r11 = r0 instanceof com.mobilefuse.sdk.exception.ErrorResult
            if (r11 == 0) goto Lb7
            com.mobilefuse.sdk.exception.ErrorResult r0 = (com.mobilefuse.sdk.exception.ErrorResult) r0
            java.lang.Object r11 = r0.getValue()
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            com.mobilefuse.videoplayer.endcard.EndCardListener r11 = r4.endCardListener
            com.mobilefuse.videoplayer.model.VastError r0 = com.mobilefuse.videoplayer.model.VastError.UNABLE_TO_DISPLAY_REQUIRED_COMPANION
            r11.onError(r0)
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r12.invoke(r11)
            return
        Lb7:
            boolean r11 = r0 instanceof com.mobilefuse.sdk.exception.SuccessResult
            if (r11 == 0) goto Lc1
            com.mobilefuse.sdk.exception.SuccessResult r0 = (com.mobilefuse.sdk.exception.SuccessResult) r0
            r0.getValue()
            return
        Lc1:
            lf.m r11 = new lf.m
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobilefuse.videoplayer.endcard.EndCardPresenter.showNextEndCard(com.mobilefuse.videoplayer.view.ViewCloseTrigger, kotlin.jvm.functions.Function1):void");
    }

    public /* synthetic */ EndCardPresenter(FrameLayout frameLayout, Context context, Activity activity, EndCardScheduler endCardScheduler, List list, boolean z10, boolean z11, CloseConfigResponse closeConfigResponse, EndCardListener endCardListener, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(frameLayout, context, activity, endCardScheduler, list, z10, (i10 & 64) != 0 ? false : z11, closeConfigResponse, endCardListener);
    }
}
