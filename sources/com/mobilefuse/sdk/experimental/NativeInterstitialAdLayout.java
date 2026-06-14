package com.mobilefuse.sdk.experimental;

import android.content.Context;
import android.view.View;
import com.ironsource.C4424m2;
import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.MobileFuseNativeAd;
import com.mobilefuse.sdk.StabilityHelper;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/mobilefuse/sdk/experimental/NativeInterstitialAdLayout;", "", "nativeAd", "Lcom/mobilefuse/sdk/MobileFuseNativeAd;", "rootView", "Landroid/view/View;", "(Lcom/mobilefuse/sdk/MobileFuseNativeAd;Landroid/view/View;)V", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "getNativeAd", "()Lcom/mobilefuse/sdk/MobileFuseNativeAd;", "getRootView", "()Landroid/view/View;", y.f66058y, "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final class NativeInterstitialAdLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static WeakReference<MobileFuseNativeAd> currentNativeAd;

    @NotNull
    private final Context context;

    @NotNull
    private final MobileFuseNativeAd nativeAd;

    @NotNull
    private final View rootView;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rJ\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0005H\u0007R4\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/mobilefuse/sdk/experimental/NativeInterstitialAdLayout$Companion;", "", "()V", "<set-?>", "Ljava/lang/ref/WeakReference;", "Lcom/mobilefuse/sdk/MobileFuseNativeAd;", "currentNativeAd", "getCurrentNativeAd", "()Ljava/lang/ref/WeakReference;", "setCurrentNativeAd", "(Ljava/lang/ref/WeakReference;)V", "releaseCurrentNativeAd", "", "releaseCurrentNativeAd$mobilefuse_sdk_core_release", C4424m2.f43623v, "nativeAd", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        private Companion() {
        }

        private final void setCurrentNativeAd(WeakReference<MobileFuseNativeAd> weakReference) {
            NativeInterstitialAdLayout.currentNativeAd = weakReference;
        }

        @Nullable
        public final WeakReference<MobileFuseNativeAd> getCurrentNativeAd() {
            return NativeInterstitialAdLayout.currentNativeAd;
        }

        public final void releaseCurrentNativeAd$mobilefuse_sdk_core_release() {
            MobileFuseNativeAd mobileFuseNativeAd;
            try {
                WeakReference<MobileFuseNativeAd> currentNativeAd = getCurrentNativeAd();
                if (currentNativeAd != null && (mobileFuseNativeAd = currentNativeAd.get()) != null) {
                    mobileFuseNativeAd.unregisterViews();
                }
            } catch (Throwable th2) {
                StabilityHelper.logException(this, th2);
            }
            setCurrentNativeAd(null);
        }

        public final void show(@NotNull MobileFuseNativeAd nativeAd) {
            Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("called \"NativeInterstitialAdLayout.show()\" in thread: ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb2.append(threadCurrentThread.getName());
            DebuggingKt.logDebug$default(this, sb2.toString(), null, 2, null);
            if (!NativeInterstitialAdHelpersKt.canShow(this)) {
                DebuggingKt.logError$default(this, "Can't show NativeInterstitialAdLayout due it's already displaying.", null, 2, null);
            } else {
                setCurrentNativeAd(new WeakReference<>(nativeAd));
                NativeInterstitialAdHelpersKt.startNativeInterstitialActivity(nativeAd.getContext());
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public NativeInterstitialAdLayout(@NotNull MobileFuseNativeAd nativeAd, @NotNull View rootView) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        this.nativeAd = nativeAd;
        this.rootView = rootView;
        Context applicationContext = nativeAd.getContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "nativeAd.context.applicationContext");
        this.context = applicationContext;
    }

    public static final void show(@NotNull MobileFuseNativeAd mobileFuseNativeAd) {
        INSTANCE.show(mobileFuseNativeAd);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final MobileFuseNativeAd getNativeAd() {
        return this.nativeAd;
    }

    @NotNull
    public final View getRootView() {
        return this.rootView;
    }
}
