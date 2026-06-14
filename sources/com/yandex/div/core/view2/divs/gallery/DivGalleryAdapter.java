package com.yandex.div.core.view2.divs.gallery;

import android.view.ViewGroup;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4240b4;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.DivCollectionAdapter;
import com.yandex.div.internal.core.DivItemBuilderResult;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0015H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/yandex/div/core/view2/divs/gallery/DivGalleryAdapter;", "Lcom/yandex/div/core/view2/divs/DivCollectionAdapter;", "Lcom/yandex/div/core/view2/divs/gallery/DivGalleryViewHolder;", FirebaseAnalytics.Param.ITEMS, "", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "bindingContext", "Lcom/yandex/div/core/view2/BindingContext;", "divBinder", "Lcom/yandex/div/core/view2/DivBinder;", "viewCreator", "Lcom/yandex/div/core/view2/DivViewCreator;", "path", "Lcom/yandex/div/core/state/DivStatePath;", "(Ljava/util/List;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/view2/DivBinder;Lcom/yandex/div/core/view2/DivViewCreator;Lcom/yandex/div/core/state/DivStatePath;)V", "internalIds", "Ljava/util/WeakHashMap;", "", "lastItemId", "getItemId", C4240b4.i.L, "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivGalleryAdapter extends DivCollectionAdapter<DivGalleryViewHolder> {

    @NotNull
    private final BindingContext bindingContext;

    @NotNull
    private final DivBinder divBinder;

    @NotNull
    private final WeakHashMap<DivItemBuilderResult, Long> internalIds;
    private long lastItemId;

    @NotNull
    private final DivViewCreator viewCreator;

    public DivGalleryAdapter(@NotNull List<DivItemBuilderResult> list, @NotNull BindingContext bindingContext, @NotNull DivBinder divBinder, @NotNull DivViewCreator divViewCreator, @NotNull DivStatePath divStatePath) {
        super(bindingContext, divStatePath, list);
        this.bindingContext = bindingContext;
        this.divBinder = divBinder;
        this.viewCreator = divViewCreator;
        this.internalIds = new WeakHashMap<>();
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        DivItemBuilderResult divItemBuilderResult = getVisibleItems().get(position);
        Long l10 = this.internalIds.get(divItemBuilderResult);
        if (l10 != null) {
            return l10.longValue();
        }
        long j10 = this.lastItemId;
        this.lastItemId = 1 + j10;
        this.internalIds.put(divItemBuilderResult, Long.valueOf(j10));
        return j10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public DivGalleryViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new DivGalleryViewHolder(this.bindingContext, new DivGalleryItemLayout(this.bindingContext.getDivView().getContext()), this.divBinder, this.viewCreator);
    }
}
