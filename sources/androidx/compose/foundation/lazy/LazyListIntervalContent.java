package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.Composer;
import com.ironsource.C4240b4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001BR\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0012\u001d\u0010\u000b\u001a\u0019\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0004\b\f\u0010\rR(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R.\u0010\u000b\u001a\u0019\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListIntervalContent;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "Lkotlin/Function1;", "", "", C4240b4.i.W, "type", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "", "Landroidx/compose/runtime/Composable;", "item", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "Lkotlin/jvm/functions/Function1;", "getKey", "()Lkotlin/jvm/functions/Function1;", "getType", "Lkotlin/jvm/functions/Function4;", "getItem", "()Lkotlin/jvm/functions/Function4;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LazyListIntervalContent implements LazyLayoutIntervalContent {

    @NotNull
    private final Function4<LazyItemScope, Integer, Composer, Integer, Unit> item;

    @Nullable
    private final Function1<Integer, Object> key;

    @NotNull
    private final Function1<Integer, Object> type;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyListIntervalContent(@Nullable Function1<? super Integer, ? extends Object> function1, @NotNull Function1<? super Integer, ? extends Object> type, @NotNull Function4<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> item) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(item, "item");
        this.key = function1;
        this.type = type;
        this.item = item;
    }

    @NotNull
    public final Function4<LazyItemScope, Integer, Composer, Integer, Unit> getItem() {
        return this.item;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    @Nullable
    public Function1<Integer, Object> getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    @NotNull
    public Function1<Integer, Object> getType() {
        return this.type;
    }
}
