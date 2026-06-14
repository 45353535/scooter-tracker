package f1;

import android.content.Context;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class u9 extends r6 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SurfaceView f71262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public FrameLayout f71263g;

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f71264f = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l4 invoke(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new l4(it);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(Context context, String html, v5 callback, zb impressionInterface, da nativeBridgeCommand, String str, SurfaceView surfaceView, FrameLayout videoBackground, Cif eventTracker, Function1 cbWebViewFactory) {
        super(context, html, callback, impressionInterface, str, nativeBridgeCommand, null, eventTracker, cbWebViewFactory, 64, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(nativeBridgeCommand, "nativeBridgeCommand");
        Intrinsics.checkNotNullParameter(videoBackground, "videoBackground");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(cbWebViewFactory, "cbWebViewFactory");
        this.f71262f = surfaceView;
        this.f71263g = videoBackground;
        if (surfaceView == null) {
            throw new IllegalStateException("SurfaceView is not ready. Cannot display video.");
        }
        videoBackground.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        videoBackground.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        addView(this.f71263g);
        this.f71263g.addView(this.f71262f);
        addView(getWebViewContainer());
        callback.a();
        callback.d();
    }

    public final void b() {
        SurfaceView surfaceView = this.f71262f;
        if (surfaceView != null) {
            surfaceView.setVisibility(8);
            this.f71263g.removeView(this.f71262f);
            removeView(this.f71263g);
        }
    }

    public /* synthetic */ u9(Context context, String str, v5 v5Var, zb zbVar, da daVar, String str2, SurfaceView surfaceView, FrameLayout frameLayout, Cif cif, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, v5Var, zbVar, daVar, str2, surfaceView, (i10 & 128) != 0 ? new FrameLayout(context) : frameLayout, cif, (i10 & 512) != 0 ? a.f71264f : function1);
    }
}
