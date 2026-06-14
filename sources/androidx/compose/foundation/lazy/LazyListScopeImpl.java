package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4240b4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Jb\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u001d\u0010\u000e\u001a\u0019\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J<\u0010\u0012\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0002\b\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J<\u0010\u0014\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0002\b\rH\u0017¢\u0006\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListScopeImpl;", "Landroidx/compose/foundation/lazy/LazyListScope;", "<init>", "()V", "", "count", "Lkotlin/Function1;", "", C4240b4.i.W, "contentType", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "", "Landroidx/compose/runtime/Composable;", "itemContent", FirebaseAnalytics.Param.ITEMS, "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "content", "item", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "stickyHeader", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "Landroidx/compose/foundation/lazy/LazyListIntervalContent;", "_intervals", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "intervals", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "getIntervals", "()Landroidx/compose/foundation/lazy/layout/IntervalList;", "", "_headerIndexes", "Ljava/util/List;", "", "getHeaderIndexes", "()Ljava/util/List;", "headerIndexes", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LazyListScopeImpl implements LazyListScope {

    @Nullable
    private List<Integer> _headerIndexes;

    @NotNull
    private final MutableIntervalList<LazyListIntervalContent> _intervals;

    @NotNull
    private final IntervalList<LazyListIntervalContent> intervals;

    public LazyListScopeImpl() {
        MutableIntervalList<LazyListIntervalContent> mutableIntervalList = new MutableIntervalList<>();
        this._intervals = mutableIntervalList;
        this.intervals = mutableIntervalList;
    }

    @NotNull
    public final List<Integer> getHeaderIndexes() {
        List<Integer> list = this._headerIndexes;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @NotNull
    public final IntervalList<LazyListIntervalContent> getIntervals() {
        return this.intervals;
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public /* synthetic */ void item(Object obj, Function3 function3) {
        LazyListScope.CC.b(this, obj, function3);
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public /* synthetic */ void items(int i10, Function1 function1, Function4 function4) {
        LazyListScope.CC.d(this, i10, function1, function4);
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    @ExperimentalFoundationApi
    public void stickyHeader(@Nullable Object key, @Nullable Object contentType, @NotNull Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        List arrayList = this._headerIndexes;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this._headerIndexes = arrayList;
        }
        arrayList.add(Integer.valueOf(this._intervals.getSize()));
        item(key, contentType, content);
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public void item(@Nullable final Object key, @Nullable final Object contentType, @NotNull final Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this._intervals.addInterval(1, new LazyListIntervalContent(key != null ? new Function1<Integer, Object>() { // from class: androidx.compose.foundation.lazy.LazyListScopeImpl.item.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            @NotNull
            public final Object invoke(int i10) {
                return key;
            }
        } : null, new Function1<Integer, Object>() { // from class: androidx.compose.foundation.lazy.LazyListScopeImpl.item.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            @Nullable
            public final Object invoke(int i10) {
                return contentType;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-735119482, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListScopeImpl.item.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.f93236a;
            }

            @Composable
            public final void invoke(@NotNull LazyItemScope $receiver, int i10, @Nullable Composer composer, int i11) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                if ((i11 & 14) == 0) {
                    i11 |= composer.changed($receiver) ? 4 : 2;
                }
                if ((i11 & 651) == 130 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-735119482, i11, -1, "androidx.compose.foundation.lazy.LazyListScopeImpl.item.<anonymous> (LazyListScopeImpl.kt:55)");
                }
                content.invoke($receiver, composer, Integer.valueOf(i11 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        })));
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public void items(int count, @Nullable Function1<? super Integer, ? extends Object> key, @NotNull Function1<? super Integer, ? extends Object> contentType, @NotNull Function4<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        this._intervals.addInterval(count, new LazyListIntervalContent(key, contentType, itemContent));
    }
}
