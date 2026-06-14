package com.google.android.material.shape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.annotation.AttrRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import com.google.android.material.R;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes9.dex */
public class ShapeAppearanceModel {
    public static final int NUM_CORNERS = 4;
    public static final CornerSize PILL = new RelativeCornerSize(0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    CornerTreatment f27533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    CornerTreatment f27534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    CornerTreatment f27535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    CornerTreatment f27536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    CornerSize f27537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    CornerSize f27538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    CornerSize f27539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    CornerSize f27540h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    EdgeTreatment f27541i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    EdgeTreatment f27542j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    EdgeTreatment f27543k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    EdgeTreatment f27544l;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CornerTreatment f27545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private CornerTreatment f27546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CornerTreatment f27547c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CornerTreatment f27548d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private CornerSize f27549e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private CornerSize f27550f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private CornerSize f27551g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private CornerSize f27552h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private EdgeTreatment f27553i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private EdgeTreatment f27554j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private EdgeTreatment f27555k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private EdgeTreatment f27556l;

        public Builder() {
            this.f27545a = MaterialShapeUtils.b();
            this.f27546b = MaterialShapeUtils.b();
            this.f27547c = MaterialShapeUtils.b();
            this.f27548d = MaterialShapeUtils.b();
            this.f27549e = new AbsoluteCornerSize(0.0f);
            this.f27550f = new AbsoluteCornerSize(0.0f);
            this.f27551g = new AbsoluteCornerSize(0.0f);
            this.f27552h = new AbsoluteCornerSize(0.0f);
            this.f27553i = MaterialShapeUtils.c();
            this.f27554j = MaterialShapeUtils.c();
            this.f27555k = MaterialShapeUtils.c();
            this.f27556l = MaterialShapeUtils.c();
        }

        private static float m(CornerTreatment cornerTreatment) {
            if (cornerTreatment instanceof RoundedCornerTreatment) {
                return ((RoundedCornerTreatment) cornerTreatment).f27532a;
            }
            if (cornerTreatment instanceof CutCornerTreatment) {
                return ((CutCornerTreatment) cornerTreatment).f27462a;
            }
            return -1.0f;
        }

        @NonNull
        public ShapeAppearanceModel build() {
            return new ShapeAppearanceModel(this);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setAllCornerSizes(@NonNull CornerSize cornerSize) {
            return setTopLeftCornerSize(cornerSize).setTopRightCornerSize(cornerSize).setBottomRightCornerSize(cornerSize).setBottomLeftCornerSize(cornerSize);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setAllCorners(int i10, @Dimension float f10) {
            return setAllCorners(MaterialShapeUtils.a(i10)).setAllCornerSizes(f10);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setAllEdges(@NonNull EdgeTreatment edgeTreatment) {
            return setLeftEdge(edgeTreatment).setTopEdge(edgeTreatment).setRightEdge(edgeTreatment).setBottomEdge(edgeTreatment);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomEdge(@NonNull EdgeTreatment edgeTreatment) {
            this.f27555k = edgeTreatment;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomLeftCorner(int i10, @Dimension float f10) {
            return setBottomLeftCorner(MaterialShapeUtils.a(i10)).setBottomLeftCornerSize(f10);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomLeftCornerSize(@Dimension float f10) {
            this.f27552h = new AbsoluteCornerSize(f10);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomRightCorner(int i10, @Dimension float f10) {
            return setBottomRightCorner(MaterialShapeUtils.a(i10)).setBottomRightCornerSize(f10);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomRightCornerSize(@Dimension float f10) {
            this.f27551g = new AbsoluteCornerSize(f10);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setLeftEdge(@NonNull EdgeTreatment edgeTreatment) {
            this.f27556l = edgeTreatment;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setRightEdge(@NonNull EdgeTreatment edgeTreatment) {
            this.f27554j = edgeTreatment;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopEdge(@NonNull EdgeTreatment edgeTreatment) {
            this.f27553i = edgeTreatment;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopLeftCorner(int i10, @Dimension float f10) {
            return setTopLeftCorner(MaterialShapeUtils.a(i10)).setTopLeftCornerSize(f10);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopLeftCornerSize(@Dimension float f10) {
            this.f27549e = new AbsoluteCornerSize(f10);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopRightCorner(int i10, @Dimension float f10) {
            return setTopRightCorner(MaterialShapeUtils.a(i10)).setTopRightCornerSize(f10);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopRightCornerSize(@Dimension float f10) {
            this.f27550f = new AbsoluteCornerSize(f10);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomLeftCornerSize(@NonNull CornerSize cornerSize) {
            this.f27552h = cornerSize;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomRightCornerSize(@NonNull CornerSize cornerSize) {
            this.f27551g = cornerSize;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopLeftCornerSize(@NonNull CornerSize cornerSize) {
            this.f27549e = cornerSize;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopRightCornerSize(@NonNull CornerSize cornerSize) {
            this.f27550f = cornerSize;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setAllCorners(@NonNull CornerTreatment cornerTreatment) {
            return setTopLeftCorner(cornerTreatment).setTopRightCorner(cornerTreatment).setBottomRightCorner(cornerTreatment).setBottomLeftCorner(cornerTreatment);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomLeftCorner(int i10, @NonNull CornerSize cornerSize) {
            return setBottomLeftCorner(MaterialShapeUtils.a(i10)).setBottomLeftCornerSize(cornerSize);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomRightCorner(int i10, @NonNull CornerSize cornerSize) {
            return setBottomRightCorner(MaterialShapeUtils.a(i10)).setBottomRightCornerSize(cornerSize);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopLeftCorner(int i10, @NonNull CornerSize cornerSize) {
            return setTopLeftCorner(MaterialShapeUtils.a(i10)).setTopLeftCornerSize(cornerSize);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopRightCorner(int i10, @NonNull CornerSize cornerSize) {
            return setTopRightCorner(MaterialShapeUtils.a(i10)).setTopRightCornerSize(cornerSize);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setAllCornerSizes(@Dimension float f10) {
            return setTopLeftCornerSize(f10).setTopRightCornerSize(f10).setBottomRightCornerSize(f10).setBottomLeftCornerSize(f10);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomLeftCorner(@NonNull CornerTreatment cornerTreatment) {
            this.f27548d = cornerTreatment;
            float fM = m(cornerTreatment);
            if (fM != -1.0f) {
                setBottomLeftCornerSize(fM);
            }
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomRightCorner(@NonNull CornerTreatment cornerTreatment) {
            this.f27547c = cornerTreatment;
            float fM = m(cornerTreatment);
            if (fM != -1.0f) {
                setBottomRightCornerSize(fM);
            }
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopLeftCorner(@NonNull CornerTreatment cornerTreatment) {
            this.f27545a = cornerTreatment;
            float fM = m(cornerTreatment);
            if (fM != -1.0f) {
                setTopLeftCornerSize(fM);
            }
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopRightCorner(@NonNull CornerTreatment cornerTreatment) {
            this.f27546b = cornerTreatment;
            float fM = m(cornerTreatment);
            if (fM != -1.0f) {
                setTopRightCornerSize(fM);
            }
            return this;
        }

        public Builder(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
            this.f27545a = MaterialShapeUtils.b();
            this.f27546b = MaterialShapeUtils.b();
            this.f27547c = MaterialShapeUtils.b();
            this.f27548d = MaterialShapeUtils.b();
            this.f27549e = new AbsoluteCornerSize(0.0f);
            this.f27550f = new AbsoluteCornerSize(0.0f);
            this.f27551g = new AbsoluteCornerSize(0.0f);
            this.f27552h = new AbsoluteCornerSize(0.0f);
            this.f27553i = MaterialShapeUtils.c();
            this.f27554j = MaterialShapeUtils.c();
            this.f27555k = MaterialShapeUtils.c();
            this.f27556l = MaterialShapeUtils.c();
            this.f27545a = shapeAppearanceModel.f27533a;
            this.f27546b = shapeAppearanceModel.f27534b;
            this.f27547c = shapeAppearanceModel.f27535c;
            this.f27548d = shapeAppearanceModel.f27536d;
            this.f27549e = shapeAppearanceModel.f27537e;
            this.f27550f = shapeAppearanceModel.f27538f;
            this.f27551g = shapeAppearanceModel.f27539g;
            this.f27552h = shapeAppearanceModel.f27540h;
            this.f27553i = shapeAppearanceModel.f27541i;
            this.f27554j = shapeAppearanceModel.f27542j;
            this.f27555k = shapeAppearanceModel.f27543k;
            this.f27556l = shapeAppearanceModel.f27544l;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface CornerSizeUnaryOperator {
        @NonNull
        CornerSize apply(@NonNull CornerSize cornerSize);
    }

    private static Builder a(Context context, int i10, int i11, int i12) {
        return b(context, i10, i11, new AbsoluteCornerSize(i12));
    }

    private static Builder b(Context context, int i10, int i11, CornerSize cornerSize) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i11, true);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(R.styleable.ShapeAppearance);
        try {
            int i12 = typedArrayObtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamily, 0);
            int i13 = typedArrayObtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyTopLeft, i12);
            int i14 = typedArrayObtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyTopRight, i12);
            int i15 = typedArrayObtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyBottomRight, i12);
            int i16 = typedArrayObtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyBottomLeft, i12);
            CornerSize cornerSize2 = getCornerSize(typedArrayObtainStyledAttributes, R.styleable.ShapeAppearance_cornerSize, cornerSize);
            CornerSize cornerSize3 = getCornerSize(typedArrayObtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeTopLeft, cornerSize2);
            CornerSize cornerSize4 = getCornerSize(typedArrayObtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeTopRight, cornerSize2);
            CornerSize cornerSize5 = getCornerSize(typedArrayObtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeBottomRight, cornerSize2);
            return new Builder().setTopLeftCorner(i13, cornerSize3).setTopRightCorner(i14, cornerSize4).setBottomRightCorner(i15, cornerSize5).setBottomLeftCorner(i16, getCornerSize(typedArrayObtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeBottomLeft, cornerSize2));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @NonNull
    public static Builder builder() {
        return new Builder();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static CornerSize getCornerSize(@NonNull TypedArray typedArray, int i10, @NonNull CornerSize cornerSize) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue != null) {
            int i11 = typedValuePeekValue.type;
            if (i11 == 5) {
                return new AbsoluteCornerSize(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i11 == 6) {
                return new RelativeCornerSize(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return cornerSize;
    }

    @NonNull
    public EdgeTreatment getBottomEdge() {
        return this.f27543k;
    }

    @NonNull
    public CornerTreatment getBottomLeftCorner() {
        return this.f27536d;
    }

    @NonNull
    public CornerSize getBottomLeftCornerSize() {
        return this.f27540h;
    }

    @NonNull
    public CornerTreatment getBottomRightCorner() {
        return this.f27535c;
    }

    @NonNull
    public CornerSize getBottomRightCornerSize() {
        return this.f27539g;
    }

    @NonNull
    public EdgeTreatment getLeftEdge() {
        return this.f27544l;
    }

    @NonNull
    public EdgeTreatment getRightEdge() {
        return this.f27542j;
    }

    @NonNull
    public EdgeTreatment getTopEdge() {
        return this.f27541i;
    }

    @NonNull
    public CornerTreatment getTopLeftCorner() {
        return this.f27533a;
    }

    @NonNull
    public CornerSize getTopLeftCornerSize() {
        return this.f27537e;
    }

    @NonNull
    public CornerTreatment getTopRightCorner() {
        return this.f27534b;
    }

    @NonNull
    public CornerSize getTopRightCornerSize() {
        return this.f27538f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean hasRoundedCorners() {
        return (this.f27534b instanceof RoundedCornerTreatment) && (this.f27533a instanceof RoundedCornerTreatment) && (this.f27535c instanceof RoundedCornerTreatment) && (this.f27536d instanceof RoundedCornerTreatment);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isRoundRect(@NonNull RectF rectF) {
        boolean z10 = this.f27544l.getClass().equals(EdgeTreatment.class) && this.f27542j.getClass().equals(EdgeTreatment.class) && this.f27541i.getClass().equals(EdgeTreatment.class) && this.f27543k.getClass().equals(EdgeTreatment.class);
        float cornerSize = this.f27537e.getCornerSize(rectF);
        return z10 && ((this.f27538f.getCornerSize(rectF) > cornerSize ? 1 : (this.f27538f.getCornerSize(rectF) == cornerSize ? 0 : -1)) == 0 && (this.f27540h.getCornerSize(rectF) > cornerSize ? 1 : (this.f27540h.getCornerSize(rectF) == cornerSize ? 0 : -1)) == 0 && (this.f27539g.getCornerSize(rectF) > cornerSize ? 1 : (this.f27539g.getCornerSize(rectF) == cornerSize ? 0 : -1)) == 0) && hasRoundedCorners();
    }

    @NonNull
    public Builder toBuilder() {
        return new Builder(this);
    }

    @NonNull
    public String toString() {
        return C4240b4.j.f42672d + getTopLeftCornerSize() + ", " + getTopRightCornerSize() + ", " + getBottomRightCornerSize() + ", " + getBottomLeftCornerSize() + C4240b4.j.f42674e;
    }

    @NonNull
    public ShapeAppearanceModel withCornerSize(float f10) {
        return toBuilder().setAllCornerSizes(f10).build();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ShapeAppearanceModel withTransformedCornerSizes(@NonNull CornerSizeUnaryOperator cornerSizeUnaryOperator) {
        return toBuilder().setTopLeftCornerSize(cornerSizeUnaryOperator.apply(getTopLeftCornerSize())).setTopRightCornerSize(cornerSizeUnaryOperator.apply(getTopRightCornerSize())).setBottomLeftCornerSize(cornerSizeUnaryOperator.apply(getBottomLeftCornerSize())).setBottomRightCornerSize(cornerSizeUnaryOperator.apply(getBottomRightCornerSize())).build();
    }

    private ShapeAppearanceModel(Builder builder) {
        this.f27533a = builder.f27545a;
        this.f27534b = builder.f27546b;
        this.f27535c = builder.f27547c;
        this.f27536d = builder.f27548d;
        this.f27537e = builder.f27549e;
        this.f27538f = builder.f27550f;
        this.f27539g = builder.f27551g;
        this.f27540h = builder.f27552h;
        this.f27541i = builder.f27553i;
        this.f27542j = builder.f27554j;
        this.f27543k = builder.f27555k;
        this.f27544l = builder.f27556l;
    }

    @NonNull
    public static Builder builder(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i10, @StyleRes int i11) {
        return builder(context, attributeSet, i10, i11, 0);
    }

    @NonNull
    public ShapeAppearanceModel withCornerSize(@NonNull CornerSize cornerSize) {
        return toBuilder().setAllCornerSizes(cornerSize).build();
    }

    @NonNull
    public static Builder builder(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i10, @StyleRes int i11, int i12) {
        return builder(context, attributeSet, i10, i11, new AbsoluteCornerSize(i12));
    }

    @NonNull
    public static Builder builder(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i10, @StyleRes int i11, @NonNull CornerSize cornerSize) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MaterialShape, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialShape_shapeAppearance, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialShape_shapeAppearanceOverlay, 0);
        typedArrayObtainStyledAttributes.recycle();
        return b(context, resourceId, resourceId2, cornerSize);
    }

    @NonNull
    public static Builder builder(Context context, @StyleRes int i10, @StyleRes int i11) {
        return a(context, i10, i11, 0);
    }

    public ShapeAppearanceModel() {
        this.f27533a = MaterialShapeUtils.b();
        this.f27534b = MaterialShapeUtils.b();
        this.f27535c = MaterialShapeUtils.b();
        this.f27536d = MaterialShapeUtils.b();
        this.f27537e = new AbsoluteCornerSize(0.0f);
        this.f27538f = new AbsoluteCornerSize(0.0f);
        this.f27539g = new AbsoluteCornerSize(0.0f);
        this.f27540h = new AbsoluteCornerSize(0.0f);
        this.f27541i = MaterialShapeUtils.c();
        this.f27542j = MaterialShapeUtils.c();
        this.f27543k = MaterialShapeUtils.c();
        this.f27544l = MaterialShapeUtils.c();
    }
}
