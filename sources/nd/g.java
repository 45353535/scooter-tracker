package nd;

import io.bidmachine.AdsType;
import io.bidmachine.TrackEventType;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f95835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Map f95836b = new ConcurrentHashMap();

    public g(b bVar) {
        this.f95835a = bVar;
    }

    @Override // nd.f
    public void a(l lVar, TrackEventType trackEventType, j jVar) {
        Object trackingKey = lVar.getTrackingKey();
        Map enumMap = (Map) this.f95836b.get(trackingKey);
        if (enumMap == null) {
            enumMap = new EnumMap(TrackEventType.class);
            this.f95836b.put(trackingKey, enumMap);
        }
        if (enumMap.containsKey(trackEventType)) {
            return;
        }
        if (jVar == null) {
            jVar = new j();
        }
        enumMap.put(trackEventType, jVar);
    }

    @Override // nd.f
    public void b(l lVar) {
        this.f95836b.remove(lVar.getTrackingKey());
    }

    @Override // nd.f
    public void c(l lVar, TrackEventType trackEventType, AdsType adsType, ae.a aVar, a aVar2) {
        j jVar;
        Map map = (Map) this.f95836b.get(lVar.getTrackingKey());
        if (map == null || !map.containsKey(trackEventType)) {
            jVar = null;
        } else {
            jVar = (j) map.get(trackEventType);
            if (jVar != null) {
                jVar.d(System.currentTimeMillis());
            }
            map.remove(trackEventType);
            if (map.isEmpty()) {
                b(lVar);
            }
        }
        trackEvent(lVar, trackEventType, jVar, adsType, aVar, aVar2);
    }

    @Override // nd.f
    public void d(l lVar, TrackEventType trackEventType) {
        Map map = (Map) this.f95836b.get(lVar.getTrackingKey());
        if (map != null) {
            map.remove(trackEventType);
        }
    }

    @Override // nd.b
    public void trackEvent(l lVar, TrackEventType trackEventType, j jVar, AdsType adsType, ae.a aVar, a aVar2) {
        this.f95835a.trackEvent(lVar, trackEventType, jVar, adsType, aVar, aVar2);
    }
}
