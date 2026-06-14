package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.annotation.BoolRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.StateListCornerSize;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class MaterialButtonToggleGroup extends MaterialButtonGroup {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f25766s = R.style.Widget_MaterialComponents_MaterialButtonToggleGroup;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final LinkedHashSet f25767m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f25768n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f25769o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f25770p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f25771q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Set f25772r;

    public interface OnButtonCheckedListener {
        void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup, @IdRes int i10, boolean z10);
    }

    public MaterialButtonToggleGroup(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    private String getChildrenA11yClassName() {
        return (this.f25769o ? RadioButton.class : ToggleButton.class).getName();
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && j(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private boolean j(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    private void q(int i10, boolean z10) {
        if (i10 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i10);
            return;
        }
        HashSet hashSet = new HashSet(this.f25772r);
        if (z10 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.f25769o && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else {
            if (z10 || !hashSet.contains(Integer.valueOf(i10))) {
                return;
            }
            if (!this.f25770p || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i10));
            }
        }
        v(hashSet);
    }

    private void r(int i10, boolean z10) {
        Iterator it = this.f25767m.iterator();
        while (it.hasNext()) {
            ((OnButtonCheckedListener) it.next()).onButtonChecked(this, i10, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int s(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) == view) {
                return i10;
            }
            if ((getChildAt(i11) instanceof MaterialButton) && j(i11)) {
                i10++;
            }
        }
        return -1;
    }

    private void setupButtonChild(@NonNull MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    private void u(int i10, boolean z10) {
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById instanceof MaterialButton) {
            this.f25768n = true;
            ((MaterialButton) viewFindViewById).setChecked(z10);
            this.f25768n = false;
        }
    }

    private void v(Set set) {
        Set set2 = this.f25772r;
        this.f25772r = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = f(i10).getId();
            u(id2, set.contains(Integer.valueOf(id2)));
            if (set2.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                r(id2, set.contains(Integer.valueOf(id2)));
            }
        }
        invalidate();
    }

    private void w() {
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            f(i10).setA11yClassName(childrenA11yClassName);
        }
    }

    public void addOnButtonCheckedListener(@NonNull OnButtonCheckedListener onButtonCheckedListener) {
        this.f25767m.add(onButtonCheckedListener);
    }

    @Override // com.google.android.material.button.MaterialButtonGroup, android.view.ViewGroup
    public void addView(@NonNull View view, int i10, @NonNull ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        q(materialButton.getId(), materialButton.isChecked());
        ViewCompat.setAccessibilityDelegate(materialButton, new AccessibilityDelegateCompat() { // from class: com.google.android.material.button.MaterialButtonToggleGroup.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view2, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, MaterialButtonToggleGroup.this.s(view2), 1, false, ((MaterialButton) view2).isChecked()));
            }
        });
    }

    public void check(@IdRes int i10) {
        q(i10, true);
    }

    public void clearChecked() {
        v(new HashSet());
    }

    public void clearOnButtonCheckedListeners() {
        this.f25767m.clear();
    }

    @IdRes
    public int getCheckedButtonId() {
        if (!this.f25769o || this.f25772r.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f25772r.iterator().next()).intValue();
    }

    @NonNull
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = f(i10).getId();
            if (this.f25772r.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    public boolean isSelectionRequired() {
        return this.f25770p;
    }

    public boolean isSingleSelection() {
        return this.f25769o;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f25771q;
        if (i10 != -1) {
            v(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, getVisibleButtonCount(), false, isSingleSelection() ? 1 : 2));
    }

    public void removeOnButtonCheckedListener(@NonNull OnButtonCheckedListener onButtonCheckedListener) {
        this.f25767m.remove(onButtonCheckedListener);
    }

    public void setSelectionRequired(boolean z10) {
        this.f25770p = z10;
    }

    public void setSingleSelection(boolean z10) {
        if (this.f25769o != z10) {
            this.f25769o = z10;
            clearChecked();
        }
        w();
    }

    void t(MaterialButton materialButton, boolean z10) {
        if (this.f25768n) {
            return;
        }
        q(materialButton.getId(), z10);
    }

    public void uncheck(@IdRes int i10) {
        q(i10, false);
    }

    public MaterialButtonToggleGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonToggleGroupStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = f25766s;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        this.f25767m = new LinkedHashSet();
        this.f25768n = false;
        this.f25772r = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(getContext(), attributeSet, R.styleable.MaterialButtonToggleGroup, i10, i11, new int[0]);
        setSingleSelection(typedArrayObtainStyledAttributes.getBoolean(R.styleable.MaterialButtonToggleGroup_singleSelection, false));
        this.f25771q = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialButtonToggleGroup_checkedButton, -1);
        this.f25770p = typedArrayObtainStyledAttributes.getBoolean(R.styleable.MaterialButtonToggleGroup_selectionRequired, false);
        if (this.f25737g == null) {
            this.f25737g = StateListCornerSize.create(new AbsoluteCornerSize(0.0f));
        }
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(R.styleable.MaterialButtonToggleGroup_android_enabled, true));
        typedArrayObtainStyledAttributes.recycle();
        setImportantForAccessibility(1);
    }

    public void setSingleSelection(@BoolRes int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
