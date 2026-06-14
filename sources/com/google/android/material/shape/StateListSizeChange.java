package com.google.android.material.shape;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import com.google.android.material.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class StateListSizeChange {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f27625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SizeChange f27626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int[][] f27627c = new int[10][];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    SizeChange[] f27628d = new SizeChange[10];

    public static class SizeChange {

        @Nullable
        public SizeChangeAmount widthChange;

        SizeChange(SizeChangeAmount sizeChangeAmount) {
            this.widthChange = sizeChangeAmount;
        }
    }

    public static class SizeChangeAmount {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        SizeChangeType f27629a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f27630b;

        SizeChangeAmount(SizeChangeType sizeChangeType, float f10) {
            this.f27629a = sizeChangeType;
            this.f27630b = f10;
        }

        public int getChange(@Px int i10) {
            SizeChangeType sizeChangeType = this.f27629a;
            if (sizeChangeType == SizeChangeType.PERCENT) {
                return (int) (this.f27630b * i10);
            }
            if (sizeChangeType == SizeChangeType.PIXELS) {
                return (int) this.f27630b;
            }
            return 0;
        }
    }

    public enum SizeChangeType {
        PERCENT,
        PIXELS
    }

    private void a(int[] iArr, SizeChange sizeChange) {
        int i10 = this.f27625a;
        if (i10 == 0 || iArr.length == 0) {
            this.f27626b = sizeChange;
        }
        if (i10 >= this.f27627c.length) {
            c(i10, i10 + 10);
        }
        int[][] iArr2 = this.f27627c;
        int i11 = this.f27625a;
        iArr2[i11] = iArr;
        this.f27628d[i11] = sizeChange;
        this.f27625a = i11 + 1;
    }

    private SizeChangeAmount b(TypedArray typedArray, int i10, SizeChangeAmount sizeChangeAmount) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue != null) {
            int i11 = typedValuePeekValue.type;
            if (i11 == 5) {
                return new SizeChangeAmount(SizeChangeType.PIXELS, TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i11 == 6) {
                return new SizeChangeAmount(SizeChangeType.PERCENT, typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return sizeChangeAmount;
    }

    private void c(int i10, int i11) {
        int[][] iArr = new int[i11][];
        System.arraycopy(this.f27627c, 0, iArr, 0, i10);
        this.f27627c = iArr;
        SizeChange[] sizeChangeArr = new SizeChange[i11];
        System.arraycopy(this.f27628d, 0, sizeChangeArr, 0, i10);
        this.f27628d = sizeChangeArr;
    }

    @Nullable
    public static StateListSizeChange create(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i10) {
        int next;
        int resourceId = typedArray.getResourceId(i10, 0);
        if (resourceId == 0 || !context.getResources().getResourceTypeName(resourceId).equals("xml")) {
            return null;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                StateListSizeChange stateListSizeChange = new StateListSizeChange();
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
                    stateListSizeChange.e(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                xml.close();
                return stateListSizeChange;
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
            return null;
        }
    }

    private int d(int[] iArr) {
        int[][] iArr2 = this.f27627c;
        for (int i10 = 0; i10 < this.f27625a; i10++) {
            if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                return i10;
            }
        }
        return -1;
    }

    private void e(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, R.styleable.StateListSizeChange) : theme.obtainStyledAttributes(attributeSet, R.styleable.StateListSizeChange, 0, 0);
                SizeChangeAmount sizeChangeAmountB = b(typedArrayObtainAttributes, R.styleable.StateListSizeChange_widthChange, null);
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i10 = 0;
                for (int i11 = 0; i11 < attributeCount; i11++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i11);
                    if (attributeNameResource != R.attr.widthChange) {
                        int i12 = i10 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i10] = attributeNameResource;
                        i10 = i12;
                    }
                }
                a(StateSet.trimStateSet(iArr, i10), new SizeChange(sizeChangeAmountB));
            }
        }
    }

    @NonNull
    public SizeChange getDefaultSizeChange() {
        return this.f27626b;
    }

    public int getMaxWidthChange(@Px int i10) {
        float fMax;
        int i11 = -i10;
        for (int i12 = 0; i12 < this.f27625a; i12++) {
            SizeChangeAmount sizeChangeAmount = this.f27628d[i12].widthChange;
            SizeChangeType sizeChangeType = sizeChangeAmount.f27629a;
            if (sizeChangeType == SizeChangeType.PIXELS) {
                fMax = Math.max(i11, sizeChangeAmount.f27630b);
            } else if (sizeChangeType == SizeChangeType.PERCENT) {
                fMax = Math.max(i11, i10 * sizeChangeAmount.f27630b);
            }
            i11 = (int) fMax;
        }
        return i11;
    }

    @NonNull
    public SizeChange getSizeChangeForState(@NonNull int[] iArr) {
        int iD = d(iArr);
        if (iD < 0) {
            iD = d(StateSet.WILD_CARD);
        }
        return iD < 0 ? this.f27626b : this.f27628d[iD];
    }

    public boolean isStateful() {
        return this.f27625a > 1;
    }
}
