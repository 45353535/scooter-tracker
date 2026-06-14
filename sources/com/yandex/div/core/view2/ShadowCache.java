package com.yandex.div.core.view2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.drawable.shapes.RoundRectShape;
import com.yandex.div.core.util.bitmap.BitmapEffectHelper;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001$B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\u0012\u001a\u00020\u0011*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\n*\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\fR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\n0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/yandex/div/core/view2/ShadowCache;", "", "<init>", "()V", "", "radii", "", "blur", "Lcom/yandex/div/core/util/bitmap/BitmapEffectHelper;", "effectHelper", "Landroid/graphics/NinePatch;", "createNewShadow", "([FFLcom/yandex/div/core/util/bitmap/BitmapEffectHelper;)Landroid/graphics/NinePatch;", "Landroid/graphics/Bitmap;", "rectWidth", "rectHeight", "scale", "", "drawNewShadow", "(Landroid/graphics/Bitmap;FF[FFF)V", "toNinePatch", "(Landroid/graphics/Bitmap;)Landroid/graphics/NinePatch;", "", "width", "height", "", "createNinePatchChunk", "(II)[B", "getShadow", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "", "Lcom/yandex/div/core/view2/ShadowCache$ShadowCacheKey;", "shadowMap", "Ljava/util/Map;", "ShadowCacheKey", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ShadowCache {

    @NotNull
    public static final ShadowCache INSTANCE = new ShadowCache();

    @NotNull
    private static final Paint paint = new Paint();

    @NotNull
    private static final Map<ShadowCacheKey, NinePatch> shadowMap = new LinkedHashMap();

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/div/core/view2/ShadowCache$ShadowCacheKey;", "", "", "radii", "", "blur", "<init>", "([FF)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "[F", "getRadii", "()[F", "F", "getBlur", "()F", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ShadowCacheKey {
        private final float blur;

        @NotNull
        private final float[] radii;

        public ShadowCacheKey(@NotNull float[] fArr, float f10) {
            this.radii = fArr;
            this.blur = f10;
        }

        public boolean equals(@Nullable Object other) {
            if (!(other instanceof ShadowCacheKey)) {
                return false;
            }
            ShadowCacheKey shadowCacheKey = (ShadowCacheKey) other;
            return this.blur == shadowCacheKey.blur && Arrays.equals(this.radii, shadowCacheKey.radii);
        }

        public int hashCode() {
            return (Arrays.hashCode(this.radii) * 31) + Float.floatToIntBits(this.blur);
        }
    }

    private ShadowCache() {
    }

    private final NinePatch createNewShadow(float[] radii, float blur, BitmapEffectHelper effectHelper) {
        float fMax = blur + Math.max(radii[1] + radii[2], radii[5] + radii[6]);
        float fMax2 = blur + Math.max(radii[0] + radii[7], radii[3] + radii[4]);
        if (fMax <= 0.0f || fMax2 <= 0.0f) {
            return null;
        }
        float coercedBlurRadius = effectHelper.getCoercedBlurRadius(blur);
        float bitmapScale = effectHelper.getBitmapScale(blur);
        float f10 = blur * 2;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) ((fMax + f10) * bitmapScale), (int) ((f10 + fMax2) * bitmapScale), Bitmap.Config.ALPHA_8);
        drawNewShadow(bitmapCreateBitmap, fMax, fMax2, radii, coercedBlurRadius, bitmapScale);
        Bitmap bitmapBlurShadow = effectHelper.blurShadow(bitmapCreateBitmap, coercedBlurRadius);
        bitmapCreateBitmap.recycle();
        if (bitmapScale < 1.0f) {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapBlurShadow, (int) (bitmapBlurShadow.getWidth() / bitmapScale), (int) (bitmapBlurShadow.getHeight() / bitmapScale), true);
            bitmapBlurShadow.recycle();
            bitmapBlurShadow = bitmapCreateScaledBitmap;
        }
        return toNinePatch(bitmapBlurShadow);
    }

    private final byte[] createNinePatchChunk(int width, int height) {
        int i10 = height / 2;
        int i11 = width / 2;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
        byteBufferOrder.put((byte) 1);
        byteBufferOrder.put((byte) 2);
        byteBufferOrder.put((byte) 2);
        byteBufferOrder.put((byte) 9);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(i11 - 1);
        byteBufferOrder.putInt(i11 + 1);
        byteBufferOrder.putInt(i10 - 1);
        byteBufferOrder.putInt(i10 + 1);
        for (int i12 = 0; i12 < 9; i12++) {
            byteBufferOrder.putInt(1);
        }
        return byteBufferOrder.array();
    }

    private final void drawNewShadow(Bitmap bitmap, float f10, float f11, float[] fArr, float f12, float f13) {
        RoundRectShape roundRectShape = new RoundRectShape(fArr, null, null);
        roundRectShape.resize(f10, f11);
        Canvas canvas = new Canvas();
        canvas.setBitmap(bitmap);
        int iSave = canvas.save();
        canvas.translate(f12, f12);
        try {
            iSave = canvas.save();
            canvas.scale(f13, f13, 0.0f, 0.0f);
            roundRectShape.draw(canvas, paint);
            canvas.restoreToCount(iSave);
        } catch (Throwable th2) {
            throw th2;
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    private final NinePatch toNinePatch(Bitmap bitmap) {
        return new NinePatch(bitmap, createNinePatchChunk(bitmap.getWidth(), bitmap.getHeight()));
    }

    @Nullable
    public final NinePatch getShadow(@NotNull float[] radii, float blur, @NotNull BitmapEffectHelper effectHelper) {
        ShadowCacheKey shadowCacheKey = new ShadowCacheKey(radii, blur);
        Map<ShadowCacheKey, NinePatch> map = shadowMap;
        NinePatch ninePatch = map.get(shadowCacheKey);
        if (ninePatch != null) {
            return ninePatch;
        }
        NinePatch ninePatchCreateNewShadow = createNewShadow(radii, blur, effectHelper);
        if (ninePatchCreateNewShadow == null) {
            return null;
        }
        map.put(shadowCacheKey, ninePatchCreateNewShadow);
        return ninePatchCreateNewShadow;
    }
}
