package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jy\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0002\b\n2\u0006\u0010\r\u001a\u00020\f2)\u0010\u0011\u001a%\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/material/TextFieldTransitionScope;", "", "<init>", "()V", "Landroidx/compose/material/InputPhase;", "inputState", "Landroidx/compose/ui/graphics/Color;", "focusedTextStyleColor", "unfocusedTextStyleColor", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "contentColor", "", "showLabel", "Lkotlin/Function4;", "", "", "content", "Transition-DTcfvLk", "(Landroidx/compose/material/InputPhase;JJLkotlin/jvm/functions/Function3;ZLkotlin/jvm/functions/Function6;Landroidx/compose/runtime/Composer;I)V", "Transition", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class TextFieldTransitionScope {

    @NotNull
    public static final TextFieldTransitionScope INSTANCE = new TextFieldTransitionScope();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InputPhase.values().length];
            try {
                iArr[InputPhase.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputPhase.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InputPhase.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private TextFieldTransitionScope() {
    }

    private static final float Transition_DTcfvLk$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float Transition_DTcfvLk$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final long Transition_DTcfvLk$lambda$5(State<Color> state) {
        return state.getValue().m1614unboximpl();
    }

    private static final long Transition_DTcfvLk$lambda$6(State<Color> state) {
        return state.getValue().m1614unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c5  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0][0]]")
    /* JADX INFO: renamed from: Transition-DTcfvLk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1188TransitionDTcfvLk(@org.jetbrains.annotations.NotNull final androidx.compose.material.InputPhase r27, long r28, final long r30, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.material.InputPhase, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, androidx.compose.ui.graphics.Color> r32, final boolean r33, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function6<? super java.lang.Float, ? super androidx.compose.ui.graphics.Color, ? super androidx.compose.ui.graphics.Color, ? super java.lang.Float, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r34, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r35, final int r36) {
        /*
            Method dump skipped, instruction units count: 1091
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldTransitionScope.m1188TransitionDTcfvLk(androidx.compose.material.InputPhase, long, long, kotlin.jvm.functions.Function3, boolean, kotlin.jvm.functions.Function6, androidx.compose.runtime.Composer, int):void");
    }
}
