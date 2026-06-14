package com.google.android.material.tooltip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.MarkerEdgeTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.OffsetEdgeTreatment;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class TooltipDrawable extends MaterialShapeDrawable implements TextDrawableHelper.TextDrawableDelegate {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final int f28266c0 = R.style.Widget_MaterialComponents_Tooltip;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final int f28267d0 = R.attr.tooltipStyle;
    private CharSequence K;
    private final Context L;
    private final Paint.FontMetrics M;
    private final TextDrawableHelper N;
    private final View.OnLayoutChangeListener O;
    private final Rect P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private boolean U;
    private int V;
    private int W;
    private float X;
    private float Y;
    private float Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private float f28268a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private float f28269b0;

    private TooltipDrawable(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.M = new Paint.FontMetrics();
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.N = textDrawableHelper;
        this.O = new View.OnLayoutChangeListener() { // from class: com.google.android.material.tooltip.TooltipDrawable.1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                TooltipDrawable.this.T(view);
            }
        };
        this.P = new Rect();
        this.X = 1.0f;
        this.Y = 1.0f;
        this.Z = 0.5f;
        this.f28268a0 = 0.5f;
        this.f28269b0 = 1.0f;
        this.L = context;
        textDrawableHelper.getTextPaint().density = context.getResources().getDisplayMetrics().density;
        textDrawableHelper.getTextPaint().setTextAlign(Paint.Align.CENTER);
    }

    private float M() {
        int i10;
        if (((this.P.right - getBounds().right) - this.W) - this.T < 0) {
            i10 = ((this.P.right - getBounds().right) - this.W) - this.T;
        } else {
            if (((this.P.left - getBounds().left) - this.W) + this.T <= 0) {
                return 0.0f;
            }
            i10 = ((this.P.left - getBounds().left) - this.W) + this.T;
        }
        return i10;
    }

    private float N() {
        this.N.getTextPaint().getFontMetrics(this.M);
        Paint.FontMetrics fontMetrics = this.M;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private float O(Rect rect) {
        return rect.centerY() - N();
    }

    private EdgeTreatment P() {
        float f10 = -M();
        float fWidth = (float) ((((double) getBounds().width()) - (((double) this.V) * Math.sqrt(2.0d))) / 2.0d);
        return new OffsetEdgeTreatment(new MarkerEdgeTreatment(this.V), Math.min(Math.max(f10, -fWidth), fWidth));
    }

    private void Q(Canvas canvas) {
        if (this.K == null) {
            return;
        }
        int iO = (int) O(getBounds());
        if (this.N.getTextAppearance() != null) {
            this.N.getTextPaint().drawableState = getState();
            this.N.updateTextPaintDrawState(this.L);
            this.N.getTextPaint().setAlpha((int) (this.f28269b0 * 255.0f));
        }
        CharSequence charSequence = this.K;
        canvas.drawText(charSequence, 0, charSequence.length(), r0.centerX(), iO, this.N.getTextPaint());
    }

    private float R() {
        CharSequence charSequence = this.K;
        if (charSequence == null) {
            return 0.0f;
        }
        return this.N.getTextWidth(charSequence.toString());
    }

    private void S(AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(this.L, attributeSet, R.styleable.Tooltip, i10, i11, new int[0]);
        this.V = this.L.getResources().getDimensionPixelSize(R.dimen.mtrl_tooltip_arrowSize);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.Tooltip_showMarker, true);
        this.U = z10;
        if (z10) {
            setShapeAppearanceModel(getShapeAppearanceModel().toBuilder().setBottomEdge(P()).build());
        } else {
            this.V = 0;
        }
        setText(typedArrayObtainStyledAttributes.getText(R.styleable.Tooltip_android_text));
        TextAppearance textAppearance = MaterialResources.getTextAppearance(this.L, typedArrayObtainStyledAttributes, R.styleable.Tooltip_android_textAppearance);
        if (textAppearance != null) {
            int i12 = R.styleable.Tooltip_android_textColor;
            if (typedArrayObtainStyledAttributes.hasValue(i12)) {
                textAppearance.setTextColor(MaterialResources.getColorStateList(this.L, typedArrayObtainStyledAttributes, i12));
            }
        }
        setTextAppearance(textAppearance);
        setFillColor(ColorStateList.valueOf(typedArrayObtainStyledAttributes.getColor(R.styleable.Tooltip_backgroundTint, MaterialColors.layer(ColorUtils.setAlphaComponent(MaterialColors.getColor(this.L, android.R.attr.colorBackground, TooltipDrawable.class.getCanonicalName()), 229), ColorUtils.setAlphaComponent(MaterialColors.getColor(this.L, R.attr.colorOnBackground, TooltipDrawable.class.getCanonicalName()), 153)))));
        setStrokeColor(ColorStateList.valueOf(MaterialColors.getColor(this.L, R.attr.colorSurface, TooltipDrawable.class.getCanonicalName())));
        this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Tooltip_android_padding, 0);
        this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Tooltip_android_minWidth, 0);
        this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Tooltip_android_minHeight, 0);
        this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Tooltip_android_layout_margin, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.W = iArr[0];
        view.getWindowVisibleDisplayFrame(this.P);
    }

    @NonNull
    public static TooltipDrawable create(@NonNull Context context) {
        return createFromAttributes(context, null, f28267d0, f28266c0);
    }

    @NonNull
    public static TooltipDrawable createFromAttributes(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10, @StyleRes int i11) {
        TooltipDrawable tooltipDrawable = new TooltipDrawable(context, attributeSet, i10, i11);
        tooltipDrawable.S(attributeSet, i10, i11);
        return tooltipDrawable;
    }

    public void detachView(@Nullable View view) {
        if (view == null) {
            return;
        }
        view.removeOnLayoutChangeListener(this.O);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        canvas.save();
        float fM = M();
        float f10 = (float) (-((((double) this.V) * Math.sqrt(2.0d)) - ((double) this.V)));
        canvas.scale(this.X, this.Y, getBounds().left + (getBounds().width() * this.Z), getBounds().top + (getBounds().height() * this.f28268a0));
        canvas.translate(fM, f10);
        super.draw(canvas);
        Q(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.N.getTextPaint().getTextSize(), this.S);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) Math.max((this.Q * 2) + R(), this.R);
    }

    public int getLayoutMargin() {
        return this.T;
    }

    public int getMinHeight() {
        return this.S;
    }

    public int getMinWidth() {
        return this.R;
    }

    @Nullable
    public CharSequence getText() {
        return this.K;
    }

    @Nullable
    public TextAppearance getTextAppearance() {
        return this.N.getTextAppearance();
    }

    public int getTextPadding() {
        return this.Q;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.U) {
            setShapeAppearanceModel(getShapeAppearanceModel().toBuilder().setBottomEdge(P()).build());
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public void onTextSizeChange() {
        invalidateSelf();
    }

    public void setLayoutMargin(@Px int i10) {
        this.T = i10;
        invalidateSelf();
    }

    public void setMinHeight(@Px int i10) {
        this.S = i10;
        invalidateSelf();
    }

    public void setMinWidth(@Px int i10) {
        this.R = i10;
        invalidateSelf();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setPivots(float f10, float f11) {
        this.Z = f10;
        this.f28268a0 = f11;
        invalidateSelf();
    }

    public void setRelativeToView(@Nullable View view) {
        if (view == null) {
            return;
        }
        T(view);
        view.addOnLayoutChangeListener(this.O);
    }

    public void setRevealFraction(@FloatRange(from = 0.0d, to = 1.0d) float f10) {
        this.X = f10;
        this.Y = f10;
        this.f28269b0 = AnimationUtils.lerp(0.0f, 1.0f, 0.19f, 1.0f, f10);
        invalidateSelf();
    }

    public void setText(@Nullable CharSequence charSequence) {
        if (TextUtils.equals(this.K, charSequence)) {
            return;
        }
        this.K = charSequence;
        this.N.setTextWidthDirty(true);
        invalidateSelf();
    }

    public void setTextAppearance(@Nullable TextAppearance textAppearance) {
        this.N.setTextAppearance(textAppearance, this.L);
    }

    public void setTextAppearanceResource(@StyleRes int i10) {
        setTextAppearance(new TextAppearance(this.L, i10));
    }

    public void setTextPadding(@Px int i10) {
        this.Q = i10;
        invalidateSelf();
    }

    public void setTextResource(@StringRes int i10) {
        setText(this.L.getResources().getString(i10));
    }

    @NonNull
    public static TooltipDrawable createFromAttributes(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        return createFromAttributes(context, attributeSet, f28267d0, f28266c0);
    }
}
