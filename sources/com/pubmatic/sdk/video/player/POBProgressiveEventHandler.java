package com.pubmatic.sdk.video.player;

import androidx.annotation.NonNull;
import com.pubmatic.sdk.video.vastmodels.POBVastCreative;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes11.dex */
public class POBProgressiveEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SortedMap f63077a = new TreeMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private POBProgressiveEventListener f63078b;

    public POBProgressiveEventHandler(@NonNull POBProgressiveEventListener pOBProgressiveEventListener) {
        this.f63078b = pOBProgressiveEventListener;
    }

    public void addProgressUrls(@NonNull Integer num, POBVastCreative.POBEventTypes pOBEventTypes, @NonNull List<String> list) {
        Map map = (Map) this.f63077a.get(num);
        if (map == null) {
            HashMap map2 = new HashMap();
            map2.put(pOBEventTypes, list);
            this.f63077a.put(num, map2);
        } else {
            List list2 = (List) map.get(pOBEventTypes);
            if (list2 == null) {
                map.put(pOBEventTypes, list);
            } else {
                list2.addAll(list);
            }
        }
    }

    public void onProgress(int i10) {
        Map<POBVastCreative.POBEventTypes, List<String>> map;
        if (this.f63077a.isEmpty()) {
            return;
        }
        Integer num = (Integer) this.f63077a.firstKey();
        if (i10 < num.intValue() || (map = (Map) this.f63077a.get(num)) == null) {
            return;
        }
        this.f63078b.onProgressReached(map);
        this.f63077a.remove(num);
    }
}
