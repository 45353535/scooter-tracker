package com.mobilefuse.sdk.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.widget.ImageView;
import com.mobilefuse.sdk.StabilityHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003\u001a\f\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\b\u001a,\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003\u001a,\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003¨\u0006\u0010"}, d2 = {"crop", "Landroid/graphics/Bitmap;", "xPx", "", "yPx", "widthPx", "heightPx", "toBitmap", "Landroid/view/View;", "toCroppedBitmap", "cropXPx", "cropYPx", "cropWidthPx", "cropHeightPx", "toCroppedImageView", "Landroid/widget/ImageView;", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
public final class ViewToBitmapKt {
    @Nullable
    public static final Bitmap crop(@NotNull Bitmap crop, int i10, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(crop, "$this$crop");
        try {
            return Bitmap.createBitmap(crop, i10, i11, i12, i13);
        } catch (Exception e10) {
            StabilityHelper.logException(crop, e10);
            return null;
        }
    }

    @Nullable
    public static final Bitmap toBitmap(@NotNull View toBitmap) {
        Intrinsics.checkNotNullParameter(toBitmap, "$this$toBitmap");
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(toBitmap.getWidth(), toBitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "Bitmap.createBitmap(widt… Bitmap.Config.ARGB_8888)");
            toBitmap.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        } catch (Exception e10) {
            StabilityHelper.logException(toBitmap, e10);
            return null;
        }
    }

    @Nullable
    public static final Bitmap toCroppedBitmap(@NotNull View toCroppedBitmap, int i10, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(toCroppedBitmap, "$this$toCroppedBitmap");
        Bitmap bitmap = toBitmap(toCroppedBitmap);
        if (bitmap != null) {
            return crop(bitmap, i10, i11, i12, i13);
        }
        return null;
    }

    @Nullable
    public static final ImageView toCroppedImageView(@NotNull View toCroppedImageView, int i10, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(toCroppedImageView, "$this$toCroppedImageView");
        Bitmap croppedBitmap = toCroppedBitmap(toCroppedImageView, i10, i11, i12, i13);
        if (croppedBitmap == null) {
            return null;
        }
        ImageView imageView = new ImageView(toCroppedImageView.getContext());
        imageView.setImageBitmap(croppedBitmap);
        return imageView;
    }
}
