package l3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;

/* JADX INFO: loaded from: classes7.dex */
public class c extends a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f94038j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Paint f94039k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Paint f94040l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Paint f94041m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private i3.c f94042n;

    public c(Context context) {
        super(context);
        this.f94039k = j3.d.c().a();
        this.f94040l = j3.d.c().a();
        this.f94041m = j3.d.c().b(-1).f(PorterDuff.Mode.CLEAR).a();
    }

    @Override // l3.a
    protected void b(Canvas canvas) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        float[] fArr = new float[3];
        Color.colorToHSV(this.f94038j, fArr);
        int iMax = Math.max(2, width / 256);
        int i10 = 0;
        while (i10 <= width) {
            float f10 = i10;
            fArr[2] = f10 / (width - 1);
            this.f94039k.setColor(Color.HSVToColor(fArr));
            i10 += iMax;
            canvas.drawRect(f10, 0.0f, i10, height, this.f94039k);
        }
    }

    @Override // l3.a
    protected void c(Canvas canvas, float f10, float f11) {
        this.f94040l.setColor(i3.d.c(this.f94038j, this.f94031i));
        canvas.drawCircle(f10, f11, this.f94029g, this.f94041m);
        canvas.drawCircle(f10, f11, this.f94029g * 0.75f, this.f94040l);
    }

    @Override // l3.a
    protected void e(float f10) {
        i3.c cVar = this.f94042n;
        if (cVar != null) {
            cVar.setLightness(f10);
        }
    }

    public void setColor(int i10) {
        this.f94038j = i10;
        this.f94031i = i3.d.f(i10);
        if (this.f94026d != null) {
            f();
            invalidate();
        }
    }

    public void setColorPicker(i3.c cVar) {
        this.f94042n = cVar;
    }
}
