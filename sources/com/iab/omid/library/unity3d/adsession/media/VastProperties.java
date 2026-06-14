package com.iab.omid.library.unity3d.adsession.media;

import com.iab.omid.library.unity3d.utils.d;
import com.iab.omid.library.unity3d.utils.g;
import com.ironsource.C4240b4;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f36219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f36220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f36221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f36222d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f36219a = z10;
        this.f36220b = f10;
        this.f36221c = z11;
        this.f36222d = position;
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
            jSONObject.put("skippable", this.f36219a);
            if (this.f36219a) {
                jSONObject.put("skipOffset", this.f36220b);
            }
            jSONObject.put("autoPlay", this.f36221c);
            jSONObject.put(C4240b4.i.L, this.f36222d);
            return jSONObject;
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f36222d;
    }

    public Float getSkipOffset() {
        return this.f36220b;
    }

    public boolean isAutoPlay() {
        return this.f36221c;
    }

    public boolean isSkippable() {
        return this.f36219a;
    }
}
