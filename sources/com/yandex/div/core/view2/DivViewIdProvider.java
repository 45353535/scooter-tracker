package com.yandex.div.core.view2;

import androidx.core.view.ViewCompat;
import com.yandex.div.internal.util.CollectionsKt;
import java.util.Map;
import kotlin.Metadata;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/div/core/view2/DivViewIdProvider;", "", "<init>", "()V", "", "id", "", "getViewId", "(Ljava/lang/String;)I", "", Reporting.EventType.CACHE, "Ljava/util/Map;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivViewIdProvider {

    @NotNull
    private final Map<String, Integer> cache = CollectionsKt.arrayMap();

    public final int getViewId(@Nullable String id2) {
        if (id2 == null) {
            return -1;
        }
        Map<String, Integer> map = this.cache;
        Integer numValueOf = map.get(id2);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(ViewCompat.generateViewId());
            map.put(id2, numValueOf);
        }
        return numValueOf.intValue();
    }
}
