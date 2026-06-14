package com.google.android.material.shape;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import com.google.android.material.R;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import j$.util.Objects;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class StateListShapeAppearanceModel {
    public static final int CORNER_BOTTOM_LEFT = 4;
    public static final int CORNER_BOTTOM_RIGHT = 8;
    public static final int CORNER_TOP_LEFT = 1;
    public static final int CORNER_TOP_RIGHT = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f27609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ShapeAppearanceModel f27610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int[][] f27611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ShapeAppearanceModel[] f27612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final StateListCornerSize f27613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final StateListCornerSize f27614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final StateListCornerSize f27615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final StateListCornerSize f27616h;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f27617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ShapeAppearanceModel f27618b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int[][] f27619c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ShapeAppearanceModel[] f27620d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private StateListCornerSize f27621e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private StateListCornerSize f27622f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private StateListCornerSize f27623g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private StateListCornerSize f27624h;

        private boolean i(int i10, int i11) {
            return (i11 | i10) == i10;
        }

        private void j(int i10, int i11) {
            int[][] iArr = new int[i11][];
            System.arraycopy(this.f27619c, 0, iArr, 0, i10);
            this.f27619c = iArr;
            ShapeAppearanceModel[] shapeAppearanceModelArr = new ShapeAppearanceModel[i11];
            System.arraycopy(this.f27620d, 0, shapeAppearanceModelArr, 0, i10);
            this.f27620d = shapeAppearanceModelArr;
        }

        private void k() {
            this.f27618b = new ShapeAppearanceModel();
            this.f27619c = new int[10][];
            this.f27620d = new ShapeAppearanceModel[10];
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addStateShapeAppearanceModel(@NonNull int[] iArr, @NonNull ShapeAppearanceModel shapeAppearanceModel) {
            int i10 = this.f27617a;
            if (i10 == 0 || iArr.length == 0) {
                this.f27618b = shapeAppearanceModel;
            }
            if (i10 >= this.f27619c.length) {
                j(i10, i10 + 10);
            }
            int[][] iArr2 = this.f27619c;
            int i11 = this.f27617a;
            iArr2[i11] = iArr;
            this.f27620d[i11] = shapeAppearanceModel;
            this.f27617a = i11 + 1;
            return this;
        }

        @Nullable
        public StateListShapeAppearanceModel build() {
            if (this.f27617a == 0) {
                return null;
            }
            return new StateListShapeAppearanceModel(this);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setCornerSizeOverride(@NonNull StateListCornerSize stateListCornerSize, int i10) {
            if (i(i10, 1)) {
                this.f27621e = stateListCornerSize;
            }
            if (i(i10, 2)) {
                this.f27622f = stateListCornerSize;
            }
            if (i(i10, 4)) {
                this.f27623g = stateListCornerSize;
            }
            if (i(i10, 8)) {
                this.f27624h = stateListCornerSize;
            }
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder withTransformedCornerSizes(@NonNull ShapeAppearanceModel.CornerSizeUnaryOperator cornerSizeUnaryOperator) {
            ShapeAppearanceModel[] shapeAppearanceModelArr = new ShapeAppearanceModel[this.f27620d.length];
            for (int i10 = 0; i10 < this.f27617a; i10++) {
                shapeAppearanceModelArr[i10] = this.f27620d[i10].withTransformedCornerSizes(cornerSizeUnaryOperator);
            }
            this.f27620d = shapeAppearanceModelArr;
            StateListCornerSize stateListCornerSize = this.f27621e;
            if (stateListCornerSize != null) {
                this.f27621e = stateListCornerSize.withTransformedCornerSizes(cornerSizeUnaryOperator);
            }
            StateListCornerSize stateListCornerSize2 = this.f27622f;
            if (stateListCornerSize2 != null) {
                this.f27622f = stateListCornerSize2.withTransformedCornerSizes(cornerSizeUnaryOperator);
            }
            StateListCornerSize stateListCornerSize3 = this.f27623g;
            if (stateListCornerSize3 != null) {
                this.f27623g = stateListCornerSize3.withTransformedCornerSizes(cornerSizeUnaryOperator);
            }
            StateListCornerSize stateListCornerSize4 = this.f27624h;
            if (stateListCornerSize4 != null) {
                this.f27624h = stateListCornerSize4.withTransformedCornerSizes(cornerSizeUnaryOperator);
            }
            return this;
        }

        public Builder(@NonNull StateListShapeAppearanceModel stateListShapeAppearanceModel) {
            int i10 = stateListShapeAppearanceModel.f27609a;
            this.f27617a = i10;
            this.f27618b = stateListShapeAppearanceModel.f27610b;
            int[][] iArr = stateListShapeAppearanceModel.f27611c;
            int[][] iArr2 = new int[iArr.length][];
            this.f27619c = iArr2;
            this.f27620d = new ShapeAppearanceModel[stateListShapeAppearanceModel.f27612d.length];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(stateListShapeAppearanceModel.f27612d, 0, this.f27620d, 0, this.f27617a);
            this.f27621e = stateListShapeAppearanceModel.f27613e;
            this.f27622f = stateListShapeAppearanceModel.f27614f;
            this.f27623g = stateListShapeAppearanceModel.f27615g;
            this.f27624h = stateListShapeAppearanceModel.f27616h;
        }

        public Builder(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
            k();
            addStateShapeAppearanceModel(StateSet.WILD_CARD, shapeAppearanceModel);
        }

        private Builder(Context context, int i10) {
            int next;
            k();
            try {
                XmlResourceParser xml = context.getResources().getXml(i10);
                try {
                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                    do {
                        next = xml.next();
                        if (next == 2) {
                            break;
                        }
                    } while (next != 1);
                    if (next == 2) {
                        if (xml.getName().equals("selector")) {
                            StateListShapeAppearanceModel.d(this, context, xml, attributeSetAsAttributeSet, context.getTheme());
                        }
                        xml.close();
                        return;
                    }
                    throw new XmlPullParserException("No start tag found");
                } catch (Throwable th2) {
                    if (xml != null) {
                        try {
                            xml.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                k();
            }
        }
    }

    private int c(int[] iArr) {
        int[][] iArr2 = this.f27611c;
        for (int i10 = 0; i10 < this.f27609a; i10++) {
            if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                return i10;
            }
        }
        return -1;
    }

    @Nullable
    public static StateListShapeAppearanceModel create(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i10) {
        int resourceId = typedArray.getResourceId(i10, 0);
        if (resourceId != 0 && Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return new Builder(context, resourceId).build();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Builder builder, Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, R.styleable.MaterialShape) : theme.obtainStyledAttributes(attributeSet, R.styleable.MaterialShape, 0, 0);
                ShapeAppearanceModel shapeAppearanceModelBuild = ShapeAppearanceModel.builder(context, typedArrayObtainAttributes.getResourceId(R.styleable.MaterialShape_shapeAppearance, 0), typedArrayObtainAttributes.getResourceId(R.styleable.MaterialShape_shapeAppearanceOverlay, 0)).build();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i10 = 0;
                for (int i11 = 0; i11 < attributeCount; i11++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i11);
                    if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                        int i12 = i10 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i10] = attributeNameResource;
                        i10 = i12;
                    }
                }
                builder.addStateShapeAppearanceModel(StateSet.trimStateSet(iArr, i10), shapeAppearanceModelBuild);
            }
        }
    }

    public static int swapCornerPositionRtl(int i10) {
        int i11 = i10 & 5;
        return ((i10 & 10) >> 1) | (i11 << 1);
    }

    protected ShapeAppearanceModel b(int[] iArr) {
        int iC = c(iArr);
        if (iC < 0) {
            iC = c(StateSet.WILD_CARD);
        }
        if (this.f27613e == null && this.f27614f == null && this.f27615g == null && this.f27616h == null) {
            return this.f27612d[iC];
        }
        ShapeAppearanceModel.Builder builder = this.f27612d[iC].toBuilder();
        StateListCornerSize stateListCornerSize = this.f27613e;
        if (stateListCornerSize != null) {
            builder.setTopLeftCornerSize(stateListCornerSize.getCornerSizeForState(iArr));
        }
        StateListCornerSize stateListCornerSize2 = this.f27614f;
        if (stateListCornerSize2 != null) {
            builder.setTopRightCornerSize(stateListCornerSize2.getCornerSizeForState(iArr));
        }
        StateListCornerSize stateListCornerSize3 = this.f27615g;
        if (stateListCornerSize3 != null) {
            builder.setBottomLeftCornerSize(stateListCornerSize3.getCornerSizeForState(iArr));
        }
        StateListCornerSize stateListCornerSize4 = this.f27616h;
        if (stateListCornerSize4 != null) {
            builder.setBottomRightCornerSize(stateListCornerSize4.getCornerSizeForState(iArr));
        }
        return builder.build();
    }

    @NonNull
    public ShapeAppearanceModel getDefaultShape(boolean z10) {
        if (!z10 || (this.f27613e == null && this.f27614f == null && this.f27615g == null && this.f27616h == null)) {
            return this.f27610b;
        }
        ShapeAppearanceModel.Builder builder = this.f27610b.toBuilder();
        StateListCornerSize stateListCornerSize = this.f27613e;
        if (stateListCornerSize != null) {
            builder.setTopLeftCornerSize(stateListCornerSize.getDefaultCornerSize());
        }
        StateListCornerSize stateListCornerSize2 = this.f27614f;
        if (stateListCornerSize2 != null) {
            builder.setTopRightCornerSize(stateListCornerSize2.getDefaultCornerSize());
        }
        StateListCornerSize stateListCornerSize3 = this.f27615g;
        if (stateListCornerSize3 != null) {
            builder.setBottomLeftCornerSize(stateListCornerSize3.getDefaultCornerSize());
        }
        StateListCornerSize stateListCornerSize4 = this.f27616h;
        if (stateListCornerSize4 != null) {
            builder.setBottomRightCornerSize(stateListCornerSize4.getDefaultCornerSize());
        }
        return builder.build();
    }

    public int getStateCount() {
        return this.f27609a;
    }

    public boolean isStateful() {
        StateListCornerSize stateListCornerSize;
        StateListCornerSize stateListCornerSize2;
        StateListCornerSize stateListCornerSize3;
        StateListCornerSize stateListCornerSize4;
        return this.f27609a > 1 || ((stateListCornerSize = this.f27613e) != null && stateListCornerSize.isStateful()) || (((stateListCornerSize2 = this.f27614f) != null && stateListCornerSize2.isStateful()) || (((stateListCornerSize3 = this.f27615g) != null && stateListCornerSize3.isStateful()) || ((stateListCornerSize4 = this.f27616h) != null && stateListCornerSize4.isStateful())));
    }

    @NonNull
    public Builder toBuilder() {
        return new Builder(this);
    }

    @NonNull
    public StateListShapeAppearanceModel withTransformedCornerSizes(@NonNull ShapeAppearanceModel.CornerSizeUnaryOperator cornerSizeUnaryOperator) {
        return toBuilder().withTransformedCornerSizes(cornerSizeUnaryOperator).build();
    }

    private StateListShapeAppearanceModel(Builder builder) {
        this.f27609a = builder.f27617a;
        this.f27610b = builder.f27618b;
        this.f27611c = builder.f27619c;
        this.f27612d = builder.f27620d;
        this.f27613e = builder.f27621e;
        this.f27614f = builder.f27622f;
        this.f27615g = builder.f27623g;
        this.f27616h = builder.f27624h;
    }
}
