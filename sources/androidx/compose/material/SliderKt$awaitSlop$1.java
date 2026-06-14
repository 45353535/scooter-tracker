package androidx.compose.material;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "androidx.compose.material.SliderKt", f = "Slider.kt", l = {811}, m = "awaitSlop-8vUncbI")
final class SliderKt$awaitSlop$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    SliderKt$awaitSlop$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SliderKt.m1103awaitSlop8vUncbI(null, 0L, 0, this);
    }
}
