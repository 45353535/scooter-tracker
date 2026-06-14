package com.yandex.div.core.player;

import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.core.view2.divs.widgets.DivVideoView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import k8.pw;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/div/core/player/DivVideoViewMapper;", "", "<init>", "()V", "Lcom/yandex/div/core/view2/divs/widgets/DivVideoView;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lk8/pw;", "div", "", "addView", "(Lcom/yandex/div/core/view2/divs/widgets/DivVideoView;Lk8/pw;)V", "Lcom/yandex/div/core/player/DivPlayer;", "getPlayer", "(Lk8/pw;)Lcom/yandex/div/core/player/DivPlayer;", "Ljava/util/WeakHashMap;", "currentViews", "Ljava/util/WeakHashMap;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivVideoViewMapper {

    @NotNull
    private final WeakHashMap<DivVideoView, pw> currentViews = new WeakHashMap<>();

    public final void addView(@NotNull DivVideoView view, @NotNull pw div) {
        this.currentViews.put(view, div);
    }

    @Nullable
    public final DivPlayer getPlayer(@NotNull pw div) {
        Set<Map.Entry<DivVideoView, pw>> setEntrySet = this.currentViews.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            Map.Entry entry = (Map.Entry) obj;
            if (Intrinsics.areEqual(entry.getValue(), div) || Intrinsics.areEqual(((pw) entry.getValue()).getId(), div.getId())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            DivPlayerView playerView = ((DivVideoView) ((Map.Entry) it.next()).getKey()).getPlayerView();
            DivPlayer attachedPlayer = playerView != null ? playerView.getAttachedPlayer() : null;
            if (attachedPlayer != null) {
                arrayList2.add(attachedPlayer);
            }
        }
        return (DivPlayer) CollectionsKt.firstOrNull((List) arrayList2);
    }
}
