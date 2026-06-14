package f1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.chartboost.sdk.R$string;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class va extends he {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f71381l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f71382m = -14669512;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f71383n = -436207617;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f71384o = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f71385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xb f71386f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ha f71387g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f71388h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ob f71389i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f71390j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f71391k;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71392a;

        static {
            int[] iArr = new int[ob.values().length];
            try {
                iArr[ob.f70732b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ob.f70733c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f71392a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(Context context, AttributeSet attributeSet, int i10, String timerContentDescription, xb densityProvider) {
        super(context, attributeSet, i10, null, densityProvider, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(timerContentDescription, "timerContentDescription");
        Intrinsics.checkNotNullParameter(densityProvider, "densityProvider");
        this.f71385e = timerContentDescription;
        this.f71386f = densityProvider;
        this.f71389i = ob.f70733c;
        this.f71390j = "Reward in %d seconds";
        this.f71391k = "Reward granted";
        setId(View.generateViewId());
        setLayoutParams(new ConstraintLayout.LayoutParams(b(28), b(28)));
        setCornerRadius(b(14));
        setContentDescription((CharSequence) timerContentDescription);
        ha haVar = new ha(context, attributeSet, i10, densityProvider);
        haVar.setId(View.generateViewId());
        haVar.setLayoutParams(new ConstraintLayout.LayoutParams(b(28), b(28)));
        haVar.setBackgroundPaintColor(-15262682);
        haVar.setArcColor(f71383n);
        this.f71387g = haVar;
        TextView textView = new TextView(context);
        textView.setId(View.generateViewId());
        textView.setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        textView.setTextSize(12.0f);
        textView.setTextColor(f71384o);
        textView.setIncludeFontPadding(false);
        textView.setGravity(17);
        textView.setImportantForAccessibility(2);
        this.f71388h = textView;
        addView(haVar);
        addView(textView);
        setFocusable(true);
        setClickable(true);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.connect(haVar.getId(), 1, 0, 1);
        constraintSet.connect(haVar.getId(), 2, 0, 2);
        constraintSet.connect(haVar.getId(), 3, 0, 3);
        constraintSet.connect(haVar.getId(), 4, 0, 4);
        constraintSet.connect(textView.getId(), 1, 0, 1);
        constraintSet.connect(textView.getId(), 2, 0, 2);
        constraintSet.connect(textView.getId(), 3, 0, 3);
        constraintSet.connect(textView.getId(), 4, 0, 4);
        constraintSet.applyTo(this);
    }

    public final String e(long j10) {
        return String.valueOf((int) Math.rint(j10 / 1000.0f));
    }

    public final void f(long j10, long j11) {
        this.f71387g.setProgress(kotlin.ranges.g.m(j10 / j11, 0.0f, 1.0f));
        i(j10);
    }

    public final void g(d9 tracker, t7 purpose) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        tracker.a(this, purpose);
        tracker.a(this.f71387g, purpose);
        tracker.a(this.f71388h, purpose);
    }

    @VisibleForTesting(otherwise = 2)
    @NotNull
    public final ha getTimerArc() {
        return this.f71387g;
    }

    @VisibleForTesting(otherwise = 2)
    @NotNull
    public final TextView getTimerText() {
        return this.f71388h;
    }

    public final void h(ob mode, String str, String str2) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f71389i = mode;
        int i10 = b.f71392a[mode.ordinal()];
        if (i10 == 1) {
            setLayoutParams(new ConstraintLayout.LayoutParams(-2, b(28)));
            this.f71387g.setVisibility(8);
            this.f71388h.setVisibility(0);
            setCornerRadius(b(14));
            getBackgroundDrawable().setColor(f71382m);
            if (str != null) {
                this.f71390j = str;
            }
            if (str2 != null) {
                this.f71391k = str2;
            }
            this.f71388h.setPadding(b(12), b(8), b(12), b(8));
        } else if (i10 == 2) {
            setLayoutParams(new ConstraintLayout.LayoutParams(b(28), b(28)));
            this.f71387g.setVisibility(0);
            this.f71388h.setVisibility(0);
            setCornerRadius(b(14));
            getBackgroundDrawable().setColor(-15262682);
            this.f71388h.setPadding(0, 0, 0, 0);
        }
        requestLayout();
    }

    public final void i(long j10) {
        int i10 = b.f71392a[this.f71389i.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            this.f71388h.setText(e(j10));
        } else {
            if (j10 <= 0) {
                this.f71388h.setText(this.f71391k);
                return;
            }
            TextView textView = this.f71388h;
            String str = String.format(this.f71390j, Arrays.copyOf(new Object[]{Long.valueOf(j10 / ((long) 1000))}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            textView.setText(str);
        }
    }

    public final void setContentDescription(@NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        setContentDescription((CharSequence) description);
    }

    public final void setDurationMs(long j10) {
        this.f71387g.setProgress(1.0f);
        i(j10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ va(Context context, AttributeSet attributeSet, int i10, String str, xb xbVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        AttributeSet attributeSet2 = (i11 & 2) != 0 ? null : attributeSet;
        int i12 = (i11 & 4) != 0 ? 0 : i10;
        if ((i11 & 8) != 0) {
            str = context.getString(R$string.f17924j);
            Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        }
        this(context, attributeSet2, i12, str, (i11 & 16) != 0 ? new y7(context) : xbVar);
    }
}
