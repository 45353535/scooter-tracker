package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.w;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class v {

    public static final class a implements Function3 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function0 f57290b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f57291c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f57292d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f57293e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f57294f;

        public a(Function0 function0, boolean z10, long j10, long j11, long j12) {
            this.f57290b = function0;
            this.f57291c = z10;
            this.f57292d = j10;
            this.f57293e = j11;
            this.f57294f = j12;
        }

        public final void a(w buttonPart, Composer composer, int i10) {
            int i11;
            Intrinsics.checkNotNullParameter(buttonPart, "buttonPart");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.changed(buttonPart) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1264027403, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.CountdownButton.<anonymous>.<anonymous> (CountdownButton.kt:56)");
            }
            MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getH6();
            if (buttonPart instanceof w.a) {
                composer.startReplaceableGroup(1000154410);
                composer.endReplaceableGroup();
            } else {
                if (!(buttonPart instanceof w.b)) {
                    composer.startReplaceableGroup(-1491758567);
                    composer.endReplaceableGroup();
                    throw new lf.m();
                }
                composer.startReplaceableGroup(1000496526);
                w.b bVar = (w.b) buttonPart;
                c0.b(bVar.e(), this.f57290b, null, this.f57291c, bVar.c(), this.f57292d, this.f57293e, bVar.d(), bVar.b(), bVar.a(), composer, 0, 4);
                composer.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((w) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.f93236a;
        }
    }

    public static final Unit a(w wVar, Modifier modifier, Function0 function0, boolean z10, long j10, long j11, long j12, com.moloco.sdk.internal.ortb.model.k kVar, int i10, int i11, Composer composer, int i12) {
        b(wVar, modifier, function0, z10, j10, j11, j12, kVar, composer, i10 | 1, i11);
        return Unit.f93236a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.w r25, androidx.compose.ui.Modifier r26, final kotlin.jvm.functions.Function0 r27, final boolean r28, long r29, long r31, long r33, final com.moloco.sdk.internal.ortb.model.k r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instruction units count: 701
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.v.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.w, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, boolean, long, long, long, com.moloco.sdk.internal.ortb.model.k, androidx.compose.runtime.Composer, int, int):void");
    }
}
