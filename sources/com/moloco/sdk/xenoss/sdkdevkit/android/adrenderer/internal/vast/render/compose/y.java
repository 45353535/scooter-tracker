package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f58106a = Dp.m3951constructorimpl(4);

    public static final class a implements Function3 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f58107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f58108c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f58109d;

        public a(String str, String str2, long j10) {
            this.f58107b = str;
            this.f58108c = str2;
            this.f58109d = j10;
        }

        public final void a(RowScope OutlinedButton, Composer composer, int i10) {
            Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
            if ((i10 & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1553541117, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastCTA.<anonymous> (VastCTA.kt:38)");
            }
            String str = this.f58107b;
            composer.startReplaceableGroup(-1632172008);
            if (str != null) {
                String str2 = this.f58107b;
                Modifier.Companion companion = Modifier.INSTANCE;
                p.f.a(str2, null, SizeKt.m461size3ABfNKs(ClipKt.clip(companion, RoundedCornerShapeKt.m690RoundedCornerShape0680j_4(y.f58106a)), Dp.m3951constructorimpl(36)), null, null, null, null, 0.0f, null, 0, composer, 48, 1016);
                SpacerKt.Spacer(SizeKt.m466width3ABfNKs(companion, y.f58106a), composer, 6);
                Unit unit = Unit.f93236a;
            }
            composer.endReplaceableGroup();
            TextKt.m1192TextfLXpl1I(this.f58108c, null, this.f58109d, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, null, null, composer, 0, 3072, 57338);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.f93236a;
        }
    }

    public static final Unit b(Modifier modifier, String str, String str2, long j10, Function0 function0, int i10, int i11, Composer composer, int i12) {
        c(modifier, str, str2, j10, function0, composer, i10 | 1, i11);
        return Unit.f93236a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(androidx.compose.ui.Modifier r20, java.lang.String r21, final java.lang.String r22, long r23, final kotlin.jvm.functions.Function0 r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.y.c(androidx.compose.ui.Modifier, java.lang.String, java.lang.String, long, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }
}
