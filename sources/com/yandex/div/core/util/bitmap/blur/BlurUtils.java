package com.yandex.div.core.util.bitmap.blur;

import android.graphics.Bitmap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/yandex/div/core/util/bitmap/blur/BlurUtils;", "", "()V", "isBlurParamsValid", "", "bitmap", "Landroid/graphics/Bitmap;", "radius", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BlurUtils {

    @NotNull
    public static final BlurUtils INSTANCE = new BlurUtils();

    private BlurUtils() {
    }

    public final boolean isBlurParamsValid(@NotNull Bitmap bitmap, float radius) {
        return !bitmap.isRecycled() && bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && radius > 0.0f;
    }
}
