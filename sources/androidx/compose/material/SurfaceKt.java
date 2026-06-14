package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a¬\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0088\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001af\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001a\u0090\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00142\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#\u001a\u0096\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00142\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010&2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010'\u001a/\u0010(\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u000eH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-\u001a;\u0010.\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00062"}, d2 = {"Surface", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "shape", "Landroidx/compose/ui/graphics/Shape;", "color", "Landroidx/compose/ui/graphics/Color;", "contentColor", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "elevation", "Landroidx/compose/ui/unit/Dp;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indication", "Landroidx/compose/foundation/Indication;", "enabled", "", "onClickLabel", "", "role", "Landroidx/compose/ui/semantics/Role;", "content", "Landroidx/compose/runtime/Composable;", "Surface-9VG74zQ", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Surface-LPr_se0", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Surface-F-jzlyU", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "selected", "Surface-Ny5ogXk", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "checked", "onCheckedChange", "Lkotlin/Function1;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "surfaceColorAtElevation", "elevationOverlay", "Landroidx/compose/material/ElevationOverlay;", "absoluteElevation", "surfaceColorAtElevation-cq6XJ1M", "(JLandroidx/compose/material/ElevationOverlay;FLandroidx/compose/runtime/Composer;I)J", "surface", "backgroundColor", "surface-8ww4TTg", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/foundation/BorderStroke;F)Landroidx/compose/ui/Modifier;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SurfaceKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x036a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x014d  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v16 */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Surface-9VG74zQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1123Surface9VG74zQ(@org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r39, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r40, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r41, long r42, long r44, @org.jetbrains.annotations.Nullable androidx.compose.foundation.BorderStroke r46, float r47, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r48, @org.jetbrains.annotations.Nullable androidx.compose.foundation.Indication r49, boolean r50, @org.jetbrains.annotations.Nullable java.lang.String r51, @org.jetbrains.annotations.Nullable androidx.compose.ui.semantics.Role r52, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r53, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r54, final int r55, final int r56, final int r57) {
        /*
            Method dump skipped, instruction units count: 899
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt.m1123Surface9VG74zQ(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.BorderStroke, float, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.Indication, boolean, java.lang.String, androidx.compose.ui.semantics.Role, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013f  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Surface-F-jzlyU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1124SurfaceFjzlyU(@org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r24, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r25, long r26, long r28, @org.jetbrains.annotations.Nullable androidx.compose.foundation.BorderStroke r30, float r31, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt.m1124SurfaceFjzlyU(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.BorderStroke, float, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x029e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0146  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v13 */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Surface-LPr_se0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1125SurfaceLPr_se0(@org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r31, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r32, boolean r33, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r34, long r35, long r37, @org.jetbrains.annotations.Nullable androidx.compose.foundation.BorderStroke r39, float r40, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r41, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r42, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r43, final int r44, final int r45) {
        /*
            Method dump skipped, instruction units count: 686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt.m1125SurfaceLPr_se0(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.BorderStroke, float, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0148  */
    /* JADX WARN: Type inference failed for: r11v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Surface-Ny5ogXk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1126SurfaceNy5ogXk(final boolean r30, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r31, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r32, boolean r33, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r34, long r35, long r37, @org.jetbrains.annotations.Nullable androidx.compose.foundation.BorderStroke r39, float r40, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r41, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r42, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r43, final int r44, final int r45, final int r46) {
        /*
            Method dump skipped, instruction units count: 751
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt.m1126SurfaceNy5ogXk(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.BorderStroke, float, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: surface-8ww4TTg, reason: not valid java name */
    public static final Modifier m1130surface8ww4TTg(Modifier modifier, Shape shape, long j10, BorderStroke borderStroke, float f10) {
        Modifier modifierM1288shadows4CzXII$default = ShadowKt.m1288shadows4CzXII$default(modifier, f10, shape, false, 0L, 0L, 24, null);
        Modifier modifierBorder = Modifier.INSTANCE;
        if (borderStroke != null) {
            modifierBorder = BorderKt.border(modifierBorder, borderStroke, shape);
        }
        return ClipKt.clip(BackgroundKt.m169backgroundbw27NRU(modifierM1288shadows4CzXII$default.then(modifierBorder), j10, shape), shape);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    /* JADX INFO: renamed from: surfaceColorAtElevation-cq6XJ1M, reason: not valid java name */
    public static final long m1131surfaceColorAtElevationcq6XJ1M(long j10, ElevationOverlay elevationOverlay, float f10, Composer composer, int i10) {
        Composer composer2;
        long jMo996apply7g2Lkgo;
        composer.startReplaceableGroup(1561611256);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1561611256, i10, -1, "androidx.compose.material.surfaceColorAtElevation (Surface.kt:629)");
        }
        if (!Color.m1605equalsimpl0(j10, MaterialTheme.INSTANCE.getColors(composer, 6).m966getSurface0d7_KjU()) || elevationOverlay == null) {
            composer2 = composer;
            jMo996apply7g2Lkgo = j10;
        } else {
            composer2 = composer;
            jMo996apply7g2Lkgo = elevationOverlay.mo996apply7g2Lkgo(j10, f10, composer2, (i10 & 14) | ((i10 >> 3) & 112) | ((i10 << 3) & 896));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceableGroup();
        return jMo996apply7g2Lkgo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0148  */
    /* JADX WARN: Type inference failed for: r11v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Surface-Ny5ogXk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1127SurfaceNy5ogXk(final boolean r30, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r31, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r32, boolean r33, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r34, long r35, long r37, @org.jetbrains.annotations.Nullable androidx.compose.foundation.BorderStroke r39, float r40, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r41, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r42, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r43, final int r44, final int r45, final int r46) {
        /*
            Method dump skipped, instruction units count: 751
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt.m1127SurfaceNy5ogXk(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.BorderStroke, float, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
