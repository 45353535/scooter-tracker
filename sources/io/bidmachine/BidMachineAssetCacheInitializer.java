package io.bidmachine;

import android.content.Context;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import io.bidmachine.protobuf.InitResponse;
import io.bidmachine.protobuf.sdk.AssetCache;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import qd.a;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/bidmachine/BidMachineAssetCacheInitializer;", "", "<init>", "()V", "Lio/bidmachine/protobuf/InitResponse;", "initResponse", "Lqd/a$c;", "getMediaFileCacheManagerConfiguration", "(Lio/bidmachine/protobuf/InitResponse;)Lqd/a$c;", "Lio/bidmachine/protobuf/sdk/AssetCache$PolicyLimit;", "Lqd/a$h;", "toPolicyLimit", "(Lio/bidmachine/protobuf/sdk/AssetCache$PolicyLimit;)Lqd/a$h;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "", "configure", "(Landroid/content/Context;Lio/bidmachine/protobuf/InitResponse;)V", "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class BidMachineAssetCacheInitializer {
    private final a.c getMediaFileCacheManagerConfiguration(InitResponse initResponse) {
        a.c cVar;
        a.c cVar2 = null;
        try {
            if (!initResponse.hasAssetCacheConfiguration()) {
                return null;
            }
            AssetCache.Configuration assetCacheConfiguration = initResponse.getAssetCacheConfiguration();
            AssetCache.CleanConfiguration cleanConfiguration = assetCacheConfiguration.getCleanConfiguration();
            a.C1171a c1171a = new a.C1171a(cleanConfiguration.getTriggerOnStartup(), cleanConfiguration.getTriggerOnCaching(), cleanConfiguration.getTriggerOnDiskIssue());
            AssetCache.ConnectionConfiguration connectionConfiguration = assetCacheConfiguration.getConnectionConfiguration();
            b.a aVar = kotlin.time.b.f93560c;
            long headRequestTimeoutMs = connectionConfiguration.getHeadRequestTimeoutMs();
            cg.b bVar = cg.b.f6838e;
            a.d dVar = new a.d(kotlin.time.c.t(headRequestTimeoutMs, bVar), kotlin.time.c.t(connectionConfiguration.getDownloadRequestTimeoutMs(), bVar), null);
            AssetCache.PolicyConfiguration policyConfiguration = assetCacheConfiguration.getPolicyConfiguration();
            AssetCache.PolicyLimit maxPingTimeMs = policyConfiguration.getDownloadPolicy().getMaxPingTimeMs();
            Intrinsics.checkNotNullExpressionValue(maxPingTimeMs, "protobufPolicyConfig.downloadPolicy.maxPingTimeMs");
            a.h policyLimit = toPolicyLimit(maxPingTimeMs);
            AssetCache.PolicyLimit maxFileSizeBytes = policyConfiguration.getDownloadPolicy().getMaxFileSizeBytes();
            Intrinsics.checkNotNullExpressionValue(maxFileSizeBytes, "protobufPolicyConfig.dow…adPolicy.maxFileSizeBytes");
            a.e eVar = new a.e(policyLimit, toPolicyLimit(maxFileSizeBytes));
            List<AssetCache.EvictionPolicy> evictionPoliciesList = policyConfiguration.getEvictionPoliciesList();
            Intrinsics.checkNotNullExpressionValue(evictionPoliciesList, "protobufPolicyConfig.evictionPoliciesList");
            List<AssetCache.EvictionPolicy> list = evictionPoliciesList;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AssetCache.EvictionPolicy evictionPolicy = (AssetCache.EvictionPolicy) it.next();
                double score = evictionPolicy.getScore();
                double minDiskAppliedPercent = evictionPolicy.getMinDiskAppliedPercent();
                double maxDiskAppliedPercent = evictionPolicy.getMaxDiskAppliedPercent();
                b.a aVar2 = kotlin.time.b.f93560c;
                cVar = cVar2;
                Iterator it2 = it;
                try {
                    a.h hVar = new a.h(kotlin.time.b.q(kotlin.time.c.t(evictionPolicy.getMaxTtlSeconds().getThreshold(), cg.b.f6839f)), evictionPolicy.getMaxTtlSeconds().getWeight());
                    AssetCache.PolicyLimit minFrequency = evictionPolicy.getMinFrequency();
                    Intrinsics.checkNotNullExpressionValue(minFrequency, "it.minFrequency");
                    a.h policyLimit2 = toPolicyLimit(minFrequency);
                    AssetCache.PolicyLimit maxImageSizeBytes = evictionPolicy.getMaxImageSizeBytes();
                    Intrinsics.checkNotNullExpressionValue(maxImageSizeBytes, "it.maxImageSizeBytes");
                    a.h policyLimit3 = toPolicyLimit(maxImageSizeBytes);
                    AssetCache.PolicyLimit maxVideoSizeBytes = evictionPolicy.getMaxVideoSizeBytes();
                    Intrinsics.checkNotNullExpressionValue(maxVideoSizeBytes, "it.maxVideoSizeBytes");
                    arrayList.add(new a.f(score, minDiskAppliedPercent, maxDiskAppliedPercent, hVar, policyLimit2, policyLimit3, toPolicyLimit(maxVideoSizeBytes)));
                    it = it2;
                    cVar2 = cVar;
                } catch (Throwable unused) {
                    return cVar;
                }
            }
            cVar = cVar2;
            return new a.c(c1171a, dVar, new a.g(eVar, arrayList));
        } catch (Throwable unused2) {
            return cVar2;
        }
    }

    private final a.h toPolicyLimit(AssetCache.PolicyLimit policyLimit) {
        return new a.h(policyLimit.getThreshold(), policyLimit.getWeight());
    }

    public final void configure(@NotNull Context context, @NotNull InitResponse initResponse) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initResponse, "initResponse");
        h9.a aVar = h9.a.f72957a;
        aVar.d(context);
        a.c mediaFileCacheManagerConfiguration = getMediaFileCacheManagerConfiguration(initResponse);
        if (mediaFileCacheManagerConfiguration != null) {
            aVar.a(context, mediaFileCacheManagerConfiguration);
        }
        aVar.e(context);
    }
}
