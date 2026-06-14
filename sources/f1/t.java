package f1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.chartboost.sdk.R$drawable;
import com.chartboost.sdk.R$string;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class t extends he {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f71103j = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f71104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f71105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xb f71106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Function0 f71107h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageView f71108i;

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context, AttributeSet attributeSet, int i10, int i11, String skipButtonContentDescription, xb densityProvider, Function0 onSkipClicked) {
        super(context, attributeSet, i10, null, densityProvider, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(skipButtonContentDescription, "skipButtonContentDescription");
        Intrinsics.checkNotNullParameter(densityProvider, "densityProvider");
        Intrinsics.checkNotNullParameter(onSkipClicked, "onSkipClicked");
        this.f71104e = i11;
        this.f71105f = skipButtonContentDescription;
        this.f71106g = densityProvider;
        this.f71107h = onSkipClicked;
        setId(View.generateViewId());
        setCornerRadius(b(14));
        setContentDescription((CharSequence) skipButtonContentDescription);
        ImageView imageView = new ImageView(context);
        imageView.setId(View.generateViewId());
        imageView.setLayoutParams(new ConstraintLayout.LayoutParams(b(28), b(28)));
        imageView.setImageResource(i11);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImportantForAccessibility(2);
        this.f71108i = imageView;
        addView(imageView);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.connect(imageView.getId(), 1, 0, 1);
        constraintSet.connect(imageView.getId(), 2, 0, 2);
        constraintSet.connect(imageView.getId(), 3, 0, 3);
        constraintSet.connect(imageView.getId(), 4, 0, 4);
        constraintSet.applyTo(this);
        setFocusable(true);
        setClickable(true);
    }

    public final void e(d9 tracker, t7 purpose) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        tracker.a(this, purpose);
        tracker.a(this.f71108i, purpose);
    }

    @VisibleForTesting(otherwise = 2)
    @NotNull
    public final ImageView getIconView() {
        return this.f71108i;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 1) {
            this.f71107h.invoke();
        }
        return true;
    }

    public final void setContentDescription(@NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        setContentDescription((CharSequence) description);
    }

    public final void setSkipIcon(int i10) {
        this.f71108i.setImageResource(i10);
    }

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f71109f = new a();

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

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ t(Context context, AttributeSet attributeSet, int i10, int i11, String str, xb xbVar, Function0 function0, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        String string;
        AttributeSet attributeSet2 = (i12 & 2) != 0 ? null : attributeSet;
        int i13 = (i12 & 4) != 0 ? 0 : i10;
        int i14 = (i12 & 8) != 0 ? R$drawable.f17910c : i11;
        if ((i12 & 16) != 0) {
            string = context.getString(R$string.f17922h);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        } else {
            string = str;
        }
        this(context, attributeSet2, i13, i14, string, (i12 & 32) != 0 ? new y7(context) : xbVar, (i12 & 64) != 0 ? a.f71109f : function0);
    }
}
