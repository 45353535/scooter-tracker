package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import android.graphics.Bitmap;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f55851a;

    public static final class a implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function2 f55852b;

        public a(Function2 function2) {
            this.f55852b = function2;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(586795374, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.WatermarkImpl.ApplyWatermark.<anonymous> (Watermark.kt:47)");
            }
            this.f55852b.invoke(composer, 0);
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

    public b(String str) {
        this.f55851a = str;
    }

    public static final Unit b(b bVar, Function2 function2, int i10, Composer composer, int i11) {
        bVar.a(function2, composer, i10 | 1);
        return Unit.f93236a;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0
    public void a(final Function2 content, Composer composer, final int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(412679763);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(content) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(this) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(412679763, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.WatermarkImpl.ApplyWatermark (Watermark.kt:45)");
            }
            g.e(this.f55851a, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 586795374, true, new a(content)), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return b.b(this.f55848b, content, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0
    public void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Bitmap bitmapA = g.a(this.f55851a);
        if (bitmapA == null) {
            return;
        }
        com.moloco.sdk.service_locator.b bVar = com.moloco.sdk.service_locator.b.f55791a;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(bVar.a().getResources(), bitmapA);
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        bitmapDrawable.setTileModeXY(tileMode, tileMode);
        bitmapDrawable.setTargetDensity(bVar.a().getResources().getDisplayMetrics());
        view.setForeground(bitmapDrawable);
        view.setClickable(false);
        view.setFocusable(false);
    }
}
