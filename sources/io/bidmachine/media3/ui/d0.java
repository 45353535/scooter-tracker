package io.bidmachine.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import j$.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
final class d0 {
    private int A;
    private int B;
    private int C;
    private int D;
    private StaticLayout E;
    private StaticLayout F;
    private int G;
    private int H;
    private int I;
    private Rect J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f81706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f81707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f81708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f81709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f81710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TextPaint f81711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f81712g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f81713h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CharSequence f81714i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Layout.Alignment f81715j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Bitmap f81716k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f81717l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f81718m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f81719n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f81720o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f81721p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f81722q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f81723r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f81724s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f81725t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f81726u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f81727v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f81728w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f81729x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f81730y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f81731z;

    public d0(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f81710e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f81709d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f81706a = fRound;
        this.f81707b = fRound;
        this.f81708c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f81711f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f81712g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f81713h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    private static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != charSequence2) {
            return charSequence != null && charSequence.equals(charSequence2);
        }
        return true;
    }

    private void c(Canvas canvas) {
        canvas.drawBitmap(this.f81716k, (Rect) null, this.J, this.f81713h);
    }

    private void d(Canvas canvas, boolean z10) {
        if (z10) {
            e(canvas);
            return;
        }
        q9.a.e(this.J);
        q9.a.e(this.f81716k);
        c(canvas);
    }

    private void e(Canvas canvas) {
        Canvas canvas2;
        StaticLayout staticLayout = this.E;
        StaticLayout staticLayout2 = this.F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.G, this.H);
        if (Color.alpha(this.f81726u) > 0) {
            this.f81712g.setColor(this.f81726u);
            canvas2 = canvas;
            canvas2.drawRect(-this.I, 0.0f, staticLayout.getWidth() + this.I, staticLayout.getHeight(), this.f81712g);
        } else {
            canvas2 = canvas;
        }
        int i10 = this.f81728w;
        if (i10 == 1) {
            this.f81711f.setStrokeJoin(Paint.Join.ROUND);
            this.f81711f.setStrokeWidth(this.f81706a);
            this.f81711f.setColor(this.f81727v);
            this.f81711f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else if (i10 == 2) {
            TextPaint textPaint = this.f81711f;
            float f10 = this.f81707b;
            float f11 = this.f81708c;
            textPaint.setShadowLayer(f10, f11, f11, this.f81727v);
        } else if (i10 == 3 || i10 == 4) {
            boolean z10 = i10 == 3;
            int i11 = z10 ? -1 : this.f81727v;
            int i12 = z10 ? this.f81727v : -1;
            float f12 = this.f81707b / 2.0f;
            this.f81711f.setColor(this.f81724s);
            this.f81711f.setStyle(Paint.Style.FILL);
            float f13 = -f12;
            this.f81711f.setShadowLayer(this.f81707b, f13, f13, i11);
            staticLayout2.draw(canvas2);
            this.f81711f.setShadowLayer(this.f81707b, f12, f12, i12);
        }
        this.f81711f.setColor(this.f81724s);
        this.f81711f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        this.f81711f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas2.restoreToCount(iSave);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void f() {
        /*
            r7 = this;
            android.graphics.Bitmap r0 = r7.f81716k
            int r1 = r7.C
            int r2 = r7.A
            int r1 = r1 - r2
            int r3 = r7.D
            int r4 = r7.B
            int r3 = r3 - r4
            float r2 = (float) r2
            float r1 = (float) r1
            float r5 = r7.f81720o
            float r5 = r5 * r1
            float r2 = r2 + r5
            float r4 = (float) r4
            float r3 = (float) r3
            float r5 = r7.f81717l
            float r5 = r5 * r3
            float r4 = r4 + r5
            float r5 = r7.f81722q
            float r1 = r1 * r5
            int r1 = java.lang.Math.round(r1)
            float r5 = r7.f81723r
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L2e
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
            goto L3f
        L2e:
            float r3 = (float) r1
            int r5 = r0.getHeight()
            float r5 = (float) r5
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
        L3f:
            int r3 = r7.f81721p
            r5 = 1
            r6 = 2
            if (r3 != r6) goto L48
            float r3 = (float) r1
        L46:
            float r2 = r2 - r3
            goto L4e
        L48:
            if (r3 != r5) goto L4e
            int r3 = r1 / 2
            float r3 = (float) r3
            goto L46
        L4e:
            int r2 = java.lang.Math.round(r2)
            int r3 = r7.f81719n
            if (r3 != r6) goto L59
            float r3 = (float) r0
        L57:
            float r4 = r4 - r3
            goto L5f
        L59:
            if (r3 != r5) goto L5f
            int r3 = r0 / 2
            float r3 = (float) r3
            goto L57
        L5f:
            int r3 = java.lang.Math.round(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r1 = r1 + r2
            int r0 = r0 + r3
            r4.<init>(r2, r3, r1, r0)
            r7.J = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.ui.d0.f():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void g() {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.ui.d0.g():void");
    }

    public void b(p9.a aVar, yb.a aVar2, float f10, float f11, float f12, Canvas canvas, int i10, int i11, int i12, int i13) {
        int i14;
        boolean z10 = aVar.f98080d == null;
        if (!z10) {
            i14 = ViewCompat.MEASURED_STATE_MASK;
        } else if (TextUtils.isEmpty(aVar.f98077a)) {
            return;
        } else {
            i14 = aVar.f98088l ? aVar.f98089m : aVar2.f118895c;
        }
        if (a(this.f81714i, aVar.f98077a) && Objects.equals(this.f81715j, aVar.f98078b) && this.f81716k == aVar.f98080d && this.f81717l == aVar.f98081e && this.f81718m == aVar.f98082f && Integer.valueOf(this.f81719n).equals(Integer.valueOf(aVar.f98083g)) && this.f81720o == aVar.f98084h && Integer.valueOf(this.f81721p).equals(Integer.valueOf(aVar.f98085i)) && this.f81722q == aVar.f98086j && this.f81723r == aVar.f98087k && this.f81724s == aVar2.f118893a && this.f81725t == aVar2.f118894b && this.f81726u == i14 && this.f81728w == aVar2.f118896d && this.f81727v == aVar2.f118897e && Objects.equals(this.f81711f.getTypeface(), aVar2.f118898f) && this.f81729x == f10 && this.f81730y == f11 && this.f81731z == f12 && this.A == i10 && this.B == i11 && this.C == i12 && this.D == i13) {
            d(canvas, z10);
            return;
        }
        this.f81714i = aVar.f98077a;
        this.f81715j = aVar.f98078b;
        this.f81716k = aVar.f98080d;
        this.f81717l = aVar.f98081e;
        this.f81718m = aVar.f98082f;
        this.f81719n = aVar.f98083g;
        this.f81720o = aVar.f98084h;
        this.f81721p = aVar.f98085i;
        this.f81722q = aVar.f98086j;
        this.f81723r = aVar.f98087k;
        this.f81724s = aVar2.f118893a;
        this.f81725t = aVar2.f118894b;
        this.f81726u = i14;
        this.f81728w = aVar2.f118896d;
        this.f81727v = aVar2.f118897e;
        this.f81711f.setTypeface(aVar2.f118898f);
        this.f81729x = f10;
        this.f81730y = f11;
        this.f81731z = f12;
        this.A = i10;
        this.B = i11;
        this.C = i12;
        this.D = i13;
        if (z10) {
            q9.a.e(this.f81714i);
            g();
        } else {
            q9.a.e(this.f81716k);
            f();
        }
        d(canvas, z10);
    }
}
