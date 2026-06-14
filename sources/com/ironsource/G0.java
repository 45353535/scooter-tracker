package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class G0 implements Ze<JSONObject>, Xe<E0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, C4504qc> f40933a = new LinkedHashMap();

    @Override // com.ironsource.InterfaceC4294e7
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(@NotNull Ye mode) throws JSONException {
        Intrinsics.checkNotNullParameter(mode, "mode");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, C4504qc> entry : this.f40933a.entrySet()) {
            String key = entry.getKey();
            JSONObject jSONObjectA = entry.getValue().a(mode);
            if (jSONObjectA.length() > 0) {
                jSONObject.put(StringsKt.l1(key, "_", null, 2, null), jSONObjectA);
            }
        }
        return jSONObject;
    }

    @Override // com.ironsource.Xe
    public void a(@NotNull E0 record) {
        Intrinsics.checkNotNullParameter(record, "record");
        String strD = record.d();
        Map<String, C4504qc> map = this.f40933a;
        C4504qc c4504qc = map.get(strD);
        if (c4504qc == null) {
            c4504qc = new C4504qc();
            map.put(strD, c4504qc);
        }
        c4504qc.a(record.a(new F0()));
    }
}
