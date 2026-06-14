package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j;
import kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public abstract class r0 {
    public static final Unit a(j.b bVar, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        b(bVar, modifier, composer, i10 | 1, i11);
        return Unit.f93236a;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j.b r17, androidx.compose.ui.Modifier r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            r0 = r17
            r1 = r20
            r2 = r21
            java.lang.String r3 = "imageResource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            r3 = 1666152349(0x634f779d, float:3.827095E21)
            r4 = r19
            androidx.compose.runtime.Composer r14 = r4.startRestartGroup(r3)
            r4 = r2 & 1
            if (r4 == 0) goto L1b
            r4 = r1 | 6
            goto L2b
        L1b:
            r4 = r1 & 6
            if (r4 != 0) goto L2a
            boolean r4 = r14.changed(r0)
            if (r4 == 0) goto L27
            r4 = 4
            goto L28
        L27:
            r4 = 2
        L28:
            r4 = r4 | r1
            goto L2b
        L2a:
            r4 = r1
        L2b:
            r5 = r2 & 2
            if (r5 == 0) goto L34
            r4 = r4 | 48
        L31:
            r6 = r18
            goto L46
        L34:
            r6 = r1 & 48
            if (r6 != 0) goto L31
            r6 = r18
            boolean r7 = r14.changed(r6)
            if (r7 == 0) goto L43
            r7 = 32
            goto L45
        L43:
            r7 = 16
        L45:
            r4 = r4 | r7
        L46:
            r7 = r4 & 19
            r8 = 18
            if (r7 != r8) goto L58
            boolean r7 = r14.getSkipping()
            if (r7 != 0) goto L53
            goto L58
        L53:
            r14.skipToGroupEnd()
            r3 = r6
            goto L9d
        L58:
            if (r5 == 0) goto L5d
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.INSTANCE
            goto L5e
        L5d:
            r5 = r6
        L5e:
            boolean r6 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r6 == 0) goto L6a
            r6 = -1
            java.lang.String r7 = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastResourceImage (VastResourceImage.kt:10)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r4, r6, r7)
        L6a:
            int r3 = r0.c()
            float r3 = (float) r3
            float r3 = androidx.compose.ui.unit.Dp.m3951constructorimpl(r3)
            int r4 = r0.a()
            float r4 = (float) r4
            float r4 = androidx.compose.ui.unit.Dp.m3951constructorimpl(r4)
            androidx.compose.ui.Modifier r6 = androidx.compose.foundation.layout.SizeKt.m463sizeVpY3zN4(r5, r3, r4)
            java.lang.String r4 = r0.b()
            r15 = 48
            r16 = 1016(0x3f8, float:1.424E-42)
            r3 = r5
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            p.f.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r4 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r4 == 0) goto L9d
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L9d:
            androidx.compose.runtime.ScopeUpdateScope r4 = r14.endRestartGroup()
            if (r4 == 0) goto Lab
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q0 r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q0
            r5.<init>()
            r4.updateScope(r5)
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.r0.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j$b, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}
