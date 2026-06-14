package com.yandex.div.core.util.bitmap.blur;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.yandex.div.core.util.bitmap.BitmapEffectHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/core/util/bitmap/blur/LowApiBitmapEffectHelper;", "Lcom/yandex/div/core/util/bitmap/BitmapEffectHelper;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "(Landroid/content/Context;)V", "cachedRenderScript", "Landroid/renderscript/RenderScript;", "blurBitmap", "Landroid/graphics/Bitmap;", "bitmap", "radius", "", "blurShadow", "coercedRadius", "getBitmapScale", "getCoercedBlurRadius", "getOrCreateRenderScript", "release", "", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LowApiBitmapEffectHelper extends BitmapEffectHelper {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Nullable
    private RenderScript cachedRenderScript;

    @NotNull
    private final Context context;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/yandex/div/core/util/bitmap/blur/LowApiBitmapEffectHelper$Companion;", "", "()V", "MAX_BLUR", "", "MIN_BLUR", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public LowApiBitmapEffectHelper(@NotNull Context context) {
        this.context = context;
    }

    private final RenderScript getOrCreateRenderScript() {
        RenderScript renderScript = this.cachedRenderScript;
        if (renderScript != null) {
            return renderScript;
        }
        Context context = this.context;
        RenderScript renderScriptCreateMultiContext = RenderScript.createMultiContext(context, RenderScript.ContextType.NORMAL, 0, context.getApplicationInfo().targetSdkVersion);
        this.cachedRenderScript = renderScriptCreateMultiContext;
        return renderScriptCreateMultiContext;
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    @NotNull
    public Bitmap blurBitmap(@NotNull Bitmap bitmap, float radius) {
        float f10;
        Bitmap bitmapCreateScaledBitmap;
        if (!BlurUtils.INSTANCE.isBlurParamsValid(bitmap, radius)) {
            return bitmap;
        }
        RenderScript orCreateRenderScript = getOrCreateRenderScript();
        if (radius > 25.0f) {
            f10 = (radius * 1.0f) / 25.0f;
            radius = 25.0f;
        } else {
            f10 = 1.0f;
        }
        if (f10 == 1.0f) {
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            bitmapCreateScaledBitmap = bitmap.copy(config, false);
        } else {
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() / f10), (int) (bitmap.getHeight() / f10), false);
        }
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(orCreateRenderScript, bitmapCreateScaledBitmap);
        Allocation allocationCreateTyped = Allocation.createTyped(orCreateRenderScript, allocationCreateFromBitmap.getType());
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(orCreateRenderScript, Element.U8_4(orCreateRenderScript));
        scriptIntrinsicBlurCreate.setRadius(radius);
        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
        scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
        allocationCreateTyped.copyTo(bitmapCreateScaledBitmap);
        allocationCreateFromBitmap.destroy();
        allocationCreateTyped.destroy();
        scriptIntrinsicBlurCreate.destroy();
        return bitmapCreateScaledBitmap;
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    @NotNull
    public Bitmap blurShadow(@NotNull Bitmap bitmap, float coercedRadius) {
        if (!BlurUtils.INSTANCE.isBlurParamsValid(bitmap, coercedRadius)) {
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ALPHA_8);
        RenderScript orCreateRenderScript = getOrCreateRenderScript();
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(orCreateRenderScript, Element.A_8(orCreateRenderScript));
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(orCreateRenderScript, bitmap);
        Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(orCreateRenderScript, bitmapCreateBitmap);
        scriptIntrinsicBlurCreate.setRadius(coercedRadius);
        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
        scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
        allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
        allocationCreateFromBitmap2.destroy();
        allocationCreateFromBitmap.destroy();
        scriptIntrinsicBlurCreate.destroy();
        return bitmapCreateBitmap;
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    public float getBitmapScale(float radius) {
        if (radius <= 25.0f) {
            return 1.0f;
        }
        return 25.0f / radius;
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    public float getCoercedBlurRadius(float radius) {
        return g.m(radius, 1.0f, 25.0f);
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    public void release() {
        RenderScript renderScript = this.cachedRenderScript;
        if (renderScript != null) {
            renderScript.destroy();
        }
        this.cachedRenderScript = null;
    }
}
