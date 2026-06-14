package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.Insets;
import androidx.core.util.Pair;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.dialog.InsetDialogOnTouchListener;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.EdgeToEdgeUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes9.dex */
public class MaterialDatePicker<S> extends DialogFragment {
    static final Object F = "CONFIRM_BUTTON_TAG";
    static final Object G = "CANCEL_BUTTON_TAG";
    static final Object H = "TOGGLE_BUTTON_TAG";
    public static final int INPUT_MODE_CALENDAR = 0;
    public static final int INPUT_MODE_TEXT = 1;
    private MaterialShapeDrawable A;
    private Button B;
    private boolean C;
    private CharSequence D;
    private CharSequence E;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashSet f26357b = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LinkedHashSet f26358c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinkedHashSet f26359d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LinkedHashSet f26360e = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f26361f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private DateSelector f26362g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private PickerFragment f26363h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CalendarConstraints f26364i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private DayViewDecorator f26365j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MaterialCalendar f26366k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f26367l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private CharSequence f26368m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f26369n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f26370o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f26371p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private CharSequence f26372q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f26373r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CharSequence f26374s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f26375t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private CharSequence f26376u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f26377v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private CharSequence f26378w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private TextView f26379x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private TextView f26380y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private CheckableImageButton f26381z;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface InputMode {
    }

    public static /* synthetic */ void b(MaterialDatePicker materialDatePicker, View view) {
        materialDatePicker.B.setEnabled(materialDatePicker.getDateSelector().isSelectionComplete());
        materialDatePicker.f26381z.toggle();
        materialDatePicker.f26370o = materialDatePicker.f26370o == 1 ? 0 : 1;
        materialDatePicker.t(materialDatePicker.f26381z);
        materialDatePicker.q();
    }

    private static Drawable e(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, AppCompatResources.getDrawable(context, com.google.android.material.R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AppCompatResources.getDrawable(context, com.google.android.material.R.drawable.material_ic_edit_black_24dp));
        return stateListDrawable;
    }

    private void f(Window window) {
        if (this.C) {
            return;
        }
        final View viewFindViewById = requireView().findViewById(com.google.android.material.R.id.fullscreen_header);
        EdgeToEdgeUtils.applyEdgeToEdge(window, true, ViewUtils.getBackgroundColor(viewFindViewById), null);
        final int paddingTop = viewFindViewById.getPaddingTop();
        final int paddingLeft = viewFindViewById.getPaddingLeft();
        final int paddingRight = viewFindViewById.getPaddingRight();
        final int i10 = viewFindViewById.getLayoutParams().height;
        ViewCompat.setOnApplyWindowInsetsListener(viewFindViewById, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.datepicker.MaterialDatePicker.1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
                if (i10 >= 0) {
                    viewFindViewById.getLayoutParams().height = i10 + insets.top;
                    View view2 = viewFindViewById;
                    view2.setLayoutParams(view2.getLayoutParams());
                }
                View view3 = viewFindViewById;
                view3.setPadding(paddingLeft + insets.left, paddingTop + insets.top, paddingRight + insets.right, view3.getPaddingBottom());
                return windowInsetsCompat;
            }
        });
        this.C = true;
    }

    private static CharSequence g(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] strArrSplit = TextUtils.split(String.valueOf(charSequence), IOUtils.LINE_SEPARATOR_UNIX);
        return strArrSplit.length > 1 ? strArrSplit[0] : charSequence;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DateSelector getDateSelector() {
        if (this.f26362g == null) {
            this.f26362g = (DateSelector) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f26362g;
    }

    private String h() {
        return getDateSelector().getSelectionContentDescription(requireContext());
    }

    private static int i(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_calendar_content_padding);
        int i10 = Month.d().f26415e;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_calendar_day_width) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_calendar_month_horizontal_padding));
    }

    private int j(Context context) {
        int i10 = this.f26361f;
        return i10 != 0 ? i10 : getDateSelector().getDefaultThemeResId(context);
    }

    private void k(Context context) {
        this.f26381z.setTag(H);
        this.f26381z.setImageDrawable(e(context));
        this.f26381z.setChecked(this.f26370o != 0);
        ViewCompat.setAccessibilityDelegate(this.f26381z, null);
        t(this.f26381z);
        this.f26381z.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MaterialDatePicker.b(this.f26476b, view);
            }
        });
    }

    static boolean l(Context context) {
        return p(context, R.attr.windowFullscreen);
    }

    private boolean m() {
        return getResources().getConfiguration().orientation == 2;
    }

    static boolean n(Context context) {
        return p(context, com.google.android.material.R.attr.nestedScrollable);
    }

    static MaterialDatePicker o(Builder builder) {
        MaterialDatePicker materialDatePicker = new MaterialDatePicker();
        Bundle bundle = new Bundle();
        bundle.putInt("OVERRIDE_THEME_RES_ID", builder.f26390b);
        bundle.putParcelable("DATE_SELECTOR_KEY", builder.f26389a);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", builder.f26391c);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", builder.f26392d);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", builder.f26393e);
        bundle.putCharSequence("TITLE_TEXT_KEY", builder.f26394f);
        bundle.putInt("INPUT_MODE_KEY", builder.f26404p);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", builder.f26395g);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", builder.f26396h);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", builder.f26397i);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", builder.f26398j);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", builder.f26399k);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", builder.f26400l);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", builder.f26401m);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", builder.f26402n);
        materialDatePicker.setArguments(bundle);
        return materialDatePicker;
    }

    static boolean p(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(MaterialAttributes.resolveOrThrow(context, com.google.android.material.R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), new int[]{i10});
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z10;
    }

    private void q() {
        int iJ = j(requireContext());
        MaterialCalendar materialCalendarNewInstance = MaterialCalendar.newInstance(getDateSelector(), iJ, this.f26364i, this.f26365j);
        this.f26366k = materialCalendarNewInstance;
        PickerFragment pickerFragmentC = materialCalendarNewInstance;
        if (this.f26370o == 1) {
            pickerFragmentC = MaterialTextInputPicker.c(getDateSelector(), iJ, this.f26364i);
        }
        this.f26363h = pickerFragmentC;
        s();
        r(getHeaderText());
        FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.replace(com.google.android.material.R.id.mtrl_calendar_frame, this.f26363h);
        fragmentTransactionBeginTransaction.commitNow();
        this.f26363h.addOnSelectionChangedListener(new OnSelectionChangedListener<S>() { // from class: com.google.android.material.datepicker.MaterialDatePicker.2
            @Override // com.google.android.material.datepicker.OnSelectionChangedListener
            public void onIncompleteSelectionChanged() {
                MaterialDatePicker.this.B.setEnabled(false);
            }

            @Override // com.google.android.material.datepicker.OnSelectionChangedListener
            public void onSelectionChanged(S s10) {
                MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
                materialDatePicker.r(materialDatePicker.getHeaderText());
                MaterialDatePicker.this.B.setEnabled(MaterialDatePicker.this.getDateSelector().isSelectionComplete());
            }
        });
    }

    private void s() {
        this.f26379x.setText((this.f26370o == 1 && m()) ? this.E : this.D);
    }

    private void t(CheckableImageButton checkableImageButton) {
        this.f26381z.setContentDescription(this.f26370o == 1 ? checkableImageButton.getContext().getString(com.google.android.material.R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(com.google.android.material.R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    public static long thisMonthInUtcMilliseconds() {
        return Month.d().f26417g;
    }

    public static long todayInUtcMilliseconds() {
        return UtcDates.q().getTimeInMillis();
    }

    public boolean addOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        return this.f26359d.add(onCancelListener);
    }

    public boolean addOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        return this.f26360e.add(onDismissListener);
    }

    public boolean addOnNegativeButtonClickListener(View.OnClickListener onClickListener) {
        return this.f26358c.add(onClickListener);
    }

    public boolean addOnPositiveButtonClickListener(MaterialPickerOnPositiveButtonClickListener<? super S> materialPickerOnPositiveButtonClickListener) {
        return this.f26357b.add(materialPickerOnPositiveButtonClickListener);
    }

    public void clearOnCancelListeners() {
        this.f26359d.clear();
    }

    public void clearOnDismissListeners() {
        this.f26360e.clear();
    }

    public void clearOnNegativeButtonClickListeners() {
        this.f26358c.clear();
    }

    public void clearOnPositiveButtonClickListeners() {
        this.f26357b.clear();
    }

    public String getHeaderText() {
        return getDateSelector().getSelectionDisplayString(getContext());
    }

    public int getInputMode() {
        return this.f26370o;
    }

    @Nullable
    public final S getSelection() {
        return (S) getDateSelector().getSelection();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        Iterator it = this.f26359d.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f26361f = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f26362g = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f26364i = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f26365j = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f26367l = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f26368m = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f26370o = bundle.getInt("INPUT_MODE_KEY");
        this.f26371p = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f26372q = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f26373r = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f26374s = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f26375t = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f26376u = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f26377v = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f26378w = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f26368m;
        if (text == null) {
            text = requireContext().getResources().getText(this.f26367l);
        }
        this.D = text;
        this.E = g(text);
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), j(requireContext()));
        Context context = dialog.getContext();
        this.f26369n = l(context);
        int i10 = com.google.android.material.R.attr.materialCalendarStyle;
        int i11 = com.google.android.material.R.style.Widget_MaterialComponents_MaterialCalendar;
        this.A = new MaterialShapeDrawable(context, null, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, com.google.android.material.R.styleable.MaterialCalendar, i10, i11);
        int color = typedArrayObtainStyledAttributes.getColor(com.google.android.material.R.styleable.MaterialCalendar_backgroundTint, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.A.initializeElevationOverlay(context);
        this.A.setFillColor(ColorStateList.valueOf(color));
        this.A.setElevation(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f26369n ? com.google.android.material.R.layout.mtrl_picker_fullscreen : com.google.android.material.R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        DayViewDecorator dayViewDecorator = this.f26365j;
        if (dayViewDecorator != null) {
            dayViewDecorator.initialize(context);
        }
        if (this.f26369n) {
            viewInflate.findViewById(com.google.android.material.R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(i(context), -2));
        } else {
            viewInflate.findViewById(com.google.android.material.R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(i(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(com.google.android.material.R.id.mtrl_picker_header_selection_text);
        this.f26380y = textView;
        textView.setAccessibilityLiveRegion(1);
        this.f26381z = (CheckableImageButton) viewInflate.findViewById(com.google.android.material.R.id.mtrl_picker_header_toggle);
        this.f26379x = (TextView) viewInflate.findViewById(com.google.android.material.R.id.mtrl_picker_title_text);
        k(context);
        this.B = (Button) viewInflate.findViewById(com.google.android.material.R.id.confirm_button);
        if (getDateSelector().isSelectionComplete()) {
            this.B.setEnabled(true);
        } else {
            this.B.setEnabled(false);
        }
        this.B.setTag(F);
        CharSequence charSequence = this.f26372q;
        if (charSequence != null) {
            this.B.setText(charSequence);
        } else {
            int i10 = this.f26371p;
            if (i10 != 0) {
                this.B.setText(i10);
            }
        }
        CharSequence charSequence2 = this.f26374s;
        if (charSequence2 != null) {
            this.B.setContentDescription(charSequence2);
        } else if (this.f26373r != 0) {
            this.B.setContentDescription(getContext().getResources().getText(this.f26373r));
        }
        this.B.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f26474b.onPositiveButtonClick(view);
            }
        });
        Button button = (Button) viewInflate.findViewById(com.google.android.material.R.id.cancel_button);
        button.setTag(G);
        CharSequence charSequence3 = this.f26376u;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i11 = this.f26375t;
            if (i11 != 0) {
                button.setText(i11);
            }
        }
        CharSequence charSequence4 = this.f26378w;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.f26377v != 0) {
            button.setContentDescription(getContext().getResources().getText(this.f26377v));
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f26475b.onNegativeButtonClick(view);
            }
        });
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NonNull DialogInterface dialogInterface) {
        Iterator it = this.f26360e.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public void onNegativeButtonClick(@NonNull View view) {
        Iterator it = this.f26358c.iterator();
        while (it.hasNext()) {
            ((View.OnClickListener) it.next()).onClick(view);
        }
        dismiss();
    }

    public void onPositiveButtonClick(@NonNull View view) {
        Iterator it = this.f26357b.iterator();
        while (it.hasNext()) {
            ((MaterialPickerOnPositiveButtonClickListener) it.next()).onPositiveButtonClick(getSelection());
        }
        dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f26361f);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f26362g);
        CalendarConstraints.Builder builder = new CalendarConstraints.Builder(this.f26364i);
        MaterialCalendar materialCalendar = this.f26366k;
        Month monthP = materialCalendar == null ? null : materialCalendar.p();
        if (monthP != null) {
            builder.setOpenAt(monthP.f26417g);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", builder.build());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f26365j);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f26367l);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f26368m);
        bundle.putInt("INPUT_MODE_KEY", this.f26370o);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f26371p);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f26372q);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f26373r);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f26374s);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f26375t);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f26376u);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f26377v);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f26378w);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f26369n) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.A);
            f(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.A, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new InsetDialogOnTouchListener(requireDialog(), rect));
        }
        q();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        this.f26363h.b();
        super.onStop();
    }

    void r(String str) {
        this.f26380y.setContentDescription(h());
        this.f26380y.setText(str);
    }

    public boolean removeOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        return this.f26359d.remove(onCancelListener);
    }

    public boolean removeOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        return this.f26360e.remove(onDismissListener);
    }

    public boolean removeOnNegativeButtonClickListener(View.OnClickListener onClickListener) {
        return this.f26358c.remove(onClickListener);
    }

    public boolean removeOnPositiveButtonClickListener(MaterialPickerOnPositiveButtonClickListener<? super S> materialPickerOnPositiveButtonClickListener) {
        return this.f26357b.remove(materialPickerOnPositiveButtonClickListener);
    }

    public static final class Builder<S> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final DateSelector f26389a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        CalendarConstraints f26391c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        DayViewDecorator f26392d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f26390b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f26393e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        CharSequence f26394f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f26395g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        CharSequence f26396h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f26397i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        CharSequence f26398j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f26399k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        CharSequence f26400l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f26401m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        CharSequence f26402n = null;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f26403o = null;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f26404p = 0;

        private Builder(DateSelector dateSelector) {
            this.f26389a = dateSelector;
        }

        private Month a() {
            if (!this.f26389a.getSelectedDays().isEmpty()) {
                Month monthC = Month.c(this.f26389a.getSelectedDays().iterator().next().longValue());
                if (b(monthC, this.f26391c)) {
                    return monthC;
                }
            }
            Month monthD = Month.d();
            return b(monthD, this.f26391c) ? monthD : this.f26391c.k();
        }

        private static boolean b(Month month, CalendarConstraints calendarConstraints) {
            return month.compareTo(calendarConstraints.k()) >= 0 && month.compareTo(calendarConstraints.g()) <= 0;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static <S> Builder<S> customDatePicker(@NonNull DateSelector<S> dateSelector) {
            return new Builder<>(dateSelector);
        }

        @NonNull
        public static Builder<Long> datePicker() {
            return new Builder<>(new SingleDateSelector());
        }

        @NonNull
        public static Builder<Pair<Long, Long>> dateRangePicker() {
            return new Builder<>(new RangeDateSelector());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NonNull
        public MaterialDatePicker<S> build() {
            if (this.f26391c == null) {
                this.f26391c = new CalendarConstraints.Builder().build();
            }
            if (this.f26393e == 0) {
                this.f26393e = this.f26389a.getDefaultTitleResId();
            }
            Object obj = this.f26403o;
            if (obj != null) {
                this.f26389a.setSelection(obj);
            }
            if (this.f26391c.j() == null) {
                this.f26391c.n(a());
            }
            return MaterialDatePicker.o(this);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setCalendarConstraints(CalendarConstraints calendarConstraints) {
            this.f26391c = calendarConstraints;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setDayViewDecorator(@Nullable DayViewDecorator dayViewDecorator) {
            this.f26392d = dayViewDecorator;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setInputMode(int i10) {
            this.f26404p = i10;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setNegativeButtonContentDescription(@StringRes int i10) {
            this.f26401m = i10;
            this.f26402n = null;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setNegativeButtonText(@StringRes int i10) {
            this.f26399k = i10;
            this.f26400l = null;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setPositiveButtonContentDescription(@StringRes int i10) {
            this.f26397i = i10;
            this.f26398j = null;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setPositiveButtonText(@StringRes int i10) {
            this.f26395g = i10;
            this.f26396h = null;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setSelection(S s10) {
            this.f26403o = s10;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setTextInputFormat(@Nullable SimpleDateFormat simpleDateFormat) {
            this.f26389a.setTextInputFormat(simpleDateFormat);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setTheme(@StyleRes int i10) {
            this.f26390b = i10;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setTitleText(@StringRes int i10) {
            this.f26393e = i10;
            this.f26394f = null;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setNegativeButtonContentDescription(@Nullable CharSequence charSequence) {
            this.f26402n = charSequence;
            this.f26401m = 0;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setNegativeButtonText(@Nullable CharSequence charSequence) {
            this.f26400l = charSequence;
            this.f26399k = 0;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setPositiveButtonContentDescription(@Nullable CharSequence charSequence) {
            this.f26398j = charSequence;
            this.f26397i = 0;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setPositiveButtonText(@Nullable CharSequence charSequence) {
            this.f26396h = charSequence;
            this.f26395g = 0;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setTitleText(@Nullable CharSequence charSequence) {
            this.f26394f = charSequence;
            this.f26393e = 0;
            return this;
        }
    }
}
