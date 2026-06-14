package com.amazon.aps.ads.util.adview;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ScrollView;
import com.amazon.aps.ads.Aps;
import com.amazon.aps.ads.util.ApsAdExtensionsKt;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBAdUtil;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/amazon/aps/ads/util/adview/ApsAdViewUtils;", "", "<init>", "()V", y.f66058y, "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ApsAdViewUtils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u000bH\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u000eH\u0007J\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0006\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0007J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0010H\u0007J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0006\u001a\u00020\u000eJ\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000eH\u0007¨\u0006\u0017"}, d2 = {"Lcom/amazon/aps/ads/util/adview/ApsAdViewUtils$Companion;", "", "<init>", "()V", "verifyIsVisible", "", "webView", "Lcom/amazon/aps/ads/util/adview/ApsAdViewBase;", "isAdViewVisible", "", "notifyViewabilityAndSetIsVisible", "Lkotlin/Function2;", "getScrollViewParent", "Landroid/widget/ScrollView;", "Landroid/webkit/WebView;", "computeAdViewRect", "Landroid/graphics/Rect;", "scrollView", "computeExposureInScrollView", "", "adViewRect", "computeRootContainerRectInRootView", "initWebView", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Rect computeAdViewRect(@NotNull WebView webView, @Nullable ScrollView scrollView) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            Activity activity = DTBAdUtil.getActivity(webView);
            if (activity == null) {
                return null;
            }
            View viewFindViewById = activity.findViewById(R.id.content);
            ViewGroup viewGroup = viewFindViewById instanceof ViewGroup ? (ViewGroup) viewFindViewById : null;
            if (viewGroup == null) {
                return null;
            }
            int[] iArr = new int[2];
            viewGroup.getLocationInWindow(iArr);
            int i10 = iArr[0];
            Rect rect = new Rect(i10, iArr[1], viewGroup.getWidth() + i10, iArr[1] + viewGroup.getHeight());
            int[] iArr2 = new int[2];
            webView.getLocationInWindow(iArr2);
            int i11 = iArr2[0];
            Rect rect2 = new Rect(i11, iArr2[1], webView.getWidth() + i11, iArr2[1] + webView.getHeight());
            if (scrollView == null) {
                rect2.intersect(rect);
                return rect2;
            }
            int[] iArr3 = new int[2];
            scrollView.getLocationInWindow(iArr3);
            int i12 = iArr3[0];
            Rect rect3 = new Rect(i12, iArr3[1], scrollView.getWidth() + i12, iArr3[1] + scrollView.getHeight());
            rect3.intersect(rect);
            rect2.intersect(rect3);
            return rect2;
        }

        public final int computeExposureInScrollView(@NotNull WebView webView, @NotNull Rect adViewRect) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            Intrinsics.checkNotNullParameter(adViewRect, "adViewRect");
            float width = webView.getWidth() * webView.getHeight();
            float f10 = (adViewRect.right - adViewRect.left) * (adViewRect.bottom - adViewRect.top);
            if (width == 0.0f) {
                return 0;
            }
            return (int) ((100 * f10) / width);
        }

        @Nullable
        public final Rect computeRootContainerRectInRootView(@NotNull WebView webView) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            Object parent = webView.getParent();
            View view = parent instanceof View ? (View) parent : null;
            Activity activity = view != null ? DTBAdUtil.getActivity(view) : DTBAdUtil.getActivity(webView);
            if (activity == null) {
                return null;
            }
            View viewFindViewById = activity.findViewById(R.id.content);
            ViewGroup viewGroup = viewFindViewById instanceof ViewGroup ? (ViewGroup) viewFindViewById : null;
            if (viewGroup == null) {
                return null;
            }
            int[] iArr = new int[2];
            viewGroup.getLocationInWindow(iArr);
            int i10 = iArr[0];
            return new Rect(i10, iArr[1], viewGroup.getWidth() + i10, iArr[1] + viewGroup.getHeight());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [android.webkit.WebView, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View] */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v7 */
        @Nullable
        public final ScrollView getScrollViewParent(@NotNull WebView webView) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            do {
                ViewParent parent = webView.getParent();
                webView = parent instanceof ViewGroup ? (ViewGroup) parent : 0;
                if (webView == 0) {
                    return null;
                }
            } while (!(webView instanceof ScrollView));
            return (ScrollView) webView;
        }

        @SuppressLint({"SetJavaScriptEnabled"})
        public final void initWebView(@NotNull WebView webView) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            WebSettings settings = webView.getSettings();
            if (settings != null) {
                WebView.setWebContentsDebuggingEnabled(Aps.isTestingMode());
                settings.setJavaScriptEnabled(true);
                settings.setAllowContentAccess(true);
                settings.setDomStorageEnabled(true);
                settings.setCacheMode(-1);
                settings.setAllowFileAccess(false);
                settings.setLoadsImagesAutomatically(true);
                settings.setMediaPlaybackRequiresUserGesture(false);
                settings.setBlockNetworkImage(false);
            }
        }

        public final void verifyIsVisible(@NotNull ApsAdViewBase webView, boolean isAdViewVisible, @NotNull Function2<? super Boolean, ? super Boolean, Unit> notifyViewabilityAndSetIsVisible) {
            ViewGroup viewGroup;
            Intrinsics.checkNotNullParameter(webView, "webView");
            Intrinsics.checkNotNullParameter(notifyViewabilityAndSetIsVisible, "notifyViewabilityAndSetIsVisible");
            if (webView.getParent() == null || webView.getVisibility() != 0) {
                Boolean bool = Boolean.FALSE;
                notifyViewabilityAndSetIsVisible.invoke(bool, bool);
                return;
            }
            Activity currentActivity = AdRegistration.getCurrentActivity();
            if (currentActivity == null) {
                Boolean bool2 = Boolean.FALSE;
                notifyViewabilityAndSetIsVisible.invoke(bool2, bool2);
                return;
            }
            try {
                viewGroup = (ViewGroup) currentActivity.findViewById(R.id.content);
            } catch (RuntimeException e10) {
                ApsAdExtensionsKt.logEvent(this, APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to get content view", e10);
                viewGroup = null;
            }
            if (viewGroup == null) {
                Boolean bool3 = Boolean.FALSE;
                notifyViewabilityAndSetIsVisible.invoke(bool3, bool3);
                return;
            }
            int[] iArr = new int[2];
            viewGroup.getLocationInWindow(iArr);
            int i10 = iArr[0];
            Rect rect = new Rect(i10, iArr[1], viewGroup.getWidth() + i10, iArr[1] + viewGroup.getHeight());
            int[] iArr2 = new int[2];
            webView.getLocationInWindow(iArr2);
            int i11 = iArr2[0];
            Rect rect2 = new Rect(i11, iArr2[1], webView.getWidth() + i11, iArr2[1] + webView.getHeight());
            if (!rect.contains(rect2) && !Rect.intersects(rect, rect2)) {
                Boolean bool4 = Boolean.FALSE;
                notifyViewabilityAndSetIsVisible.invoke(bool4, bool4);
                return;
            }
            ScrollView scrollViewParent = webView.getScrollViewParent();
            if (scrollViewParent == null) {
                notifyViewabilityAndSetIsVisible.invoke(Boolean.TRUE, Boolean.valueOf(!isAdViewVisible));
                return;
            }
            int[] iArr3 = new int[2];
            scrollViewParent.getLocationInWindow(iArr3);
            int i12 = iArr3[0];
            Rect rect3 = new Rect(i12, iArr3[1], scrollViewParent.getWidth() + i12, iArr3[1] + scrollViewParent.getHeight());
            if (!Rect.intersects(rect2, rect3)) {
                notifyViewabilityAndSetIsVisible.invoke(Boolean.FALSE, Boolean.TRUE);
                ApsAdExtensionsKt.d(this, "SET MRAID Visible false because of scroll ");
            } else {
                if (!Rect.intersects(rect2, rect3) || isAdViewVisible) {
                    return;
                }
                notifyViewabilityAndSetIsVisible.invoke(Boolean.TRUE, Boolean.valueOf(!isAdViewVisible));
                ApsAdExtensionsKt.d(this, "SET MRAID Visible true because of scroll ");
            }
        }

        private Companion() {
        }
    }

    private ApsAdViewUtils() {
    }

    @Nullable
    public static final Rect computeAdViewRect(@NotNull WebView webView, @Nullable ScrollView scrollView) {
        return INSTANCE.computeAdViewRect(webView, scrollView);
    }

    public static final int computeExposureInScrollView(@NotNull WebView webView, @NotNull Rect rect) {
        return INSTANCE.computeExposureInScrollView(webView, rect);
    }

    @Nullable
    public static final ScrollView getScrollViewParent(@NotNull WebView webView) {
        return INSTANCE.getScrollViewParent(webView);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public static final void initWebView(@NotNull WebView webView) {
        INSTANCE.initWebView(webView);
    }

    public static final void verifyIsVisible(@NotNull ApsAdViewBase apsAdViewBase, boolean z10, @NotNull Function2<? super Boolean, ? super Boolean, Unit> function2) {
        INSTANCE.verifyIsVisible(apsAdViewBase, z10, function2);
    }
}
