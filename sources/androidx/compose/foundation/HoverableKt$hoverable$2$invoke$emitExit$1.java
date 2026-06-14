package androidx.compose.foundation;

import androidx.compose.foundation.HoverableKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "androidx.compose.foundation.HoverableKt$hoverable$2", f = "Hoverable.kt", l = {70}, m = "invoke$emitExit")
final class HoverableKt$hoverable$2$invoke$emitExit$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    HoverableKt$hoverable$2$invoke$emitExit$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return HoverableKt.AnonymousClass2.invoke$emitExit(null, null, this);
    }
}
