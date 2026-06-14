package com.google.android.material.shape;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import com.google.android.material.R;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class StateListCornerSize {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f27605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CornerSize f27606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int[][] f27607c = new int[10][];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    CornerSize[] f27608d = new CornerSize[10];

    private void a(int[] iArr, CornerSize cornerSize) {
        int i10 = this.f27605a;
        if (i10 == 0 || iArr.length == 0) {
            this.f27606b = cornerSize;
        }
        if (i10 >= this.f27607c.length) {
            b(i10, i10 + 10);
        }
        int[][] iArr2 = this.f27607c;
        int i11 = this.f27605a;
        iArr2[i11] = iArr;
        this.f27608d[i11] = cornerSize;
        this.f27605a = i11 + 1;
    }

    private void b(int i10, int i11) {
        int[][] iArr = new int[i11][];
        System.arraycopy(this.f27607c, 0, iArr, 0, i10);
        this.f27607c = iArr;
        CornerSize[] cornerSizeArr = new CornerSize[i11];
        System.arraycopy(this.f27608d, 0, cornerSizeArr, 0, i10);
        this.f27608d = cornerSizeArr;
    }

    private int c(int[] iArr) {
        int[][] iArr2 = this.f27607c;
        for (int i10 = 0; i10 < this.f27605a; i10++) {
            if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                return i10;
            }
        }
        return -1;
    }

    @NonNull
    public static StateListCornerSize create(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i10, @NonNull CornerSize cornerSize) {
        int next;
        int resourceId = typedArray.getResourceId(i10, 0);
        if (resourceId == 0) {
            return create(ShapeAppearanceModel.getCornerSize(typedArray, i10, cornerSize));
        }
        if (!context.getResources().getResourceTypeName(resourceId).equals("xml")) {
            return create(ShapeAppearanceModel.getCornerSize(typedArray, i10, cornerSize));
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                StateListCornerSize stateListCornerSize = new StateListCornerSize();
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (xml.getName().equals("selector")) {
                    stateListCornerSize.d(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                xml.close();
                return stateListCornerSize;
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
            return create(cornerSize);
        }
    }

    private void d(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, R.styleable.ShapeAppearance) : theme.obtainStyledAttributes(attributeSet, R.styleable.ShapeAppearance, 0, 0);
                CornerSize cornerSize = ShapeAppearanceModel.getCornerSize(typedArrayObtainAttributes, R.styleable.ShapeAppearance_cornerSize, new AbsoluteCornerSize(0.0f));
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i10 = 0;
                for (int i11 = 0; i11 < attributeCount; i11++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i11);
                    if (attributeNameResource != R.attr.cornerSize) {
                        int i12 = i10 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i10] = attributeNameResource;
                        i10 = i12;
                    }
                }
                a(StateSet.trimStateSet(iArr, i10), cornerSize);
            }
        }
    }

    @NonNull
    public CornerSize getCornerSizeForState(@NonNull int[] iArr) {
        int iC = c(iArr);
        if (iC < 0) {
            iC = c(StateSet.WILD_CARD);
        }
        return iC < 0 ? this.f27606b : this.f27608d[iC];
    }

    @NonNull
    public CornerSize getDefaultCornerSize() {
        return this.f27606b;
    }

    public boolean isStateful() {
        return this.f27605a > 1;
    }

    @NonNull
    public StateListCornerSize withTransformedCornerSizes(@NonNull ShapeAppearanceModel.CornerSizeUnaryOperator cornerSizeUnaryOperator) {
        StateListCornerSize stateListCornerSize = new StateListCornerSize();
        stateListCornerSize.f27605a = this.f27605a;
        int[][] iArr = new int[this.f27607c.length][];
        stateListCornerSize.f27607c = iArr;
        int[][] iArr2 = this.f27607c;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        stateListCornerSize.f27608d = new CornerSize[this.f27608d.length];
        for (int i10 = 0; i10 < this.f27605a; i10++) {
            stateListCornerSize.f27608d[i10] = cornerSizeUnaryOperator.apply(this.f27608d[i10]);
        }
        return stateListCornerSize;
    }

    @NonNull
    public static StateListCornerSize create(@NonNull CornerSize cornerSize) {
        StateListCornerSize stateListCornerSize = new StateListCornerSize();
        stateListCornerSize.a(StateSet.WILD_CARD, cornerSize);
        return stateListCornerSize;
    }
}
