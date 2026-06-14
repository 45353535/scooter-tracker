package androidx.compose.material;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ab\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a^\u0010\u0019\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"", "expanded", "Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/unit/DpOffset;", "offset", "Landroidx/compose/ui/window/PopupProperties;", "properties", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "content", "DropdownMenu-ILWXrKs", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DropdownMenu", "onClick", "enabled", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/layout/RowScope;", "DropdownMenuItem", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AndroidMenu_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019c  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: DropdownMenu-ILWXrKs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m889DropdownMenuILWXrKs(boolean r26, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r27, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r28, long r29, @org.jetbrains.annotations.Nullable androidx.compose.ui.window.PopupProperties r31, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instruction units count: 503
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AndroidMenu_androidKt.m889DropdownMenuILWXrKs(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, long, androidx.compose.ui.window.PopupProperties, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0130  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void DropdownMenuItem(@org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r16, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r17, boolean r18, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.PaddingValues r19, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r20, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r21, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }
}
