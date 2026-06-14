package sg.bigo.ads.controller.b;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import org.json.JSONObject;
import sg.bigo.ads.api.a.m;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final JSONObject f103402a;

    public j(@NonNull JSONObject jSONObject) {
        this.f103402a = jSONObject;
    }

    @Nullable
    private Object d(@NonNull String str) {
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length == 0) {
            return null;
        }
        JSONObject jSONObjectOptJSONObject = this.f103402a;
        for (int i10 = 0; i10 < strArrSplit.length - 1; i10++) {
            jSONObjectOptJSONObject = jSONObjectOptJSONObject.optJSONObject(strArrSplit[i10]);
            if (jSONObjectOptJSONObject == null) {
                return null;
            }
        }
        return jSONObjectOptJSONObject.opt(strArrSplit[strArrSplit.length - 1]);
    }

    @Override // sg.bigo.ads.api.a.m
    public final int a(@NonNull String str) {
        Integer numA = sg.bigo.ads.common.utils.j.a(d(str));
        if (numA != null) {
            return numA.intValue();
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.a.m
    public final float b(@NonNull String str) {
        Float fB = sg.bigo.ads.common.utils.j.b(d(str));
        if (fB != null) {
            return fB.floatValue();
        }
        return 0.0f;
    }

    @Override // sg.bigo.ads.api.a.m
    public final boolean c(@NonNull String str) {
        return a(str) == 1;
    }

    @NonNull
    public final String toString() {
        return this.f103402a.toString();
    }

    @Override // sg.bigo.ads.api.a.m
    public final int a(@NonNull String str, int i10) {
        Integer numA = sg.bigo.ads.common.utils.j.a(d(str));
        return numA != null ? numA.intValue() : i10;
    }

    @Override // sg.bigo.ads.api.a.m
    public final m a(Map<String, String> map) {
        try {
            j jVar = new j(new JSONObject(this.f103402a.toString()));
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String value = entry.getValue();
                String key = entry.getKey();
                JSONObject jSONObjectOptJSONObject = this.f103402a.optJSONObject(value);
                if (jSONObjectOptJSONObject != null) {
                    jVar.f103402a.put(key, jSONObjectOptJSONObject);
                }
                jVar.f103402a.remove(value);
                this.f103402a.remove(value);
            }
            return jVar;
        } catch (Exception unused) {
            return this;
        }
    }
}
