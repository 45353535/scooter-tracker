package i2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public class b extends TextView implements e2.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RectF f73915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private GradientDrawable f73916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Paint f73917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f73918e;

    public b(Context context) {
        super(context);
        this.f73915b = new RectF();
        this.f73918e = false;
        a(context);
    }

    protected void a(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f73916c = gradientDrawable;
        gradientDrawable.setColor(e2.a.f68790c);
        this.f73916c.setShape(0);
        setBackgroundDrawable(this.f73916c);
        setGravity(17);
        setMaxLines(1);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f73918e || this.f73917d == null) {
            return;
        }
        float height = getHeight() / 2.0f;
        canvas.drawRoundRect(this.f73915b, height, height, this.f73917d);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        if (View.MeasureSpec.getMode(i11) == 1073741824) {
            float size = (View.MeasureSpec.getSize(i11) - getCompoundPaddingTop()) - getCompoundPaddingRight();
            if (getTextSize() != size) {
                setTextSize(0, size);
            }
        }
        if (mode == 1073741824 && getText() != null) {
            int size2 = (View.MeasureSpec.getSize(i10) - getCompoundPaddingLeft()) - getCompoundPaddingRight();
            float fMeasureText = getPaint().measureText(getText(), 0, getText().length());
            float f10 = size2;
            if (f10 < fMeasureText) {
                float textSize = (int) (getTextSize() * (f10 / fMeasureText));
                if (getTextSize() != textSize) {
                    setTextSize(0, textSize);
                }
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        Paint paint;
        super.onSizeChanged(i10, i11, i12, i13);
        GradientDrawable gradientDrawable = this.f73916c;
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadius(i11 / 2.0f);
        }
        if (!this.f73918e || (paint = this.f73917d) == null) {
            return;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        float f10 = 0.0f + strokeWidth;
        this.f73915b.set(f10, f10, i10 - strokeWidth, i11 - strokeWidth);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        GradientDrawable gradientDrawable = this.f73916c;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i10);
        }
    }

    @Override // e2.d
    public void setStyle(@NonNull e2.e eVar) {
        boolean zBooleanValue = eVar.I().booleanValue();
        this.f73918e = zBooleanValue;
        if (zBooleanValue) {
            Paint paint = new Paint(1);
            this.f73917d = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.f73917d.setColor(eVar.B().intValue());
            this.f73917d.setStrokeWidth(eVar.C(getContext()).floatValue());
        }
        setTextColor(eVar.B().intValue());
        setBackgroundColor(eVar.i().intValue());
        setTextSize(0, eVar.j(getContext()).floatValue());
        setTypeface(Typeface.create(Typeface.DEFAULT, eVar.k().intValue()));
        setAlpha(eVar.t().floatValue());
        setPadding(eVar.v(getContext()).intValue(), eVar.A(getContext()).intValue(), eVar.x(getContext()).intValue(), eVar.u(getContext()).intValue());
    }
}
