package com.monetization.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.EditText;
import android.widget.TextView;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.cg;
import yads.he2;
import yads.ow2;
import yads.vh1;
import yads.wh1;
import yads.xf;
import yads.yf;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/monetization/ads/fullscreen/template/view/ExtendedTextView;", "Landroid/widget/TextView;", "Lyads/wh1;", "measureSpecProvider", "", "setMeasureSpecProvider", "(Lyads/wh1;)V", "", "autoSizeTextType", "setAutoSizeTextType", "(I)V", "unit", "", "size", "setTextSize", "(IF)V", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/util/AttributeSet;", "attributeSet", "defStyleAttr", "Lyads/yf;", "appCompatAutoSizeControllerFactory", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILyads/wh1;Lyads/yf;)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
public final class ExtendedTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private wh1 f59017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xf f59018b;

    @SuppressLint({"CustomViewStyleable"})
    public ExtendedTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, null, 28, null);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        xf xfVar;
        super.onLayout(z10, i10, i11, i12, i13);
        if (Build.VERSION.SDK_INT < 27 && (xfVar = this.f59018b) != null) {
            xfVar.f117807a.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        vh1 vh1VarA = this.f59017a.a(i10, i11);
        super.onMeasure(vh1VarA.f117010a, vh1VarA.f117011b);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        xf xfVar;
        super.onTextChanged(charSequence, i10, i11, i12);
        if (Build.VERSION.SDK_INT < 27 && (xfVar = this.f59018b) != null) {
            xfVar.f117807a.a();
        }
    }

    public final void setAutoSizeTextType(int autoSizeTextType) {
        if (Build.VERSION.SDK_INT >= 27) {
            setAutoSizeTextTypeWithDefaults(autoSizeTextType);
            return;
        }
        xf xfVar = this.f59018b;
        if (xfVar != null) {
            cg cgVar = xfVar.f117807a;
            if (cgVar.f109394g instanceof EditText) {
                return;
            }
            if (autoSizeTextType == 0) {
                cgVar.f109388a = 0;
                cgVar.f109391d = -1.0f;
                cgVar.f109390c = -1.0f;
                cgVar.f109392e = new int[0];
                cgVar.f109389b = false;
                return;
            }
            if (autoSizeTextType != 1) {
                throw new IllegalArgumentException(he2.a("Unknown auto-size text type: ", autoSizeTextType));
            }
            DisplayMetrics displayMetrics = cgVar.f109395h.getResources().getDisplayMetrics();
            float fApplyDimension = TypedValue.applyDimension(2, 12.0f, displayMetrics);
            float fApplyDimension2 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
            if (fApplyDimension <= 0.0f) {
                throw new IllegalArgumentException("Minimum auto-size text size (" + fApplyDimension + "px) is less or equal to (0px)");
            }
            if (fApplyDimension2 <= fApplyDimension) {
                throw new IllegalArgumentException("Maximum auto-size text size (" + fApplyDimension2 + "px) is less or equal to minimum auto-size text size (" + fApplyDimension + "px)");
            }
            cgVar.f109388a = 1;
            cgVar.f109391d = fApplyDimension;
            cgVar.f109390c = 1.0f;
            if (cgVar.f109394g instanceof EditText) {
                cgVar.f109389b = false;
            } else {
                int iFloor = ((int) Math.floor((fApplyDimension2 - fApplyDimension) / 1.0f)) + 1;
                int[] iArr = new int[iFloor];
                for (int i10 = 0; i10 < iFloor; i10++) {
                    iArr[i10] = Math.round((i10 * cgVar.f109390c) + cgVar.f109391d);
                }
                if (iFloor != 0) {
                    Arrays.sort(iArr);
                    ArrayList arrayList = new ArrayList();
                    for (int i11 = 0; i11 < iFloor; i11++) {
                        int i12 = iArr[i11];
                        if (i12 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i12)) < 0) {
                            arrayList.add(Integer.valueOf(i12));
                        }
                    }
                    if (iFloor != arrayList.size()) {
                        int size = arrayList.size();
                        iArr = new int[size];
                        for (int i13 = 0; i13 < size; i13++) {
                            iArr[i13] = ((Integer) arrayList.get(i13)).intValue();
                        }
                    }
                }
                cgVar.f109392e = iArr;
                cgVar.f109389b = true;
            }
            if (cgVar.f109389b) {
                cgVar.a();
            }
        }
    }

    public final void setMeasureSpecProvider(@NotNull wh1 measureSpecProvider) {
        this.f59017a = measureSpecProvider;
        requestLayout();
        invalidate();
    }

    @Override // android.widget.TextView
    public void setTextSize(int unit, float size) {
        if (Build.VERSION.SDK_INT >= 27) {
            super.setTextSize(unit, size);
            return;
        }
        xf xfVar = this.f59018b;
        if (xfVar != null) {
            cg cgVar = xfVar.f117807a;
            if ((cgVar.f109394g instanceof EditText) || cgVar.f109388a == 0) {
                cgVar.a(unit, size);
            }
        }
    }

    @SuppressLint({"CustomViewStyleable"})
    public ExtendedTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, @NotNull wh1 wh1Var, @NotNull yf yfVar) {
        super(context, attributeSet, i10);
        this.f59017a = wh1Var;
        yfVar.getClass();
        this.f59018b = yf.a(this);
    }

    public /* synthetic */ ExtendedTextView(Context context, AttributeSet attributeSet, int i10, wh1 wh1Var, yf yfVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? new ow2() : wh1Var, (i11 & 16) != 0 ? new yf() : yfVar);
    }
}
