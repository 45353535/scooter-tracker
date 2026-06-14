package f1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.chartboost.sdk.R$string;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class dd extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f69648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f69649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f69650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xb f69651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Function0 f69652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Function0 f69653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final va f69654h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a5 f69655i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f69656j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f69657k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f69658l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f69659m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd(Context context, AttributeSet attributeSet, int i10, String timerContentDescription, String closeContentDescription, String skipContentDescription, xb densityProvider, Function0 onCloseClicked, Function0 onSkipClicked) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(timerContentDescription, "timerContentDescription");
        Intrinsics.checkNotNullParameter(closeContentDescription, "closeContentDescription");
        Intrinsics.checkNotNullParameter(skipContentDescription, "skipContentDescription");
        Intrinsics.checkNotNullParameter(densityProvider, "densityProvider");
        Intrinsics.checkNotNullParameter(onCloseClicked, "onCloseClicked");
        Intrinsics.checkNotNullParameter(onSkipClicked, "onSkipClicked");
        this.f69648b = timerContentDescription;
        this.f69649c = closeContentDescription;
        this.f69650d = skipContentDescription;
        this.f69651e = densityProvider;
        this.f69652f = onCloseClicked;
        this.f69653g = onSkipClicked;
        this.f69658l = 28;
        this.f69659m = 8;
        setId(View.generateViewId());
        setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        y7 y7Var = new y7(context);
        int iA = y7Var.a(28);
        int iA2 = y7Var.a(8);
        va vaVar = new va(context, null, 0, null, null, 30, null);
        vaVar.setId(View.generateViewId());
        vaVar.setLayoutParams(new ConstraintLayout.LayoutParams(iA, iA));
        vaVar.setVisibility(8);
        this.f69654h = vaVar;
        addView(vaVar);
        t tVar = new t(context, null, 0, 0, null, null, onSkipClicked, 62, null);
        tVar.setId(View.generateViewId());
        tVar.setLayoutParams(new ConstraintLayout.LayoutParams(iA, iA));
        tVar.setVisibility(8);
        this.f69656j = tVar;
        addView(tVar);
        a5 a5Var = new a5(context, null, 0, null, onCloseClicked, 14, null);
        a5Var.setId(View.generateViewId());
        a5Var.setLayoutParams(new ConstraintLayout.LayoutParams(iA, iA));
        a5Var.setVisibility(8);
        this.f69655i = a5Var;
        addView(a5Var);
        setupConstraints(iA2);
        a();
    }

    public static /* synthetic */ void b(dd ddVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        ddVar.e(z10);
    }

    private final void setupConstraints(int i10) {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.connect(this.f69654h.getId(), 1, 0, 1);
        constraintSet.connect(this.f69654h.getId(), 3, 0, 3);
        constraintSet.connect(this.f69654h.getId(), 4, 0, 4);
        constraintSet.connect(this.f69656j.getId(), 1, this.f69654h.getId(), 2, i10);
        constraintSet.connect(this.f69656j.getId(), 3, 0, 3);
        constraintSet.connect(this.f69656j.getId(), 4, 0, 4);
        constraintSet.connect(this.f69655i.getId(), 1, this.f69656j.getId(), 2, i10);
        constraintSet.connect(this.f69655i.getId(), 3, 0, 3);
        constraintSet.connect(this.f69655i.getId(), 4, 0, 4);
        constraintSet.connect(this.f69655i.getId(), 2, 0, 2);
        constraintSet.applyTo(this);
    }

    public final void a() {
        setContentDescription(this.f69654h.getVisibility() == 0 ? this.f69648b : this.f69655i.getVisibility() == 0 ? this.f69649c : this.f69656j.getVisibility() == 0 ? this.f69650d : null);
        setFocusable(getContentDescription() != null);
        setClickable(getContentDescription() != null);
    }

    public final void c(boolean z10) {
        this.f69655i.setVisibility(z10 ? 0 : 8);
        if (z10 && this.f69657k) {
            e(false);
            d(false);
        }
    }

    public final void d(boolean z10) {
        this.f69656j.setVisibility(z10 ? 0 : 8);
        if (z10 && this.f69657k) {
            e(false);
            c(false);
        }
    }

    public final void e(boolean z10) {
        this.f69654h.setVisibility(z10 ? 0 : 8);
        if (z10 && this.f69657k) {
            c(false);
            d(false);
        }
    }

    @NotNull
    public final a5 getCloseButton() {
        return this.f69655i;
    }

    public final boolean getShouldOnlyShowOneButton() {
        return this.f69657k;
    }

    @NotNull
    public final t getSkipButton() {
        return this.f69656j;
    }

    @NotNull
    public final va getTimerChipView() {
        return this.f69654h;
    }

    public final void setShouldOnlyShowOneButton(boolean z10) {
        this.f69657k = z10;
    }

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f69660f = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }

        public final void a() {
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f69661f = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }

        public final void a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ dd(Context context, AttributeSet attributeSet, int i10, String str, String str2, String str3, xb xbVar, Function0 function0, Function0 function02, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        String string;
        String string2;
        String string3;
        AttributeSet attributeSet2 = (i11 & 2) != 0 ? null : attributeSet;
        int i12 = (i11 & 4) != 0 ? 0 : i10;
        if ((i11 & 8) != 0) {
            string = context.getString(R$string.f17924j);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        } else {
            string = str;
        }
        if ((i11 & 16) != 0) {
            string2 = context.getString(R$string.f17915a);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        } else {
            string2 = str2;
        }
        if ((i11 & 32) != 0) {
            string3 = context.getString(R$string.f17922h);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        } else {
            string3 = str3;
        }
        this(context, attributeSet2, i12, string, string2, string3, (i11 & 64) != 0 ? new y7(context) : xbVar, (i11 & 128) != 0 ? a.f69660f : function0, (i11 & 256) != 0 ? b.f69661f : function02);
    }
}
