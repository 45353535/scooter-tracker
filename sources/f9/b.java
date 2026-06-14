package f9;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import b9.j;
import b9.k;

/* JADX INFO: loaded from: classes12.dex */
public class b extends TextView implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RectF f71961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private GradientDrawable f71962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Paint f71963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f71964e;

    public b(Context context) {
        super(context);
        this.f71961b = new RectF();
        this.f71964e = false;
        a(context);
    }

    protected void a(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f71962c = gradientDrawable;
        gradientDrawable.setColor(b9.a.f5839c);
        this.f71962c.setShape(0);
        setBackgroundDrawable(this.f71962c);
        setGravity(17);
        setMaxLines(1);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f71964e || this.f71963d == null) {
            return;
        }
        float height = getHeight() / 2.0f;
        canvas.drawRoundRect(this.f71961b, height, height, this.f71963d);
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
        GradientDrawable gradientDrawable = this.f71962c;
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadius(i11 / 2.0f);
        }
        if (!this.f71964e || (paint = this.f71963d) == null) {
            return;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        float f10 = 0.0f + strokeWidth;
        this.f71961b.set(f10, f10, i10 - strokeWidth, i11 - strokeWidth);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        GradientDrawable gradientDrawable = this.f71962c;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i10);
        }
    }

    @Override // b9.j
    public void setStyle(@NonNull k kVar) {
        boolean zBooleanValue = kVar.I().booleanValue();
        this.f71964e = zBooleanValue;
        if (zBooleanValue) {
            Paint paint = new Paint(1);
            this.f71963d = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.f71963d.setColor(kVar.B().intValue());
            this.f71963d.setStrokeWidth(kVar.C(getContext()).floatValue());
        }
        setTextColor(kVar.B().intValue());
        setBackgroundColor(kVar.i().intValue());
        setTextSize(0, kVar.j(getContext()).floatValue());
        setTypeface(Typeface.create(Typeface.DEFAULT, kVar.k().intValue()));
        setAlpha(kVar.t().floatValue());
        setPadding(kVar.v(getContext()).intValue(), kVar.A(getContext()).intValue(), kVar.x(getContext()).intValue(), kVar.u(getContext()).intValue());
    }
}
