package f1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.chartboost.sdk.R$drawable;
import com.chartboost.sdk.R$string;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class l3 extends he {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f70292j = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f70293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Function1 f70294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f70295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f70296h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f70297i;

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f70298f = new a();

        public a() {
            super(1);
        }

        public final void a(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return Unit.f93236a;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(Context context, AttributeSet attributeSet, int i10, String infoIconContentDescription, Function1 onInfoIconClicked) {
        super(context, attributeSet, i10, null, null, 24, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(infoIconContentDescription, "infoIconContentDescription");
        Intrinsics.checkNotNullParameter(onInfoIconClicked, "onInfoIconClicked");
        this.f70293e = infoIconContentDescription;
        this.f70294f = onInfoIconClicked;
        this.f70297i = "";
        setId(View.generateViewId());
        setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        setCornerRadius(b(14));
        setContentDescription(infoIconContentDescription);
        ImageView imageView = new ImageView(context);
        imageView.setId(View.generateViewId());
        imageView.setLayoutParams(new ConstraintLayout.LayoutParams(b(28), b(28)));
        imageView.setImageResource(R$drawable.f17909b);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImportantForAccessibility(2);
        this.f70295g = imageView;
        TextView textView = new TextView(context);
        textView.setId(View.generateViewId());
        textView.setText(context.getString(R$string.f17923i));
        textView.setTextSize(12.0f);
        textView.setTextColor(-1);
        textView.setGravity(16);
        textView.setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        textView.setVisibility(8);
        textView.setImportantForAccessibility(2);
        this.f70296h = textView;
        addView(imageView);
        addView(textView);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.connect(imageView.getId(), 1, 0, 1);
        constraintSet.connect(imageView.getId(), 3, 0, 3);
        constraintSet.connect(imageView.getId(), 4, 0, 4);
        constraintSet.connect(textView.getId(), 1, imageView.getId(), 2);
        constraintSet.connect(textView.getId(), 3, 0, 3);
        constraintSet.connect(textView.getId(), 4, 0, 4);
        constraintSet.connect(textView.getId(), 2, 0, 2);
        constraintSet.setMargin(textView.getId(), 2, b(8));
        constraintSet.applyTo(this);
        setFocusable(true);
        setClickable(true);
    }

    public final void e(d9 tracker, t7 purpose) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        tracker.a(this, purpose);
        tracker.a(this.f70295g, purpose);
        tracker.a(this.f70296h, purpose);
    }

    public final void f(rb size) {
        Intrinsics.checkNotNullParameter(size, "size");
        ViewGroup.LayoutParams layoutParams = this.f70295g.getLayoutParams();
        layoutParams.width = a(size.b());
        layoutParams.height = a(size.a());
        this.f70295g.setLayoutParams(layoutParams);
        setCornerRadius(a(size.a() / ((double) 2)));
        requestLayout();
    }

    public final void g(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (url.length() > 0) {
            return;
        }
        this.f70295g.setImageResource(R$drawable.f17909b);
    }

    @NotNull
    public final String getClickthroughUrl() {
        return this.f70297i;
    }

    @VisibleForTesting(otherwise = 2)
    @NotNull
    public final ImageView getIconView() {
        return this.f70295g;
    }

    @VisibleForTesting(otherwise = 2)
    @NotNull
    public final TextView getSponsorText() {
        return this.f70296h;
    }

    public final void h() {
        String str;
        if (this.f70296h.getVisibility() == 0) {
            str = this.f70293e + ": " + ((Object) this.f70296h.getText());
        } else {
            str = this.f70293e;
        }
        setContentDescription(str);
    }

    @Override // android.view.View
    public boolean performClick() {
        this.f70294f.invoke(this.f70297i);
        return super.performClick();
    }

    public final void setClickthroughUrl(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f70297i = url;
    }

    public final void setCustomContentDescription(@NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        h();
    }

    public final void setEnableSponsorText(boolean z10) {
        this.f70296h.setVisibility(z10 ? 0 : 8);
        h();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ l3(Context context, AttributeSet attributeSet, int i10, String str, Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        AttributeSet attributeSet2 = (i11 & 2) != 0 ? null : attributeSet;
        int i12 = (i11 & 4) != 0 ? 0 : i10;
        if ((i11 & 8) != 0) {
            str = context.getString(R$string.f17916b);
            Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        }
        this(context, attributeSet2, i12, str, (i11 & 16) != 0 ? a.f70298f : function1);
    }
}
