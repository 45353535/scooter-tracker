package com.yandex.div.core.util.bitmap.blur;

import android.graphics.Bitmap;
import android.graphics.HardwareRenderer;
import android.graphics.RenderNode;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.platform.u1;
import com.taurusx.tax.f.y;
import com.yandex.div.core.util.bitmap.BitmapEffectHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y0.c;

/* JADX INFO: loaded from: classes11.dex */
@RequiresApi(31)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0002J\b\u0010\u0014\u001a\u00020\u0006H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/yandex/div/core/util/bitmap/blur/HighApiBitmapEffectHelper;", "Lcom/yandex/div/core/util/bitmap/BitmapEffectHelper;", "()V", "cachedHardwareRenderer", "Landroid/graphics/HardwareRenderer;", "cachedRenderNode", "Landroid/graphics/RenderNode;", "blur", "Landroid/graphics/Bitmap;", "bitmap", "radius", "", "isShadow", "", "blurBitmap", "blurShadow", "coercedRadius", "getBitmapScale", "getCoercedBlurRadius", "getOrCreateHardwareRenderer", "getOrCreateRenderNode", "release", "", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HighApiBitmapEffectHelper extends BitmapEffectHelper {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Nullable
    private HardwareRenderer cachedHardwareRenderer;

    @Nullable
    private RenderNode cachedRenderNode;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/core/util/bitmap/blur/HighApiBitmapEffectHelper$Companion;", "", "()V", "BLUR_COMPATIBILITY_DIVIDER", "", "MAX_BLURRED_IMAGES", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0086 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:12:0x0067, B:17:0x0076, B:19:0x007e, B:32:0x00a9, B:22:0x0086, B:24:0x0090, B:26:0x0096, B:27:0x0098, B:28:0x009d, B:30:0x00a3, B:31:0x00a5), top: B:36:0x0067 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.graphics.Bitmap blur(android.graphics.Bitmap r9, float r10, boolean r11) {
        /*
            r8 = this;
            android.graphics.HardwareRenderer r0 = r8.getOrCreateHardwareRenderer()
            android.graphics.RenderNode r1 = r8.getOrCreateRenderNode()
            int r2 = r9.getWidth()
            int r3 = r9.getHeight()
            r5 = 1
            r6 = 768(0x300, double:3.794E-321)
            r4 = 1
            android.media.ImageReader r2 = y0.a.a(r2, r3, r4, r5, r6)
            android.view.Surface r3 = r2.getSurface()
            y0.l.a(r0, r3)
            y0.m.a(r0, r1)
            int r3 = r2.getWidth()
            int r4 = r2.getHeight()
            r5 = 0
            androidx.compose.ui.platform.i0.a(r1, r5, r5, r3, r4)
            r3 = 1069547520(0x3fc00000, float:1.5)
            float r10 = r10 / r3
            if (r11 == 0) goto L38
            android.graphics.Shader$TileMode r3 = androidx.compose.ui.graphics.g0.a()
            goto L3a
        L38:
            android.graphics.Shader$TileMode r3 = android.graphics.Shader.TileMode.MIRROR
        L3a:
            android.graphics.RenderEffect r10 = androidx.compose.ui.graphics.j1.a(r10, r10, r3)
            androidx.compose.ui.platform.a2.a(r1, r10)
            android.graphics.RecordingCanvas r10 = androidx.compose.ui.platform.w0.a(r1)
            r3 = 0
            r4 = 0
            y0.n.a(r10, r9, r3, r3, r4)
            androidx.compose.ui.platform.x0.a(r1)
            android.graphics.HardwareRenderer$FrameRenderRequest r10 = y0.b.a(r0)
            r0 = 1
            android.graphics.HardwareRenderer$FrameRenderRequest r10 = y0.f.a(r10, r0)
            y0.g.a(r10)
            android.media.Image r10 = r2.acquireNextImage()
            if (r10 != 0) goto L60
            goto L66
        L60:
            android.hardware.HardwareBuffer r1 = y0.h.a(r10)
            if (r1 != 0) goto L67
        L66:
            return r9
        L67:
            android.graphics.Bitmap r0 = y0.i.a(r1, r4)     // Catch: java.lang.Throwable -> L83
            if (r0 != 0) goto L74
        L6d:
            y0.j.a(r1)
            r10.close()
            return r9
        L74:
            if (r11 == 0) goto L86
            android.graphics.Bitmap$Config r11 = r0.getConfig()     // Catch: java.lang.Throwable -> L83
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ALPHA_8     // Catch: java.lang.Throwable -> L83
            if (r11 == r2) goto L86
            android.graphics.Bitmap r9 = r0.copy(r2, r5)     // Catch: java.lang.Throwable -> L83
            goto La9
        L83:
            r0 = move-exception
            r9 = r0
            goto Lad
        L86:
            android.graphics.Bitmap$Config r11 = r0.getConfig()     // Catch: java.lang.Throwable -> L83
            android.graphics.Bitmap$Config r2 = r9.getConfig()     // Catch: java.lang.Throwable -> L83
            if (r11 == r2) goto L9d
            android.graphics.Bitmap$Config r9 = r9.getConfig()     // Catch: java.lang.Throwable -> L83
            if (r9 != 0) goto L98
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L83
        L98:
            android.graphics.Bitmap r9 = r0.copy(r9, r5)     // Catch: java.lang.Throwable -> L83
            goto La9
        L9d:
            android.graphics.Bitmap$Config r9 = r0.getConfig()     // Catch: java.lang.Throwable -> L83
            if (r9 != 0) goto La5
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L83
        La5:
            android.graphics.Bitmap r9 = r0.copy(r9, r5)     // Catch: java.lang.Throwable -> L83
        La9:
            r0.recycle()     // Catch: java.lang.Throwable -> L83
            goto L6d
        Lad:
            y0.j.a(r1)
            r10.close()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.util.bitmap.blur.HighApiBitmapEffectHelper.blur(android.graphics.Bitmap, float, boolean):android.graphics.Bitmap");
    }

    private final HardwareRenderer getOrCreateHardwareRenderer() {
        HardwareRenderer hardwareRenderer = this.cachedHardwareRenderer;
        if (hardwareRenderer != null) {
            return hardwareRenderer;
        }
        HardwareRenderer hardwareRendererA = c.a();
        this.cachedHardwareRenderer = hardwareRendererA;
        return hardwareRendererA;
    }

    private final RenderNode getOrCreateRenderNode() {
        RenderNode renderNode = this.cachedRenderNode;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeA = u1.a("BlurEffect");
        this.cachedRenderNode = renderNodeA;
        return renderNodeA;
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    @NotNull
    public Bitmap blurBitmap(@NotNull Bitmap bitmap, float radius) {
        return !BlurUtils.INSTANCE.isBlurParamsValid(bitmap, radius) ? bitmap : blur(bitmap, radius, false);
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    @NotNull
    public Bitmap blurShadow(@NotNull Bitmap bitmap, float coercedRadius) {
        return !BlurUtils.INSTANCE.isBlurParamsValid(bitmap, coercedRadius) ? bitmap : blur(bitmap, coercedRadius, true);
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    public float getBitmapScale(float radius) {
        return 1.0f;
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    public float getCoercedBlurRadius(float radius) {
        return radius;
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    public void release() {
        RenderNode renderNode = this.cachedRenderNode;
        if (renderNode != null) {
            renderNode.discardDisplayList();
        }
        this.cachedRenderNode = null;
        HardwareRenderer hardwareRenderer = this.cachedHardwareRenderer;
        if (hardwareRenderer != null) {
            hardwareRenderer.destroy();
        }
        this.cachedHardwareRenderer = null;
    }
}
