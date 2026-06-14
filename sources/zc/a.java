package zc;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends BitmapShader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1341a f119337a = new C1341a(null);

    /* JADX INFO: renamed from: zc.a$a, reason: collision with other inner class name */
    public static final class C1341a {
        public /* synthetic */ C1341a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bitmap a(RectF rectF, int[] iArr, Bitmap.Config config) {
            Bitmap bitmapCreateBitmap;
            try {
                int iWidth = (int) rectF.width();
                int iHeight = (int) rectF.height();
                bitmapCreateBitmap = Bitmap.createBitmap(iWidth, iHeight, config);
                bitmapCreateBitmap.setPixels(a.f119337a.c(rectF, iArr, bitmapCreateBitmap.hasAlpha()), 0, iWidth, 0, 0, iWidth, iHeight);
            } catch (Throwable unused) {
                bitmapCreateBitmap = null;
            }
            if (bitmapCreateBitmap != null) {
                return bitmapCreateBitmap;
            }
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(1, 1, config);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap2, "createBitmap(1, 1, config)");
            return bitmapCreateBitmap2;
        }

        private final int[] c(RectF rectF, int[] iArr, boolean z10) {
            int iWidth = (int) rectF.width();
            int iHeight = (int) rectF.height();
            int[] iArr2 = new int[iWidth * iHeight];
            for (int i10 = 0; i10 < iHeight; i10++) {
                float f10 = iHeight == 1 ? 0.0f : i10 / (iHeight - 1);
                for (int i11 = 0; i11 < iWidth; i11++) {
                    iArr2[(i10 * iWidth) + i11] = pd.e.f98220a.e(iArr[0], iArr[1], iArr[2], iArr[3], iWidth == 1 ? 0.0f : i11 / (iWidth - 1), f10, z10);
                }
            }
            return iArr2;
        }

        private C1341a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(RectF bounds, int[] colors, Bitmap.Config config) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(config, "config");
        Bitmap bitmapA = f119337a.a(bounds, colors, config);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        super(bitmapA, tileMode, tileMode);
    }
}
