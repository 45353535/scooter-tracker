package com.ironsource;

import com.ironsource.N6;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.b2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4238b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final N6.a f42454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList<String> f42455b = new ArrayList<>(new Z1().a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final P6 f42456c = new P6();

    public C4238b2(@Nullable N6.a aVar) {
        this.f42454a = aVar;
    }

    @NotNull
    public final JSONObject a() {
        N6.a aVar = this.f42454a;
        JSONObject jSONObjectA = aVar != null ? this.f42456c.a(this.f42455b, aVar) : null;
        if (jSONObjectA == null) {
            jSONObjectA = this.f42456c.a(this.f42455b);
            Intrinsics.checkNotNullExpressionValue(jSONObjectA, "mGlobalDataReader.getDataByKeys(mAuctionKeyList)");
        }
        return a(jSONObjectA);
    }

    private final JSONObject a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectB = Q6.b(jSONObject.optJSONObject("md"));
        if (jSONObjectB != null) {
            jSONObject.put("md", jSONObjectB);
        }
        return jSONObject;
    }
}
