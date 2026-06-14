package org.bidon.amazon;

import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdNetwork;
import com.amazon.device.ads.DTBAdNetworkInfo;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.amazon.device.ads.DtbConstants;
import eg.i;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.g;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import lf.m;
import org.bidon.sdk.BidonSdk;
import org.bidon.sdk.ads.banner.BannerFormat;
import org.bidon.sdk.ads.banner.ext.BannerFormatExtKt;
import org.bidon.sdk.ads.banner.helper.DeviceInfo;
import org.bidon.sdk.auction.AdTypeParam;
import org.bidon.sdk.config.BidonError;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.regulation.Regulation;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f97012a = new ConcurrentHashMap();

    public static final class a implements DTBAdCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ DTBAdSize f97013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CancellableContinuation f97014b;

        a(DTBAdSize dTBAdSize, CancellableContinuation cancellableContinuation) {
            this.f97013a = dTBAdSize;
            this.f97014b = cancellableContinuation;
        }

        @Override // com.amazon.device.ads.DTBAdCallback
        public void onFailure(AdError adError) {
            Intrinsics.checkNotNullParameter(adError, "adError");
            LogExtKt.logError("AmazonBidManager", "Error while loading ad: " + this.f97013a + " " + adError.getCode() + " " + adError.getMessage(), BidonError.NoBid.INSTANCE);
            this.f97014b.resumeWith(Result.b(null));
        }

        @Override // com.amazon.device.ads.DTBAdCallback
        public void onSuccess(DTBAdResponse dtbAdResponse) {
            Intrinsics.checkNotNullParameter(dtbAdResponse, "dtbAdResponse");
            this.f97014b.resumeWith(Result.b(dtbAdResponse));
        }
    }

    /* JADX INFO: renamed from: org.bidon.amazon.b$b, reason: collision with other inner class name */
    static final class C1120b extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f97015r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f97016s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ List f97017t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ b f97018u;

        /* JADX INFO: renamed from: org.bidon.amazon.b$b$a */
        static final class a extends k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f97019r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ b f97020s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ DTBAdSize f97021t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, DTBAdSize dTBAdSize, Continuation continuation) {
                super(2, continuation);
                this.f97020s = bVar;
                this.f97021t = dTBAdSize;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f97020s, this.f97021t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = pf.b.g();
                int i10 = this.f97019r;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    b bVar = this.f97020s;
                    DTBAdSize dTBAdSize = this.f97021t;
                    this.f97019r = 1;
                    obj = bVar.f(dTBAdSize, this);
                    if (obj == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                }
                DTBAdResponse dTBAdResponse = (DTBAdResponse) obj;
                if (dTBAdResponse == null) {
                    return null;
                }
                DTBAdSize dTBAdSize2 = this.f97021t;
                LogExtKt.logInfo("AmazonBidManager", "AmazonInfo response -> " + dTBAdSize2.getDTBAdType() + ": " + dTBAdSize2.getSlotUUID() + ", " + dTBAdResponse);
                return TuplesKt.to(dTBAdSize2.getSlotUUID(), dTBAdResponse);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1120b(List list, b bVar, Continuation continuation) {
            super(2, continuation);
            this.f97017t = list;
            this.f97018u = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            C1120b c1120b = new C1120b(this.f97017t, this.f97018u, continuation);
            c1120b.f97016s = obj;
            return c1120b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f97015r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f97016s;
                List<DTBAdSize> list = this.f97017t;
                b bVar = this.f97018u;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (DTBAdSize dTBAdSize : list) {
                    LogExtKt.logInfo("AmazonBidManager", "AmazonInfo request -> " + dTBAdSize.getDTBAdType() + ": " + dTBAdSize.getSlotUUID());
                    arrayList.add(i.b(coroutineScope, null, null, new a(bVar, dTBAdSize, null), 3, null));
                }
                this.f97015r = 1;
                obj = eg.d.a(arrayList, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            return CollectionsKt.filterNotNull((Iterable) obj);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C1120b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f97022r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f97023s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f97025u;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f97023s = obj;
            this.f97025u |= Integer.MIN_VALUE;
            return b.this.l(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(DTBAdRequest dTBAdRequest, Regulation regulation) {
        String usPrivacyString = regulation.getUsPrivacyString();
        if (usPrivacyString != null) {
            dTBAdRequest.putCustomTarget(DtbConstants.APS_ADMOB_CONST_CCPA_US_PRIVACY, usPrivacyString);
        }
    }

    private final Map e(Map map, AdTypeParam adTypeParam) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            f fVar = (f) entry.getKey();
            if (adTypeParam instanceof AdTypeParam.Banner) {
                if (fVar == f.f97032d || (((AdTypeParam.Banner) adTypeParam).getBannerFormat() == BannerFormat.MRec && fVar == f.f97033e)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            } else if (!(adTypeParam instanceof AdTypeParam.Interstitial)) {
                if (!(adTypeParam instanceof AdTypeParam.Rewarded)) {
                    throw new m();
                }
                if (fVar == f.f97034f) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            } else if (fVar == f.f97036h || fVar == f.f97035g) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f(DTBAdSize dTBAdSize, Continuation continuation) {
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
        eVar.I();
        DTBAdRequest dTBAdRequest = new DTBAdRequest(new DTBAdNetworkInfo(DTBAdNetwork.CUSTOM_MEDIATION));
        d(dTBAdRequest, i());
        dTBAdRequest.setSizes(dTBAdSize);
        dTBAdRequest.loadAd(new a(dTBAdSize, eVar));
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            g.c(continuation);
        }
        return objC;
    }

    private final List g(Map map, AdTypeParam adTypeParam) {
        DTBAdSize dTBAdSizeH;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            f fVar = (f) entry.getKey();
            List<String> list = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (String str : list) {
                if (adTypeParam instanceof AdTypeParam.Banner) {
                    AdTypeParam.Banner banner = (AdTypeParam.Banner) adTypeParam;
                    dTBAdSizeH = new DTBAdSize(BannerFormatExtKt.getWidth(banner.getBannerFormat()), BannerFormatExtKt.getHeight(banner.getBannerFormat()), str);
                } else {
                    dTBAdSizeH = adTypeParam instanceof AdTypeParam.Interstitial ? fVar == f.f97035g ? h(str) : new DTBAdSize.DTBInterstitialAdSize(str) : adTypeParam instanceof AdTypeParam.Rewarded ? h(str) : null;
                }
                if (dTBAdSizeH != null) {
                    arrayList2.add(dTBAdSizeH);
                }
            }
            CollectionsKt.addAll(arrayList, arrayList2);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LogExtKt.logInfo("AmazonBidManager", "AmazonInfo suitable slot UUID -> " + ((DTBAdSize) it.next()).getSlotUUID());
        }
        return arrayList;
    }

    private final DTBAdSize.DTBVideo h(String str) {
        DeviceInfo deviceInfo = DeviceInfo.INSTANCE;
        Integer numValueOf = Integer.valueOf(deviceInfo.getScreenWidthDp());
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 320;
        Integer numValueOf2 = Integer.valueOf(deviceInfo.getScreenHeightDp());
        Integer num = numValueOf2.intValue() > 0 ? numValueOf2 : null;
        int iIntValue2 = num != null ? num.intValue() : DtbConstants.DEFAULT_PLAYER_HEIGHT;
        LogExtKt.logInfo("AmazonBidManager", "Amazon video player size dp: " + iIntValue + " x " + iIntValue2);
        return new DTBAdSize.DTBVideo(iIntValue, iIntValue2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Regulation i() {
        return BidonSdk.getRegulation();
    }

    private final Object k(List list, Continuation continuation) {
        return kotlinx.coroutines.i.g(new C1120b(list, this, null), continuation);
    }

    public final DTBAdResponse j(String slotUuid) {
        Intrinsics.checkNotNullParameter(slotUuid, "slotUuid");
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) this.f97012a.get(slotUuid);
        if (concurrentLinkedQueue != null) {
            return (DTBAdResponse) concurrentLinkedQueue.poll();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(java.util.Map r5, org.bidon.sdk.auction.AdTypeParam r6, kotlin.coroutines.Continuation r7) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.amazon.b.l(java.util.Map, org.bidon.sdk.auction.AdTypeParam, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
