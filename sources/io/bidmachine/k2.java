package io.bidmachine;

/* JADX INFO: loaded from: classes12.dex */
class k2 extends nd.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a2 f80491c;

    k2(nd.b bVar) {
        super(bVar);
        this.f80491c = new a2();
    }

    @Override // nd.g, nd.b
    public void trackEvent(nd.l lVar, TrackEventType trackEventType, nd.j jVar, AdsType adsType, ae.a aVar, nd.a aVar2) {
        super.trackEvent(lVar, trackEventType, jVar, adsType, aVar, aVar2);
        this.f80491c.trackEvent(lVar, trackEventType, jVar, adsType, aVar, aVar2);
    }
}
