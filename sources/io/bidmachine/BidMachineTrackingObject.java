package io.bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdResponseCacheParamsCollector;
import io.bidmachine.protobuf.AdExtension;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class BidMachineTrackingObject extends nd.h {

    @Nullable
    private u adResponse;

    @NonNull
    private final AdResponseCacheParamsCollector cacheParamsCollector;

    public BidMachineTrackingObject() {
        super(j2.e().t());
        this.cacheParamsCollector = new AdResponseCacheParamsCollector();
        this.adResponse = null;
    }

    public void eventFinish(@NonNull TrackEventType trackEventType, @Nullable AdsType adsType, @Nullable u uVar, @Nullable ae.a aVar) {
        eventFinish(trackEventType, adsType, uVar, aVar, null);
    }

    @Override // nd.m, nd.l
    public /* bridge */ /* synthetic */ void eventStart(@NonNull TrackEventType trackEventType) {
        nd.k.a(this, trackEventType);
    }

    @Override // nd.m, nd.l
    @Nullable
    public AdExtension.EventConfiguration getEventConfiguration() {
        u uVar = this.adResponse;
        return uVar != null ? uVar.E() : super.getEventConfiguration();
    }

    @Override // nd.m, nd.l
    @Nullable
    public List<String> getTrackingUrls(@NonNull TrackEventType trackEventType) {
        u uVar = this.adResponse;
        return uVar != null ? uVar.H(trackEventType) : super.getTrackingUrls(trackEventType);
    }

    public void setAdResponse(@Nullable u uVar) {
        this.adResponse = uVar;
    }

    public void eventFinish(@NonNull final TrackEventType trackEventType, @Nullable final AdsType adsType, @Nullable final u uVar, @Nullable final ae.a aVar, @Nullable final Map<String, Object> map) {
        this.cacheParamsCollector.collect(trackEventType, uVar, new AdResponseCacheParamsCollector.Callback() { // from class: io.bidmachine.o2
            @Override // io.bidmachine.AdResponseCacheParamsCollector.Callback
            public final void onCollected(Map map2) {
                this.f81876a.eventFinish(trackEventType, adsType, uVar, aVar, map, map2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void eventFinish(@NonNull TrackEventType trackEventType, @Nullable AdsType adsType, @Nullable u uVar, @Nullable ae.a aVar, @Nullable Map<String, Object> map, @Nullable Map<String, ?> map2) {
        nd.a aVarI;
        if (uVar != null) {
            aVarI = new nd.a().h(uVar.D().getNetworkKey()).i(Double.valueOf(uVar.F()));
            if (map != null && !map.isEmpty()) {
                aVarI.a(map);
            }
            if (map2 != null && !map2.isEmpty()) {
                aVarI.a(map2);
            }
            zb.a aVarA = uVar.A();
            if (aVarA != null) {
                aVarI.a(aVarA.getCustomParams());
            }
        } else {
            aVarI = null;
        }
        eventFinish(trackEventType, adsType, aVarI, aVar);
    }

    public BidMachineTrackingObject(@NonNull Object obj) {
        super(obj, j2.e().t());
        this.cacheParamsCollector = new AdResponseCacheParamsCollector();
        this.adResponse = null;
    }
}
