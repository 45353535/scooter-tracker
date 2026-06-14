package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.Trackers;
import com.inmobi.media.ads.network.common.model.TrackersV2;
import com.inmobi.media.ads.network.common.model.TrackingInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.z4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC4197z4 {
    public static final ArrayList a(G g10, String type) {
        Intrinsics.checkNotNullParameter(g10, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        List list = g10.f36903f;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.areEqual(((Trackers) obj).getType(), type)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList2, ((Trackers) it.next()).getUrl());
        }
        return arrayList2.isEmpty() ? a(type, g10.f36904g) : arrayList2;
    }

    public static final ArrayList a(String type, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TrackingInfo trackingInfo = (TrackingInfo) it.next();
            List<TrackersV2> trackers = trackingInfo.getTrackers();
            ArrayList<TrackersV2> arrayList2 = new ArrayList();
            for (Object obj : trackers) {
                if (Intrinsics.areEqual(((TrackersV2) obj).getType(), type)) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (TrackersV2 trackersV2 : arrayList2) {
                List<String> url = trackersV2.getUrl();
                List<String> imExts = trackersV2.getImExts();
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(imExts, 10));
                for (String str : imExts) {
                    arrayList4.add(trackingInfo.getImBaseUrl() + str);
                }
                CollectionsKt.addAll(arrayList3, CollectionsKt.plus((Collection) url, (Iterable) arrayList4));
            }
            CollectionsKt.addAll(arrayList, arrayList3);
        }
        return arrayList;
    }
}
