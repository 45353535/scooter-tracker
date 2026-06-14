package com.mbridge.msdk.video.dynview.shape;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;

/* JADX INFO: loaded from: classes10.dex */
public class a extends ShapeDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f52371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f52372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f52373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f52374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f52375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Bitmap f52376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Bitmap f52377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f52378h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Paint f52379i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Matrix f52380j;

    public static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private RectShape f52381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Bitmap f52382b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Bitmap f52383c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f52384d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f52385e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f52386f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f52387g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f52388h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float f52389i;

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public a build() {
            return new a(this);
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c orientation(int i10) {
            this.f52385e = i10;
            return this;
        }

        private b() {
            this.f52386f = 100;
            this.f52387g = 10;
            this.f52381a = new RectShape();
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c a(Bitmap bitmap) {
            this.f52383c = bitmap;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c b(Bitmap bitmap) {
            this.f52382b = bitmap;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c a(boolean z10) {
            this.f52384d = z10;
            return this;
        }

        public c b(float f10) {
            this.f52388h = f10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c a(float f10) {
            this.f52389i = f10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c a(int i10) {
            this.f52387g = i10;
            return this;
        }
    }

    public interface c {
        c a(float f10);

        c a(int i10);

        c a(Bitmap bitmap);

        c a(boolean z10);

        c b(Bitmap bitmap);

        a build();

        c orientation(int i10);
    }

    private void a(Canvas canvas) {
        float f10 = this.f52372b / 2.0f;
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(0.0f, this.f52373c);
        path.lineTo((f10 - this.f52374d) - this.f52375e, this.f52373c);
        path.lineTo((this.f52374d + f10) - this.f52375e, 0.0f);
        if (this.f52378h) {
            try {
                a(canvas, path);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else {
            Bitmap bitmap = this.f52376f;
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    a(canvas, path, this.f52376f);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
        Path path2 = new Path();
        path2.moveTo(this.f52374d + f10 + this.f52375e, 0.0f);
        path2.lineTo(this.f52372b, 0.0f);
        path2.lineTo(this.f52372b, this.f52373c);
        path2.lineTo((f10 - this.f52374d) + this.f52375e, this.f52373c);
        if (this.f52378h) {
            try {
                a(canvas, path2);
                return;
            } catch (Exception e12) {
                e12.printStackTrace();
                return;
            }
        }
        Bitmap bitmap2 = this.f52377g;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        try {
            a(canvas, path2, this.f52377g);
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    private void b(Canvas canvas) {
        float f10 = this.f52373c / 2.0f;
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(0.0f, (this.f52374d + f10) - this.f52375e);
        path.lineTo(this.f52372b, (f10 - this.f52374d) - this.f52375e);
        path.lineTo(this.f52372b, 0.0f);
        if (this.f52378h) {
            try {
                a(canvas, path);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else {
            Bitmap bitmap = this.f52376f;
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    a(canvas, path, this.f52376f);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
        Path path2 = new Path();
        path2.moveTo(0.0f, this.f52374d + f10 + this.f52375e);
        path2.lineTo(0.0f, this.f52373c);
        path2.lineTo(this.f52372b, this.f52373c);
        path2.lineTo(this.f52372b, (f10 - this.f52374d) + this.f52375e);
        if (this.f52378h) {
            try {
                a(canvas, path2);
                return;
            } catch (Exception e12) {
                e12.printStackTrace();
                return;
            }
        }
        Bitmap bitmap2 = this.f52377g;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        try {
            a(canvas, path2, this.f52377g);
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f52371a == 1) {
            b(canvas);
        } else {
            a(canvas);
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    private a(b bVar) {
        super(bVar.f52381a);
        this.f52378h = false;
        this.f52376f = bVar.f52382b;
        this.f52377g = bVar.f52383c;
        this.f52378h = bVar.f52384d;
        this.f52371a = bVar.f52385e;
        this.f52374d = bVar.f52386f;
        this.f52375e = bVar.f52387g;
        this.f52372b = bVar.f52388h;
        this.f52373c = bVar.f52389i;
        Paint paint = new Paint();
        this.f52379i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f52379i.setAntiAlias(true);
        this.f52380j = new Matrix();
    }

    private void a(Canvas canvas, Path path, Bitmap bitmap) {
        if (canvas == null || path == null || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0) {
            float fMax = Math.max(this.f52372b / bitmap.getWidth(), this.f52373c / bitmap.getHeight());
            if (this.f52380j == null) {
                this.f52380j = new Matrix();
            }
            this.f52380j.reset();
            this.f52380j.preScale(fMax, fMax);
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(this.f52380j);
        this.f52379i.setShader(bitmapShader);
        canvas.drawPath(path, this.f52379i);
    }

    private void a(Canvas canvas, Path path) {
        this.f52379i.setColor(Color.parseColor("#40EAEAEA"));
        canvas.drawPath(path, this.f52379i);
    }

    public static b a() {
        return new b();
    }
}
