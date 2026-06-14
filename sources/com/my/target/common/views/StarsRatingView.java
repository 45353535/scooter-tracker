package com.my.target.common.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import com.my.target.gb;

/* JADX INFO: loaded from: classes11.dex */
public class StarsRatingView extends View {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Paint f59437f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f59438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f59439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f59440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bitmap f59441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f59442e;

    static {
        Paint paint = new Paint();
        f59437f = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
    }

    public StarsRatingView(@NonNull Context context) {
        super(context);
    }

    public final void a() {
        if (this.f59438a <= 0) {
            return;
        }
        int iFloor = (int) Math.floor(this.f59440c);
        int iCeil = (int) Math.ceil(5.0f - this.f59440c);
        float f10 = iFloor;
        boolean z10 = this.f59440c - f10 >= 0.2f;
        try {
            int i10 = this.f59438a;
            this.f59441d = Bitmap.createBitmap((int) ((i10 + this.f59439b) * 5.0f), i10, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f59441d);
            a(0, this.f59438a, -552162, canvas, iFloor);
            int i11 = this.f59438a;
            int i12 = (int) (0 + ((i11 + this.f59439b) * f10));
            a(i12, i11, -3355444, canvas, iCeil);
            if (z10) {
                int i13 = this.f59438a;
                double d10 = this.f59440c;
                a(i12, i13, (float) (d10 - Math.floor(d10)), canvas);
            }
            invalidate();
            this.f59442e = false;
        } catch (OutOfMemoryError unused) {
            gb.a("StarsRatingView: Unable to create rating bitmap because of OOME");
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f59440c > 0.0f) {
            Bitmap bitmap = this.f59441d;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            } else {
                if (this.f59438a <= 0 || this.f59442e) {
                    return;
                }
                this.f59442e = true;
                post(new Runnable() { // from class: m5.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f94464b.a();
                    }
                });
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int size = this.f59438a;
        if (size <= 0) {
            size = View.MeasureSpec.getSize(i11);
            this.f59438a = size;
        }
        setMeasuredDimension((int) ((size * 5) + (this.f59439b * 4.0f)), size);
    }

    public void setRating(float f10) {
        setContentDescription(Float.toString(f10));
        if (f10 > 5.0f || f10 < 0.0f) {
            gb.a("StarsRatingView: Rating is out of bounds - " + f10);
            this.f59440c = 0.0f;
        } else {
            this.f59440c = f10;
        }
        invalidate();
    }

    public void setStarSize(int i10) {
        this.f59438a = i10;
    }

    public void setStarsPadding(float f10) {
        this.f59439b = f10;
    }

    public final void a(int i10, int i11, int i12, Canvas canvas, int i13) {
        Paint paint = f59437f;
        paint.setColor(i12);
        canvas.drawPath(a(i10, i11 / 2, i13), paint);
    }

    public final Path a(int i10, float f10, int i11) {
        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        int i12 = 0;
        while (i12 < i11) {
            float f11 = i12;
            double d10 = i10 + f10 + (f11 * f10 * 2.0f) + (f11 * this.f59439b);
            double d11 = f10;
            float f12 = 2.0f * f10;
            path.moveTo((float) (d10 + (Math.sin(0.0d) * d11)), f12 - ((float) ((Math.cos(0.0d) * d11) + d11)));
            double d12 = 0.45f * f10;
            path.lineTo((float) (d10 + (Math.sin(0.6283185307179586d) * d12)), f12 - ((float) ((Math.cos(0.6283185307179586d) * d12) + d11)));
            int i13 = 1;
            while (i13 < 5) {
                double d13 = ((double) i13) * 1.2566370614359172d;
                path.lineTo((float) (d10 + (Math.sin(d13) * d11)), f12 - ((float) (d11 + (Math.cos(d13) * d11))));
                double d14 = d13 + 0.6283185307179586d;
                path.lineTo((float) (d10 + (Math.sin(d14) * d12)), f12 - ((float) ((Math.cos(d14) * d12) + d11)));
                i13++;
                i12 = i12;
            }
            i12++;
        }
        path.close();
        return path;
    }

    public final void a(int i10, int i11, float f10, Canvas canvas) {
        Paint paint = f59437f;
        paint.setColor(-552162);
        Path pathA = a(0, i11 / 2, 1);
        float f11 = i11 * f10;
        Rect rect = new Rect(i10, 0, (int) (i10 + f11), i11);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) f11, i11, Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawPath(pathA, paint);
        canvas.drawBitmap(bitmapCreateBitmap, (Rect) null, rect, paint);
    }
}
