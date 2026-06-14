package com.google.maps.android.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.maps.android.R;

/* JADX INFO: loaded from: classes9.dex */
public class IconGenerator {
    public static final int STYLE_BLUE = 4;
    public static final int STYLE_DEFAULT = 1;
    public static final int STYLE_GREEN = 5;
    public static final int STYLE_ORANGE = 7;
    public static final int STYLE_PURPLE = 6;
    public static final int STYLE_RED = 3;
    public static final int STYLE_WHITE = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f34069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewGroup f34070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RotationLayout f34071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TextView f34072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f34073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f34074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f34075g = 0.5f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f34076h = 1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private BubbleDrawable f34077i;

    public IconGenerator(Context context) {
        this.f34069a = context;
        this.f34077i = new BubbleDrawable(context);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.amu_text_bubble, (ViewGroup) null);
        this.f34070b = viewGroup;
        RotationLayout rotationLayout = (RotationLayout) viewGroup.getChildAt(0);
        this.f34071c = rotationLayout;
        TextView textView = (TextView) rotationLayout.findViewById(R.id.amu_text);
        this.f34072d = textView;
        this.f34073e = textView;
        setStyle(1);
    }

    private static int a(int i10) {
        if (i10 == 3) {
            return -3407872;
        }
        if (i10 == 4) {
            return -16737844;
        }
        if (i10 == 5) {
            return -10053376;
        }
        if (i10 != 6) {
            return i10 != 7 ? -1 : -30720;
        }
        return -6736948;
    }

    private static int b(int i10) {
        return (i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? R.style.amu_Bubble_TextAppearance_Light : R.style.amu_Bubble_TextAppearance_Dark;
    }

    private float c(float f10, float f11) {
        int i10 = this.f34074f;
        if (i10 == 0) {
            return f10;
        }
        if (i10 == 1) {
            return 1.0f - f11;
        }
        if (i10 == 2) {
            return 1.0f - f10;
        }
        if (i10 == 3) {
            return f11;
        }
        throw new IllegalStateException();
    }

    public float getAnchorU() {
        return c(this.f34075g, this.f34076h);
    }

    public float getAnchorV() {
        return c(this.f34076h, this.f34075g);
    }

    public Bitmap makeIcon(CharSequence charSequence) {
        TextView textView = this.f34072d;
        if (textView != null) {
            textView.setText(charSequence);
        }
        return makeIcon();
    }

    public void setBackground(Drawable drawable) {
        this.f34070b.setBackgroundDrawable(drawable);
        if (drawable == null) {
            this.f34070b.setPadding(0, 0, 0, 0);
            return;
        }
        Rect rect = new Rect();
        drawable.getPadding(rect);
        this.f34070b.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void setColor(int i10) {
        this.f34077i.setColor(i10);
        setBackground(this.f34077i);
    }

    public void setContentPadding(int i10, int i11, int i12, int i13) {
        this.f34073e.setPadding(i10, i11, i12, i13);
    }

    public void setContentRotation(int i10) {
        this.f34071c.setViewRotation(i10);
    }

    public void setContentView(View view) {
        this.f34071c.removeAllViews();
        this.f34071c.addView(view);
        this.f34073e = view;
        View viewFindViewById = this.f34071c.findViewById(R.id.amu_text);
        this.f34072d = viewFindViewById instanceof TextView ? (TextView) viewFindViewById : null;
    }

    public void setRotation(int i10) {
        this.f34074f = ((i10 + 360) % 360) / 90;
    }

    public void setStyle(int i10) {
        setColor(a(i10));
        setTextAppearance(this.f34069a, b(i10));
    }

    public void setTextAppearance(Context context, int i10) {
        TextView textView = this.f34072d;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void setTextAppearance(int i10) {
        setTextAppearance(this.f34069a, i10);
    }

    public Bitmap makeIcon() {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f34070b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredWidth = this.f34070b.getMeasuredWidth();
        int measuredHeight = this.f34070b.getMeasuredHeight();
        this.f34070b.layout(0, 0, measuredWidth, measuredHeight);
        int i10 = this.f34074f;
        if (i10 == 1 || i10 == 3) {
            measuredHeight = this.f34070b.getMeasuredWidth();
            measuredWidth = this.f34070b.getMeasuredHeight();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(0);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int i11 = this.f34074f;
        if (i11 == 1) {
            canvas.translate(measuredWidth, 0.0f);
            canvas.rotate(90.0f);
        } else if (i11 == 2) {
            canvas.rotate(180.0f, measuredWidth / 2, measuredHeight / 2);
        } else if (i11 == 3) {
            canvas.translate(0.0f, measuredHeight);
            canvas.rotate(270.0f);
        }
        this.f34070b.draw(canvas);
        return bitmapCreateBitmap;
    }
}
