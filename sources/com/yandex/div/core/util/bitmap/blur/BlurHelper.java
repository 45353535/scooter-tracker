package com.yandex.div.core.util.bitmap.blur;

import android.graphics.Bitmap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H&J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u000b\u001a\u00020\fH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/util/bitmap/blur/BlurHelper;", "", "blurBitmap", "Landroid/graphics/Bitmap;", "bitmap", "radius", "", "blurShadow", "coercedRadius", "getBitmapScale", "getCoercedBlurRadius", "release", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface BlurHelper {
    @NotNull
    Bitmap blurBitmap(@NotNull Bitmap bitmap, float radius);

    @NotNull
    Bitmap blurShadow(@NotNull Bitmap bitmap, float coercedRadius);

    float getBitmapScale(float radius);

    float getCoercedBlurRadius(float radius);

    void release();
}
