package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composer;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4240b4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@LazyScopeMarker
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J@\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ4\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0017¢\u0006\u0004\b\t\u0010\u000bJf\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\u0016\b\u0002\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u001d\u0010\u000f\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0002\b\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011JN\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\u001d\u0010\u000f\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0002\b\u0007H\u0017¢\u0006\u0004\b\u0010\u0010\u0012J@\u0010\u0013\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H'¢\u0006\u0004\b\u0013\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListScope;", "", C4240b4.i.W, "contentType", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "", "Landroidx/compose/runtime/Composable;", "content", "item", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "", "count", "Lkotlin/Function2;", "itemContent", FirebaseAnalytics.Param.ITEMS, "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "stickyHeader", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface LazyListScope {

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyListScope$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static void a(LazyListScope lazyListScope, Object obj, Object obj2, Function3 content) {
            Intrinsics.checkNotNullParameter(content, "content");
            throw new IllegalStateException("The method is not implemented");
        }

        public static /* synthetic */ void b(LazyListScope lazyListScope, Object obj, Function3 content) {
            Intrinsics.checkNotNullParameter(content, "content");
            lazyListScope.item(obj, null, content);
        }

        public static void c(LazyListScope lazyListScope, int i10, Function1 function1, Function1 contentType, Function4 itemContent) {
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            Intrinsics.checkNotNullParameter(itemContent, "itemContent");
            throw new IllegalStateException("The method is not implemented");
        }

        public static /* synthetic */ void d(LazyListScope lazyListScope, int i10, Function1 function1, Function4 itemContent) {
            Intrinsics.checkNotNullParameter(itemContent, "itemContent");
            lazyListScope.items(i10, function1, new Function1<Integer, Object>() { // from class: androidx.compose.foundation.lazy.LazyListScope.items.2
                @Nullable
                public final Object invoke(int i11) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }
            }, itemContent);
        }

        public static /* synthetic */ void i(LazyListScope lazyListScope, Object obj, Object obj2, Function3 function3, int i10, Object obj3) {
            if (obj3 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            if ((i10 & 2) != 0) {
                obj2 = null;
            }
            lazyListScope.item(obj, obj2, function3);
        }

        public static /* synthetic */ void j(LazyListScope lazyListScope, Object obj, Function3 function3, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            lazyListScope.item(obj, function3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void k(LazyListScope lazyListScope, int i10, Function1 function1, Function1 function12, Function4 function4, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
            }
            if ((i11 & 2) != 0) {
                function1 = null;
            }
            if ((i11 & 4) != 0) {
                function12 = new Function1() { // from class: androidx.compose.foundation.lazy.LazyListScope.items.1
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
            lazyListScope.items(i10, function1, function12, function4);
        }

        public static /* synthetic */ void l(LazyListScope lazyListScope, int i10, Function1 function1, Function4 function4, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
            }
            if ((i11 & 2) != 0) {
                function1 = null;
            }
            lazyListScope.items(i10, function1, function4);
        }

        public static /* synthetic */ void m(LazyListScope lazyListScope, Object obj, Object obj2, Function3 function3, int i10, Object obj3) {
            if (obj3 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            if ((i10 & 2) != 0) {
                obj2 = null;
            }
            lazyListScope.stickyHeader(obj, obj2, function3);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void item(@NotNull LazyListScope lazyListScope, @Nullable Object obj, @Nullable Object obj2, @NotNull Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> content) {
            Intrinsics.checkNotNullParameter(content, "content");
            CC.a(lazyListScope, obj, obj2, content);
        }

        @Deprecated
        public static void items(@NotNull LazyListScope lazyListScope, int i10, @Nullable Function1<? super Integer, ? extends Object> function1, @NotNull Function1<? super Integer, ? extends Object> contentType, @NotNull Function4<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> itemContent) {
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            Intrinsics.checkNotNullParameter(itemContent, "itemContent");
            CC.c(lazyListScope, i10, function1, contentType, itemContent);
        }

        @Deprecated
        public static /* synthetic */ void item(LazyListScope lazyListScope, Object obj, Function3 content) {
            Intrinsics.checkNotNullParameter(content, "content");
            CC.b(lazyListScope, obj, content);
        }

        @Deprecated
        public static /* synthetic */ void items(LazyListScope lazyListScope, int i10, Function1 function1, Function4 itemContent) {
            Intrinsics.checkNotNullParameter(itemContent, "itemContent");
            CC.d(lazyListScope, i10, function1, itemContent);
        }
    }

    void item(@Nullable Object key, @Nullable Object contentType, @NotNull Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> content);

    /* synthetic */ void item(Object key, Function3 content);

    void items(int count, @Nullable Function1<? super Integer, ? extends Object> key, @NotNull Function1<? super Integer, ? extends Object> contentType, @NotNull Function4<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> itemContent);

    /* synthetic */ void items(int count, Function1 key, Function4 itemContent);

    @ExperimentalFoundationApi
    void stickyHeader(@Nullable Object key, @Nullable Object contentType, @NotNull Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> content);
}
