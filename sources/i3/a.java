package i3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;

/* JADX INFO: loaded from: classes7.dex */
public class a extends ColorDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f73927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f73928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f73929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Paint f73930d;

    public a(int i10) {
        super(i10);
        this.f73928b = j3.d.c().e(Paint.Style.STROKE).d(this.f73927a).b(-1).a();
        this.f73929c = j3.d.c().e(Paint.Style.FILL).b(0).a();
        this.f73930d = j3.d.c().c(j3.d.b(16)).a();
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.drawColor(0);
        float width = canvas.getWidth() / 2.0f;
        float f10 = width / 12.0f;
        this.f73927a = f10;
        this.f73928b.setStrokeWidth(f10);
        this.f73929c.setColor(getColor());
        canvas.drawCircle(width, width, width - (this.f73927a * 1.5f), this.f73930d);
        canvas.drawCircle(width, width, width - (this.f73927a * 1.5f), this.f73929c);
        canvas.drawCircle(width, width, width - this.f73927a, this.f73928b);
    }

    @Override // android.graphics.drawable.ColorDrawable
    public void setColor(int i10) {
        super.setColor(i10);
        invalidateSelf();
    }
}
