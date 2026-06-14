package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composer;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4240b4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@LazyStaggeredGridScopeMarker
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001JL\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH'¢\u0006\u0004\b\u000b\u0010\fJ~\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\u0016\b\u0002\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u001d\u0010\u0010\u001a\u0019\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\tH&¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0001\u0001\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "", C4240b4.i.W, "contentType", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "span", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "", "Landroidx/compose/runtime/Composable;", "content", "item", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;Lkotlin/jvm/functions/Function3;)V", "", "count", "Lkotlin/Function2;", "itemContent", FirebaseAnalytics.Param.ITEMS, "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScopeImpl;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface LazyStaggeredGridScope {

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static /* synthetic */ void a(LazyStaggeredGridScope lazyStaggeredGridScope, Object obj, Object obj2, StaggeredGridItemSpan staggeredGridItemSpan, Function3 function3, int i10, Object obj3) {
            if (obj3 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            if ((i10 & 2) != 0) {
                obj2 = null;
            }
            if ((i10 & 4) != 0) {
                staggeredGridItemSpan = null;
            }
            lazyStaggeredGridScope.item(obj, obj2, staggeredGridItemSpan, function3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void b(LazyStaggeredGridScope lazyStaggeredGridScope, int i10, Function1 function1, Function1 function12, Function1 function13, Function4 function4, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
            }
            if ((i11 & 2) != 0) {
                function1 = null;
            }
            if ((i11 & 4) != 0) {
                function12 = new Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope.items.1
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
            if ((i11 & 8) != 0) {
                function13 = null;
            }
            lazyStaggeredGridScope.items(i10, function1, function12, function13, function4);
        }
    }

    @ExperimentalFoundationApi
    void item(@Nullable Object key, @Nullable Object contentType, @Nullable StaggeredGridItemSpan span, @NotNull Function3<? super LazyStaggeredGridItemScope, ? super Composer, ? super Integer, Unit> content);

    void items(int count, @Nullable Function1<? super Integer, ? extends Object> key, @NotNull Function1<? super Integer, ? extends Object> contentType, @Nullable Function1<? super Integer, StaggeredGridItemSpan> span, @NotNull Function4<? super LazyStaggeredGridItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> itemContent);
}
