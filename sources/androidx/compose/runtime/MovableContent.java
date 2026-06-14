package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@InternalComposeApi
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B \u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\bR(\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/MovableContent;", "P", "", "Lkotlin/Function1;", "", "Landroidx/compose/runtime/Composable;", "content", "<init>", "(Lkotlin/jvm/functions/Function3;)V", "Lkotlin/jvm/functions/Function3;", "getContent", "()Lkotlin/jvm/functions/Function3;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MovableContent<P> {
    public static final int $stable = 0;

    @NotNull
    private final Function3<P, Composer, Integer, Unit> content;

    /* JADX WARN: Multi-variable type inference failed */
    public MovableContent(@NotNull Function3<? super P, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.content = content;
    }

    @NotNull
    public final Function3<P, Composer, Integer, Unit> getContent() {
        return this.content;
    }
}
