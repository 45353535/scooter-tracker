package com.mobilefuse.sdk.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0006\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0006\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0007"}, d2 = {"dpToPx", "Landroid/graphics/Point;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "", "", "pxToDp", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
public final class DimConversionsKt {
    public static final int dpToPx(float f10, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        return (int) (f10 * resources.getDisplayMetrics().density);
    }

    public static final float pxToDp(int i10, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        return i10 / resources.getDisplayMetrics().density;
    }

    public static final int dpToPx(int i10, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return dpToPx(i10, context);
    }

    public static final float pxToDp(float f10, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return pxToDp((int) f10, context);
    }

    @NotNull
    public static final Point dpToPx(@NotNull Point dpToPx, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(dpToPx, "$this$dpToPx");
        Intrinsics.checkNotNullParameter(context, "context");
        return new Point(dpToPx(dpToPx.x, context), dpToPx(dpToPx.y, context));
    }
}
