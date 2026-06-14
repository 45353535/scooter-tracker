package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.ui.layout.Placeable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4240b4;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bâ\u0080\u0001\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/MeasuredItemFactory;", "", "createItem", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", FirebaseAnalytics.Param.INDEX, "", "lane", "span", C4240b4.i.W, "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
interface MeasuredItemFactory {
    @NotNull
    LazyStaggeredGridMeasuredItem createItem(int index, int lane, int span, @NotNull Object key, @NotNull List<? extends Placeable> placeables);
}
