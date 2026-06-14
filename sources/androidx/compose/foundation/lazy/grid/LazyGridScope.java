package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Composer;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4240b4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@LazyGridScopeMarker
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J[\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0002\b\nH&ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0087\u0001\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00102\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\u001d\u0010\u0011\u001a\u0019\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\u0010¢\u0006\u0002\b\nH&ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0001\u0001\u0014ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "", C4240b4.i.W, "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "span", "contentType", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "", "Landroidx/compose/runtime/Composable;", "content", "item", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "", "count", "Lkotlin/Function2;", "itemContent", FirebaseAnalytics.Param.ITEMS, "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "Landroidx/compose/foundation/lazy/grid/LazyGridScopeImpl;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface LazyGridScope {

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridScope$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void a(LazyGridScope lazyGridScope, Object obj, Function1 function1, Object obj2, Function3 function3, int i10, Object obj3) {
            if (obj3 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            if ((i10 & 2) != 0) {
                function1 = null;
            }
            if ((i10 & 4) != 0) {
                obj2 = null;
            }
            lazyGridScope.item(obj, function1, obj2, function3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void b(LazyGridScope lazyGridScope, int i10, Function1 function1, Function2 function2, Function1 function12, Function4 function4, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
            }
            if ((i11 & 2) != 0) {
                function1 = null;
            }
            if ((i11 & 4) != 0) {
                function2 = null;
            }
            if ((i11 & 8) != 0) {
                function12 = new Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScope.items.1
                    @Nullable
                    public final Void invoke(int i12) {
                        return null;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        return invoke(((Number) obj2).intValue());
                    }
                };
            }
            lazyGridScope.items(i10, function1, function2, function12, function4);
        }
    }

    void item(@Nullable Object key, @Nullable Function1<? super LazyGridItemSpanScope, GridItemSpan> span, @Nullable Object contentType, @NotNull Function3<? super LazyGridItemScope, ? super Composer, ? super Integer, Unit> content);

    void items(int count, @Nullable Function1<? super Integer, ? extends Object> key, @Nullable Function2<? super LazyGridItemSpanScope, ? super Integer, GridItemSpan> span, @NotNull Function1<? super Integer, ? extends Object> contentType, @NotNull Function4<? super LazyGridItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> itemContent);
}
