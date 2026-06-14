package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.StateListCornerSize;
import com.google.android.material.shape.StateListShapeAppearanceModel;
import com.google.android.material.shape.StateListSizeChange;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes9.dex */
public class MaterialButtonGroup extends LinearLayout {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f25731l = R.style.Widget_Material3_MaterialButtonGroup;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f25732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f25733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PressedStateTracker f25734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Comparator f25735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer[] f25736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    StateListCornerSize f25737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private StateListShapeAppearanceModel f25738h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f25739i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private StateListSizeChange f25740j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f25741k;

    private class PressedStateTracker implements MaterialButton.OnPressedChangeListener {
        private PressedStateTracker() {
        }

        @Override // com.google.android.material.button.MaterialButton.OnPressedChangeListener
        public void onPressedChanged(@NonNull MaterialButton materialButton, boolean z10) {
            MaterialButtonGroup.this.invalidate();
        }
    }

    public MaterialButtonGroup(@NonNull Context context) {
        this(context, null);
    }

    public static /* synthetic */ int a(MaterialButtonGroup materialButtonGroup, MaterialButton materialButton, MaterialButton materialButton2) {
        materialButtonGroup.getClass();
        int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
        return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(materialButtonGroup.indexOfChild(materialButton), materialButtonGroup.indexOfChild(materialButton2));
    }

    private void b() {
        int iMin;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
            MaterialButton materialButtonF = f(i10);
            MaterialButton materialButtonF2 = f(i10 - 1);
            if (this.f25739i <= 0) {
                iMin = Math.min(materialButtonF.getStrokeWidth(), materialButtonF2.getStrokeWidth());
                materialButtonF.setShouldDrawSurfaceColorStroke(true);
                materialButtonF2.setShouldDrawSurfaceColorStroke(true);
            } else {
                materialButtonF.setShouldDrawSurfaceColorStroke(false);
                materialButtonF2.setShouldDrawSurfaceColorStroke(false);
                iMin = 0;
            }
            LinearLayout.LayoutParams layoutParamsD = d(materialButtonF);
            if (getOrientation() == 0) {
                layoutParamsD.setMarginEnd(0);
                layoutParamsD.setMarginStart(this.f25739i - iMin);
                layoutParamsD.topMargin = 0;
            } else {
                layoutParamsD.bottomMargin = 0;
                layoutParamsD.topMargin = this.f25739i - iMin;
                layoutParamsD.setMarginStart(0);
            }
            materialButtonF.setLayoutParams(layoutParamsD);
        }
        m(firstVisibleChildIndex);
    }

    private void c() {
        if (this.f25740j == null || getChildCount() == 0) {
            return;
        }
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int iMin = Integer.MAX_VALUE;
        for (int i10 = firstVisibleChildIndex; i10 <= lastVisibleChildIndex; i10++) {
            if (j(i10)) {
                int iE = e(i10);
                if (i10 != firstVisibleChildIndex && i10 != lastVisibleChildIndex) {
                    iE /= 2;
                }
                iMin = Math.min(iMin, iE);
            }
        }
        int i11 = firstVisibleChildIndex;
        while (i11 <= lastVisibleChildIndex) {
            if (j(i11)) {
                f(i11).setSizeChange(this.f25740j);
                f(i11).setWidthChangeMax((i11 == firstVisibleChildIndex || i11 == lastVisibleChildIndex) ? iMin : iMin * 2);
            }
            i11++;
        }
    }

    private int e(int i10) {
        if (!j(i10) || this.f25740j == null) {
            return 0;
        }
        int iMax = Math.max(0, this.f25740j.getMaxWidthChange(f(i10).getWidth()));
        MaterialButton materialButtonI = i(i10);
        int allowedWidthDecrease = materialButtonI == null ? 0 : materialButtonI.getAllowedWidthDecrease();
        MaterialButton materialButtonG = g(i10);
        return Math.min(iMax, allowedWidthDecrease + (materialButtonG != null ? materialButtonG.getAllowedWidthDecrease() : 0));
    }

    private MaterialButton g(int i10) {
        int childCount = getChildCount();
        do {
            i10++;
            if (i10 >= childCount) {
                return null;
            }
        } while (!j(i10));
        return f(i10);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (j(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (j(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private StateListShapeAppearanceModel.Builder h(boolean z10, boolean z11, int i10) {
        StateListShapeAppearanceModel stateListShapeAppearanceModel = this.f25738h;
        if (stateListShapeAppearanceModel == null || (!z10 && !z11)) {
            stateListShapeAppearanceModel = (StateListShapeAppearanceModel) this.f25733c.get(i10);
        }
        return stateListShapeAppearanceModel == null ? new StateListShapeAppearanceModel.Builder((ShapeAppearanceModel) this.f25732b.get(i10)) : stateListShapeAppearanceModel.toBuilder();
    }

    private MaterialButton i(int i10) {
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (j(i11)) {
                return f(i11);
            }
        }
        return null;
    }

    private boolean j(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    private void l() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            f(i10).n();
        }
    }

    private void m(int i10) {
        if (getChildCount() == 0 || i10 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) f(i10).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            layoutParams.setMarginEnd(0);
            layoutParams.setMarginStart(0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    private void n() {
        TreeMap treeMap = new TreeMap(this.f25735e);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put(f(i10), Integer.valueOf(i10));
        }
        this.f25736f = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    private void setGeneratedIdIfNeeded(@NonNull MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view, int i10, @Nullable ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        l();
        this.f25741k = true;
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.f25734d);
        this.f25732b.add(materialButton.getShapeAppearanceModel());
        this.f25733c.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    LinearLayout.LayoutParams d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        n();
        super.dispatchDraw(canvas);
    }

    MaterialButton f(int i10) {
        return (MaterialButton) getChildAt(i10);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public StateListSizeChange getButtonSizeChange() {
        return this.f25740j;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f25736f;
        if (numArr != null && i11 < numArr.length) {
            return numArr[i11].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i11;
    }

    @NonNull
    public CornerSize getInnerCornerSize() {
        return this.f25737g.getDefaultCornerSize();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public StateListCornerSize getInnerCornerSizeStateList() {
        return this.f25737g;
    }

    @Nullable
    public ShapeAppearanceModel getShapeAppearance() {
        StateListShapeAppearanceModel stateListShapeAppearanceModel = this.f25738h;
        if (stateListShapeAppearanceModel == null) {
            return null;
        }
        return stateListShapeAppearanceModel.getDefaultShape(true);
    }

    @Px
    public int getSpacing() {
        return this.f25739i;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public StateListShapeAppearanceModel getStateListShapeAppearance() {
        return this.f25738h;
    }

    void k(MaterialButton materialButton, int i10) {
        int iIndexOfChild = indexOfChild(materialButton);
        if (iIndexOfChild < 0) {
            return;
        }
        MaterialButton materialButtonI = i(iIndexOfChild);
        MaterialButton materialButtonG = g(iIndexOfChild);
        if (materialButtonI == null && materialButtonG == null) {
            return;
        }
        if (materialButtonI == null) {
            materialButtonG.setDisplayedWidthDecrease(i10);
        }
        if (materialButtonG == null) {
            materialButtonI.setDisplayedWidthDecrease(i10);
        }
        if (materialButtonI == null || materialButtonG == null) {
            return;
        }
        materialButtonI.setDisplayedWidthDecrease(i10 / 2);
        materialButtonG.setDisplayedWidthDecrease((i10 + 1) / 2);
    }

    void o() {
        int iSwapCornerPositionRtl;
        if (!(this.f25737g == null && this.f25738h == null) && this.f25741k) {
            this.f25741k = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i10 = 0;
            while (i10 < childCount) {
                MaterialButton materialButtonF = f(i10);
                if (materialButtonF.getVisibility() != 8) {
                    boolean z10 = i10 == firstVisibleChildIndex;
                    boolean z11 = i10 == lastVisibleChildIndex;
                    StateListShapeAppearanceModel.Builder builderH = h(z10, z11, i10);
                    boolean z12 = getOrientation() == 0;
                    boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
                    if (z12) {
                        iSwapCornerPositionRtl = z10 ? 5 : 0;
                        if (z11) {
                            iSwapCornerPositionRtl |= 10;
                        }
                        if (zIsLayoutRtl) {
                            iSwapCornerPositionRtl = StateListShapeAppearanceModel.swapCornerPositionRtl(iSwapCornerPositionRtl);
                        }
                    } else {
                        iSwapCornerPositionRtl = z10 ? 3 : 0;
                        if (z11) {
                            iSwapCornerPositionRtl |= 12;
                        }
                    }
                    StateListShapeAppearanceModel stateListShapeAppearanceModelBuild = builderH.setCornerSizeOverride(this.f25737g, ~iSwapCornerPositionRtl).build();
                    if (stateListShapeAppearanceModelBuild.isStateful()) {
                        materialButtonF.setStateListShapeAppearanceModel(stateListShapeAppearanceModelBuild);
                    } else {
                        materialButtonF.setShapeAppearanceModel(stateListShapeAppearanceModelBuild.getDefaultShape(true));
                    }
                }
                i10++;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            l();
            c();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        o();
        b();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f25732b.remove(iIndexOfChild);
            this.f25733c.remove(iIndexOfChild);
        }
        this.f25741k = true;
        o();
        l();
        b();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setButtonSizeChange(@NonNull StateListSizeChange stateListSizeChange) {
        if (this.f25740j != stateListSizeChange) {
            this.f25740j = stateListSizeChange;
            c();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            f(i10).setEnabled(z10);
        }
    }

    public void setInnerCornerSize(@NonNull CornerSize cornerSize) {
        this.f25737g = StateListCornerSize.create(cornerSize);
        this.f25741k = true;
        o();
        invalidate();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setInnerCornerSizeStateList(@NonNull StateListCornerSize stateListCornerSize) {
        this.f25737g = stateListCornerSize;
        this.f25741k = true;
        o();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (getOrientation() != i10) {
            this.f25741k = true;
        }
        super.setOrientation(i10);
    }

    public void setShapeAppearance(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        this.f25738h = new StateListShapeAppearanceModel.Builder(shapeAppearanceModel).build();
        this.f25741k = true;
        o();
        invalidate();
    }

    public void setSpacing(@Px int i10) {
        this.f25739i = i10;
        invalidate();
        requestLayout();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setStateListShapeAppearance(@Nullable StateListShapeAppearanceModel stateListShapeAppearanceModel) {
        this.f25738h = stateListShapeAppearanceModel;
        this.f25741k = true;
        o();
        invalidate();
    }

    public MaterialButtonGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonGroupStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = f25731l;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        this.f25732b = new ArrayList();
        this.f25733c = new ArrayList();
        this.f25734d = new PressedStateTracker();
        this.f25735e = new Comparator() { // from class: com.google.android.material.button.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return MaterialButtonGroup.a(this.f25777b, (MaterialButton) obj, (MaterialButton) obj2);
            }
        };
        this.f25741k = true;
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.MaterialButtonGroup, i10, i11, new int[0]);
        int i12 = R.styleable.MaterialButtonGroup_buttonSizeChange;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            this.f25740j = StateListSizeChange.create(context2, typedArrayObtainStyledAttributes, i12);
        }
        int i13 = R.styleable.MaterialButtonGroup_shapeAppearance;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            StateListShapeAppearanceModel stateListShapeAppearanceModelCreate = StateListShapeAppearanceModel.create(context2, typedArrayObtainStyledAttributes, i13);
            this.f25738h = stateListShapeAppearanceModelCreate;
            if (stateListShapeAppearanceModelCreate == null) {
                this.f25738h = new StateListShapeAppearanceModel.Builder(ShapeAppearanceModel.builder(context2, typedArrayObtainStyledAttributes.getResourceId(i13, 0), typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialButtonGroup_shapeAppearanceOverlay, 0)).build()).build();
            }
        }
        int i14 = R.styleable.MaterialButtonGroup_innerCornerSize;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            this.f25737g = StateListCornerSize.create(context2, typedArrayObtainStyledAttributes, i14, new AbsoluteCornerSize(0.0f));
        }
        this.f25739i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MaterialButtonGroup_android_spacing, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(R.styleable.MaterialButtonGroup_android_enabled, true));
        typedArrayObtainStyledAttributes.recycle();
    }
}
