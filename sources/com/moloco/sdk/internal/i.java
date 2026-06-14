package com.moloco.sdk.internal;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import com.moloco.sdk.R$drawable;
import com.moloco.sdk.internal.ortb.model.B;
import com.moloco.sdk.internal.ortb.model.C;
import com.moloco.sdk.internal.ortb.model.C4724a;
import com.moloco.sdk.internal.ortb.model.C4725b;
import com.moloco.sdk.internal.ortb.model.C4726c;
import com.moloco.sdk.internal.ortb.model.D;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f54278a = lf.i.a(new Function0() { // from class: com.moloco.sdk.internal.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return i.m();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f54279b = Color.INSTANCE.m1641getWhite0d7_KjU();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f54280c = g0.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f54281d;

    public static final class a implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ B f54282b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.k f54283c;

        public a(B b10, com.moloco.sdk.internal.ortb.model.k kVar) {
            this.f54282b = b10;
            this.f54283c = kVar;
        }

        public final Function10 a(Composer composer, int i10) {
            composer.startReplaceableGroup(-1299178940);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1299178940, i10, -1, "com.moloco.sdk.internal.determineSkipCloseBehaviorFromDec.<anonymous> (AggregatedOptions.kt:186)");
            }
            float fM3951constructorimpl = Dp.m3951constructorimpl(this.f54282b.getControlSize());
            long jM3973DpSizeYgX7TsA = DpKt.m3973DpSizeYgX7TsA(fM3951constructorimpl, fM3951constructorimpl);
            Alignment alignmentA = i.a(this.f54282b.getHorizontalAlignment(), this.f54282b.getVerticalAlignment());
            PaddingValues paddingValuesM411PaddingValues0680j_4 = PaddingKt.m411PaddingValues0680j_4(Dp.m3951constructorimpl(this.f54282b.getPadding()));
            long jF = this.f54282b.getForegroundColor();
            long sp = TextUnitKt.getSp(this.f54282b.getControlSize());
            TextUnitKt.m4145checkArithmeticR2X_6o(sp);
            long jPack = TextUnitKt.pack(TextUnit.m4130getRawTypeimpl(sp), TextUnit.m4132getValueimpl(sp) / 2);
            long jM4054timesGh9hcWk = DpSize.m4054timesGh9hcWk(jM3973DpSizeYgX7TsA, 0.4f);
            Color colorC = this.f54282b.getBackgroundColor();
            Function10 function10B = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.l.b(alignmentA, paddingValuesM411PaddingValues0680j_4, jF, jM3973DpSizeYgX7TsA, jPack, i.k(jM4054timesGh9hcWk, colorC != null ? colorC.m1614unboximpl() : i.f54279b, composer, 0), null, this.f54283c, composer, 0, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return function10B;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    public static final class b implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f54284b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ B f54285c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.k f54286d;

        public b(boolean z10, B b10, com.moloco.sdk.internal.ortb.model.k kVar) {
            this.f54284b = z10;
            this.f54285c = b10;
            this.f54286d = kVar;
        }

        public final Function10 a(Composer composer, int i10) {
            Function10 function10B;
            composer.startReplaceableGroup(2061132145);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2061132145, i10, -1, "com.moloco.sdk.internal.toCloseButton.<anonymous> (AggregatedOptions.kt:204)");
            }
            if (this.f54284b) {
                function10B = null;
            } else {
                float fM3951constructorimpl = Dp.m3951constructorimpl(this.f54285c.getControlSize());
                long jM3973DpSizeYgX7TsA = DpKt.m3973DpSizeYgX7TsA(fM3951constructorimpl, fM3951constructorimpl);
                Alignment alignmentA = i.a(this.f54285c.getHorizontalAlignment(), this.f54285c.getVerticalAlignment());
                PaddingValues paddingValuesM411PaddingValues0680j_4 = PaddingKt.m411PaddingValues0680j_4(Dp.m3951constructorimpl(this.f54285c.getPadding()));
                long jF = this.f54285c.getForegroundColor();
                long sp = TextUnitKt.getSp(this.f54285c.getControlSize());
                TextUnitKt.m4145checkArithmeticR2X_6o(sp);
                long jPack = TextUnitKt.pack(TextUnit.m4130getRawTypeimpl(sp), TextUnit.m4132getValueimpl(sp) / 2);
                Painter painterPainterResource = PainterResources_androidKt.painterResource(R$drawable.f53879f, composer, 0);
                long jM4054timesGh9hcWk = DpSize.m4054timesGh9hcWk(jM3973DpSizeYgX7TsA, 0.45f);
                Color colorC = this.f54285c.getBackgroundColor();
                function10B = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a0.b(alignmentA, paddingValuesM411PaddingValues0680j_4, jF, jM3973DpSizeYgX7TsA, jPack, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a0.a(painterPainterResource, jM4054timesGh9hcWk, null, colorC != null ? colorC.m1614unboximpl() : i.f54279b, composer, 0, 4), null, this.f54286d, composer, 0, 64);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return function10B;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    public static final class c implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.x f54287b;

        public c(com.moloco.sdk.internal.ortb.model.x xVar) {
            this.f54287b = xVar;
        }

        public final Function7 a(Composer composer, int i10) {
            long jM3973DpSizeYgX7TsA;
            composer.startReplaceableGroup(1012987991);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1012987991, i10, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:77)");
            }
            if (this.f54287b.getMute().getControlSize() != null) {
                float fM3951constructorimpl = Dp.m3951constructorimpl(r1.g());
                jM3973DpSizeYgX7TsA = DpKt.m3973DpSizeYgX7TsA(fM3951constructorimpl, fM3951constructorimpl);
            } else {
                jM3973DpSizeYgX7TsA = i.f54281d;
            }
            Alignment alignmentA = i.a(this.f54287b.getMute().getHorizontalAlignment(), this.f54287b.getMute().getVerticalAlignment());
            PaddingValues paddingValuesM411PaddingValues0680j_4 = PaddingKt.m411PaddingValues0680j_4(Dp.m3951constructorimpl(this.f54287b.getMute().getPadding()));
            long jM4054timesGh9hcWk = DpSize.m4054timesGh9hcWk(jM3973DpSizeYgX7TsA, 0.6f);
            long jE = this.f54287b.getMute().getForegroundColor();
            Color colorC = this.f54287b.getMute().getBackgroundColor();
            Function7 function7G = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h0.g(jM3973DpSizeYgX7TsA, jM4054timesGh9hcWk, null, colorC != null ? colorC.m1614unboximpl() : i.f54279b, alignmentA, paddingValuesM411PaddingValues0680j_4, jE, PainterResources_androidKt.painterResource(R$drawable.f53885l, composer, 0), PainterResources_androidKt.painterResource(R$drawable.f53886m, composer, 0), null, composer, 0, 516);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return function7G;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    public static final class d implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.x f54288b;

        public d(com.moloco.sdk.internal.ortb.model.x xVar) {
            this.f54288b = xVar;
        }

        public final Function10 a(Composer composer, int i10) {
            Function10 function10B;
            composer.startReplaceableGroup(-168563086);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-168563086, i10, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:92)");
            }
            B skip = this.f54288b.getSkip();
            if (skip == null) {
                function10B = null;
            } else {
                com.moloco.sdk.internal.ortb.model.x xVar = this.f54288b;
                float fM3951constructorimpl = Dp.m3951constructorimpl(skip.getControlSize());
                long jM3973DpSizeYgX7TsA = DpKt.m3973DpSizeYgX7TsA(fM3951constructorimpl, fM3951constructorimpl);
                Alignment alignmentA = i.a(skip.getHorizontalAlignment(), skip.getVerticalAlignment());
                PaddingValues paddingValuesM411PaddingValues0680j_4 = PaddingKt.m411PaddingValues0680j_4(Dp.m3951constructorimpl(skip.getPadding()));
                long jF = skip.getForegroundColor();
                long sp = TextUnitKt.getSp(skip.getControlSize());
                TextUnitKt.m4145checkArithmeticR2X_6o(sp);
                long jPack = TextUnitKt.pack(TextUnit.m4130getRawTypeimpl(sp), TextUnit.m4132getValueimpl(sp) / 2);
                long jM4054timesGh9hcWk = DpSize.m4054timesGh9hcWk(jM3973DpSizeYgX7TsA, 0.4f);
                Color colorC = skip.getBackgroundColor();
                function10B = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.l.b(alignmentA, paddingValuesM411PaddingValues0680j_4, jF, jM3973DpSizeYgX7TsA, jPack, i.k(jM4054timesGh9hcWk, colorC != null ? colorC.m1614unboximpl() : i.f54279b, composer, 0), null, xVar.getCountDownTimer(), composer, 0, 64);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return function10B;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    public static final class e implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f54289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.x f54290c;

        public e(boolean z10, com.moloco.sdk.internal.ortb.model.x xVar) {
            this.f54289b = z10;
            this.f54290c = xVar;
        }

        public final Function7 a(Composer composer, int i10) {
            Function7 function7C;
            Composer composer2;
            com.moloco.sdk.internal.ortb.model.i cta;
            composer.startReplaceableGroup(616016756);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(616016756, i10, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:110)");
            }
            if (this.f54289b || (cta = this.f54290c.getCta()) == null) {
                function7C = null;
                composer2 = composer;
            } else {
                Alignment alignmentA = i.a(cta.getHorizontalAlignment(), cta.getVerticalAlignment());
                PaddingValues paddingValuesM411PaddingValues0680j_4 = PaddingKt.m411PaddingValues0680j_4(Dp.m3951constructorimpl(cta.getPadding()));
                String strH = cta.getText();
                long jD = cta.getForegroundColor();
                Color colorC = cta.getBackgroundColor();
                composer2 = composer;
                function7C = g0.c(alignmentA, paddingValuesM411PaddingValues0680j_4, strH, jD, colorC != null ? colorC.m1614unboximpl() : g0.a(), cta.getImageUrl(), composer2, 0, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return function7C;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    public static final class f implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f54291b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.x f54292c;

        public f(boolean z10, com.moloco.sdk.internal.ortb.model.x xVar) {
            this.f54291b = z10;
            this.f54292c = xVar;
        }

        public final Function5 a(Composer composer, int i10) {
            Function5 function5F;
            Composer composer2;
            com.moloco.sdk.internal.ortb.model.y progressBar;
            composer.startReplaceableGroup(962638324);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(962638324, i10, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:128)");
            }
            if (this.f54291b || (progressBar = this.f54292c.getProgressBar()) == null) {
                function5F = null;
                composer2 = composer;
            } else {
                composer2 = composer;
                function5F = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h0.f(i.a(progressBar.getHorizontalAlignment(), progressBar.getVerticalAlignment()), PaddingKt.m411PaddingValues0680j_4(Dp.m3951constructorimpl(progressBar.getPadding())), progressBar.getForegroundColor(), composer2, 0, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return function5F;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    public static final class g implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.x f54293b;

        public g(com.moloco.sdk.internal.ortb.model.x xVar) {
            this.f54293b = xVar;
        }

        public final Function6 a(Composer composer, int i10) {
            composer.startReplaceableGroup(524680050);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(524680050, i10, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:142)");
            }
            C vastPrivacyIcon = this.f54293b.getVastPrivacyIcon();
            composer.startReplaceableGroup(-1135751215);
            Function6 function6I = vastPrivacyIcon == null ? null : com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.s.i(i.a(vastPrivacyIcon.getHorizontalAlignment(), vastPrivacyIcon.getVerticalAlignment()), PaddingKt.m411PaddingValues0680j_4(Dp.m3951constructorimpl(vastPrivacyIcon.getPadding())), composer, 0, 0);
            composer.endReplaceableGroup();
            if (function6I == null) {
                function6I = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.s.i(null, null, composer, 0, 3);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return function6I;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    static {
        float f10 = 30;
        f54281d = DpKt.m3973DpSizeYgX7TsA(Dp.m3951constructorimpl(f10), Dp.m3951constructorimpl(f10));
    }

    public static final Alignment a(com.moloco.sdk.internal.ortb.model.t horizontalAlignment, D verticalAlignment) {
        Intrinsics.checkNotNullParameter(horizontalAlignment, "horizontalAlignment");
        Intrinsics.checkNotNullParameter(verticalAlignment, "verticalAlignment");
        D d10 = D.f54491c;
        if (verticalAlignment == d10 && (horizontalAlignment == com.moloco.sdk.internal.ortb.model.t.f54628c || horizontalAlignment == com.moloco.sdk.internal.ortb.model.t.f54631f)) {
            return Alignment.INSTANCE.getTopStart();
        }
        if (verticalAlignment == d10 && horizontalAlignment == com.moloco.sdk.internal.ortb.model.t.f54629d) {
            return Alignment.INSTANCE.getTopCenter();
        }
        if (verticalAlignment == d10 && (horizontalAlignment == com.moloco.sdk.internal.ortb.model.t.f54630e || horizontalAlignment == com.moloco.sdk.internal.ortb.model.t.f54632g)) {
            return Alignment.INSTANCE.getTopEnd();
        }
        D d11 = D.f54492d;
        if (verticalAlignment == d11 && (horizontalAlignment == com.moloco.sdk.internal.ortb.model.t.f54628c || horizontalAlignment == com.moloco.sdk.internal.ortb.model.t.f54631f)) {
            return Alignment.INSTANCE.getCenterStart();
        }
        if (verticalAlignment == d11 && horizontalAlignment == com.moloco.sdk.internal.ortb.model.t.f54629d) {
            return Alignment.INSTANCE.getCenter();
        }
        if (verticalAlignment == d11 && (horizontalAlignment == com.moloco.sdk.internal.ortb.model.t.f54630e || horizontalAlignment == com.moloco.sdk.internal.ortb.model.t.f54632g)) {
            return Alignment.INSTANCE.getCenterEnd();
        }
        D d12 = D.f54493e;
        return (verticalAlignment == d12 && (horizontalAlignment == com.moloco.sdk.internal.ortb.model.t.f54628c || horizontalAlignment == com.moloco.sdk.internal.ortb.model.t.f54631f)) ? Alignment.INSTANCE.getBottomStart() : (verticalAlignment == d12 && horizontalAlignment == com.moloco.sdk.internal.ortb.model.t.f54629d) ? Alignment.INSTANCE.getBottomCenter() : (verticalAlignment == d12 && (horizontalAlignment == com.moloco.sdk.internal.ortb.model.t.f54630e || horizontalAlignment == com.moloco.sdk.internal.ortb.model.t.f54632g)) ? Alignment.INSTANCE.getBottomEnd() : Alignment.INSTANCE.getTopStart();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o b(com.moloco.sdk.internal.ortb.model.x xVar, boolean z10) {
        com.moloco.sdk.internal.ortb.model.r rVarC;
        lf.t delaySeconds;
        int iE = xVar.getClose().getDelaySeconds();
        Function9 function9J = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.p.j(0L, h(z10, xVar.getClose(), xVar.getDec(), xVar.getCountDownTimer()), 1, null);
        com.moloco.sdk.internal.ortb.model.l dec = xVar.getDec();
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o(iE, function9J, (dec == null || (rVarC = dec.getClose()) == null || (delaySeconds = rVarC.getDelaySeconds()) == null) ? 0 : delaySeconds.g(), g(xVar.getClose(), z10, null, 2, null), xVar.getAndroidInline(), xVar.getAutoInline());
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q c() {
        return d(p());
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q d(com.moloco.sdk.internal.ortb.model.x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o oVarB = b(xVar, true);
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q(l(xVar, true), oVarB, oVarB);
    }

    public static final Function2 f(B b10, boolean z10, com.moloco.sdk.internal.ortb.model.k kVar) {
        return new b(z10, b10, kVar);
    }

    public static /* synthetic */ Function2 g(B b10, boolean z10, com.moloco.sdk.internal.ortb.model.k kVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            kVar = null;
        }
        return f(b10, z10, kVar);
    }

    public static final Function2 h(boolean z10, B close, com.moloco.sdk.internal.ortb.model.l lVar, com.moloco.sdk.internal.ortb.model.k kVar) {
        Intrinsics.checkNotNullParameter(close, "close");
        return lVar == null ? f(close, z10, kVar) : new a(close, kVar);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q i() {
        return j(p());
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q j(com.moloco.sdk.internal.ortb.model.x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o oVarB = b(xVar, false);
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q(l(xVar, false), oVarB, oVarB);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.w k(long j10, long j11, Composer composer, int i10) {
        composer.startReplaceableGroup(-868162195);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-868162195, i10, -1, "com.moloco.sdk.internal.defaultMolocoSkipAfterCountdownButtonPart (AggregatedOptions.kt:161)");
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.w wVarA = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.l.a(PainterResources_androidKt.painterResource(R$drawable.f53880g, composer, 0), j10, null, j11, composer, ((i10 << 3) & 112) | ((i10 << 6) & 7168), 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return wVarA;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f0 l(com.moloco.sdk.internal.ortb.model.x xVar, boolean z10) {
        com.moloco.sdk.internal.ortb.model.r rVarC;
        lf.t delaySeconds;
        boolean zG = xVar.getMute().getMute();
        Boolean bool = xVar.getSkip() == null ? null : Boolean.TRUE;
        B skip = xVar.getSkip();
        int iG = 0;
        int iE = skip != null ? skip.getDelaySeconds() : 0;
        C4726c autoStore = xVar.getAutoStore();
        boolean z11 = autoStore != null && autoStore.getEnabled() && xVar.getAutoStore().getOnSkip();
        C4726c autoStore2 = xVar.getAutoStore();
        boolean z12 = autoStore2 != null && autoStore2.getEnabled();
        int iE2 = xVar.getClose().getDelaySeconds();
        com.moloco.sdk.internal.ortb.model.l dec = xVar.getDec();
        if (dec != null && (rVarC = dec.getClose()) != null && (delaySeconds = rVarC.getDelaySeconds()) != null) {
            iG = delaySeconds.g();
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f0(zG, bool, iE, iE2, iG, z11, z12, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h0.e(0L, new c(xVar), f(xVar.getClose(), z10, xVar.getCountDownTimer()), new d(xVar), new e(z10, xVar), z.b(xVar.getIsAllAreaClickable()), new f(z10, xVar), new g(xVar), null, null, 769, null), xVar.getAndroidInline(), xVar.getAutoInline());
    }

    public static final com.moloco.sdk.internal.ortb.model.x m() {
        long j10 = f54280c;
        int iC = lf.t.c(30);
        com.moloco.sdk.internal.ortb.model.t tVar = com.moloco.sdk.internal.ortb.model.t.f54630e;
        D d10 = D.f54491c;
        DefaultConstructorMarker defaultConstructorMarker = null;
        Color color = null;
        B b10 = new B(5, 10, iC, tVar, d10, j10, color, 64, defaultConstructorMarker);
        com.moloco.sdk.internal.ortb.model.y yVar = new com.moloco.sdk.internal.ortb.model.y(0, com.moloco.sdk.internal.ortb.model.t.f54629d, D.f54493e, j10, null);
        byte b11 = 0 == true ? 1 : 0;
        return new com.moloco.sdk.internal.ortb.model.x(b10, b10, yVar, new com.moloco.sdk.internal.ortb.model.w((boolean) b11, 10, com.moloco.sdk.internal.ortb.model.t.f54628c, d10, j10, (lf.t) null, color, 96, defaultConstructorMarker), (com.moloco.sdk.internal.ortb.model.i) null, true, new C4726c(false, false, (String) null, 6, (DefaultConstructorMarker) null), (C) null, (com.moloco.sdk.internal.ortb.model.l) null, (com.moloco.sdk.internal.ortb.model.k) null, (C4724a) null, (C4725b) null, 3456, (DefaultConstructorMarker) null);
    }

    public static final com.moloco.sdk.internal.ortb.model.x p() {
        return (com.moloco.sdk.internal.ortb.model.x) f54278a.getValue();
    }
}
