package com.mobilefuse.sdk.ad.rendering.omniad.view;

import android.app.Activity;
import android.util.Log;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.config.ExternalUsageInfo;
import com.mobilefuse.sdk.config.UsageInfoType;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.exception.TryKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"createViewRenderingPixels", "Lcom/mobilefuse/sdk/ad/rendering/omniad/view/ViewRenderingPixels;", "activity", "Landroid/app/Activity;", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
public final class ViewRenderingPixelsKt {
    @Nullable
    public static final ViewRenderingPixels createViewRenderingPixels(@NotNull Activity activity) {
        Either errorResult;
        ViewRenderingPixels viewRenderingPixels;
        Intrinsics.checkNotNullParameter(activity, "activity");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        Object value = null;
        try {
            if (ExternalUsageInfo.INSTANCE.hasUsageInfo(UsageInfoType.MODULE, ExternalUsageInfo.SDK_MODULE_UNITY)) {
                Log.d("OmniAd", "Force rendering with 1x1 pixels.");
                viewRenderingPixels = new ViewRenderingPixels(activity);
                viewRenderingPixels.addPixels();
            } else {
                viewRenderingPixels = null;
            }
            errorResult = new SuccessResult(viewRenderingPixels);
        } catch (Throwable th2) {
            if (TryKt.WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            errorResult = new ErrorResult(th2);
        }
        if (errorResult instanceof ErrorResult) {
        } else {
            if (!(errorResult instanceof SuccessResult)) {
                throw new m();
            }
            value = ((SuccessResult) errorResult).getValue();
        }
        return (ViewRenderingPixels) value;
    }
}
