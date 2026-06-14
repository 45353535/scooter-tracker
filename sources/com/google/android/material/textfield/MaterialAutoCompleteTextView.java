package com.google.android.material.textfield;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.ArrayRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ListPopupWindow f28017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AccessibilityManager f28018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f28019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f28020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f28021f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ColorStateList f28022g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f28023h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ColorStateList f28024i;

    private class MaterialArrayAdapter<T> extends ArrayAdapter<String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ColorStateList f28026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ColorStateList f28027c;

        MaterialArrayAdapter(Context context, int i10, String[] strArr) {
            super(context, i10, strArr);
            f();
        }

        private ColorStateList a() {
            if (!c() || !d()) {
                return null;
            }
            int[] iArr = {R.attr.state_hovered, -16842919};
            int[] iArr2 = {R.attr.state_selected, -16842919};
            return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{MaterialColors.layer(MaterialAutoCompleteTextView.this.f28023h, MaterialAutoCompleteTextView.this.f28024i.getColorForState(iArr2, 0)), MaterialColors.layer(MaterialAutoCompleteTextView.this.f28023h, MaterialAutoCompleteTextView.this.f28024i.getColorForState(iArr, 0)), MaterialAutoCompleteTextView.this.f28023h});
        }

        private Drawable b() {
            if (!c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(MaterialAutoCompleteTextView.this.f28023h);
            if (this.f28027c == null) {
                return colorDrawable;
            }
            colorDrawable.setTintList(this.f28026b);
            return new RippleDrawable(this.f28027c, colorDrawable, null);
        }

        private boolean c() {
            return MaterialAutoCompleteTextView.this.f28023h != 0;
        }

        private boolean d() {
            return MaterialAutoCompleteTextView.this.f28024i != null;
        }

        private ColorStateList e() {
            if (!d()) {
                return null;
            }
            int[] iArr = {R.attr.state_pressed};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{MaterialAutoCompleteTextView.this.f28024i.getColorForState(iArr, 0), 0});
        }

        void f() {
            this.f28027c = e();
            this.f28026b = a();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i10, @Nullable View view, ViewGroup viewGroup) {
            View view2 = super.getView(i10, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                textView.setBackground(MaterialAutoCompleteTextView.this.getText().toString().contentEquals(textView.getText()) ? b() : null);
            }
            return view2;
        }
    }

    public MaterialAutoCompleteTextView(@NonNull Context context) {
        this(context, null);
    }

    private TextInputLayout e() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private boolean f() {
        return h() || g();
    }

    private boolean g() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f28018c;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = this.f28018c.getEnabledAccessibilityServiceList(16)) != null) {
            for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean h() {
        AccessibilityManager accessibilityManager = this.f28018c;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    private int i() {
        ListAdapter adapter = getAdapter();
        TextInputLayout textInputLayoutE = e();
        int i10 = 0;
        if (adapter == null || textInputLayoutE == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMin = Math.min(adapter.getCount(), Math.max(0, this.f28017b.getSelectedItemPosition()) + 15);
        View view = null;
        int iMax = 0;
        for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
            int itemViewType = adapter.getItemViewType(iMax2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(iMax2, view, textInputLayoutE);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        Drawable background = this.f28017b.getBackground();
        if (background != null) {
            background.getPadding(this.f28019d);
            Rect rect = this.f28019d;
            iMax += rect.left + rect.right;
        }
        return iMax + textInputLayoutE.getEndIconView().getMeasuredWidth();
    }

    private void j() {
        TextInputLayout textInputLayoutE = e();
        if (textInputLayoutE != null) {
            textInputLayoutE.m0();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (f()) {
            this.f28017b.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    @Nullable
    public ColorStateList getDropDownBackgroundTintList() {
        return this.f28022g;
    }

    @Override // android.widget.TextView
    @Nullable
    public CharSequence getHint() {
        TextInputLayout textInputLayoutE = e();
        return (textInputLayoutE == null || !textInputLayoutE.isProvidingHint()) ? super.getHint() : textInputLayoutE.getHint();
    }

    public float getPopupElevation() {
        return this.f28021f;
    }

    public int getSimpleItemSelectedColor() {
        return this.f28023h;
    }

    @Nullable
    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f28024i;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutE = e();
        if (textInputLayoutE != null && textInputLayoutE.isProvidingHint() && super.getHint() == null && ManufacturerUtils.isMeizuDevice()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28017b.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), i()), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        if (f()) {
            return;
        }
        super.onWindowFocusChanged(z10);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(@Nullable T t10) {
        super.setAdapter(t10);
        this.f28017b.setAdapter(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        ListPopupWindow listPopupWindow = this.f28017b;
        if (listPopupWindow != null) {
            listPopupWindow.setBackgroundDrawable(drawable);
        }
    }

    public void setDropDownBackgroundTint(@ColorInt int i10) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i10));
    }

    public void setDropDownBackgroundTintList(@Nullable ColorStateList colorStateList) {
        this.f28022g = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) dropDownBackground).setFillColor(this.f28022g);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(@Nullable AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f28017b.setOnItemSelectedListener(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i10) {
        super.setRawInputType(i10);
        j();
    }

    public void setSimpleItemSelectedColor(int i10) {
        this.f28023h = i10;
        if (getAdapter() instanceof MaterialArrayAdapter) {
            ((MaterialArrayAdapter) getAdapter()).f();
        }
    }

    public void setSimpleItemSelectedRippleColor(@Nullable ColorStateList colorStateList) {
        this.f28024i = colorStateList;
        if (getAdapter() instanceof MaterialArrayAdapter) {
            ((MaterialArrayAdapter) getAdapter()).f();
        }
    }

    public void setSimpleItems(@ArrayRes int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (f()) {
            this.f28017b.show();
        } else {
            super.showDropDown();
        }
    }

    public MaterialAutoCompleteTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.autoCompleteTextViewStyle);
    }

    public void setSimpleItems(@NonNull String[] strArr) {
        setAdapter(new MaterialArrayAdapter(getContext(), this.f28020e, strArr));
    }

    public MaterialAutoCompleteTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, 0), attributeSet, i10);
        this.f28019d = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, com.google.android.material.R.styleable.MaterialAutoCompleteTextView, i10, androidx.appcompat.R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        int i11 = com.google.android.material.R.styleable.MaterialAutoCompleteTextView_android_inputType;
        if (typedArrayObtainStyledAttributes.hasValue(i11) && typedArrayObtainStyledAttributes.getInt(i11, 0) == 0) {
            setKeyListener(null);
        }
        this.f28020e = typedArrayObtainStyledAttributes.getResourceId(com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItemLayout, com.google.android.material.R.layout.mtrl_auto_complete_simple_item);
        this.f28021f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(com.google.android.material.R.styleable.MaterialAutoCompleteTextView_android_popupElevation, com.google.android.material.R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int i12 = com.google.android.material.R.styleable.MaterialAutoCompleteTextView_dropDownBackgroundTint;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            this.f28022g = ColorStateList.valueOf(typedArrayObtainStyledAttributes.getColor(i12, 0));
        }
        this.f28023h = typedArrayObtainStyledAttributes.getColor(com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItemSelectedColor, 0);
        this.f28024i = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItemSelectedRippleColor);
        this.f28018c = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2);
        this.f28017b = listPopupWindow;
        listPopupWindow.setModal(true);
        listPopupWindow.setAnchorView(this);
        listPopupWindow.setInputMethodMode(2);
        listPopupWindow.setAdapter(getAdapter());
        listPopupWindow.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.google.android.material.textfield.MaterialAutoCompleteTextView.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i13, long j10) {
                MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
                Object selectedItem = i13 < 0 ? materialAutoCompleteTextView.f28017b.getSelectedItem() : materialAutoCompleteTextView.getAdapter().getItem(i13);
                MaterialAutoCompleteTextView materialAutoCompleteTextView2 = MaterialAutoCompleteTextView.this;
                materialAutoCompleteTextView2.setText(materialAutoCompleteTextView2.convertSelectionToString(selectedItem), false);
                AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i13 < 0) {
                        view = MaterialAutoCompleteTextView.this.f28017b.getSelectedView();
                        i13 = MaterialAutoCompleteTextView.this.f28017b.getSelectedItemPosition();
                        j10 = MaterialAutoCompleteTextView.this.f28017b.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.f28017b.getListView(), view, i13, j10);
                }
                MaterialAutoCompleteTextView.this.f28017b.dismiss();
            }
        });
        int i13 = com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItems;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            setSimpleItems(typedArrayObtainStyledAttributes.getResourceId(i13, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
