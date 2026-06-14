package com.mobilefuse.sdk.ad.rendering.splashad;

import android.R;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.ad.rendering.omniad.WindowUtils;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"$\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0018\u0010\u0007\u001a\u00020\u0003*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"closedPosition", "Lcom/mobilefuse/sdk/exception/Either;", "", "Landroid/graphics/Point;", "Lcom/mobilefuse/sdk/ad/rendering/splashad/SplashAdController;", "getClosedPosition", "(Lcom/mobilefuse/sdk/ad/rendering/splashad/SplashAdController;)Lcom/mobilefuse/sdk/exception/Either;", "splashAdTransitionPosition", "getSplashAdTransitionPosition", "(Lcom/mobilefuse/sdk/ad/rendering/splashad/SplashAdController;)Landroid/graphics/Point;", "mobilefuse-sdk-mraid_release"}, k = 2, mv = {1, 4, 3})
public final class SplashAdControllerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Either<Throwable, Point> getClosedPosition(SplashAdController splashAdController) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            Rect windowRect = WindowUtils.getWindowRect(splashAdController.getRenderingActivity());
            Point currentPosition = splashAdController.getOmniAdContainer$mobilefuse_sdk_mraid_release().getCurrentPosition();
            Point currentSize = splashAdController.getOmniAdContainer$mobilefuse_sdk_mraid_release().getCurrentSize();
            return new SuccessResult(currentPosition.x + (currentSize.x / 2) < windowRect.left + (windowRect.width() / 2) ? new Point(-currentSize.x, currentPosition.y) : new Point(windowRect.right, currentPosition.y));
        } catch (Throwable th2) {
            if (SplashAdControllerKt$closedPosition$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            return new ErrorResult(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Point getSplashAdTransitionPosition(SplashAdController splashAdController) {
        Window window = splashAdController.getRenderingActivity().getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "renderingActivity.window");
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "renderingActivity.window.decorView");
        View viewFindViewById = decorView.getRootView().findViewById(R.id.content);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        Rect rect = new Rect();
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        viewGroup.getGlobalVisibleRect(rect, new Point(iArr[0], iArr[1]));
        return new Point((rect.left + (rect.width() / 2)) - (splashAdController.getSizePx().x / 2), (rect.top + rect.height()) - splashAdController.getSizePx().y);
    }
}
