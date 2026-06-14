package i3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import com.flask.colorpicker.R$id;
import com.flask.colorpicker.R$styleable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class c extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bitmap f73936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Canvas f73937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f73938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f73939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f73940f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f73941g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Integer[] f73942h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f73943i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Integer f73944j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Integer f73945k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Paint f73946l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Paint f73947m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Paint f73948n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Paint f73949o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private i3.b f73950p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ArrayList f73951q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ArrayList f73952r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private l3.c f73953s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private l3.b f73954t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private EditText f73955u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private TextWatcher f73956v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private LinearLayout f73957w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private k3.c f73958x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f73959y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f73960z;

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Object tag;
            if (view == null || (tag = view.getTag()) == null || !(tag instanceof Integer)) {
                return;
            }
            c.this.setSelectedColor(((Integer) tag).intValue());
        }
    }

    /* JADX INFO: renamed from: i3.c$c, reason: collision with other inner class name */
    public enum EnumC0917c {
        FLOWER,
        CIRCLE;

        public static EnumC0917c a(int i10) {
            return i10 != 0 ? i10 != 1 ? FLOWER : CIRCLE : FLOWER;
        }
    }

    public c(Context context) {
        super(context);
        this.f73938d = 10;
        this.f73939e = 1.0f;
        this.f73940f = 1.0f;
        this.f73941g = 0;
        this.f73942h = new Integer[]{null, null, null, null, null};
        this.f73943i = 0;
        this.f73946l = j3.d.c().b(0).a();
        this.f73947m = j3.d.c().b(-1).a();
        this.f73948n = j3.d.c().b(ViewCompat.MEASURED_STATE_MASK).a();
        this.f73949o = j3.d.c().a();
        this.f73951q = new ArrayList();
        this.f73952r = new ArrayList();
        this.f73956v = new a();
        e(context, null);
    }

    private void b() {
        this.f73937c.drawColor(0, PorterDuff.Mode.CLEAR);
        if (this.f73958x == null) {
            return;
        }
        float width = this.f73937c.getWidth() / 2.0f;
        float f10 = (width - 2.05f) - (width / this.f73938d);
        k3.b bVarA = this.f73958x.a();
        bVarA.f85972a = this.f73938d;
        bVarA.f85973b = f10;
        bVarA.f85974c = (f10 / (r4 - 1)) / 2.0f;
        bVarA.f85975d = 2.05f;
        bVarA.f85976e = this.f73940f;
        bVarA.f85977f = this.f73939e;
        bVarA.f85978g = this.f73937c;
        this.f73958x.b(bVarA);
        this.f73958x.d();
    }

    private i3.b c(int i10) {
        float[] fArr = new float[3];
        Color.colorToHSV(i10, fArr);
        char c10 = 1;
        char c11 = 0;
        double d10 = 3.141592653589793d;
        double d11 = 180.0d;
        double dCos = ((double) fArr[1]) * Math.cos((((double) fArr[0]) * 3.141592653589793d) / 180.0d);
        double dSin = ((double) fArr[1]) * Math.sin((((double) fArr[0]) * 3.141592653589793d) / 180.0d);
        i3.b bVar = null;
        double d12 = Double.MAX_VALUE;
        for (i3.b bVar2 : this.f73958x.c()) {
            float[] fArrA = bVar2.a();
            char c12 = c10;
            char c13 = c11;
            double d13 = dSin;
            double d14 = d10;
            double d15 = d11;
            double dCos2 = dCos - (((double) fArrA[c12]) * Math.cos((((double) fArrA[c13]) * d14) / d11));
            double dSin2 = d13 - (((double) fArrA[c12]) * Math.sin((((double) fArrA[c13]) * d14) / d15));
            double d16 = (dCos2 * dCos2) + (dSin2 * dSin2);
            if (d16 < d12) {
                d12 = d16;
                bVar = bVar2;
            }
            c10 = c12;
            c11 = c13;
            dSin = d13;
            d10 = d14;
            d11 = d15;
        }
        return bVar;
    }

    private i3.b d(float f10, float f11) {
        i3.b bVar = null;
        double d10 = Double.MAX_VALUE;
        for (i3.b bVar2 : this.f73958x.c()) {
            double dF = bVar2.f(f10, f11);
            if (d10 > dF) {
                bVar = bVar2;
                d10 = dF;
            }
        }
        return bVar;
    }

    private void e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f20089n);
        this.f73938d = typedArrayObtainStyledAttributes.getInt(R$styleable.f20091p, 10);
        this.f73944j = Integer.valueOf(typedArrayObtainStyledAttributes.getInt(R$styleable.f20092q, -1));
        this.f73945k = Integer.valueOf(typedArrayObtainStyledAttributes.getInt(R$styleable.f20094s, -1));
        k3.c cVarA = j3.c.a(EnumC0917c.a(typedArrayObtainStyledAttributes.getInt(R$styleable.f20095t, 0)));
        this.f73959y = typedArrayObtainStyledAttributes.getResourceId(R$styleable.f20090o, 0);
        this.f73960z = typedArrayObtainStyledAttributes.getResourceId(R$styleable.f20093r, 0);
        setRenderer(cVarA);
        setDensity(this.f73938d);
        h(this.f73944j.intValue(), true);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void j() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredHeight < measuredWidth) {
            measuredWidth = measuredHeight;
        }
        if (measuredWidth <= 0) {
            return;
        }
        if (this.f73936b == null) {
            this.f73936b = Bitmap.createBitmap(measuredWidth, measuredWidth, Bitmap.Config.ARGB_8888);
            this.f73937c = new Canvas(this.f73936b);
            this.f73949o.setShader(j3.d.b(8));
        }
        b();
        invalidate();
    }

    private void setColorPreviewColor(int i10) {
        Integer[] numArr;
        int i11;
        LinearLayout linearLayout = this.f73957w;
        if (linearLayout == null || (numArr = this.f73942h) == null || (i11 = this.f73943i) > numArr.length || numArr[i11] == null || linearLayout.getChildCount() == 0 || this.f73957w.getVisibility() != 0) {
            return;
        }
        View childAt = this.f73957w.getChildAt(this.f73943i);
        if (childAt instanceof LinearLayout) {
            ((ImageView) ((LinearLayout) childAt).findViewById(R$id.f20072a)).setImageDrawable(new i3.a(i10));
        }
    }

    private void setColorText(int i10) {
        EditText editText = this.f73955u;
        if (editText == null) {
            return;
        }
        editText.setText(d.e(i10, this.f73954t != null));
    }

    private void setColorToSliders(int i10) {
        l3.c cVar = this.f73953s;
        if (cVar != null) {
            cVar.setColor(i10);
        }
        l3.b bVar = this.f73954t;
        if (bVar != null) {
            bVar.setColor(i10);
        }
    }

    private void setHighlightedColor(int i10) {
        int childCount = this.f73957w.getChildCount();
        if (childCount == 0 || this.f73957w.getVisibility() != 0) {
            return;
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = this.f73957w.getChildAt(i11);
            if (childAt instanceof LinearLayout) {
                LinearLayout linearLayout = (LinearLayout) childAt;
                if (i11 == i10) {
                    linearLayout.setBackgroundColor(-1);
                } else {
                    linearLayout.setBackgroundColor(0);
                }
            }
        }
    }

    protected void a(int i10, int i11) {
        ArrayList arrayList = this.f73951q;
        if (arrayList == null || i10 == i11) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            androidx.privacysandbox.ads.adservices.topics.a.a(it.next());
            try {
                throw null;
            } catch (Exception unused) {
            }
        }
    }

    public void f(int i10, boolean z10) {
        h(i10, z10);
        j();
        invalidate();
    }

    public void g(LinearLayout linearLayout, Integer num) {
        if (linearLayout == null) {
            return;
        }
        this.f73957w = linearLayout;
        if (num == null) {
            num = 0;
        }
        int childCount = linearLayout.getChildCount();
        if (childCount == 0 || linearLayout.getVisibility() != 0) {
            return;
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = linearLayout.getChildAt(i10);
            if (childAt instanceof LinearLayout) {
                LinearLayout linearLayout2 = (LinearLayout) childAt;
                if (i10 == num.intValue()) {
                    linearLayout2.setBackgroundColor(-1);
                }
                ImageView imageView = (ImageView) linearLayout2.findViewById(R$id.f20072a);
                imageView.setClickable(true);
                imageView.setTag(Integer.valueOf(i10));
                imageView.setOnClickListener(new b());
            }
        }
    }

    public Integer[] getAllColors() {
        return this.f73942h;
    }

    public int getSelectedColor() {
        i3.b bVar = this.f73950p;
        return d.a(this.f73940f, bVar != null ? Color.HSVToColor(bVar.b(this.f73939e)) : 0);
    }

    public void h(int i10, boolean z10) {
        float[] fArr = new float[3];
        Color.colorToHSV(i10, fArr);
        this.f73940f = d.d(i10);
        this.f73939e = fArr[2];
        this.f73942h[this.f73943i] = Integer.valueOf(i10);
        this.f73944j = Integer.valueOf(i10);
        setColorPreviewColor(i10);
        setColorToSliders(i10);
        if (this.f73955u != null && z10) {
            setColorText(i10);
        }
        this.f73950p = c(i10);
    }

    public void i(Integer[] numArr, int i10) {
        this.f73942h = numArr;
        this.f73943i = i10;
        Integer num = numArr[i10];
        if (num == null) {
            num = -1;
        }
        h(num.intValue(), true);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(this.f73941g);
        Bitmap bitmap = this.f73936b;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        if (this.f73950p != null) {
            float width = (((canvas.getWidth() / 2.0f) - 2.05f) / this.f73938d) / 2.0f;
            this.f73946l.setColor(Color.HSVToColor(this.f73950p.b(this.f73939e)));
            this.f73946l.setAlpha((int) (this.f73940f * 255.0f));
            canvas.drawCircle(this.f73950p.c(), this.f73950p.d(), 2.0f * width, this.f73947m);
            canvas.drawCircle(this.f73950p.c(), this.f73950p.d(), 1.5f * width, this.f73948n);
            canvas.drawCircle(this.f73950p.c(), this.f73950p.d(), width, this.f73949o);
            canvas.drawCircle(this.f73950p.c(), this.f73950p.d(), width, this.f73946l);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f73959y != 0) {
            setAlphaSlider((l3.b) getRootView().findViewById(this.f73959y));
        }
        if (this.f73960z != 0) {
            setLightnessSlider((l3.c) getRootView().findViewById(this.f73960z));
        }
        j();
        this.f73950p = c(this.f73944j.intValue());
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = mode == 0 ? i10 : (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.getSize(i10) : 0;
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode2 != 0) {
            i10 = (mode2 == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.getSize(i11) : 0;
        }
        if (i10 < size) {
            size = i10;
        }
        setMeasuredDimension(size, size);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        j();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            int r0 = r4.getAction()
            r1 = 1
            if (r0 == 0) goto L36
            if (r0 == r1) goto Ld
            r2 = 2
            if (r0 == r2) goto L36
            goto L5b
        Ld:
            int r4 = r3.getSelectedColor()
            java.util.ArrayList r0 = r3.f73952r
            if (r0 == 0) goto L29
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L20
            goto L29
        L20:
            java.lang.Object r2 = r0.next()
            androidx.privacysandbox.ads.adservices.topics.a.a(r2)
            r2 = 0
            throw r2     // Catch: java.lang.Exception -> L19
        L29:
            r3.setColorToSliders(r4)
            r3.setColorText(r4)
            r3.setColorPreviewColor(r4)
            r3.invalidate()
            goto L5b
        L36:
            int r0 = r3.getSelectedColor()
            float r2 = r4.getX()
            float r4 = r4.getY()
            i3.b r4 = r3.d(r2, r4)
            r3.f73950p = r4
            int r4 = r3.getSelectedColor()
            r3.a(r0, r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r3.f73944j = r0
            r3.setColorToSliders(r4)
            r3.invalidate()
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.c.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        j();
        this.f73950p = c(this.f73944j.intValue());
    }

    public void setAlphaSlider(l3.b bVar) {
        this.f73954t = bVar;
        if (bVar != null) {
            bVar.setColorPicker(this);
            this.f73954t.setColor(getSelectedColor());
        }
    }

    public void setAlphaValue(float f10) {
        Integer num;
        int selectedColor = getSelectedColor();
        this.f73940f = f10;
        Integer numValueOf = Integer.valueOf(Color.HSVToColor(d.b(f10), this.f73950p.b(this.f73939e)));
        this.f73944j = numValueOf;
        EditText editText = this.f73955u;
        if (editText != null) {
            editText.setText(d.e(numValueOf.intValue(), this.f73954t != null));
        }
        l3.c cVar = this.f73953s;
        if (cVar != null && (num = this.f73944j) != null) {
            cVar.setColor(num.intValue());
        }
        a(selectedColor, this.f73944j.intValue());
        j();
        invalidate();
    }

    public void setColorEdit(EditText editText) {
        this.f73955u = editText;
        if (editText != null) {
            editText.setVisibility(0);
            this.f73955u.addTextChangedListener(this.f73956v);
            setColorEditTextColor(this.f73945k.intValue());
        }
    }

    public void setColorEditTextColor(int i10) {
        this.f73945k = Integer.valueOf(i10);
        EditText editText = this.f73955u;
        if (editText != null) {
            editText.setTextColor(i10);
        }
    }

    public void setDensity(int i10) {
        this.f73938d = Math.max(2, i10);
        invalidate();
    }

    public void setLightness(float f10) {
        Integer num;
        int selectedColor = getSelectedColor();
        this.f73939e = f10;
        Integer numValueOf = Integer.valueOf(Color.HSVToColor(d.b(this.f73940f), this.f73950p.b(f10)));
        this.f73944j = numValueOf;
        EditText editText = this.f73955u;
        if (editText != null) {
            editText.setText(d.e(numValueOf.intValue(), this.f73954t != null));
        }
        l3.b bVar = this.f73954t;
        if (bVar != null && (num = this.f73944j) != null) {
            bVar.setColor(num.intValue());
        }
        a(selectedColor, this.f73944j.intValue());
        j();
        invalidate();
    }

    public void setLightnessSlider(l3.c cVar) {
        this.f73953s = cVar;
        if (cVar != null) {
            cVar.setColorPicker(this);
            this.f73953s.setColor(getSelectedColor());
        }
    }

    public void setRenderer(k3.c cVar) {
        this.f73958x = cVar;
        invalidate();
    }

    public void setSelectedColor(int i10) {
        Integer[] numArr = this.f73942h;
        if (numArr == null || numArr.length < i10) {
            return;
        }
        this.f73943i = i10;
        setHighlightedColor(i10);
        Integer num = this.f73942h[i10];
        if (num == null) {
            return;
        }
        f(num.intValue(), true);
    }

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            try {
                c.this.f(Color.parseColor(charSequence.toString()), false);
            } catch (Exception unused) {
            }
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
