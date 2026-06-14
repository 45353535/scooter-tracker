package sg.bigo.ads.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import sg.bigo.ads.R;

/* JADX INFO: loaded from: classes4.dex */
public class PrivacyCheckBox extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f102910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f102911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f102912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f102913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Paint f102914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f102915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f102916g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f102917h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f102918i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f102919j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PorterDuffXfermode f102920k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f102921l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private a f102922m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private d f102923n;

    class a {
        private a() {
        }

        protected void a(Canvas canvas) {
            Paint paint;
            int i10;
            if (PrivacyCheckBox.this.f102910a) {
                paint = PrivacyCheckBox.this.f102914e;
                i10 = PrivacyCheckBox.this.f102916g;
            } else {
                paint = PrivacyCheckBox.this.f102914e;
                i10 = PrivacyCheckBox.this.f102917h;
            }
            paint.setColor(i10);
            canvas.drawCircle(0.0f, 0.0f, PrivacyCheckBox.this.f102913d, PrivacyCheckBox.this.f102914e);
        }

        protected void b(Canvas canvas) {
            Paint paint;
            int i10;
            if (PrivacyCheckBox.this.f102910a) {
                paint = PrivacyCheckBox.this.f102914e;
                i10 = PrivacyCheckBox.this.f102918i;
            } else {
                paint = PrivacyCheckBox.this.f102914e;
                i10 = PrivacyCheckBox.this.f102919j;
            }
            paint.setColor(i10);
            PrivacyCheckBox.this.f102914e.setStyle(Paint.Style.STROKE);
            canvas.save();
            canvas.translate(-(PrivacyCheckBox.this.f102913d / 8.0f), PrivacyCheckBox.this.f102913d / 3.0f);
            canvas.rotate(-45.0f);
            Path path = new Path();
            path.reset();
            path.moveTo(0.0f, 0.0f);
            path.lineTo(PrivacyCheckBox.this.f102915f, 0.0f);
            path.moveTo(0.0f, 0.0f);
            path.lineTo(0.0f, (-PrivacyCheckBox.this.f102915f) / 2.0f);
            canvas.drawPath(path, PrivacyCheckBox.this.f102914e);
            canvas.restore();
        }

        /* synthetic */ a(PrivacyCheckBox privacyCheckBox, byte b10) {
            this();
        }
    }

    class b extends a {
        private b() {
            super(PrivacyCheckBox.this, (byte) 0);
        }

        @Override // sg.bigo.ads.common.view.PrivacyCheckBox.a
        protected final void a(Canvas canvas) {
            Paint paint;
            Paint.Style style;
            if (PrivacyCheckBox.this.f102910a) {
                paint = PrivacyCheckBox.this.f102914e;
                style = Paint.Style.FILL;
            } else {
                paint = PrivacyCheckBox.this.f102914e;
                style = Paint.Style.STROKE;
            }
            paint.setStyle(style);
            super.a(canvas);
        }

        @Override // sg.bigo.ads.common.view.PrivacyCheckBox.a
        protected final void b(Canvas canvas) {
            if (PrivacyCheckBox.this.f102910a) {
                PrivacyCheckBox.this.f102914e.setXfermode(PrivacyCheckBox.this.f102920k);
                super.b(canvas);
                PrivacyCheckBox.this.f102914e.setXfermode(null);
            }
        }

        /* synthetic */ b(PrivacyCheckBox privacyCheckBox, byte b10) {
            this();
        }
    }

    class c extends a {
        private c() {
            super(PrivacyCheckBox.this, (byte) 0);
        }

        @Override // sg.bigo.ads.common.view.PrivacyCheckBox.a
        protected final void a(Canvas canvas) {
            PrivacyCheckBox.this.f102914e.setStyle(Paint.Style.FILL);
            super.a(canvas);
        }

        /* synthetic */ c(PrivacyCheckBox privacyCheckBox, byte b10) {
            this();
        }
    }

    public interface d {
        void a(boolean z10);
    }

    class e implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private View.OnClickListener f102929b;

        e(View.OnClickListener onClickListener) {
            this.f102929b = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PrivacyCheckBox.this.f102910a = !r0.f102910a;
            PrivacyCheckBox.this.invalidate();
            if (PrivacyCheckBox.this.f102923n != null) {
                PrivacyCheckBox.this.f102923n.a(PrivacyCheckBox.this.f102910a);
            }
            View.OnClickListener onClickListener = this.f102929b;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public PrivacyCheckBox(Context context) {
        this(context, null);
    }

    private static int a(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == 1073741824) {
            return size;
        }
        if (mode == Integer.MIN_VALUE) {
            return Math.min(80, size);
        }
        return 80;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int iSaveLayer = canvas.saveLayer((-this.f102911b) / 2.0f, (-this.f102912c) / 2.0f, getWidth(), getHeight(), null, 31);
        canvas.translate(this.f102911b / 2, this.f102912c / 2);
        this.f102922m.a(canvas);
        this.f102922m.b(canvas);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setMeasuredDimension(a(i10), a(i11));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f102911b = i10;
        this.f102912c = i11;
        this.f102913d = (Math.min(i10, i11) / 2.0f) * 0.9f;
        this.f102915f = (Math.min(this.f102911b, this.f102912c) / 2.0f) * 0.8f;
    }

    public void setOnCheckChangeListener(d dVar) {
        this.f102923n = dVar;
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        super.setOnClickListener(new e(onClickListener));
    }

    public PrivacyCheckBox(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final PrivacyCheckBox a(boolean z10) {
        this.f102910a = z10;
        d dVar = this.f102923n;
        if (dVar != null) {
            dVar.a(z10);
        }
        invalidate();
        return this;
    }

    public PrivacyCheckBox(Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11;
        a cVar;
        super(context, attributeSet, i10);
        float f10 = (int) ((context.getResources().getDisplayMetrics().density * 1.5f) + 0.5f);
        byte b10 = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PrivacyCheckBox, i10, 0);
            this.f102916g = typedArrayObtainStyledAttributes.getColor(R.styleable.PrivacyCheckBox_bigo_ad_hcb_check_circle_color, -16736769);
            this.f102917h = typedArrayObtainStyledAttributes.getColor(R.styleable.PrivacyCheckBox_bigo_ad_hcb_uncheck_circle_color, -1);
            this.f102918i = typedArrayObtainStyledAttributes.getColor(R.styleable.PrivacyCheckBox_bigo_ad_hcb_check_hook_color, ViewCompat.MEASURED_STATE_MASK);
            this.f102919j = typedArrayObtainStyledAttributes.getColor(R.styleable.PrivacyCheckBox_bigo_ad_hcb_uncheck_hook_color, -1);
            i11 = typedArrayObtainStyledAttributes.getInt(R.styleable.PrivacyCheckBox_bigo_ad_hcb_style, 1);
            this.f102910a = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PrivacyCheckBox_bigo_ad_hcb_is_check, false);
            this.f102921l = typedArrayObtainStyledAttributes.getDimension(R.styleable.PrivacyCheckBox_bigo_ad_hcb_line_width, f10);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.f102916g = -16736769;
            this.f102917h = -1;
            this.f102918i = ViewCompat.MEASURED_STATE_MASK;
            this.f102919j = -1;
            this.f102921l = f10;
            this.f102910a = false;
            i11 = 1;
        }
        if (i11 != 2) {
            cVar = i11 == 1 ? new c(this, b10) : cVar;
            Paint paint = new Paint();
            this.f102914e = paint;
            paint.setAntiAlias(true);
            this.f102914e.setStyle(Paint.Style.FILL);
            this.f102914e.setColor(this.f102917h);
            this.f102914e.setStrokeWidth(this.f102921l);
            this.f102914e.setStrokeJoin(Paint.Join.ROUND);
            this.f102914e.setStrokeCap(Paint.Cap.ROUND);
            setLayerType(1, null);
            this.f102920k = new PorterDuffXfermode(PorterDuff.Mode.XOR);
            setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.common.view.PrivacyCheckBox.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            });
        }
        cVar = new b(this, b10);
        this.f102922m = cVar;
        Paint paint2 = new Paint();
        this.f102914e = paint2;
        paint2.setAntiAlias(true);
        this.f102914e.setStyle(Paint.Style.FILL);
        this.f102914e.setColor(this.f102917h);
        this.f102914e.setStrokeWidth(this.f102921l);
        this.f102914e.setStrokeJoin(Paint.Join.ROUND);
        this.f102914e.setStrokeCap(Paint.Cap.ROUND);
        setLayerType(1, null);
        this.f102920k = new PorterDuffXfermode(PorterDuff.Mode.XOR);
        setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.common.view.PrivacyCheckBox.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
    }
}
