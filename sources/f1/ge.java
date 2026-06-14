package f1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.chartboost.sdk.R$drawable;
import com.chartboost.sdk.R$string;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class ge extends he {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f69948j = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f69949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f69950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Function1 f69951g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f69952h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f69953i;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge(Context context, AttributeSet attributeSet, int i10, String volumeOnContentDescription, String volumeOffContentDescription, Function1 function1) {
        super(context, attributeSet, i10, null, null, 24, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(volumeOnContentDescription, "volumeOnContentDescription");
        Intrinsics.checkNotNullParameter(volumeOffContentDescription, "volumeOffContentDescription");
        this.f69949e = volumeOnContentDescription;
        this.f69950f = volumeOffContentDescription;
        this.f69951g = function1;
        setId(View.generateViewId());
        setCornerRadius(b(14));
        h();
        setFocusable(true);
        setClickable(true);
        ImageView imageView = new ImageView(context);
        imageView.setId(View.generateViewId());
        imageView.setLayoutParams(new ConstraintLayout.LayoutParams(b(28), b(28)));
        imageView.setImageResource(R$drawable.f17912e);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImportantForAccessibility(2);
        this.f69952h = imageView;
        addView(imageView);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.connect(imageView.getId(), 1, 0, 1);
        constraintSet.connect(imageView.getId(), 2, 0, 2);
        constraintSet.connect(imageView.getId(), 3, 0, 3);
        constraintSet.connect(imageView.getId(), 4, 0, 4);
        constraintSet.applyTo(this);
        setOnClickListener(new View.OnClickListener() { // from class: f1.fe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ge.f(this.f69865b, view);
            }
        });
    }

    public static final void f(ge this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.g();
    }

    private final void h() {
        setContentDescription(this.f69953i ? this.f69950f : this.f69949e);
    }

    public final void e(d9 tracker, t7 purpose) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        tracker.a(this, purpose);
        tracker.a(this.f69952h, purpose);
    }

    public final void g() {
        boolean z10 = this.f69953i;
        this.f69953i = !z10;
        this.f69952h.setImageResource(!z10 ? R$drawable.f17911d : R$drawable.f17912e);
        h();
        Function1 function1 = this.f69951g;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(this.f69953i));
        }
    }

    @VisibleForTesting(otherwise = 2)
    @NotNull
    public final ImageView getIconView() {
        return this.f69952h;
    }

    public final void setMuted(boolean z10) {
        if (this.f69953i != z10) {
            this.f69953i = z10;
            this.f69952h.setImageResource(z10 ? R$drawable.f17911d : R$drawable.f17912e);
            h();
            Function1 function1 = this.f69951g;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(z10));
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ge(Context context, AttributeSet attributeSet, int i10, String str, String str2, Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        attributeSet = (i11 & 2) != 0 ? null : attributeSet;
        i10 = (i11 & 4) != 0 ? 0 : i10;
        if ((i11 & 8) != 0) {
            str = context.getString(R$string.f17926l);
            Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        }
        if ((i11 & 16) != 0) {
            str2 = context.getString(R$string.f17925k);
            Intrinsics.checkNotNullExpressionValue(str2, "getString(...)");
        }
        this(context, attributeSet, i10, str, str2, (i11 & 32) != 0 ? null : function1);
    }
}
