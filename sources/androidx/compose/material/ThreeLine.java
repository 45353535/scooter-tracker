package androidx.compose.material;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J|\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0013\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00110\u0015¢\u0006\u0002\b\u00162\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00110\u0015¢\u0006\u0002\b\u00162\u0013\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0013\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u001bR\u0019\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u0007\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\b\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\t\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\n\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u000b\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\f\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\r\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u000e\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u000f\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/material/ThreeLine;", "", "()V", "ContentLeftPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ContentRightPadding", "IconLeftPadding", "IconMinPaddedWidth", "IconThreeLineVerticalPadding", "MinHeight", "ThreeLineBaselineFirstOffset", "ThreeLineBaselineSecondOffset", "ThreeLineBaselineThirdOffset", "ThreeLineTrailingTopPadding", "TrailingRightPadding", "ListItem", "", "modifier", "Landroidx/compose/ui/Modifier;", "icon", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "text", "secondaryText", "overlineText", "trailing", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ThreeLine {
    private static final float ContentLeftPadding;
    private static final float ContentRightPadding;
    private static final float IconLeftPadding;
    private static final float IconThreeLineVerticalPadding;
    private static final float ThreeLineBaselineSecondOffset;
    private static final float ThreeLineBaselineThirdOffset;
    private static final float ThreeLineTrailingTopPadding;
    private static final float TrailingRightPadding;

    @NotNull
    public static final ThreeLine INSTANCE = new ThreeLine();
    private static final float MinHeight = Dp.m3951constructorimpl(88);
    private static final float IconMinPaddedWidth = Dp.m3951constructorimpl(40);
    private static final float ThreeLineBaselineFirstOffset = Dp.m3951constructorimpl(28);

    static {
        float f10 = 16;
        IconLeftPadding = Dp.m3951constructorimpl(f10);
        IconThreeLineVerticalPadding = Dp.m3951constructorimpl(f10);
        ContentLeftPadding = Dp.m3951constructorimpl(f10);
        ContentRightPadding = Dp.m3951constructorimpl(f10);
        float f11 = 20;
        ThreeLineBaselineSecondOffset = Dp.m3951constructorimpl(f11);
        ThreeLineBaselineThirdOffset = Dp.m3951constructorimpl(f11);
        ThreeLineTrailingTopPadding = Dp.m3951constructorimpl(f10);
        TrailingRightPadding = Dp.m3951constructorimpl(f10);
    }

    private ThreeLine() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x034c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01cb  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ListItem(@org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r36, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r37, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r38, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r39, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r40, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r41, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r42, final int r43, final int r44) {
        /*
            Method dump skipped, instruction units count: 862
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ThreeLine.ListItem(androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }
}
