package com.google.android.material.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.annotation.ArrayRes;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StringRes;
import androidx.appcompat.R;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.ContextThemeWrapper;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes9.dex */
public class MaterialAlertDialogBuilder extends AlertDialog.Builder {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f26481c = R.attr.alertDialogStyle;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f26482d = com.google.android.material.R.style.MaterialAlertDialog_MaterialComponents;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f26483e = com.google.android.material.R.attr.materialAlertDialogTheme;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Drawable f26484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f26485b;

    public MaterialAlertDialogBuilder(@NonNull Context context) {
        this(context, 0);
    }

    private static Context a(Context context) {
        int iB = b(context);
        Context contextWrap = MaterialThemeOverlay.wrap(context, null, f26481c, f26482d);
        return iB == 0 ? contextWrap : new ContextThemeWrapper(contextWrap, iB);
    }

    private static int b(Context context) {
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, f26483e);
        if (typedValueResolve == null) {
            return 0;
        }
        return typedValueResolve.data;
    }

    private static int c(Context context, int i10) {
        return i10 == 0 ? b(context) : i10;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public AlertDialog create() {
        AlertDialog alertDialogCreate = super.create();
        Window window = alertDialogCreate.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.f26484a;
        if (drawable instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) drawable).setElevation(decorView.getElevation());
        }
        window.setBackgroundDrawable(MaterialDialogs.insetDrawable(this.f26484a, this.f26485b));
        decorView.setOnTouchListener(new InsetDialogOnTouchListener(alertDialogCreate, this.f26485b));
        return alertDialogCreate;
    }

    @Nullable
    public Drawable getBackground() {
        return this.f26484a;
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setBackground(@Nullable Drawable drawable) {
        this.f26484a = drawable;
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setBackgroundInsetBottom(@Px int i10) {
        this.f26485b.bottom = i10;
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setBackgroundInsetEnd(@Px int i10) {
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.f26485b.left = i10;
            return this;
        }
        this.f26485b.right = i10;
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setBackgroundInsetStart(@Px int i10) {
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.f26485b.right = i10;
            return this;
        }
        this.f26485b.left = i10;
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setBackgroundInsetTop(@Px int i10) {
        this.f26485b.top = i10;
        return this;
    }

    public MaterialAlertDialogBuilder(@NonNull Context context, int i10) {
        super(a(context), c(context, i10));
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        int i11 = f26481c;
        int i12 = f26482d;
        this.f26485b = MaterialDialogs.getDialogBackgroundInsets(context2, i11, i12);
        int color = MaterialColors.getColor(context2, com.google.android.material.R.attr.colorSurface, getClass().getCanonicalName());
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(null, com.google.android.material.R.styleable.MaterialAlertDialog, i11, i12);
        int color2 = typedArrayObtainStyledAttributes.getColor(com.google.android.material.R.styleable.MaterialAlertDialog_backgroundTint, color);
        typedArrayObtainStyledAttributes.recycle();
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context2, null, i11, i12);
        materialShapeDrawable.initializeElevationOverlay(context2);
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(color2));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                materialShapeDrawable.setCornerSize(dimension);
            }
        }
        this.f26484a = materialShapeDrawable;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setAdapter(@Nullable ListAdapter listAdapter, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setAdapter(listAdapter, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setCancelable(boolean z10) {
        return (MaterialAlertDialogBuilder) super.setCancelable(z10);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setCursor(@Nullable Cursor cursor, @Nullable DialogInterface.OnClickListener onClickListener, @NonNull String str) {
        return (MaterialAlertDialogBuilder) super.setCursor(cursor, onClickListener, str);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setCustomTitle(@Nullable View view) {
        return (MaterialAlertDialogBuilder) super.setCustomTitle(view);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setIconAttribute(@AttrRes int i10) {
        return (MaterialAlertDialogBuilder) super.setIconAttribute(i10);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setNegativeButtonIcon(@Nullable Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setNegativeButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setNeutralButtonIcon(@Nullable Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setNeutralButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setOnCancelListener(@Nullable DialogInterface.OnCancelListener onCancelListener) {
        return (MaterialAlertDialogBuilder) super.setOnCancelListener(onCancelListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setOnDismissListener(@Nullable DialogInterface.OnDismissListener onDismissListener) {
        return (MaterialAlertDialogBuilder) super.setOnDismissListener(onDismissListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setOnItemSelectedListener(@Nullable AdapterView.OnItemSelectedListener onItemSelectedListener) {
        return (MaterialAlertDialogBuilder) super.setOnItemSelectedListener(onItemSelectedListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setOnKeyListener(@Nullable DialogInterface.OnKeyListener onKeyListener) {
        return (MaterialAlertDialogBuilder) super.setOnKeyListener(onKeyListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setPositiveButtonIcon(@Nullable Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setPositiveButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setIcon(@DrawableRes int i10) {
        return (MaterialAlertDialogBuilder) super.setIcon(i10);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setItems(@ArrayRes int i10, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setItems(i10, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setMessage(@StringRes int i10) {
        return (MaterialAlertDialogBuilder) super.setMessage(i10);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setNegativeButton(@StringRes int i10, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNegativeButton(i10, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setNeutralButton(@StringRes int i10, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNeutralButton(i10, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setPositiveButton(@StringRes int i10, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setPositiveButton(i10, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setTitle(@StringRes int i10) {
        return (MaterialAlertDialogBuilder) super.setTitle(i10);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setView(int i10) {
        return (MaterialAlertDialogBuilder) super.setView(i10);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setIcon(@Nullable Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setItems(@Nullable CharSequence[] charSequenceArr, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setItems(charSequenceArr, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setMessage(@Nullable CharSequence charSequence) {
        return (MaterialAlertDialogBuilder) super.setMessage(charSequence);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setMultiChoiceItems(@ArrayRes int i10, @Nullable boolean[] zArr, @Nullable DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (MaterialAlertDialogBuilder) super.setMultiChoiceItems(i10, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setNegativeButton(@Nullable CharSequence charSequence, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNegativeButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setNeutralButton(@Nullable CharSequence charSequence, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNeutralButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setPositiveButton(@Nullable CharSequence charSequence, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setPositiveButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setTitle(@Nullable CharSequence charSequence) {
        return (MaterialAlertDialogBuilder) super.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setView(@Nullable View view) {
        return (MaterialAlertDialogBuilder) super.setView(view);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setMultiChoiceItems(@Nullable CharSequence[] charSequenceArr, @Nullable boolean[] zArr, @Nullable DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (MaterialAlertDialogBuilder) super.setMultiChoiceItems(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setSingleChoiceItems(@ArrayRes int i10, int i11, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(i10, i11, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setMultiChoiceItems(@Nullable Cursor cursor, @NonNull String str, @NonNull String str2, @Nullable DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (MaterialAlertDialogBuilder) super.setMultiChoiceItems(cursor, str, str2, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setSingleChoiceItems(@Nullable Cursor cursor, int i10, @NonNull String str, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(cursor, i10, str, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setSingleChoiceItems(@Nullable CharSequence[] charSequenceArr, int i10, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(charSequenceArr, i10, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setSingleChoiceItems(@Nullable ListAdapter listAdapter, int i10, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(listAdapter, i10, onClickListener);
    }
}
