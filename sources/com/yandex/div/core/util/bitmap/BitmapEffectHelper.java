package com.yandex.div.core.util.bitmap;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.yandex.div.core.util.bitmap.blur.BlurHelper;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"Lcom/yandex/div/core/util/bitmap/BitmapEffectHelper;", "Lcom/yandex/div/core/util/bitmap/blur/BlurHelper;", "()V", "mirrorBitmap", "Landroid/graphics/Bitmap;", "bitmap", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class BitmapEffectHelper implements BlurHelper {
    @NotNull
    public final Bitmap mirrorBitmap(@NotNull Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        bitmapCreateBitmap.setDensity(160);
        return bitmapCreateBitmap;
    }
}
