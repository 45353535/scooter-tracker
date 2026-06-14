package q0;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.platform.u1;
import androidx.core.graphics.BlendModeCompat;
import androidx.core.graphics.PaintCompat;

/* JADX INFO: loaded from: classes5.dex */
public class o {
    private static final Matrix B = new Matrix();
    private d A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Canvas f98634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f98635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f98636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RectF f98637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RectF f98638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Rect f98639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private RectF f98640g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private RectF f98641h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Rect f98642i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private RectF f98643j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Paint f98644k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Bitmap f98645l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Canvas f98646m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Rect f98647n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private e0.a f98648o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    Matrix f98649p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    float[] f98650q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Bitmap f98651r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Bitmap f98652s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Canvas f98653t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Canvas f98654u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private e0.a f98655v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private BlurMaskFilter f98656w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f98657x = 0.0f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private RenderNode f98658y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private RenderNode f98659z;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f98660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public BlendModeCompat f98661b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ColorFilter f98662c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public d f98663d;

        public a() {
            f();
        }

        public boolean a() {
            BlendModeCompat blendModeCompat = this.f98661b;
            return (blendModeCompat == null || blendModeCompat == BlendModeCompat.SRC_OVER) ? false : true;
        }

        public boolean b() {
            return this.f98662c != null;
        }

        public boolean c() {
            return this.f98663d != null;
        }

        public boolean d() {
            return (e() || a() || c() || b()) ? false : true;
        }

        public boolean e() {
            return this.f98660a < 255;
        }

        public void f() {
            this.f98660a = 255;
            this.f98661b = null;
            this.f98662c = null;
            this.f98663d = null;
        }
    }

    protected enum b {
        DIRECT,
        SAVE_LAYER,
        BITMAP,
        RENDER_NODE
    }

    private Bitmap a(RectF rectF, Bitmap.Config config) {
        return Bitmap.createBitmap(Math.max((int) Math.ceil(((double) rectF.width()) * 1.05d), 1), Math.max((int) Math.ceil(((double) rectF.height()) * 1.05d), 1), config);
    }

    private RectF b(RectF rectF, d dVar) {
        if (this.f98638e == null) {
            this.f98638e = new RectF();
        }
        if (this.f98640g == null) {
            this.f98640g = new RectF();
        }
        this.f98638e.set(rectF);
        this.f98638e.offsetTo(rectF.left + dVar.f(), rectF.top + dVar.g());
        this.f98638e.inset(-dVar.h(), -dVar.h());
        this.f98640g.set(rectF);
        this.f98638e.union(this.f98640g);
        return this.f98638e;
    }

    private b c(Canvas canvas, a aVar) {
        if (aVar.d()) {
            return b.DIRECT;
        }
        if (!aVar.c()) {
            return b.SAVE_LAYER;
        }
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 29 || !canvas.isHardwareAccelerated()) ? b.BITMAP : i10 <= 31 ? b.BITMAP : b.RENDER_NODE;
    }

    private void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    private boolean g(Bitmap bitmap, RectF rectF) {
        return bitmap == null || rectF.width() >= ((float) bitmap.getWidth()) || rectF.height() >= ((float) bitmap.getHeight()) || rectF.width() < ((float) bitmap.getWidth()) * 0.75f || rectF.height() < ((float) bitmap.getHeight()) * 0.75f;
    }

    private void h(Canvas canvas, d dVar) {
        e0.a aVar;
        RectF rectF = this.f98637d;
        if (rectF == null || this.f98645l == null) {
            throw new IllegalStateException("Cannot render to bitmap outside a start()/finish() block");
        }
        RectF rectFB = b(rectF, dVar);
        if (this.f98639f == null) {
            this.f98639f = new Rect();
        }
        this.f98639f.set((int) Math.floor(rectFB.left), (int) Math.floor(rectFB.top), (int) Math.ceil(rectFB.right), (int) Math.ceil(rectFB.bottom));
        float[] fArr = this.f98650q;
        float f10 = fArr != null ? fArr[0] : 1.0f;
        float f11 = fArr != null ? fArr[4] : 1.0f;
        if (this.f98641h == null) {
            this.f98641h = new RectF();
        }
        this.f98641h.set(rectFB.left * f10, rectFB.top * f11, rectFB.right * f10, rectFB.bottom * f11);
        if (this.f98642i == null) {
            this.f98642i = new Rect();
        }
        this.f98642i.set(0, 0, Math.round(this.f98641h.width()), Math.round(this.f98641h.height()));
        if (g(this.f98651r, this.f98641h)) {
            Bitmap bitmap = this.f98651r;
            if (bitmap != null) {
                d(bitmap);
            }
            Bitmap bitmap2 = this.f98652s;
            if (bitmap2 != null) {
                d(bitmap2);
            }
            this.f98651r = a(this.f98641h, Bitmap.Config.ARGB_8888);
            this.f98652s = a(this.f98641h, Bitmap.Config.ALPHA_8);
            this.f98653t = new Canvas(this.f98651r);
            this.f98654u = new Canvas(this.f98652s);
        } else {
            Canvas canvas2 = this.f98653t;
            if (canvas2 == null || this.f98654u == null || (aVar = this.f98648o) == null) {
                throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
            }
            canvas2.drawRect(this.f98642i, aVar);
            this.f98654u.drawRect(this.f98642i, this.f98648o);
        }
        if (this.f98652s == null) {
            throw new IllegalStateException("Expected to have allocated a shadow mask bitmap");
        }
        if (this.f98655v == null) {
            this.f98655v = new e0.a(1);
        }
        RectF rectF2 = this.f98637d;
        this.f98654u.drawBitmap(this.f98645l, Math.round((rectF2.left - rectFB.left) * f10), Math.round((rectF2.top - rectFB.top) * f11), (Paint) null);
        if (this.f98656w == null || this.f98657x != dVar.h()) {
            float fH = (dVar.h() * (f10 + f11)) / 2.0f;
            if (fH > 0.0f) {
                this.f98656w = new BlurMaskFilter(fH, BlurMaskFilter.Blur.NORMAL);
            } else {
                this.f98656w = null;
            }
            this.f98657x = dVar.h();
        }
        this.f98655v.setColor(dVar.e());
        if (dVar.h() > 0.0f) {
            this.f98655v.setMaskFilter(this.f98656w);
        } else {
            this.f98655v.setMaskFilter(null);
        }
        this.f98655v.setFilterBitmap(true);
        this.f98653t.drawBitmap(this.f98652s, Math.round(dVar.f() * f10), Math.round(dVar.g() * f11), this.f98655v);
        canvas.drawBitmap(this.f98651r, this.f98642i, this.f98639f, this.f98644k);
    }

    private void i(Canvas canvas, d dVar) {
        if (this.f98658y == null || this.f98659z == null) {
            throw new IllegalStateException("Cannot render to render node outside a start()/finish() block");
        }
        if (Build.VERSION.SDK_INT < 31) {
            throw new RuntimeException("RenderEffect is not supported on API level <31");
        }
        float[] fArr = this.f98650q;
        float f10 = fArr != null ? fArr[0] : 1.0f;
        float f11 = fArr != null ? fArr[4] : 1.0f;
        d dVar2 = this.A;
        if (dVar2 == null || !dVar.j(dVar2)) {
            RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(dVar.e(), PorterDuff.Mode.SRC_IN));
            if (dVar.h() > 0.0f) {
                float fH = (dVar.h() * (f10 + f11)) / 2.0f;
                renderEffectCreateColorFilterEffect = RenderEffect.createBlurEffect(fH, fH, renderEffectCreateColorFilterEffect, Shader.TileMode.CLAMP);
            }
            this.f98659z.setRenderEffect(renderEffectCreateColorFilterEffect);
            this.A = dVar;
        }
        RectF rectFB = b(this.f98637d, dVar);
        RectF rectF = new RectF(rectFB.left * f10, rectFB.top * f11, rectFB.right * f10, rectFB.bottom * f11);
        this.f98659z.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
        RecordingCanvas recordingCanvasBeginRecording = this.f98659z.beginRecording((int) rectF.width(), (int) rectF.height());
        recordingCanvasBeginRecording.translate((-rectF.left) + (dVar.f() * f10), (-rectF.top) + (dVar.g() * f11));
        recordingCanvasBeginRecording.drawRenderNode(this.f98658y);
        this.f98659z.endRecording();
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        canvas.drawRenderNode(this.f98659z);
        canvas.restore();
    }

    public void e() {
        if (this.f98634a == null || this.f98635b == null || this.f98650q == null || this.f98637d == null) {
            throw new IllegalStateException("OffscreenBitmap: finish() call without matching start()");
        }
        int iOrdinal = this.f98636c.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            this.f98634a.restore();
        } else if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                if (this.f98658y == null) {
                    throw new IllegalStateException("RenderNode is not ready; should've been initialized at start() time");
                }
                if (Build.VERSION.SDK_INT < 29) {
                    throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
                }
                this.f98634a.save();
                Canvas canvas = this.f98634a;
                float[] fArr = this.f98650q;
                canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                this.f98658y.endRecording();
                if (this.f98635b.c()) {
                    i(this.f98634a, this.f98635b.f98663d);
                }
                this.f98634a.drawRenderNode(this.f98658y);
                this.f98634a.restore();
            }
        } else {
            if (this.f98645l == null) {
                throw new IllegalStateException("Bitmap is not ready; should've been initialized at start() time");
            }
            if (this.f98635b.c()) {
                h(this.f98634a, this.f98635b.f98663d);
            }
            if (this.f98647n == null) {
                this.f98647n = new Rect();
            }
            this.f98647n.set(0, 0, (int) (this.f98637d.width() * this.f98650q[0]), (int) (this.f98637d.height() * this.f98650q[4]));
            this.f98634a.drawBitmap(this.f98645l, this.f98647n, this.f98637d, this.f98644k);
        }
        this.f98634a = null;
    }

    public boolean f() {
        return this.f98636c == b.RENDER_NODE;
    }

    public Canvas j(Canvas canvas, RectF rectF, a aVar) {
        if (this.f98634a != null) {
            throw new IllegalStateException("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
        }
        if (this.f98650q == null) {
            this.f98650q = new float[9];
        }
        if (this.f98649p == null) {
            this.f98649p = new Matrix();
        }
        canvas.getMatrix(this.f98649p);
        this.f98649p.getValues(this.f98650q);
        float[] fArr = this.f98650q;
        float f10 = fArr[0];
        float f11 = fArr[4];
        if (this.f98643j == null) {
            this.f98643j = new RectF();
        }
        this.f98643j.set(rectF.left * f10, rectF.top * f11, rectF.right * f10, rectF.bottom * f11);
        this.f98634a = canvas;
        this.f98635b = aVar;
        this.f98636c = c(canvas, aVar);
        if (this.f98637d == null) {
            this.f98637d = new RectF();
        }
        this.f98637d.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        if (this.f98644k == null) {
            this.f98644k = new e0.a();
        }
        this.f98644k.reset();
        int iOrdinal = this.f98636c.ordinal();
        if (iOrdinal == 0) {
            canvas.save();
            return canvas;
        }
        if (iOrdinal == 1) {
            this.f98644k.setAlpha(aVar.f98660a);
            this.f98644k.setColorFilter(aVar.f98662c);
            if (aVar.a()) {
                PaintCompat.setBlendMode(this.f98644k, aVar.f98661b);
            }
            p.n(canvas, rectF, this.f98644k);
            return canvas;
        }
        if (iOrdinal == 2) {
            if (this.f98648o == null) {
                e0.a aVar2 = new e0.a();
                this.f98648o = aVar2;
                aVar2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            if (g(this.f98645l, this.f98643j)) {
                Bitmap bitmap = this.f98645l;
                if (bitmap != null) {
                    d(bitmap);
                }
                this.f98645l = a(this.f98643j, Bitmap.Config.ARGB_8888);
                this.f98646m = new Canvas(this.f98645l);
            } else {
                Canvas canvas2 = this.f98646m;
                if (canvas2 == null) {
                    throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas ready");
                }
                canvas2.setMatrix(B);
                this.f98646m.drawRect(-1.0f, -1.0f, this.f98643j.width() + 1.0f, this.f98643j.height() + 1.0f, this.f98648o);
            }
            PaintCompat.setBlendMode(this.f98644k, aVar.f98661b);
            this.f98644k.setColorFilter(aVar.f98662c);
            this.f98644k.setAlpha(aVar.f98660a);
            Canvas canvas3 = this.f98646m;
            canvas3.scale(f10, f11);
            canvas3.translate(-rectF.left, -rectF.top);
            return canvas3;
        }
        if (iOrdinal != 3) {
            throw new RuntimeException("Invalid render strategy for OffscreenLayer");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
        }
        if (this.f98658y == null) {
            this.f98658y = u1.a("OffscreenLayer.main");
        }
        if (aVar.c() && this.f98659z == null) {
            this.f98659z = u1.a("OffscreenLayer.shadow");
            this.A = null;
        }
        if (aVar.a() || aVar.b()) {
            if (this.f98644k == null) {
                this.f98644k = new e0.a();
            }
            this.f98644k.reset();
            PaintCompat.setBlendMode(this.f98644k, aVar.f98661b);
            this.f98644k.setColorFilter(aVar.f98662c);
            this.f98658y.setUseCompositingLayer(true, this.f98644k);
            if (aVar.c()) {
                RenderNode renderNode = this.f98659z;
                if (renderNode == null) {
                    throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
                }
                renderNode.setUseCompositingLayer(true, this.f98644k);
            }
        }
        this.f98658y.setAlpha(aVar.f98660a / 255.0f);
        if (aVar.c()) {
            RenderNode renderNode2 = this.f98659z;
            if (renderNode2 == null) {
                throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
            }
            renderNode2.setAlpha(aVar.f98660a / 255.0f);
        }
        this.f98658y.setHasOverlappingRendering(true);
        RenderNode renderNode3 = this.f98658y;
        RectF rectF2 = this.f98643j;
        renderNode3.setPosition((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        RecordingCanvas recordingCanvasBeginRecording = this.f98658y.beginRecording((int) this.f98643j.width(), (int) this.f98643j.height());
        recordingCanvasBeginRecording.setMatrix(B);
        recordingCanvasBeginRecording.scale(f10, f11);
        recordingCanvasBeginRecording.translate(-rectF.left, -rectF.top);
        return recordingCanvasBeginRecording;
    }
}
