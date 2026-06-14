package com.yandex.div.core.view2.reuse;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.core.view2.divs.gallery.DivGalleryAdapter;
import com.yandex.div.core.view2.divs.pager.DivPagerAdapter;
import com.yandex.div.core.view2.divs.widgets.DivCustomWrapper;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.core.view2.reuse.RebindTask;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k8.jk;
import k8.le;
import k8.td;
import k8.u8;
import k8.x9;
import k8.y0;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e*\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0012J+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e*\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0014J'\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e2\u0006\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e*\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0018J+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e*\u00020\u00192\u0006\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u001aJ-\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00008\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/yandex/div/core/view2/reuse/ExistingToken;", "Lcom/yandex/div/core/view2/reuse/Token;", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "item", "", "childIndex", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "parentToken", "<init>", "(Lcom/yandex/div/internal/core/DivItemBuilderResult;ILandroid/view/View;Lcom/yandex/div/core/view2/reuse/ExistingToken;)V", "Lk8/u8;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "itemsToExistingTokenList", "(Lk8/u8;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/view2/reuse/ExistingToken;)Ljava/util/List;", "Lk8/x9;", "(Lk8/x9;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/view2/reuse/ExistingToken;)Ljava/util/List;", "Lk8/le;", "(Lk8/le;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/view2/reuse/ExistingToken;)Ljava/util/List;", "stateToExistingTokenList", "(Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/view2/reuse/ExistingToken;)Ljava/util/List;", "Lk8/jk;", "(Lk8/jk;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/view2/reuse/ExistingToken;)Ljava/util/List;", "Lk8/td;", "(Lk8/td;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/view2/reuse/ExistingToken;)Ljava/util/List;", FirebaseAnalytics.Param.ITEMS, "simpleItemsToExistingTokenList", "(Ljava/util/List;Lcom/yandex/div/core/view2/reuse/ExistingToken;)Ljava/util/List;", "getChildrenTokens", "(Lcom/yandex/div/core/view2/reuse/ExistingToken;)Ljava/util/List;", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Lcom/yandex/div/core/view2/reuse/ExistingToken;", "getParentToken", "()Lcom/yandex/div/core/view2/reuse/ExistingToken;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ExistingToken extends Token {

    @Nullable
    private final ExistingToken parentToken;

    @NotNull
    private final View view;

    public ExistingToken(@NotNull DivItemBuilderResult divItemBuilderResult, int i10, @NotNull View view, @Nullable ExistingToken existingToken) {
        super(divItemBuilderResult, i10);
        this.view = view;
        this.parentToken = existingToken;
    }

    public static /* synthetic */ List getChildrenTokens$default(ExistingToken existingToken, ExistingToken existingToken2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            existingToken2 = null;
        }
        return existingToken.getChildrenTokens(existingToken2);
    }

    private final List<ExistingToken> itemsToExistingTokenList(u8 u8Var, ExpressionResolver expressionResolver, ExistingToken existingToken) {
        return simpleItemsToExistingTokenList(DivCollectionExtensionsKt.buildItems(u8Var, expressionResolver), existingToken);
    }

    private final List<ExistingToken> simpleItemsToExistingTokenList(List<DivItemBuilderResult> items, ExistingToken parentToken) {
        View childAt;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : items) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
            View view = this.view;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup == null || (childAt = viewGroup.getChildAt(i10)) == null) {
                return CollectionsKt.emptyList();
            }
            arrayList.add(new ExistingToken(divItemBuilderResult, i10, childAt, parentToken == null ? this : parentToken));
            i10 = i11;
        }
        return arrayList;
    }

    private final List<ExistingToken> stateToExistingTokenList(ExpressionResolver resolver, ExistingToken parentToken) {
        y0 activeStateDiv$div_release;
        View view = this.view;
        DivStateLayout divStateLayout = view instanceof DivStateLayout ? (DivStateLayout) view : null;
        return (divStateLayout == null || (activeStateDiv$div_release = divStateLayout.getActiveStateDiv()) == null) ? CollectionsKt.emptyList() : simpleItemsToExistingTokenList(DivCollectionExtensionsKt.toDivItemBuilderResult(CollectionsKt.listOf(activeStateDiv$div_release), resolver), parentToken);
    }

    @NotNull
    public final List<ExistingToken> getChildrenTokens(@Nullable ExistingToken parentToken) {
        y0 div = getDiv();
        if (div instanceof y0.r) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof y0.h) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof y0.f) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof y0.m) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof y0.i) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof y0.n) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof y0.j) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof y0.l) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof y0.s) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof y0.p) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof y0.c) {
            return itemsToExistingTokenList(((y0.c) getDiv()).d(), getItem().getExpressionResolver(), parentToken);
        }
        if (div instanceof y0.d) {
            return itemsToExistingTokenList(((y0.d) getDiv()).d(), getItem().getExpressionResolver(), parentToken);
        }
        if (div instanceof y0.g) {
            return itemsToExistingTokenList(((y0.g) getDiv()).d(), getItem().getExpressionResolver(), parentToken);
        }
        if (div instanceof y0.e) {
            return itemsToExistingTokenList(((y0.e) getDiv()).d(), getItem().getExpressionResolver(), parentToken);
        }
        if (div instanceof y0.k) {
            return itemsToExistingTokenList(((y0.k) getDiv()).d(), getItem().getExpressionResolver(), parentToken);
        }
        if (div instanceof y0.q) {
            throw new RebindTask.UnsupportedElementException(getDiv().getClass());
        }
        if (div instanceof y0.o) {
            return stateToExistingTokenList(getItem().getExpressionResolver(), parentToken);
        }
        throw new m();
    }

    @Nullable
    public final ExistingToken getParentToken() {
        return this.parentToken;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    private final List<ExistingToken> itemsToExistingTokenList(x9 x9Var, ExpressionResolver expressionResolver, ExistingToken existingToken) {
        ArrayList arrayList = new ArrayList();
        View view = this.view;
        DivCustomWrapper divCustomWrapper = view instanceof DivCustomWrapper ? (DivCustomWrapper) view : null;
        View customView = divCustomWrapper != null ? divCustomWrapper.getCustomView() : null;
        ViewGroup viewGroup = customView instanceof ViewGroup ? (ViewGroup) customView : null;
        if (viewGroup == null) {
            return CollectionsKt.emptyList();
        }
        int i10 = 0;
        for (Object obj : DivCollectionExtensionsKt.getNonNullItems(x9Var)) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            DivItemBuilderResult itemBuilderResult = DivCollectionExtensionsKt.toItemBuilderResult((y0) obj, expressionResolver);
            View childAt = viewGroup.getChildAt(i10);
            if (childAt == null) {
                return CollectionsKt.emptyList();
            }
            arrayList.add(new ExistingToken(itemBuilderResult, i10, childAt, existingToken == null ? this : existingToken));
            i10 = i11;
        }
        return arrayList;
    }

    private final List<ExistingToken> itemsToExistingTokenList(le leVar, ExpressionResolver expressionResolver, ExistingToken existingToken) {
        return simpleItemsToExistingTokenList(DivCollectionExtensionsKt.itemsToDivItemBuilderResult(leVar, expressionResolver), existingToken);
    }

    private final List<ExistingToken> itemsToExistingTokenList(jk jkVar, ExpressionResolver expressionResolver, ExistingToken existingToken) {
        ViewPager2 viewPager;
        ArrayList arrayList = new ArrayList();
        View view = this.view;
        DivPagerView divPagerView = view instanceof DivPagerView ? (DivPagerView) view : null;
        if (divPagerView != null && (viewPager = divPagerView.getViewPager()) != null) {
            RecyclerView.Adapter adapter = viewPager.getAdapter();
            DivPagerAdapter divPagerAdapter = adapter instanceof DivPagerAdapter ? (DivPagerAdapter) adapter : null;
            if (divPagerAdapter == null) {
                return CollectionsKt.emptyList();
            }
            AbstractList<DivItemBuilderResult> itemsToShow = divPagerAdapter.getItemsToShow();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(itemsToShow, 10));
            Iterator<DivItemBuilderResult> it = itemsToShow.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(it.next().getDiv().hash()));
            }
            int i10 = 0;
            for (Object obj : DivCollectionExtensionsKt.buildItems(jkVar, expressionResolver)) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
                if (arrayList2.contains(Integer.valueOf(divItemBuilderResult.getDiv().hash()))) {
                    View pageView = ((DivPagerView) this.view).getPageView(arrayList2.indexOf(Integer.valueOf(divItemBuilderResult.getDiv().hash())));
                    if (pageView != null) {
                        arrayList.add(new ExistingToken(divItemBuilderResult, i10, pageView, existingToken == null ? this : existingToken));
                    }
                }
                i10 = i11;
            }
            return arrayList;
        }
        return CollectionsKt.emptyList();
    }

    private final List<ExistingToken> itemsToExistingTokenList(td tdVar, ExpressionResolver expressionResolver, ExistingToken existingToken) {
        View itemView;
        ArrayList arrayList = new ArrayList();
        View view = this.view;
        DivRecyclerView divRecyclerView = view instanceof DivRecyclerView ? (DivRecyclerView) view : null;
        RecyclerView.Adapter adapter = divRecyclerView != null ? divRecyclerView.getAdapter() : null;
        DivGalleryAdapter divGalleryAdapter = adapter instanceof DivGalleryAdapter ? (DivGalleryAdapter) adapter : null;
        if (divGalleryAdapter == null) {
            return CollectionsKt.emptyList();
        }
        List<DivItemBuilderResult> visibleItems = divGalleryAdapter.getVisibleItems();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(visibleItems, 10));
        Iterator<T> it = visibleItems.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((DivItemBuilderResult) it.next()).getDiv().hash()));
        }
        int i10 = 0;
        for (Object obj : DivCollectionExtensionsKt.buildItems(tdVar, expressionResolver)) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
            if (arrayList2.contains(Integer.valueOf(divItemBuilderResult.getDiv().hash())) && (itemView = ((DivRecyclerView) this.view).getItemView(i10)) != null) {
                arrayList.add(new ExistingToken(divItemBuilderResult, i10, itemView, existingToken == null ? this : existingToken));
            }
            i10 = i11;
        }
        return arrayList;
    }
}
