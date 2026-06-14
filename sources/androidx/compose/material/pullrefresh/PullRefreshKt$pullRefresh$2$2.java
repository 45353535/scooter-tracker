package androidx.compose.material.pullrefresh;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class PullRefreshKt$pullRefresh$2$2 extends a implements Function2<Float, Continuation, Object> {
    PullRefreshKt$pullRefresh$2$2(Object obj) {
        super(2, obj, PullRefreshState.class, "onRelease", "onRelease$material_release(F)F", 4);
    }

    @Nullable
    public final Object invoke(float f10, @NotNull Continuation continuation) {
        return PullRefreshKt.pullRefresh$lambda$1$onRelease((PullRefreshState) this.receiver, f10, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Float f10, Continuation continuation) {
        return invoke(f10.floatValue(), continuation);
    }
}
