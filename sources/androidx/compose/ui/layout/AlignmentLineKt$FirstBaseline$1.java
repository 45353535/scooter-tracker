package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class AlignmentLineKt$FirstBaseline$1 extends y implements Function2<Integer, Integer, Integer> {
    public static final AlignmentLineKt$FirstBaseline$1 INSTANCE = new AlignmentLineKt$FirstBaseline$1();

    AlignmentLineKt$FirstBaseline$1() {
        super(2, zf.a.class, "min", "min(II)I", 1);
    }

    @NotNull
    public final Integer invoke(int i10, int i11) {
        return Integer.valueOf(Math.min(i10, i11));
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
        return invoke(num.intValue(), num2.intValue());
    }
}
