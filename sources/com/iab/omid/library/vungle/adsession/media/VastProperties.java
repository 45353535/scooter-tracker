package com.iab.omid.library.vungle.adsession.media;

import com.iab.omid.library.vungle.utils.d;
import com.iab.omid.library.vungle.utils.g;
import com.ironsource.C4240b4;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f36346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f36347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f36348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f36349d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f36346a = z10;
        this.f36347b = f10;
        this.f36348c = z11;
        this.f36349d = position;
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
            jSONObject.put("skippable", this.f36346a);
            if (this.f36346a) {
                jSONObject.put("skipOffset", this.f36347b);
            }
            jSONObject.put("autoPlay", this.f36348c);
            jSONObject.put(C4240b4.i.L, this.f36349d);
            return jSONObject;
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f36349d;
    }

    public Float getSkipOffset() {
        return this.f36347b;
    }

    public boolean isAutoPlay() {
        return this.f36348c;
    }

    public boolean isSkippable() {
        return this.f36346a;
    }
}
