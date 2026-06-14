package f1;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.chartboost.sdk.R$drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class a5 extends FrameLayout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f69366e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f69367f = -15262682;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xb f69368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f69369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f69370d;

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(Context context, AttributeSet attributeSet, int i10, xb densityProvider, Function0 onCloseClicked) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(densityProvider, "densityProvider");
        Intrinsics.checkNotNullParameter(onCloseClicked, "onCloseClicked");
        this.f69368b = densityProvider;
        this.f69369c = onCloseClicked;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(f69367f);
        setBackground(gradientDrawable);
        ImageView imageView = new ImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(densityProvider.a(28), densityProvider.a(28));
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageResource(R$drawable.f17908a);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f69370d = imageView;
        addView(imageView);
    }

    public final void a(d9 tracker, t7 purpose) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        tracker.a(this, purpose);
        tracker.a(this.f69370d, purpose);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 1) {
            this.f69369c.invoke();
        }
        return true;
    }

    public /* synthetic */ a5(Context context, AttributeSet attributeSet, int i10, xb xbVar, Function0 function0, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? new y7(context) : xbVar, (i11 & 16) != 0 ? a.f69371f : function0);
    }

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f69371f = new a();

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
}
