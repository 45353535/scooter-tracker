package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.service_locator.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.m;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f57068h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f57069i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f57070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f57071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f57072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f57073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a f57074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.a f57075f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f57076g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public k(o installer, String str, c bundleExtractor, b bVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a aVar, com.moloco.sdk.acm.recorder.a aVar2) {
        Intrinsics.checkNotNullParameter(installer, "installer");
        Intrinsics.checkNotNullParameter(bundleExtractor, "bundleExtractor");
        this.f57070a = installer;
        this.f57071b = str;
        this.f57072c = bundleExtractor;
        this.f57073d = bVar;
        this.f57074e = aVar;
        this.f57075f = aVar2;
        this.f57076g = new AtomicBoolean(false);
    }

    public static final Unit c(k kVar, m outcome) {
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        if (!Intrinsics.areEqual(outcome, m.c.f57082a)) {
            if (Intrinsics.areEqual(outcome, m.a.f57080a)) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "InlineInstallLauncher", "auto_fullsheet_shown", null, false, 12, null);
                com.moloco.sdk.acm.recorder.a aVar = kVar.f57075f;
                if (aVar != null) {
                    aVar.b(new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.T.g()).e(com.moloco.sdk.internal.client_metrics_data.c.f54176e.g(), "auto_fullsheet_shown"));
                }
            } else {
                if (!Intrinsics.areEqual(outcome, m.b.f57081a)) {
                    throw new lf.m();
                }
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "InlineInstallLauncher", "auto_fallback_shown", null, false, 12, null);
                com.moloco.sdk.acm.recorder.a aVar2 = kVar.f57075f;
                if (aVar2 != null) {
                    aVar2.b(new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.T.g()).e(com.moloco.sdk.internal.client_metrics_data.c.f54176e.g(), "auto_fallback_shown"));
                }
            }
        }
        return Unit.f93236a;
    }

    public static final Unit d(Function1 function1, m outcome) {
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        function1.invoke(outcome);
        return Unit.f93236a;
    }

    public static final Unit g(k kVar, m outcome) {
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        if (Intrinsics.areEqual(outcome, m.c.f57082a)) {
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.info$default(molocoLogger, "InlineInstallLauncher", "click_inline_halfsheet_shown", null, false, 12, null);
            com.moloco.sdk.acm.recorder.a aVar = kVar.f57075f;
            if (aVar != null) {
                aVar.b(new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.T.g()).e(com.moloco.sdk.internal.client_metrics_data.c.f54176e.g(), "click_inline_halfsheet_shown"));
            }
            if (kVar.f57076g.compareAndSet(false, true)) {
                String strB = kVar.f57073d.b();
                if (strB != null) {
                    b.i.f55834a.c().a(strB);
                    MolocoLogger.info$default(molocoLogger, "InlineInstallLauncher", "inline_install_success fire this event once: " + strB, null, false, 12, null);
                }
            } else {
                MolocoLogger.info$default(molocoLogger, "InlineInstallLauncher", "inline_install_success already fired", null, false, 12, null);
            }
        } else if (Intrinsics.areEqual(outcome, m.a.f57080a)) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "InlineInstallLauncher", "click_inline_fullsheet_shown", null, false, 12, null);
            com.moloco.sdk.acm.recorder.a aVar2 = kVar.f57075f;
            if (aVar2 != null) {
                aVar2.b(new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.T.g()).e(com.moloco.sdk.internal.client_metrics_data.c.f54176e.g(), "click_inline_fullsheet_shown"));
            }
        } else {
            if (!Intrinsics.areEqual(outcome, m.b.f57081a)) {
                throw new lf.m();
            }
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "InlineInstallLauncher", "click_inline_fallback_shown", null, false, 12, null);
            com.moloco.sdk.acm.recorder.a aVar3 = kVar.f57075f;
            if (aVar3 != null) {
                aVar3.b(new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.T.g()).e(com.moloco.sdk.internal.client_metrics_data.c.f54176e.g(), "click_inline_fallback_shown"));
            }
        }
        return Unit.f93236a;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.g
    public void a(String str, t0 externalLinkHandler) {
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        b bVar = this.f57073d;
        if (bVar == null || !bVar.a()) {
            if (str != null) {
                externalLinkHandler.a(str);
            }
        } else {
            com.moloco.sdk.acm.recorder.a aVar = this.f57075f;
            if (aVar != null) {
                aVar.b(new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.S.g()).e(com.moloco.sdk.internal.client_metrics_data.c.f54179h.g(), "android_inline"));
            }
            e(externalLinkHandler, str, new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k.g(this.f57066b, (m) obj);
                }
            });
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.g
    public void b(String str, t0 externalLinkHandler) {
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a aVar = this.f57074e;
        if (aVar == null || !aVar.b()) {
            return;
        }
        com.moloco.sdk.acm.recorder.a aVar2 = this.f57075f;
        if (aVar2 != null) {
            aVar2.b(new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.S.g()).e(com.moloco.sdk.internal.client_metrics_data.c.f54179h.g(), "auto_inline"));
        }
        String strA = this.f57074e.a();
        if (strA != null) {
            str = strA;
        }
        e(externalLinkHandler, str, new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k.c(this.f57065b, (m) obj);
            }
        });
        String strC = this.f57074e.c();
        if (strC != null) {
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.info$default(molocoLogger, "InlineInstallLauncher", "auto_halfsheet_shown success", null, false, 12, null);
            b.i.f55834a.c().a(strC);
            MolocoLogger.info$default(molocoLogger, "InlineInstallLauncher", "auto_inline_success fire this event once: " + strC, null, false, 12, null);
            com.moloco.sdk.acm.recorder.a aVar3 = this.f57075f;
            if (aVar3 != null) {
                aVar3.b(new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.T.g()).e(com.moloco.sdk.internal.client_metrics_data.c.f54176e.g(), "auto_halfsheet_shown"));
            }
        }
    }

    public final void e(t0 t0Var, String str, Function1 function1) {
        String str2 = this.f57071b;
        String strB = (str2 == null || !this.f57072c.a(str2)) ? str != null ? this.f57072c.b(str) : null : this.f57071b;
        String strD = str != null ? this.f57072c.d(str) : null;
        if (strB != null && this.f57072c.a(strB)) {
            f(strB, strD, str, t0Var, function1);
            return;
        }
        MolocoLogger.warn$default(MolocoLogger.INSTANCE, "InlineInstallLauncher", "Store URL found but bundle extraction/validation failed: " + str, null, false, 12, null);
        if (str == null || str.length() == 0) {
            return;
        }
        t0Var.a(str);
        function1.invoke(m.b.f57081a);
    }

    public final void f(String str, String str2, String str3, t0 t0Var, final Function1 function1) {
        if (this.f57070a.a(str, str2, new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k.d(function1, (m) obj);
            }
        }) || str3 == null) {
            return;
        }
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, "InlineInstallLauncher", "Cannot resolve app install intent", null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, "InlineInstallLauncher", "inline_install_fallback", null, false, 12, null);
        t0Var.a(str3);
        function1.invoke(m.b.f57081a);
    }
}
