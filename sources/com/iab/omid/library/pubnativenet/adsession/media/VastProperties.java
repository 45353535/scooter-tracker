package com.iab.omid.library.pubnativenet.adsession.media;

import com.iab.omid.library.pubnativenet.utils.d;
import com.iab.omid.library.pubnativenet.utils.g;
import com.ironsource.C4240b4;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f35826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f35827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f35828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f35829d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f35826a = z10;
        this.f35827b = f10;
        this.f35828c = z11;
        this.f35829d = position;
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
            jSONObject.put("skippable", this.f35826a);
            if (this.f35826a) {
                jSONObject.put("skipOffset", this.f35827b);
            }
            jSONObject.put("autoPlay", this.f35828c);
            jSONObject.put(C4240b4.i.L, this.f35829d);
            return jSONObject;
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f35829d;
    }

    public Float getSkipOffset() {
        return this.f35827b;
    }

    public boolean isAutoPlay() {
        return this.f35828c;
    }

    public boolean isSkippable() {
        return this.f35826a;
    }
}
