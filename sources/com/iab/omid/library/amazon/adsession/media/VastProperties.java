package com.iab.omid.library.amazon.adsession.media;

import com.iab.omid.library.amazon.utils.d;
import com.iab.omid.library.amazon.utils.g;
import com.ironsource.C4240b4;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f34099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f34100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f34101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f34102d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f34099a = z10;
        this.f34100b = f10;
        this.f34101c = z11;
        this.f34102d = position;
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
            jSONObject.put("skippable", this.f34099a);
            if (this.f34099a) {
                jSONObject.put("skipOffset", this.f34100b);
            }
            jSONObject.put("autoPlay", this.f34101c);
            jSONObject.put(C4240b4.i.L, this.f34102d);
            return jSONObject;
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f34102d;
    }

    public Float getSkipOffset() {
        return this.f34100b;
    }

    public boolean isAutoPlay() {
        return this.f34101c;
    }

    public boolean isSkippable() {
        return this.f34099a;
    }
}
