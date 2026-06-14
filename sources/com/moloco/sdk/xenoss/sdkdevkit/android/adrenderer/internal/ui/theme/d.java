package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme;

import androidx.compose.material.Colors;
import androidx.compose.material.ColorsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Colors f57270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Colors f57271b;

    static {
        long jA = a.a();
        long jA2 = a.a();
        Color.Companion companion = Color.INSTANCE;
        f57270a = ColorsKt.m982darkColors2qZNXz8$default(jA, jA2, companion.m1641getWhite0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 4088, null);
        f57271b = ColorsKt.m984lightColors2qZNXz8$default(a.a(), a.a(), companion.m1641getWhite0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 4088, null);
    }

    public static final Unit a(boolean z10, Function2 function2, int i10, int i11, Composer composer, int i12) {
        b(z10, function2, composer, i10 | 1, i11);
        return Unit.f93236a;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final boolean r8, kotlin.jvm.functions.Function2 r9, androidx.compose.runtime.Composer r10, final int r11, final int r12) {
        /*
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 156854067(0x9596733, float:2.6168949E-33)
            androidx.compose.runtime.Composer r5 = r10.startRestartGroup(r0)
            r10 = r11 & 6
            if (r10 != 0) goto L1f
            r10 = r12 & 1
            if (r10 != 0) goto L1c
            boolean r10 = r5.changed(r8)
            if (r10 == 0) goto L1c
            r10 = 4
            goto L1d
        L1c:
            r10 = 2
        L1d:
            r10 = r10 | r11
            goto L20
        L1f:
            r10 = r11
        L20:
            r1 = r12 & 2
            if (r1 == 0) goto L27
            r10 = r10 | 48
            goto L37
        L27:
            r1 = r11 & 48
            if (r1 != 0) goto L37
            boolean r1 = r5.changed(r9)
            if (r1 == 0) goto L34
            r1 = 32
            goto L36
        L34:
            r1 = 16
        L36:
            r10 = r10 | r1
        L37:
            r1 = r10 & 19
            r2 = 18
            if (r1 != r2) goto L49
            boolean r1 = r5.getSkipping()
            if (r1 != 0) goto L44
            goto L49
        L44:
            r5.skipToGroupEnd()
            r4 = r9
            goto L9f
        L49:
            r5.startDefaults()
            r1 = r11 & 1
            if (r1 == 0) goto L61
            boolean r1 = r5.getDefaultsInvalid()
            if (r1 == 0) goto L57
            goto L61
        L57:
            r5.skipToGroupEnd()
            r1 = r12 & 1
            if (r1 == 0) goto L6b
        L5e:
            r10 = r10 & (-15)
            goto L6b
        L61:
            r1 = r12 & 1
            if (r1 == 0) goto L6b
            r8 = 0
            boolean r8 = androidx.compose.foundation.DarkThemeKt.isSystemInDarkTheme(r5, r8)
            goto L5e
        L6b:
            r5.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L7a
            r1 = -1
            java.lang.String r2 = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.Theme (Theme.kt:31)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r10, r1, r2)
        L7a:
            if (r8 == 0) goto L80
            androidx.compose.material.Colors r0 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.d.f57270a
        L7e:
            r1 = r0
            goto L83
        L80:
            androidx.compose.material.Colors r0 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.d.f57271b
            goto L7e
        L83:
            androidx.compose.material.Typography r2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.e.a()
            androidx.compose.material.Shapes r3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.b.a()
            int r10 = r10 << 6
            r10 = r10 & 7168(0x1c00, float:1.0045E-41)
            r6 = r10 | 432(0x1b0, float:6.05E-43)
            r7 = 0
            r4 = r9
            androidx.compose.material.MaterialThemeKt.MaterialTheme(r1, r2, r3, r4, r5, r6, r7)
            boolean r9 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r9 == 0) goto L9f
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L9f:
            androidx.compose.runtime.ScopeUpdateScope r9 = r5.endRestartGroup()
            if (r9 == 0) goto Lad
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.c r10 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.c
            r10.<init>()
            r9.updateScope(r10)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.d.b(boolean, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }
}
