package com.iab.omid.library.mmadbridge.adsession.media;

import com.iab.omid.library.mmadbridge.utils.d;
import com.iab.omid.library.mmadbridge.utils.g;
import com.ironsource.C4240b4;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f35415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f35416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f35417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f35418d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f35415a = z10;
        this.f35416b = f10;
        this.f35417c = z11;
        this.f35418d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z10, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(false, null, z10, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f10, boolean z10, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f10), z10, position);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f35415a);
            if (this.f35415a) {
                jSONObject.put("skipOffset", this.f35416b);
            }
            jSONObject.put("autoPlay", this.f35417c);
            jSONObject.put(C4240b4.i.L, this.f35418d);
            return jSONObject;
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f35418d;
    }

    public Float getSkipOffset() {
        return this.f35416b;
    }

    public boolean isAutoPlay() {
        return this.f35417c;
    }

    public boolean isSkippable() {
        return this.f35415a;
    }
}
