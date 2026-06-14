package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001ø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"LocalContentColor", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/graphics/Color;", "getLocalContentColor", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ContentColorKt {

    @NotNull
    private static final ProvidableCompositionLocal<Color> LocalContentColor = CompositionLocalKt.compositionLocalOf$default(null, new Function0<Color>() { // from class: androidx.compose.material.ContentColorKt$LocalContentColor$1
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Color invoke() {
            return Color.m1594boximpl(m995invoke0d7_KjU());
        }

        /* JADX INFO: renamed from: invoke-0d7_KjU, reason: not valid java name */
        public final long m995invoke0d7_KjU() {
            return Color.INSTANCE.m1630getBlack0d7_KjU();
        }
    }, 1, null);

    @NotNull
    public static final ProvidableCompositionLocal<Color> getLocalContentColor() {
        return LocalContentColor;
    }
}
