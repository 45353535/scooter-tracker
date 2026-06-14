package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.GravityInt;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialog;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.sidesheet.SheetCallback;

/* JADX INFO: loaded from: classes9.dex */
abstract class SheetDialog<C extends SheetCallback> extends AppCompatDialog {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f27636j = R.id.coordinator;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f27637k = R.id.touch_outside;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Sheet f27638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FrameLayout f27639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FrameLayout f27640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f27641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f27642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f27643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f27644h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MaterialBackOrchestrator f27645i;

    SheetDialog(Context context, int i10, int i11, int i12) {
        super(context, k(context, i10, i11, i12));
        this.f27642f = true;
        this.f27643g = true;
        supportRequestWindowFeature(1);
    }

    public static /* synthetic */ void b(SheetDialog sheetDialog, View view) {
        if (sheetDialog.f27642f && sheetDialog.isShowing() && sheetDialog.m()) {
            sheetDialog.cancel();
        }
    }

    private void d() {
        if (this.f27639c == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), h(), null);
            this.f27639c = frameLayout;
            FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(g());
            this.f27640d = frameLayout2;
            Sheet sheetE = e(frameLayout2);
            this.f27638b = sheetE;
            c(sheetE);
            this.f27645i = new MaterialBackOrchestrator(this.f27638b, this.f27640d);
        }
    }

    private FrameLayout f() {
        if (this.f27639c == null) {
            d();
        }
        return this.f27639c;
    }

    private FrameLayout i() {
        if (this.f27640d == null) {
            d();
        }
        return this.f27640d;
    }

    private static int k(Context context, int i10, int i11, int i12) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(i11, typedValue, true) ? typedValue.resourceId : i12;
    }

    private void l() {
        FrameLayout frameLayout;
        Window window = getWindow();
        if (window == null || (frameLayout = this.f27640d) == null || !(frameLayout.getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
            return;
        }
        window.setWindowAnimations(Gravity.getAbsoluteGravity(((CoordinatorLayout.LayoutParams) this.f27640d.getLayoutParams()).gravity, this.f27640d.getLayoutDirection()) == 3 ? R.style.Animation_Material3_SideSheetDialog_Left : R.style.Animation_Material3_SideSheetDialog_Right);
    }

    private boolean m() {
        if (!this.f27644h) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{android.R.attr.windowCloseOnTouchOutside});
            this.f27643g = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f27644h = true;
        }
        return this.f27643g;
    }

    private void n() {
        MaterialBackOrchestrator materialBackOrchestrator = this.f27645i;
        if (materialBackOrchestrator == null) {
            return;
        }
        if (this.f27642f) {
            materialBackOrchestrator.startListeningForBackCallbacks();
        } else {
            materialBackOrchestrator.stopListeningForBackCallbacks();
        }
    }

    private View o(int i10, View view, ViewGroup.LayoutParams layoutParams) {
        d();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) f().findViewById(f27636j);
        if (i10 != 0 && view == null) {
            view = getLayoutInflater().inflate(i10, (ViewGroup) coordinatorLayout, false);
        }
        FrameLayout frameLayoutI = i();
        frameLayoutI.removeAllViews();
        if (layoutParams == null) {
            frameLayoutI.addView(view);
        } else {
            frameLayoutI.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(f27637k).setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.sidesheet.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SheetDialog.b(this.f27682b, view2);
            }
        });
        ViewCompat.setAccessibilityDelegate(i(), new AccessibilityDelegateCompat() { // from class: com.google.android.material.sidesheet.SheetDialog.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view2, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                if (!SheetDialog.this.f27642f) {
                    accessibilityNodeInfoCompat.setDismissable(false);
                } else {
                    accessibilityNodeInfoCompat.addAction(1048576);
                    accessibilityNodeInfoCompat.setDismissable(true);
                }
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public boolean performAccessibilityAction(View view2, int i11, Bundle bundle) {
                if (i11 == 1048576) {
                    SheetDialog sheetDialog = SheetDialog.this;
                    if (sheetDialog.f27642f) {
                        sheetDialog.cancel();
                        return true;
                    }
                }
                return super.performAccessibilityAction(view2, i11, bundle);
            }
        });
        return this.f27639c;
    }

    abstract void c(Sheet sheet);

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        Sheet behavior = getBehavior();
        if (!this.f27641e || behavior.getState() == 5) {
            super.cancel();
        } else {
            behavior.setState(5);
        }
    }

    abstract Sheet e(FrameLayout frameLayout);

    abstract int g();

    Sheet getBehavior() {
        if (this.f27638b == null) {
            d();
        }
        return this.f27638b;
    }

    abstract int h();

    public boolean isDismissWithSheetAnimationEnabled() {
        return this.f27641e;
    }

    abstract int j();

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        l();
        n();
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MaterialBackOrchestrator materialBackOrchestrator = this.f27645i;
        if (materialBackOrchestrator != null) {
            materialBackOrchestrator.stopListeningForBackCallbacks();
        }
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    protected void onStart() {
        super.onStart();
        Sheet sheet = this.f27638b;
        if (sheet == null || sheet.getState() != 5) {
            return;
        }
        this.f27638b.setState(j());
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z10) {
        super.setCancelable(z10);
        if (this.f27642f != z10) {
            this.f27642f = z10;
        }
        if (getWindow() != null) {
            n();
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        if (z10 && !this.f27642f) {
            this.f27642f = true;
        }
        this.f27643g = z10;
        this.f27644h = true;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(@LayoutRes int i10) {
        super.setContentView(o(i10, null, null));
    }

    public void setDismissWithSheetAnimationEnabled(boolean z10) {
        this.f27641e = z10;
    }

    public void setSheetEdge(@GravityInt int i10) {
        FrameLayout frameLayout = this.f27640d;
        if (frameLayout == null) {
            throw new IllegalStateException("Sheet view reference is null; sheet edge cannot be changed if the sheet view is null.");
        }
        if (frameLayout.isLaidOut()) {
            throw new IllegalStateException("Sheet view has been laid out; sheet edge cannot be changed once the sheet has been laid out.");
        }
        ViewGroup.LayoutParams layoutParams = this.f27640d.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            ((CoordinatorLayout.LayoutParams) layoutParams).gravity = i10;
            l();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(@Nullable View view) {
        super.setContentView(o(0, view, null));
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(@Nullable View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        super.setContentView(o(0, view, layoutParams));
    }
}
