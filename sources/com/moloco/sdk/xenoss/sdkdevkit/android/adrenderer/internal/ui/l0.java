package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class l0 {
    public static final Unit a(float f10, int i10, float f11, long j10, long j11, int i11, Modifier modifier, int i12, int i13, Composer composer, int i14) {
        d(f10, i10, f11, j10, j11, i11, modifier, composer, i12 | 1, i13);
        return Unit.f93236a;
    }

    public static final Unit b(float f10, long j10, long j11, int i10, int i11, Composer composer, int i12) {
        e(f10, j10, j11, composer, i10 | 1, i11);
        return Unit.f93236a;
    }

    public static final Unit c(ContentDrawScope drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        float fM1440getWidthimpl = Size.m1440getWidthimpl(drawWithContent.mo2040getSizeNHjbRc()) / 2.0f;
        float fM1437getHeightimpl = Size.m1437getHeightimpl(drawWithContent.mo2040getSizeNHjbRc());
        int iM1593getIntersectrtfAjoo = ClipOp.INSTANCE.m1593getIntersectrtfAjoo();
        DrawContext drawContext = drawWithContent.getDrawContext();
        long jMo2046getSizeNHjbRc = drawContext.mo2046getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2049clipRectN_I0leg(0.0f, 0.0f, fM1440getWidthimpl, fM1437getHeightimpl, iM1593getIntersectrtfAjoo);
        drawWithContent.drawContent();
        drawContext.getCanvas().restore();
        drawContext.mo2047setSizeuvyYCjk(jMo2046getSizeNHjbRc);
        return Unit.f93236a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02c6 A[LOOP:0: B:113:0x021c->B:126:0x02c6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02d6 A[EDGE_INSN: B:136:0x02d6->B:128:0x02d6 BREAK  A[LOOP:0: B:113:0x021c->B:126:0x02c6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(float r39, int r40, float r41, long r42, long r44, int r46, androidx.compose.ui.Modifier r47, androidx.compose.runtime.Composer r48, final int r49, final int r50) {
        /*
            Method dump skipped, instruction units count: 849
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.l0.d(float, int, float, long, long, int, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(float r19, long r20, long r22, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.l0.e(float, long, long, androidx.compose.runtime.Composer, int, int):void");
    }
}
