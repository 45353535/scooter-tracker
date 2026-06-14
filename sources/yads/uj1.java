package yads;

import com.ironsource.C4240b4;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class uj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt3 f116673a;

    public uj1(dt3 dt3Var) {
        this.f116673a = dt3Var;
    }

    public final void a(float f10, float f11) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Invalid Media duration");
        }
        if (f11 < 0.0f || f11 > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
        lu3.a(this.f116673a);
        JSONObject jSONObject = new JSONObject();
        st3.a(jSONObject, "duration", Float.valueOf(f10));
        st3.a(jSONObject, "mediaPlayerVolume", Float.valueOf(f11));
        st3.a(jSONObject, C4240b4.j.P, Float.valueOf(qu3.a().f115169a));
        this.f116673a.f110065e.a("start", jSONObject);
    }

    public final void a(float f10) {
        if (f10 >= 0.0f && f10 <= 1.0f) {
            lu3.a(this.f116673a);
            JSONObject jSONObject = new JSONObject();
            st3.a(jSONObject, "mediaPlayerVolume", Float.valueOf(f10));
            st3.a(jSONObject, C4240b4.j.P, Float.valueOf(qu3.a().f115169a));
            this.f116673a.f110065e.a("volumeChange", jSONObject);
            return;
        }
        throw new IllegalArgumentException("Invalid Media volume");
    }
}
