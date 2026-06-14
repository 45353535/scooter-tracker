package com.iab.omid.library.bigosg.adsession.video;

import com.iab.omid.library.bigosg.d.e;

/* JADX INFO: loaded from: classes9.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f34508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f34509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f34510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f34511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.bigosg.adsession.media.VastProperties f34512e;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position, com.iab.omid.library.bigosg.adsession.media.VastProperties vastProperties) {
        this.f34508a = z10;
        this.f34509b = f10;
        this.f34510c = z11;
        this.f34511d = position;
        this.f34512e = vastProperties;
    }

    public static VastProperties createVastPropertiesForNonSkippableVideo(boolean z10, Position position) {
        e.a(position, "Position is null");
        return new VastProperties(false, null, z10, position, com.iab.omid.library.bigosg.adsession.media.VastProperties.createVastPropertiesForNonSkippableMedia(z10, com.iab.omid.library.bigosg.adsession.media.Position.valueOf(position.toString().toUpperCase())));
    }

    public static VastProperties createVastPropertiesForSkippableVideo(float f10, boolean z10, Position position) {
        e.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f10), z10, position, com.iab.omid.library.bigosg.adsession.media.VastProperties.createVastPropertiesForSkippableMedia(f10, z10, com.iab.omid.library.bigosg.adsession.media.Position.valueOf(position.toString().toUpperCase())));
    }

    final com.iab.omid.library.bigosg.adsession.media.VastProperties a() {
        return this.f34512e;
    }

    public final Position getPosition() {
        return this.f34511d;
    }

    public final Float getSkipOffset() {
        return this.f34509b;
    }

    public final boolean isAutoPlay() {
        return this.f34510c;
    }

    public final boolean isSkippable() {
        return this.f34508a;
    }
}
