package com.yandex.div.core.view2;

import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.MBridgeConstans;
import com.taurusx.tax.y.z.w.s;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J,\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eH\u0002J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n*\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0002¨\u0006\u000f"}, d2 = {"Lcom/yandex/div/core/view2/ViewLocator;", "", "()V", "findSingleViewWithTag", "Landroid/view/View;", "divView", "Lcom/yandex/div/core/view2/Div2View;", s.z.f67720z, "", "findViewsWithTag", "", "findViewsWithTagTraversal", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, AdUnitActivity.EXTRA_VIEWS, "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ViewLocator {

    @NotNull
    public static final ViewLocator INSTANCE = new ViewLocator();

    private ViewLocator() {
    }

    @Nullable
    public static final View findSingleViewWithTag(@NotNull Div2View divView, @NotNull String tag) {
        List<View> listFindViewsWithTag = findViewsWithTag(divView, tag);
        if (listFindViewsWithTag.isEmpty()) {
            return null;
        }
        if (listFindViewsWithTag.size() <= 1) {
            return (View) CollectionsKt.first((List) listFindViewsWithTag);
        }
        DivActionTypedUtilsKt.logError(divView, new RuntimeException("Ambiguous scope id. There are " + listFindViewsWithTag.size() + " divs with id '" + tag + '\''));
        return null;
    }

    @NotNull
    public static final List<View> findViewsWithTag(@NotNull Div2View divView, @NotNull String tag) {
        return INSTANCE.findViewsWithTag((View) divView.getView(), (Object) tag);
    }

    private final List<View> findViewsWithTagTraversal(View view, Object tag, List<View> views) {
        if (Intrinsics.areEqual(tag, view.getTag())) {
            views.add(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                findViewsWithTagTraversal(viewGroup.getChildAt(i10), tag, views);
            }
        }
        return views;
    }

    private final List<View> findViewsWithTag(View view, Object obj) {
        if (obj == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        findViewsWithTagTraversal(view, obj, arrayList);
        return arrayList;
    }
}
