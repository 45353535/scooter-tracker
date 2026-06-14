package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lf.i;
import org.jetbrains.annotations.NotNull;
import vh.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR)\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetIsAdActivity;", "", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "<init>", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "", "activityName", "", "invoke", "(Ljava/lang/String;)Z", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "", "Lvh/h;", "kotlin.jvm.PlatformType", "activities$delegate", "Lkotlin/Lazy;", "getActivities", "()Ljava/util/List;", "activities", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidGetIsAdActivity {

    /* JADX INFO: renamed from: activities$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy activities;

    @NotNull
    private final SessionRepository sessionRepository;

    public AndroidGetIsAdActivity(@NotNull SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
        this.activities = i.a(new Function0<List<? extends h>>() { // from class: com.unity3d.ads.core.domain.AndroidGetIsAdActivity$activities$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<? extends h> invoke() {
                List<ByteString> observableAndroidActivitiesList = this.this$0.sessionRepository.getNativeConfiguration().getObservableAndroidActivitiesList();
                Intrinsics.checkNotNullExpressionValue(observableAndroidActivitiesList, "sessionRepository.native…ableAndroidActivitiesList");
                List<ByteString> list = observableAndroidActivitiesList;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    byte[] byteArray = ((ByteString) it.next()).toByteArray();
                    arrayList.add(h.E(Arrays.copyOf(byteArray, byteArray.length)));
                }
                return arrayList;
            }
        });
    }

    private final List<h> getActivities() {
        return (List) this.activities.getValue();
    }

    public final boolean invoke(@NotNull String activityName) {
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        return getActivities().contains(h.h(StringExtensionsKt.getSHA256Hash(activityName)));
    }
}
