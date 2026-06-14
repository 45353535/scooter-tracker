package com.iab.omid.library.bigosg.adsession.media;

import com.iab.omid.library.bigosg.adsession.AdSession;
import com.iab.omid.library.bigosg.adsession.a;
import com.iab.omid.library.bigosg.b.f;
import com.iab.omid.library.bigosg.d.b;
import com.iab.omid.library.bigosg.d.e;
import com.ironsource.C4240b4;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class MediaEvents {
    private final a adSession;

    private MediaEvents(a aVar) {
        this.adSession = aVar;
    }

    private void confirmValidDuration(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Invalid Media duration");
        }
    }

    private void confirmValidVolume(float f10) {
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
    }

    public static MediaEvents createMediaEvents(AdSession adSession) {
        a aVar = (a) adSession;
        e.a(adSession, "AdSession is null");
        e.g(aVar);
        e.a(aVar);
        e.b(aVar);
        e.e(aVar);
        MediaEvents mediaEvents = new MediaEvents(aVar);
        aVar.getAdSessionStatePublisher().a(mediaEvents);
        return mediaEvents;
    }

    public final void adUserInteraction(InteractionType interactionType) {
        e.a(interactionType, "InteractionType is null");
        e.c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        b.a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().a("adUserInteraction", jSONObject);
    }

    public final void bufferFinish() {
        e.c(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("bufferFinish");
    }

    public final void bufferStart() {
        e.c(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("bufferStart");
    }

    public final void complete() {
        e.c(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("complete");
    }

    public final void firstQuartile() {
        e.c(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("firstQuartile");
    }

    public final void loaded(VastProperties vastProperties) {
        e.a(vastProperties, "VastProperties is null");
        e.b(this.adSession);
        this.adSession.getAdSessionStatePublisher().a(C4240b4.i.f42648r, vastProperties.a());
    }

    public final void midpoint() {
        e.c(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("midpoint");
    }

    public final void pause() {
        e.c(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("pause");
    }

    public final void playerStateChange(PlayerState playerState) {
        e.a(playerState, "PlayerState is null");
        e.c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        b.a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().a("playerStateChange", jSONObject);
    }

    public final void resume() {
        e.c(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("resume");
    }

    public final void skipped() {
        e.c(this.adSession);
        this.adSession.getAdSessionStatePublisher().a(Reporting.EventType.VIDEO_AD_SKIPPED);
    }

    public final void start(float f10, float f11) {
        confirmValidDuration(f10);
        confirmValidVolume(f11);
        e.c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        b.a(jSONObject, "duration", Float.valueOf(f10));
        b.a(jSONObject, "mediaPlayerVolume", Float.valueOf(f11));
        b.a(jSONObject, C4240b4.j.P, Float.valueOf(f.a().d()));
        this.adSession.getAdSessionStatePublisher().a("start", jSONObject);
    }

    public final void thirdQuartile() {
        e.c(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("thirdQuartile");
    }

    public final void volumeChange(float f10) {
        confirmValidVolume(f10);
        e.c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        b.a(jSONObject, "mediaPlayerVolume", Float.valueOf(f10));
        b.a(jSONObject, C4240b4.j.P, Float.valueOf(f.a().d()));
        this.adSession.getAdSessionStatePublisher().a("volumeChange", jSONObject);
    }
}
