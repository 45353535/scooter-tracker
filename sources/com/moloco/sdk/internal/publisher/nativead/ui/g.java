package com.moloco.sdk.internal.publisher.nativead.ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.ComposeView;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.u;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.w;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends FrameLayout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f55043e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f55044f = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a f55045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.internal.a f55046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ComposeView f55047d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b implements Function3 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g0 f55048b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f55049c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function0 f55050d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ t f55051e;

        public static final class a implements Function2 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f55052b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Function0 f55053c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Modifier f55054d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ t f55055e;

            public a(g gVar, Function0 function0, Modifier modifier, t tVar) {
                this.f55052b = gVar;
                this.f55053c = function0;
                this.f55054d = modifier;
                this.f55055e = tVar;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1035844210, i10, -1, "com.moloco.sdk.internal.publisher.nativead.ui.NativeAdVideoContainer.videoView.<anonymous>.<anonymous> (NativeAdVideoContainer.kt:57)");
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar = this.f55052b.f55045b;
                long jM1630getBlack0d7_KjU = Color.INSTANCE.m1630getBlack0d7_KjU();
                Function0 function0 = this.f55053c;
                u uVar = new u(function0, function0, function0);
                h0.i(aVar, this.f55054d, jM1630getBlack0d7_KjU, h.a(composer, 0), null, null, null, uVar, null, null, w.a(i.a(), composer, 6, 0), this.f55055e, composer, 102457728, 0, 512);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((Composer) obj, ((Number) obj2).intValue());
                return Unit.f93236a;
            }
        }

        public b(g0 g0Var, g gVar, Function0 function0, t tVar) {
            this.f55048b = g0Var;
            this.f55049c = gVar;
            this.f55050d = function0;
            this.f55051e = tVar;
        }

        public final void a(Modifier modifier, Composer composer, int i10) {
            Intrinsics.checkNotNullParameter(modifier, "modifier");
            if ((i10 & 6) == 0) {
                i10 |= composer.changed(modifier) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1867022133, i10, -1, "com.moloco.sdk.internal.publisher.nativead.ui.NativeAdVideoContainer.videoView.<anonymous> (NativeAdVideoContainer.kt:56)");
            }
            this.f55048b.a(ComposableLambdaKt.composableLambda(composer, 1035844210, true, new a(this.f55049c, this.f55050d, modifier, this.f55051e)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.f93236a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a vastAdController, t viewVisibilityTracker, com.moloco.sdk.internal.a viewLifecycleOwner, g0 watermark, Function0 function0) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vastAdController, "vastAdController");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        this.f55045b = vastAdController;
        this.f55046c = viewLifecycleOwner;
        ComposeView composeViewA = c.a(context, ComposableLambdaKt.composableLambdaInstance(1867022133, true, new b(watermark, this, function0, viewVisibilityTracker)));
        addView(composeViewA, new ViewGroup.LayoutParams(-1, -1));
        this.f55047d = composeViewA;
    }

    @VisibleForTesting
    public static /* synthetic */ void getVideoView$annotations() {
    }

    public final void b() {
        this.f55045b.destroy();
        c();
    }

    public final void c() {
        removeAllViews();
        ComposeView composeView = this.f55047d;
        if (composeView != null) {
            composeView.disposeComposition();
        }
        this.f55047d = null;
    }

    @Nullable
    public final ComposeView getVideoView() {
        return this.f55047d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "VideoContainer", "onAttachedToWindow", null, false, 12, null);
        this.f55046c.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "VideoContainer", "onDetachedFromWindow", null, false, 12, null);
        this.f55046c.b(this);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            this.f55046c.d(this);
        } else {
            this.f55046c.c(this);
        }
    }

    public final void setVideoView(@Nullable ComposeView composeView) {
        this.f55047d = composeView;
    }
}
