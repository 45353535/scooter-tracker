package com.mobilefuse.sdk.ad.rendering.omniad.thumbnail;

import android.graphics.Point;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.exception.TryKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¨\u0006\u0004"}, d2 = {"getThumbnailInitSize", "Landroid/graphics/Point;", "defaultSize", "admSize", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
public final class GetThumbnailInitSizeKt {
    @NotNull
    public static final Point getThumbnailInitSize(@NotNull Point defaultSize, @NotNull Point admSize) {
        Either errorResult;
        Object value;
        Intrinsics.checkNotNullParameter(defaultSize, "defaultSize");
        Intrinsics.checkNotNullParameter(admSize, "admSize");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
        } catch (Throwable th2) {
            if (TryKt.WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            errorResult = new ErrorResult(th2);
        }
        if (admSize.x > 1 && admSize.y > 1 && !Intrinsics.areEqual(admSize, defaultSize)) {
            int iMax = Math.max(defaultSize.x, defaultSize.y);
            float f10 = admSize.x / admSize.y;
            Point point = new Point();
            if (f10 > 1) {
                point.x = iMax;
                point.y = (int) (iMax / f10);
            } else {
                point.x = (int) (iMax * f10);
                point.y = iMax;
            }
            errorResult = new SuccessResult(point);
            if (errorResult instanceof ErrorResult) {
                value = defaultSize;
            } else {
                if (!(errorResult instanceof SuccessResult)) {
                    throw new m();
                }
                value = ((SuccessResult) errorResult).getValue();
            }
            return (Point) value;
        }
        return defaultSize;
    }
}
