package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.dycreator.baseview.GradientOrientationUtils;
import com.mbridge.msdk.dycreator.engine.b;
import com.mbridge.msdk.dycreator.engine.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class MBCusRoundImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f47797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f47798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f47799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f47800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Xfermode f47801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f47802f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f47803g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f47804h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f47805i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f47806j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f47807k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f47808l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f47809m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f47810n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float[] f47811o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float[] f47812p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private RectF f47813q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private RectF f47814r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f47815s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f47816t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Path f47817u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Paint f47818v;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f47819a;

        static {
            int[] iArr = new int[c.values().length];
            f47819a = iArr;
            try {
                iArr[c.id.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47819a[c.src.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47819a[c.background.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47819a[c.contentDescription.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47819a[c.tag.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f47819a[c.visibility.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f47819a[c.scaleType.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f47819a[c.padding.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f47819a[c.paddingTop.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f47819a[c.paddingBottom.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f47819a[c.paddingLeft.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f47819a[c.paddingRight.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f47819a[c.layout_width.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f47819a[c.layout_height.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f47819a[c.gravity.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f47819a[c.layout_gravity.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public MBCusRoundImageView(Context context) {
        this(context, null);
    }

    private void a(Canvas canvas) {
        a(canvas, this.f47809m, this.f47810n, this.f47814r, this.f47811o);
    }

    private void b() {
        int i10;
        int i11;
        int i12;
        try {
            if (this.f47811o == null || this.f47812p == null) {
                return;
            }
            int i13 = 0;
            while (true) {
                i10 = 2;
                if (i13 >= 2) {
                    break;
                }
                float[] fArr = this.f47811o;
                float f10 = this.f47805i;
                fArr[i13] = f10;
                this.f47812p[i13] = f10 - (this.f47809m / 2.0f);
                i13++;
            }
            while (true) {
                i11 = 4;
                if (i10 >= 4) {
                    break;
                }
                float[] fArr2 = this.f47811o;
                float f11 = this.f47806j;
                fArr2[i10] = f11;
                this.f47812p[i10] = f11 - (this.f47809m / 2.0f);
                i10++;
            }
            while (true) {
                if (i11 >= 6) {
                    break;
                }
                float[] fArr3 = this.f47811o;
                float f12 = this.f47807k;
                fArr3[i11] = f12;
                this.f47812p[i11] = f12 - (this.f47809m / 2.0f);
                i11++;
            }
            for (i12 = 6; i12 < 8; i12++) {
                float[] fArr4 = this.f47811o;
                float f13 = this.f47808l;
                fArr4[i12] = f13;
                this.f47812p[i12] = f13 - (this.f47809m / 2.0f);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void c() {
        RectF rectF = this.f47814r;
        if (rectF != null) {
            float f10 = this.f47809m / 2.0f;
            rectF.set(f10, f10, this.f47802f - f10, this.f47803g - f10);
        }
    }

    private void d() {
        RectF rectF = this.f47813q;
        if (rectF != null) {
            rectF.set(0.0f, 0.0f, this.f47802f, this.f47803g);
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        HashMap<String, c> mapC = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = mapC.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                int i11 = AnonymousClass1.f47819a[cVar.ordinal()];
                if (i11 == 6) {
                    String attributeValue = attributeSet.getAttributeValue(i10);
                    if (!TextUtils.isEmpty(attributeValue)) {
                        if (attributeValue.equals("invisible")) {
                            setVisibility(4);
                        } else if (attributeValue.equalsIgnoreCase("gone")) {
                            setVisibility(8);
                        }
                    }
                } else if (i11 == 13) {
                    String attributeValue2 = attributeSet.getAttributeValue(i10);
                    if (attributeValue2.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue2.startsWith("m")) {
                        layoutParams.width = -1;
                    } else if (attributeValue2.startsWith("wrap")) {
                        layoutParams.width = -2;
                    } else {
                        layoutParams.width = b.a().a(attributeValue2);
                    }
                } else if (i11 == 14) {
                    String attributeValue3 = attributeSet.getAttributeValue(i10);
                    if (attributeValue3.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue3.startsWith("m")) {
                        layoutParams.height = -1;
                    } else if (attributeValue3.startsWith("wrap")) {
                        layoutParams.height = -2;
                    } else {
                        layoutParams.height = b.a().a(attributeValue3);
                    }
                }
            }
        }
        return layoutParams;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        try {
            canvas.saveLayer(this.f47813q, null, 31);
            int i10 = this.f47802f;
            int i11 = this.f47809m * 2;
            float f10 = (i10 - i11) * 1.0f;
            float f11 = i10;
            float f12 = this.f47803g;
            canvas.scale(f10 / f11, ((r5 - i11) * 1.0f) / f12, f11 / 2.0f, f12 / 2.0f);
            super.onDraw(canvas);
            Paint paint = this.f47818v;
            if (paint != null) {
                paint.reset();
                this.f47818v.setAntiAlias(true);
                this.f47818v.setStyle(Paint.Style.FILL);
                this.f47818v.setXfermode(this.f47801e);
            }
            Path path = this.f47817u;
            if (path != null) {
                path.reset();
                this.f47817u.addRoundRect(this.f47813q, this.f47812p, Path.Direction.CCW);
            }
            canvas.drawPath(this.f47817u, this.f47818v);
            Paint paint2 = this.f47818v;
            if (paint2 != null) {
                paint2.setXfermode(null);
            }
            canvas.restore();
            if (this.f47815s) {
                a(canvas);
            }
        } catch (Exception e10) {
            q0.a("MBridgeImageView", e10.getMessage());
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        try {
            this.f47802f = i10;
            this.f47803g = i11;
            if (this.f47816t) {
                b();
            } else {
                a();
            }
            c();
            d();
        } catch (Exception e10) {
            q0.b("MBridgeImageView", e10.getMessage());
        }
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        String[] strArrSplit;
        HashMap<String, c> mapC = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = mapC.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                switch (AnonymousClass1.f47819a[cVar.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i10);
                        if (attributeValue.startsWith("@+id/")) {
                            setId(attributeValue.substring(5).hashCode());
                        }
                        break;
                    case 2:
                        b.a().a(attributeSet.getAttributeValue(i10), this);
                        break;
                    case 3:
                        String attributeValue2 = attributeSet.getAttributeValue(i10);
                        if (attributeValue2.startsWith("#")) {
                            try {
                                strArrSplit = attributeValue2.split(TokenBuilder.TOKEN_DELIMITER);
                            } catch (Exception unused) {
                                strArrSplit = null;
                            }
                            if (strArrSplit != null && strArrSplit.length <= 2) {
                                setBackgroundColor(b.a().d(attributeSet.getAttributeValue(i10)));
                            } else if (strArrSplit == null || strArrSplit.length != 3) {
                                setBackgroundColor(b.a().d(attributeSet.getAttributeValue(i10)));
                            } else {
                                try {
                                    GradientDrawable gradientDrawable = new GradientDrawable(GradientOrientationUtils.getOrientation(strArrSplit[2]), new int[]{Color.parseColor(strArrSplit[0]), Color.parseColor(strArrSplit[1])});
                                    gradientDrawable.setGradientType(0);
                                    setBackground(gradientDrawable);
                                } catch (Exception unused2) {
                                    setBackgroundColor(b.a().d(attributeSet.getAttributeValue(i10)));
                                }
                            }
                        } else {
                            if (attributeValue2.startsWith("@drawable/")) {
                                attributeValue2 = attributeValue2.substring(10);
                            }
                            setBackgroundResource(getResources().getIdentifier(attributeValue2, "drawable", getContext().getPackageName()));
                        }
                        break;
                    case 4:
                        String attributeValue3 = attributeSet.getAttributeValue(i10);
                        if (!TextUtils.isEmpty(attributeValue3)) {
                            CharSequence charSequence = (String) com.mbridge.msdk.dycreator.utils.b.f48156a.get(attributeValue3.substring(8));
                            if (!TextUtils.isEmpty(charSequence)) {
                                setContentDescription(charSequence);
                            }
                        }
                        break;
                    case 5:
                        String attributeValue4 = attributeSet.getAttributeValue(i10);
                        if (!TextUtils.isEmpty(attributeValue4)) {
                            String str = com.mbridge.msdk.dycreator.utils.b.f48156a.get(attributeValue4.substring(8));
                            if (!TextUtils.isEmpty(str)) {
                                setTag(str);
                            }
                        }
                        break;
                    case 6:
                        String attributeValue5 = attributeSet.getAttributeValue(i10);
                        if (!TextUtils.isEmpty(attributeValue5)) {
                            if (attributeValue5.equals("invisible")) {
                                setVisibility(4);
                            } else if (attributeValue5.equalsIgnoreCase("gone")) {
                                setVisibility(8);
                            }
                        }
                        break;
                    case 7:
                        String attributeValue6 = attributeSet.getAttributeValue(i10);
                        if (!TextUtils.isEmpty(attributeValue6)) {
                            if (attributeValue6.equals("fitXY")) {
                                setScaleType(ImageView.ScaleType.FIT_XY);
                            } else if (attributeValue6.equals("centerInside")) {
                                setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                            } else if (attributeValue6.equals("centerCrop")) {
                                setScaleType(ImageView.ScaleType.CENTER_CROP);
                            }
                        }
                        break;
                    case 8:
                        int iA = b.a().a(attributeSet.getAttributeValue(i10));
                        this.f47800d = iA;
                        this.f47799c = iA;
                        this.f47798b = iA;
                        this.f47797a = iA;
                        setPadding(iA, iA, iA, iA);
                        break;
                    case 9:
                        int iA2 = b.a().a(attributeSet.getAttributeValue(i10));
                        this.f47798b = iA2;
                        setPadding(this.f47797a, iA2, this.f47799c, this.f47800d);
                        break;
                    case 10:
                        int iA3 = b.a().a(attributeSet.getAttributeValue(i10));
                        this.f47800d = iA3;
                        setPadding(this.f47797a, this.f47798b, this.f47799c, iA3);
                        break;
                    case 11:
                        int iA4 = b.a().a(attributeSet.getAttributeValue(i10));
                        this.f47797a = iA4;
                        setPadding(iA4, this.f47798b, this.f47799c, this.f47800d);
                        break;
                    case 12:
                        int iA5 = b.a().a(attributeSet.getAttributeValue(i10));
                        this.f47799c = iA5;
                        setPadding(this.f47797a, this.f47798b, iA5, this.f47800d);
                        break;
                }
            }
        }
    }

    public void setBorder(int i10, int i11, int i12) {
        this.f47815s = true;
        this.f47809m = i11;
        this.f47810n = i12;
        this.f47804h = i10;
    }

    public void setCornerRadius(int i10) {
        this.f47804h = i10;
    }

    public void setCustomBorder(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f47815s = true;
        this.f47816t = true;
        this.f47809m = i14;
        this.f47810n = i15;
        this.f47805i = i10;
        this.f47807k = i12;
        this.f47806j = i11;
        this.f47808l = i13;
    }

    public MBCusRoundImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
        try {
            setAttributeSet(attributeSet);
            setLayoutParams(generateLayoutParams(context, attributeSet));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void a(Canvas canvas, int i10, int i11, RectF rectF, float[] fArr) {
        try {
            a(i10, i11);
            Path path = this.f47817u;
            if (path != null) {
                path.addRoundRect(rectF, fArr, Path.Direction.CCW);
            }
            if (canvas != null) {
                canvas.drawPath(this.f47817u, this.f47818v);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public MBCusRoundImageView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f47817u = new Path();
        this.f47818v = new Paint();
        this.f47811o = new float[8];
        this.f47812p = new float[8];
        this.f47814r = new RectF();
        this.f47813q = new RectF();
        this.f47801e = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    private void a(int i10, int i11) {
        Path path = this.f47817u;
        if (path != null) {
            path.reset();
        }
        Paint paint = this.f47818v;
        if (paint != null) {
            paint.setStrokeWidth(i10);
            this.f47818v.setColor(i11);
            this.f47818v.setStyle(Paint.Style.STROKE);
        }
    }

    private void a() {
        if (this.f47811o == null || this.f47812p == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            try {
                float[] fArr = this.f47811o;
                if (i10 >= fArr.length) {
                    return;
                }
                float f10 = this.f47804h;
                fArr[i10] = f10;
                this.f47812p[i10] = f10 - (this.f47809m / 2.0f);
                i10++;
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
    }
}
