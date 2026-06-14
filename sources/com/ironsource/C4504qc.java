package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.qc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4504qc implements Ze<JSONObject>, Xe<C4470oc> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, C4322g1> f44724a = new LinkedHashMap();

    @Override // com.ironsource.InterfaceC4294e7
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(@NotNull Ye mode) throws JSONException {
        Intrinsics.checkNotNullParameter(mode, "mode");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, C4322g1> entry : this.f44724a.entrySet()) {
            String key = entry.getKey();
            JSONArray jSONArrayA = entry.getValue().a(mode);
            if (jSONArrayA.length() > 0) {
                jSONObject.put(key, jSONArrayA);
            }
        }
        return jSONObject;
    }

    @Override // com.ironsource.Xe
    public void a(@NotNull C4470oc record) {
        Intrinsics.checkNotNullParameter(record, "record");
        String strC = record.c();
        Map<String, C4322g1> map = this.f44724a;
        C4322g1 c4322g1 = map.get(strC);
        if (c4322g1 == null) {
            c4322g1 = new C4322g1();
            map.put(strC, c4322g1);
        }
        c4322g1.a(record.a(new C4487pc()));
    }
}
