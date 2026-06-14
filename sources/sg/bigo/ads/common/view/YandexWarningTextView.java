package sg.bigo.ads.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.e;

/* JADX INFO: loaded from: classes4.dex */
public class YandexWarningTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f102999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f103000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f103001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f103002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f103003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f103004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f103005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f103006h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f103007i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f103008j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f103009k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f103010l;

    public YandexWarningTextView(Context context) {
        super(context);
        this.f102999a = 25;
        this.f103000b = 10;
        this.f103001c = 35.0f;
        this.f103003e = 1;
        this.f103004f = 50.0f;
        this.f103005g = false;
        this.f103006h = 0;
        this.f103007i = 0.0f;
        this.f103008j = 1000;
        this.f103009k = 1000;
        this.f103010l = 1000;
        a(null);
    }

    private void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.YandexWarningTextView);
            this.f102999a = e.d(getContext(), typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.YandexWarningTextView_bigo_ad_maxTextSize, this.f102999a));
            this.f103000b = e.d(getContext(), typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.YandexWarningTextView_bigo_ad_minTextSize, this.f103000b));
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f103008j = e.c(getContext());
        this.f103009k = e.b(getContext());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int i10 = this.f103003e;
        if (i10 > 2) {
            i10 = 2;
        }
        canvas.save();
        float f10 = (this.f103002d * 1.0f) / i10;
        float f11 = f10 / this.f103004f;
        sg.bigo.ads.common.t.a.a("yandexWarn", "onDraw...singleLineHeight:" + f10 + "...scaleY:" + f11 + "...mPy:" + this.f103007i);
        canvas.scale(1.0f, f11, 0.0f, this.f103007i);
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        int i14;
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        try {
            if (TextUtils.isEmpty(getText())) {
                return;
            }
            int paddingLeft = (i10 - getPaddingLeft()) - getPaddingRight();
            int paddingTop = (i11 - getPaddingTop()) - getPaddingBottom();
            this.f103002d = paddingTop;
            float f10 = this.f102999a;
            float f11 = paddingTop * 0.5f;
            this.f103001c = f11;
            setLineSpacing(f11, 0.0f);
            setTextSize(2, f10);
            StaticLayout staticLayout = new StaticLayout(getText(), getPaint(), paddingLeft, Layout.Alignment.ALIGN_NORMAL, 0.0f, this.f103001c, true);
            while (true) {
                if ((staticLayout.getHeight() <= this.f103002d && staticLayout.getWidth() <= paddingLeft) || f10 <= this.f103000b) {
                    break;
                }
                f10 -= 1.0f;
                setTextSize(2, f10);
                staticLayout = new StaticLayout(getText(), getPaint(), paddingLeft, Layout.Alignment.ALIGN_NORMAL, 0.0f, this.f103001c, true);
            }
            this.f103003e = staticLayout.getLineCount();
            this.f103006h = staticLayout.getLineAscent(0);
            this.f103004f = e.b(getContext(), Math.round(f10));
            int iAbs = Math.abs(this.f103006h);
            boolean z10 = this.f103005g;
            if (z10 || 1 == (i14 = this.f103003e)) {
                if (!z10 || f10 <= 20.0f) {
                    this.f103007i = iAbs / 2.0f;
                } else {
                    this.f103007i = iAbs * 1.1f;
                }
            } else if (i14 >= 3) {
                this.f103007i = 0.0f;
            } else if (f10 > 36.0f) {
                this.f103007i = iAbs * 1.1f;
            } else {
                this.f103007i = (iAbs * 1.0f) / i14;
            }
            if (this.f103009k <= 1000 && this.f103008j <= 1000) {
                this.f103007i = 0.0f;
            }
            setLineSpacing(this.f103004f, 0.0f);
            sg.bigo.ads.common.t.a.a("yandexWarn", "adjust...line " + this.f103003e + "...TextSizeSP:" + f10 + "...TextSizePx:" + this.f103004f + "...TotalHeight:" + this.f103002d + "..lineSpace:" + this.f103001c + "...scaleX:" + getPaint().getTextScaleX() + "...mSecondLineAscentHeight:" + this.f103006h + "...secondLineTopH:" + staticLayout.getLineTop(0) + "...mPy:" + this.f103007i);
        } catch (Throwable unused) {
        }
    }

    public void setIsHorizontal(boolean z10) {
        this.f103005g = z10;
    }

    public YandexWarningTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f102999a = 25;
        this.f103000b = 10;
        this.f103001c = 35.0f;
        this.f103003e = 1;
        this.f103004f = 50.0f;
        this.f103005g = false;
        this.f103006h = 0;
        this.f103007i = 0.0f;
        this.f103008j = 1000;
        this.f103009k = 1000;
        this.f103010l = 1000;
        a(attributeSet);
    }

    public YandexWarningTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f102999a = 25;
        this.f103000b = 10;
        this.f103001c = 35.0f;
        this.f103003e = 1;
        this.f103004f = 50.0f;
        this.f103005g = false;
        this.f103006h = 0;
        this.f103007i = 0.0f;
        this.f103008j = 1000;
        this.f103009k = 1000;
        this.f103010l = 1000;
        a(attributeSet);
    }
}
