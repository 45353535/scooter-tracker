package androidx.compose.material.pullrefresh;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class PullRefreshKt$pullRefresh$2$1 extends y implements Function1<Float, Float> {
    PullRefreshKt$pullRefresh$2$1(Object obj) {
        super(1, obj, PullRefreshState.class, "onPull", "onPull$material_release(F)F", 0);
    }

    @NotNull
    public final Float invoke(float f10) {
        return Float.valueOf(((PullRefreshState) this.receiver).onPull$material_release(f10));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Float invoke(Float f10) {
        return invoke(f10.floatValue());
    }
}
