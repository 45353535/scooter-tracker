package j3;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes7.dex */
public abstract class d {

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Paint f85509a;

        public Paint a() {
            return this.f85509a;
        }

        public b b(int i10) {
            this.f85509a.setColor(i10);
            return this;
        }

        public b c(Shader shader) {
            this.f85509a.setShader(shader);
            return this;
        }

        public b d(float f10) {
            this.f85509a.setStrokeWidth(f10);
            return this;
        }

        public b e(Paint.Style style) {
            this.f85509a.setStyle(style);
            return this;
        }

        public b f(PorterDuff.Mode mode) {
            this.f85509a.setXfermode(new PorterDuffXfermode(mode));
            return this;
        }

        private b() {
            this.f85509a = new Paint(1);
        }
    }

    private static Bitmap a(int i10) {
        Paint paintA = c().a();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int iRound = Math.round(i10 / 2.0f);
        for (int i11 = 0; i11 < 2; i11++) {
            for (int i12 = 0; i12 < 2; i12++) {
                if ((i11 + i12) % 2 == 0) {
                    paintA.setColor(-1);
                } else {
                    paintA.setColor(-3092272);
                }
                canvas.drawRect(i11 * iRound, i12 * iRound, (i11 + 1) * iRound, r10 * iRound, paintA);
            }
        }
        return bitmapCreateBitmap;
    }

    public static Shader b(int i10) {
        Bitmap bitmapA = a(Math.max(8, (i10 / 2) * 2));
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        return new BitmapShader(bitmapA, tileMode, tileMode);
    }

    public static b c() {
        return new b();
    }
}
