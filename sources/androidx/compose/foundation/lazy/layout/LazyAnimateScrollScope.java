package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.ui.unit.Density;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\b*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0012\u001a\u00020\b2\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fH¦@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R\u0014\u0010 \u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019R\u0014\u0010\"\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0019ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006#À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollScope;", "", "", FirebaseAnalytics.Param.INDEX, "getTargetItemOffset", "(I)Ljava/lang/Integer;", "Landroidx/compose/foundation/gestures/ScrollScope;", "scrollOffset", "", "snapToItem", "(Landroidx/compose/foundation/gestures/ScrollScope;II)V", "targetScrollOffset", "", "expectedDistanceTo", "(II)F", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "block", "scroll", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "density", "getFirstVisibleItemIndex", "()I", "firstVisibleItemIndex", "getFirstVisibleItemScrollOffset", "firstVisibleItemScrollOffset", "getLastVisibleItemIndex", "lastVisibleItemIndex", "getItemCount", "itemCount", "getNumOfItemsForTeleport", "numOfItemsForTeleport", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface LazyAnimateScrollScope {
    float expectedDistanceTo(int index, int targetScrollOffset);

    @NotNull
    Density getDensity();

    int getFirstVisibleItemIndex();

    int getFirstVisibleItemScrollOffset();

    int getItemCount();

    int getLastVisibleItemIndex();

    int getNumOfItemsForTeleport();

    @Nullable
    Integer getTargetItemOffset(int index);

    @Nullable
    Object scroll(@NotNull Function2<? super ScrollScope, ? super Continuation, ? extends Object> function2, @NotNull Continuation continuation);

    void snapToItem(@NotNull ScrollScope scrollScope, int i10, int i11);
}
