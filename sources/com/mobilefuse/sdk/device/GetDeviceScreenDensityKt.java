package com.mobilefuse.sdk.device;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.exception.TryKt;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"getDeviceScreenDensity", "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
public final class GetDeviceScreenDensityKt {
    public static final float getDeviceScreenDensity(@NotNull Context context) {
        Either errorResult;
        Object value;
        DisplayMetrics displayMetrics;
        Intrinsics.checkNotNullParameter(context, "context");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            Resources resources = context.getResources();
            errorResult = new SuccessResult(Float.valueOf((resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 1.0f : displayMetrics.density));
        } catch (Throwable th2) {
            if (TryKt.WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            errorResult = new ErrorResult(th2);
        }
        if (errorResult instanceof ErrorResult) {
            value = Float.valueOf(1.0f);
        } else {
            if (!(errorResult instanceof SuccessResult)) {
                throw new m();
            }
            value = ((SuccessResult) errorResult).getValue();
        }
        return ((Number) value).floatValue();
    }
}
