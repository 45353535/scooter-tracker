package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.Composer;
import com.ironsource.C4240b4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001Bo\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0012\u001d\u0010\u000e\u001a\u0019\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0002\b\rø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R,\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00068\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R.\u0010\u000e\u001a\u0019\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0002\b\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "Lkotlin/Function1;", "", "", C4240b4.i.W, "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "span", "type", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "", "Landroidx/compose/runtime/Composable;", "item", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "Lkotlin/jvm/functions/Function1;", "getKey", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "getSpan", "()Lkotlin/jvm/functions/Function2;", "getType", "Lkotlin/jvm/functions/Function4;", "getItem", "()Lkotlin/jvm/functions/Function4;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LazyGridIntervalContent implements LazyLayoutIntervalContent {

    @NotNull
    private final Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> item;

    @Nullable
    private final Function1<Integer, Object> key;

    @NotNull
    private final Function2<LazyGridItemSpanScope, Integer, GridItemSpan> span;

    @NotNull
    private final Function1<Integer, Object> type;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridIntervalContent(@Nullable Function1<? super Integer, ? extends Object> function1, @NotNull Function2<? super LazyGridItemSpanScope, ? super Integer, GridItemSpan> span, @NotNull Function1<? super Integer, ? extends Object> type, @NotNull Function4<? super LazyGridItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> item) {
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(item, "item");
        this.key = function1;
        this.span = span;
        this.type = type;
        this.item = item;
    }

    @NotNull
    public final Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> getItem() {
        return this.item;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    @Nullable
    public Function1<Integer, Object> getKey() {
        return this.key;
    }

    @NotNull
    public final Function2<LazyGridItemSpanScope, Integer, GridItemSpan> getSpan() {
        return this.span;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    @NotNull
    public Function1<Integer, Object> getType() {
        return this.type;
    }
}
