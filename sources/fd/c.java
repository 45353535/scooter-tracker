package fd;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import ic.z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends View implements ic.h, z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f71997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f71998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f71999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f72000e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f71997b = new Paint(1);
        this.f71999d = ic.k.f74287c;
    }

    @Override // ic.h
    public void a(id.j appearanceParams) {
        Intrinsics.checkNotNullParameter(appearanceParams, "appearanceParams");
        Integer numI = appearanceParams.i();
        if (numI != null) {
            this.f72000e = numI.intValue();
        }
        Integer numO = appearanceParams.o();
        if (numO != null) {
            this.f71999d = numO.intValue();
        }
    }

    @Override // ic.z
    public void c(long j10, long j11, float f10) {
        this.f71998c = f10;
        postInvalidate();
    }

    public final int getLineBackgroundColor() {
        return this.f72000e;
    }

    public final int getLineColor() {
        return this.f71999d;
    }

    @NotNull
    public final Paint getLinePaint() {
        return this.f71997b;
    }

    public final float getPercent() {
        return this.f71998c;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float measuredHeight = (getMeasuredHeight() / 2.0f) + getPaddingTop();
        this.f71997b.setColor(this.f72000e);
        canvas.drawLine(getPaddingLeft(), measuredHeight, getPaddingLeft() + width, measuredHeight, this.f71997b);
        this.f71997b.setColor(this.f71999d);
        canvas.drawLine(getPaddingLeft(), measuredHeight, getPaddingLeft() + ((width * this.f71998c) / 100), measuredHeight, this.f71997b);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f71997b.setStrokeWidth(getMeasuredHeight());
    }

    public final void setLineBackgroundColor(int i10) {
        this.f72000e = i10;
    }

    public final void setLineColor(int i10) {
        this.f71999d = i10;
    }

    public final void setPercent(float f10) {
        this.f71998c = f10;
    }

    @VisibleForTesting
    public static /* synthetic */ void getLineBackgroundColor$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLineColor$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLinePaint$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getPercent$annotations() {
    }
}
