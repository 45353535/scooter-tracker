package com.yandex.div.core.view2.divs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.android.billingclient.api.BillingClient;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4240b4;
import com.yandex.div.core.Disposable;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.ExpressionSubscriber;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k8.gx;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J#\u0010\u001a\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u0016J\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0012H\u0004¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b!\u0010\u0016J\u0017\u0010\"\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\"\u0010\u0016R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010%R\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R \u0010,\u001a\b\u0012\u0004\u0012\u00020+0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b-\u0010\u000bR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\b.\u0010\u000bR\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\b/\u0010\u000b¨\u00061"}, d2 = {"Lcom/yandex/div/core/view2/divs/VisibilityAwareAdapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "VH", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/yandex/div/internal/core/ExpressionSubscriber;", "", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "initialItems", "<init>", "(Ljava/util/List;)V", "buildVisibleItemList", "()Ljava/util/List;", "", C4240b4.i.L, "visiblePositionOf", "(I)I", "Lk8/gx;", "visibility", "", "updateItemVisibility", "(ILk8/gx;)V", "notifyVisibleItemRemoved", "(I)V", "notifyVisibleItemInserted", "", FirebaseAnalytics.Param.ITEMS, "addItems", "(ILjava/util/Collection;)V", "removeItem", "getItemCount", "()I", "subscribeOnElements", "()V", "notifyRawItemRemoved", "notifyRawItemInserted", "", "itemList", "Ljava/util/List;", "visibleItemList", "", "itemVisibilityList", "isVisibleItemListValid", "Z", "Lcom/yandex/div/core/Disposable;", BillingClient.FeatureType.SUBSCRIPTIONS, "getSubscriptions", "getItems", "getVisibleItems", "visibleItems", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class VisibilityAwareAdapter<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> implements ExpressionSubscriber {
    private boolean isVisibleItemListValid;

    @NotNull
    private final List<DivItemBuilderResult> itemList;

    @NotNull
    private final List<Boolean> itemVisibilityList;

    @NotNull
    private final List<Disposable> subscriptions;

    @NotNull
    private final List<DivItemBuilderResult> visibleItemList = new ArrayList();

    public VisibilityAwareAdapter(@NotNull List<DivItemBuilderResult> list) {
        this.itemList = CollectionsKt.toMutableList((Collection) list);
        List<DivItemBuilderResult> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(VisibilityAwareAdapterKt.isVisible((DivItemBuilderResult) it.next())));
        }
        this.itemVisibilityList = CollectionsKt.toMutableList((Collection) arrayList);
        this.subscriptions = new ArrayList();
        subscribeOnElements();
    }

    private final List<DivItemBuilderResult> buildVisibleItemList() {
        if (!this.isVisibleItemListValid) {
            this.visibleItemList.clear();
            List<DivItemBuilderResult> list = this.itemList;
            List<DivItemBuilderResult> list2 = this.visibleItemList;
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
                if (!this.itemVisibilityList.get(i10).booleanValue()) {
                    divItemBuilderResult = null;
                }
                if (divItemBuilderResult != null) {
                    list2.add(divItemBuilderResult);
                }
                i10 = i11;
            }
            this.isVisibleItemListValid = true;
        }
        return this.visibleItemList;
    }

    private final void notifyVisibleItemInserted(int position) {
        notifyRawItemInserted(visiblePositionOf(position));
    }

    private final void notifyVisibleItemRemoved(int position) {
        notifyRawItemRemoved(visiblePositionOf(position));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateItemVisibility(int position, gx visibility) {
        boolean z10 = visibility == gx.VISIBLE;
        boolean zBooleanValue = this.itemVisibilityList.get(position).booleanValue();
        if (z10 == zBooleanValue) {
            return;
        }
        this.itemVisibilityList.set(position, Boolean.valueOf(z10));
        this.isVisibleItemListValid = false;
        if (zBooleanValue) {
            notifyVisibleItemRemoved(position);
        } else {
            notifyVisibleItemInserted(position);
        }
    }

    private final int visiblePositionOf(int position) {
        int i10 = 0;
        for (int i11 = 0; i11 < position; i11++) {
            if (this.itemVisibilityList.get(i11).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    public final void addItems(int position, @NotNull Collection<DivItemBuilderResult> items) {
        this.itemList.addAll(position, items);
        List<Boolean> list = this.itemVisibilityList;
        Collection<DivItemBuilderResult> collection = items;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(VisibilityAwareAdapterKt.isVisible((DivItemBuilderResult) it.next())));
        }
        list.addAll(position, arrayList);
        int i10 = 0;
        this.isVisibleItemListValid = false;
        for (Object obj : collection) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (VisibilityAwareAdapterKt.getVisibility((DivItemBuilderResult) obj) == gx.VISIBLE) {
                notifyVisibleItemInserted(i10 + position);
            }
            i10 = i11;
        }
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public /* synthetic */ void addSubscription(Disposable disposable) {
        y7.a.a(this, disposable);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public /* synthetic */ void closeAllSubscription() {
        y7.a.b(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return getVisibleItems().size();
    }

    @NotNull
    public final List<DivItemBuilderResult> getItems() {
        return this.itemList;
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    @NotNull
    public List<Disposable> getSubscriptions() {
        return this.subscriptions;
    }

    @NotNull
    public final List<DivItemBuilderResult> getVisibleItems() {
        return buildVisibleItemList();
    }

    protected void notifyRawItemInserted(int position) {
        notifyItemInserted(position);
    }

    protected void notifyRawItemRemoved(int position) {
        notifyItemRemoved(position);
    }

    @Override // com.yandex.div.core.view2.Releasable
    public /* synthetic */ void release() {
        y7.a.c(this);
    }

    public final void removeItem(int position) {
        this.itemList.remove(position);
        boolean zBooleanValue = this.itemVisibilityList.remove(position).booleanValue();
        this.isVisibleItemListValid = false;
        if (zBooleanValue) {
            notifyVisibleItemRemoved(position);
        }
    }

    protected final void subscribeOnElements() {
        closeAllSubscription();
        final int i10 = 0;
        for (Object obj : this.itemList) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
            addSubscription(divItemBuilderResult.getDiv().c().getVisibility().observe(divItemBuilderResult.getExpressionResolver(), new Function1<gx, Unit>(this) { // from class: com.yandex.div.core.view2.divs.VisibilityAwareAdapter$subscribeOnElements$1$subscription$1
                final /* synthetic */ VisibilityAwareAdapter<VH> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                    this.this$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(gx gxVar) {
                    invoke2(gxVar);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull gx gxVar) {
                    this.this$0.updateItemVisibility(i10, gxVar);
                }
            }));
            i10 = i11;
        }
    }
}
