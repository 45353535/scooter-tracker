package l3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;

/* JADX INFO: loaded from: classes7.dex */
public class b extends a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f94032j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Paint f94033k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Paint f94034l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Paint f94035m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Paint f94036n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private i3.c f94037o;

    public b(Context context) {
        super(context);
        this.f94033k = j3.d.c().a();
        this.f94034l = j3.d.c().a();
        this.f94035m = j3.d.c().a();
        this.f94036n = j3.d.c().b(-1).f(PorterDuff.Mode.CLEAR).a();
    }

    @Override // l3.a
    protected void a() {
        super.a();
        this.f94033k.setShader(j3.d.b(this.f94030h / 2));
    }

    @Override // l3.a
    protected void b(Canvas canvas) {
        int width = canvas.getWidth();
        float height = canvas.getHeight();
        canvas.drawRect(0.0f, 0.0f, width, height, this.f94033k);
        int iMax = Math.max(2, width / 256);
        int i10 = 0;
        while (i10 <= width) {
            float f10 = i10;
            this.f94034l.setColor(this.f94032j);
            this.f94034l.setAlpha(Math.round((f10 / (width - 1)) * 255.0f));
            i10 += iMax;
            float f11 = height;
            canvas.drawRect(f10, 0.0f, i10, f11, this.f94034l);
            height = f11;
        }
    }

    @Override // l3.a
    protected void c(Canvas canvas, float f10, float f11) {
        this.f94035m.setColor(this.f94032j);
        this.f94035m.setAlpha(Math.round(this.f94031i * 255.0f));
        canvas.drawCircle(f10, f11, this.f94029g, this.f94036n);
        if (this.f94031i < 1.0f) {
            canvas.drawCircle(f10, f11, this.f94029g * 0.75f, this.f94033k);
        }
        canvas.drawCircle(f10, f11, this.f94029g * 0.75f, this.f94035m);
    }

    @Override // l3.a
    protected void e(float f10) {
        i3.c cVar = this.f94037o;
        if (cVar != null) {
            cVar.setAlphaValue(f10);
        }
    }

    public void setColor(int i10) {
        this.f94032j = i10;
        this.f94031i = i3.d.d(i10);
        if (this.f94026d != null) {
            f();
            invalidate();
        }
    }

    public void setColorPicker(i3.c cVar) {
        this.f94037o = cVar;
    }
}
