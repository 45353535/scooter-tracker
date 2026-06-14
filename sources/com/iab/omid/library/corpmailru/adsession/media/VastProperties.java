package com.iab.omid.library.corpmailru.adsession.media;

import com.iab.omid.library.corpmailru.d.c;
import com.iab.omid.library.corpmailru.d.e;
import com.ironsource.C4240b4;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f34895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f34896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f34897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f34898d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f34895a = z10;
        this.f34896b = f10;
        this.f34897c = z11;
        this.f34898d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z10, Position position) {
        e.a(position, "Position is null");
        return new VastProperties(false, null, z10, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f10, boolean z10, Position position) {
        e.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f10), z10, position);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f34895a);
            if (this.f34895a) {
                jSONObject.put("skipOffset", this.f34896b);
            }
            jSONObject.put("autoPlay", this.f34897c);
            jSONObject.put(C4240b4.i.L, this.f34898d);
            return jSONObject;
        } catch (JSONException e10) {
            c.a("VastProperties: JSON error", e10);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f34898d;
    }

    public Float getSkipOffset() {
        return this.f34896b;
    }

    public boolean isAutoPlay() {
        return this.f34897c;
    }

    public boolean isSkippable() {
        return this.f34895a;
    }
}
