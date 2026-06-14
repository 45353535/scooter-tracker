package com.yandex.div.core.downloader;

import android.view.View;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2Builder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k8.y0;
import kf.a;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0011\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/div/core/downloader/DivPatchManager;", "", "Lcom/yandex/div/core/downloader/DivPatchCache;", "divPatchCache", "Lkf/a;", "Lcom/yandex/div/core/view2/Div2Builder;", "divViewCreator", "<init>", "(Lcom/yandex/div/core/downloader/DivPatchCache;Lkf/a;)V", "Lcom/yandex/div/core/view2/BindingContext;", POBCoreNativeConstants.NATIVE_CONTEXT, "", "id", "", "Landroid/view/View;", "buildViewsForId", "(Lcom/yandex/div/core/view2/BindingContext;Ljava/lang/String;)Ljava/util/List;", "", "Lk8/y0;", "createViewsForId", "(Lcom/yandex/div/core/view2/BindingContext;Ljava/lang/String;)Ljava/util/Map;", "Lcom/yandex/div/core/downloader/DivPatchCache;", "Lkf/a;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DivPatchManager {

    @NotNull
    private final DivPatchCache divPatchCache;

    @NotNull
    private final a divViewCreator;

    public DivPatchManager(@NotNull DivPatchCache divPatchCache, @NotNull a aVar) {
        this.divPatchCache = divPatchCache;
        this.divViewCreator = aVar;
    }

    @Nullable
    public List<View> buildViewsForId(@NotNull BindingContext context, @NotNull String id2) {
        List<y0> patchDivListById = this.divPatchCache.getPatchDivListById(context.getDivView().getDataTag(), id2);
        if (patchDivListById == null) {
            return null;
        }
        List<y0> list = patchDivListById;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Div2Builder) this.divViewCreator.get()).buildView((y0) it.next(), context, context.getDivView().getCurrentRootPath$div_release()));
        }
        return arrayList;
    }

    @Nullable
    public Map<y0, View> createViewsForId(@NotNull BindingContext context, @NotNull String id2) {
        List<y0> patchDivListById = this.divPatchCache.getPatchDivListById(context.getDivView().getDataTag(), id2);
        if (patchDivListById == null) {
            return null;
        }
        List<y0> list = patchDivListById;
        LinkedHashMap linkedHashMap = new LinkedHashMap(g.e(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(obj, ((Div2Builder) this.divViewCreator.get()).createView((y0) obj, context, context.getDivView().getCurrentRootPath$div_release()));
        }
        return linkedHashMap;
    }
}
