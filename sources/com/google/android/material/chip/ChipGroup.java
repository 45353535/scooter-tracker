package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.BoolRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.internal.CheckableGroup;
import com.google.android.material.internal.FlowLayout;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class ChipGroup extends FlowLayout {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f25986l = R.style.Widget_MaterialComponents_ChipGroup;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f25987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f25988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private OnCheckedStateChangeListener f25989h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final CheckableGroup f25990i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f25991j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final PassThroughHierarchyChangeListener f25992k;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    @Deprecated
    public interface OnCheckedChangeListener {
        void onCheckedChanged(@NonNull ChipGroup chipGroup, @IdRes int i10);
    }

    public interface OnCheckedStateChangeListener {
        void onCheckedChanged(@NonNull ChipGroup chipGroup, @NonNull List<Integer> list);
    }

    private class PassThroughHierarchyChangeListener implements ViewGroup.OnHierarchyChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ViewGroup.OnHierarchyChangeListener f25996b;

        private PassThroughHierarchyChangeListener() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(View.generateViewId());
                }
                ChipGroup.this.f25990i.addCheckable((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f25996b;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                chipGroup.f25990i.removeCheckable((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f25996b;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context) {
        this(context, null);
    }

    private boolean f(int i10) {
        return getChildAt(i10).getVisibility() == 0;
    }

    private int getVisibleChipCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof Chip) && f(i11)) {
                i10++;
            }
        }
        return i10;
    }

    public void check(@IdRes int i10) {
        this.f25990i.check(i10);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    public void clearCheck() {
        this.f25990i.clearCheck();
    }

    int e(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if ((childAt instanceof Chip) && f(i11)) {
                if (((Chip) childAt) == view) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    @NonNull
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @IdRes
    public int getCheckedChipId() {
        return this.f25990i.getSingleCheckedId();
    }

    @NonNull
    public List<Integer> getCheckedChipIds() {
        return this.f25990i.getCheckedIdsSortedByChildOrder(this);
    }

    @Dimension
    public int getChipSpacingHorizontal() {
        return this.f25987f;
    }

    @Dimension
    public int getChipSpacingVertical() {
        return this.f25988g;
    }

    public boolean isSelectionRequired() {
        return this.f25990i.isSelectionRequired();
    }

    @Override // com.google.android.material.internal.FlowLayout
    public boolean isSingleLine() {
        return super.isSingleLine();
    }

    public boolean isSingleSelection() {
        return this.f25990i.isSingleSelection();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f25991j;
        if (i10 != -1) {
            this.f25990i.check(i10);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(getRowCount(), isSingleLine() ? getVisibleChipCount() : -1, false, isSingleSelection() ? 1 : 2));
    }

    public void setChipSpacing(@Dimension int i10) {
        setChipSpacingHorizontal(i10);
        setChipSpacingVertical(i10);
    }

    public void setChipSpacingHorizontal(@Dimension int i10) {
        if (this.f25987f != i10) {
            this.f25987f = i10;
            setItemSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(@DimenRes int i10) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingResource(@DimenRes int i10) {
        setChipSpacing(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingVertical(@Dimension int i10) {
        if (this.f25988g != i10) {
            this.f25988g = i10;
            setLineSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(@DimenRes int i10) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i10));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(@Nullable Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i10) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(@Nullable final OnCheckedChangeListener onCheckedChangeListener) {
        if (onCheckedChangeListener == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new OnCheckedStateChangeListener() { // from class: com.google.android.material.chip.ChipGroup.2
                @Override // com.google.android.material.chip.ChipGroup.OnCheckedStateChangeListener
                public void onCheckedChanged(@NonNull ChipGroup chipGroup, @NonNull List<Integer> list) {
                    if (ChipGroup.this.f25990i.isSingleSelection()) {
                        onCheckedChangeListener.onCheckedChanged(chipGroup, ChipGroup.this.getCheckedChipId());
                    }
                }
            });
        }
    }

    public void setOnCheckedStateChangeListener(@Nullable OnCheckedStateChangeListener onCheckedStateChangeListener) {
        this.f25989h = onCheckedStateChangeListener;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f25992k.f25996b = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z10) {
        this.f25990i.setSelectionRequired(z10);
    }

    @Deprecated
    public void setShowDividerHorizontal(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // com.google.android.material.internal.FlowLayout
    public void setSingleLine(boolean z10) {
        super.setSingleLine(z10);
    }

    public void setSingleSelection(boolean z10) {
        this.f25990i.setSingleSelection(z10);
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipGroupStyle);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setSingleLine(@BoolRes int i10) {
        setSingleLine(getResources().getBoolean(i10));
    }

    public void setSingleSelection(@BoolRes int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChipGroup(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f25986l;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        CheckableGroup checkableGroup = new CheckableGroup();
        this.f25990i = checkableGroup;
        PassThroughHierarchyChangeListener passThroughHierarchyChangeListener = new PassThroughHierarchyChangeListener();
        this.f25992k = passThroughHierarchyChangeListener;
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(getContext(), attributeSet, R.styleable.ChipGroup, i10, i11, new int[0]);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(typedArrayObtainStyledAttributes.getBoolean(R.styleable.ChipGroup_singleLine, false));
        setSingleSelection(typedArrayObtainStyledAttributes.getBoolean(R.styleable.ChipGroup_singleSelection, false));
        setSelectionRequired(typedArrayObtainStyledAttributes.getBoolean(R.styleable.ChipGroup_selectionRequired, false));
        this.f25991j = typedArrayObtainStyledAttributes.getResourceId(R.styleable.ChipGroup_checkedChip, -1);
        typedArrayObtainStyledAttributes.recycle();
        checkableGroup.setOnCheckedStateChangeListener(new CheckableGroup.OnCheckedStateChangeListener() { // from class: com.google.android.material.chip.ChipGroup.1
            @Override // com.google.android.material.internal.CheckableGroup.OnCheckedStateChangeListener
            public void onCheckedStateChanged(Set<Integer> set) {
                if (ChipGroup.this.f25989h != null) {
                    OnCheckedStateChangeListener onCheckedStateChangeListener = ChipGroup.this.f25989h;
                    ChipGroup chipGroup = ChipGroup.this;
                    onCheckedStateChangeListener.onCheckedChanged(chipGroup, chipGroup.f25990i.getCheckedIdsSortedByChildOrder(ChipGroup.this));
                }
            }
        });
        super.setOnHierarchyChangeListener(passThroughHierarchyChangeListener);
        setImportantForAccessibility(1);
    }
}
