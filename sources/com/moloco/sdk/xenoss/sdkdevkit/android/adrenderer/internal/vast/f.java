package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class f {

    public static final class a implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Unit f57416b;

        public a(Unit unit) {
            this.f57416b = unit;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1040652088, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastView.<anonymous>.<anonymous> (VastActivity.kt:313)");
            }
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

    public /* synthetic */ class b extends kotlin.jvm.internal.y implements Function0 {
        public b(Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a.class, "goNextAdPartOrDismissAd", "goNextAdPartOrDismissAd()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a) this.receiver).x();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final View a(Function2 function2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar, Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        return (View) function2.invoke(ctx, aVar);
    }

    public static final Unit b(Activity activity, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar, Function2 function2, g0 g0Var, int i10, int i11, Composer composer, int i12) {
        c(activity, aVar, function2, g0Var, composer, i10 | 1, i11);
        return Unit.f93236a;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final android.app.Activity r23, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a r24, kotlin.jvm.functions.Function2 r25, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f.c(android.app.Activity, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a, kotlin.jvm.functions.Function2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0, androidx.compose.runtime.Composer, int, int):void");
    }
}
