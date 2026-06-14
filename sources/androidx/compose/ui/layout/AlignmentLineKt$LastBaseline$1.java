package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class AlignmentLineKt$LastBaseline$1 extends y implements Function2<Integer, Integer, Integer> {
    public static final AlignmentLineKt$LastBaseline$1 INSTANCE = new AlignmentLineKt$LastBaseline$1();

    AlignmentLineKt$LastBaseline$1() {
        super(2, zf.a.class, "max", "max(II)I", 1);
    }

    @NotNull
    public final Integer invoke(int i10, int i11) {
        return Integer.valueOf(Math.max(i10, i11));
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
        return invoke(num.intValue(), num2.intValue());
    }
}
