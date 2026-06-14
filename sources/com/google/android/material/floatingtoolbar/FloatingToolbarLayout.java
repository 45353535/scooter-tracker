package com.google.android.material.floatingtoolbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes9.dex */
public class FloatingToolbarLayout extends FrameLayout {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f26646k = "FloatingToolbarLayout";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f26647l = R.style.Widget_Material3_FloatingToolbar;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f26650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f26651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Rect f26652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f26653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f26654h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f26655i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f26656j;

    public FloatingToolbarLayout(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Rect rect = this.f26652f;
        if (rect == null) {
            Log.w(f26646k, "Unable to update margins because original view margins are not set");
            return;
        }
        int i10 = rect.left + (this.f26648b ? this.f26655i : 0);
        int i11 = rect.right + (this.f26650d ? this.f26656j : 0);
        int i12 = rect.top + (this.f26649c ? this.f26654h : 0);
        int i13 = rect.bottom + (this.f26651e ? this.f26653g : 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams.bottomMargin == i13 && marginLayoutParams.leftMargin == i10 && marginLayoutParams.rightMargin == i11 && marginLayoutParams.topMargin == i12) {
            return;
        }
        marginLayoutParams.bottomMargin = i13;
        marginLayoutParams.leftMargin = i10;
        marginLayoutParams.rightMargin = i11;
        marginLayoutParams.topMargin = i12;
        requestLayout();
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            this.f26652f = null;
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.f26652f = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        j();
    }

    public FloatingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingToolbarStyle);
    }

    public FloatingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10) {
        this(context, attributeSet, i10, f26647l);
    }

    public FloatingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10, @StyleRes int i11) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TintTypedArray tintTypedArrayObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, R.styleable.FloatingToolbar, i10, i11, new int[0]);
        int i12 = R.styleable.FloatingToolbar_backgroundTint;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i12)) {
            int color = tintTypedArrayObtainTintedStyledAttributes.getColor(i12, 0);
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(context2, attributeSet, i10, i11).build());
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(color));
            setBackground(materialShapeDrawable);
        }
        this.f26648b = tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.FloatingToolbar_marginLeftSystemWindowInsets, true);
        this.f26649c = tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.FloatingToolbar_marginTopSystemWindowInsets, false);
        this.f26650d = tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.FloatingToolbar_marginRightSystemWindowInsets, true);
        this.f26651e = tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.FloatingToolbar_marginBottomSystemWindowInsets, true);
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.floatingtoolbar.FloatingToolbarLayout.1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            @NonNull
            public WindowInsetsCompat onApplyWindowInsets(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
                if (!FloatingToolbarLayout.this.f26648b && !FloatingToolbarLayout.this.f26650d && !FloatingToolbarLayout.this.f26649c && !FloatingToolbarLayout.this.f26651e) {
                    return windowInsetsCompat;
                }
                Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout() | WindowInsetsCompat.Type.ime());
                FloatingToolbarLayout.this.f26653g = insets.bottom;
                FloatingToolbarLayout.this.f26654h = insets.top;
                FloatingToolbarLayout.this.f26656j = insets.right;
                FloatingToolbarLayout.this.f26655i = insets.left;
                FloatingToolbarLayout.this.j();
                return windowInsetsCompat;
            }
        });
        tintTypedArrayObtainTintedStyledAttributes.recycle();
    }
}
