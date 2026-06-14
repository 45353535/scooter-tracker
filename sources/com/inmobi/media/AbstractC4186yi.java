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

/* JADX INFO: renamed from: com.inmobi.media.yi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC4186yi {
    public static final List a(com.inmobi.media.ads.network.common.model.Ad ad2, String type) {
        Intrinsics.checkNotNullParameter(ad2, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        List<Trackers> trackers$media_release = ad2.getTrackers$media_release();
        ArrayList arrayList = new ArrayList();
        for (Object obj : trackers$media_release) {
            if (Intrinsics.areEqual(((Trackers) obj).getType(), type)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList2, ((Trackers) it.next()).getUrl());
        }
        List<TrackingInfo> trackingInfo$media_release = ad2.getTrackingInfo$media_release();
        Collection arrayList3 = new ArrayList();
        for (TrackingInfo trackingInfo : trackingInfo$media_release) {
            List<TrackersV2> trackers = trackingInfo.getTrackers();
            ArrayList<TrackersV2> arrayList4 = new ArrayList();
            for (Object obj2 : trackers) {
                if (Intrinsics.areEqual(((TrackersV2) obj2).getType(), type)) {
                    arrayList4.add(obj2);
                }
            }
            ArrayList arrayList5 = new ArrayList();
            for (TrackersV2 trackersV2 : arrayList4) {
                List<String> url = trackersV2.getUrl();
                List<String> imExts = trackersV2.getImExts();
                ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(imExts, 10));
                for (String str : imExts) {
                    arrayList6.add(trackingInfo.getImBaseUrl() + str);
                }
                CollectionsKt.addAll(arrayList5, CollectionsKt.plus((Collection) url, (Iterable) arrayList6));
            }
            CollectionsKt.addAll(arrayList3, arrayList5);
        }
        if (arrayList3.isEmpty()) {
            arrayList3 = CollectionsKt.emptyList();
        }
        return CollectionsKt.plus(arrayList3, (Iterable) arrayList2);
    }
}
