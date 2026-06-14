package com.ironsource;

import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ud, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4572ud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, C4588vc> f45557a;

    /* JADX INFO: renamed from: com.ironsource.ud$a */
    static final class a extends Lambda implements Function1<String, Pair<? extends String, ? extends C4588vc>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f45558a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(JSONObject jSONObject) {
            super(1);
            this.f45558a = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pair<String, C4588vc> invoke(String networkName) throws JSONException {
            Intrinsics.checkNotNullExpressionValue(networkName, "networkName");
            JSONObject jSONObject = this.f45558a.getJSONObject(networkName);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "providerSettings.getJSONObject(networkName)");
            return TuplesKt.to(networkName, new C4588vc(networkName, jSONObject));
        }
    }

    public C4572ud(@NotNull JSONObject providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Iterator<String> itKeys = providerSettings.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "providerSettings\n          .keys()");
        Map<String, C4588vc> map = MapsKt.toMap(kotlin.sequences.k.Q(kotlin.sequences.k.h(itKeys), new a(providerSettings)));
        this.f45557a = map;
        for (Map.Entry<String, C4588vc> entry : map.entrySet()) {
            entry.getKey();
            C4588vc value = entry.getValue();
            if (b(value)) {
                value.b(a(value));
            }
        }
    }

    private final boolean b(C4588vc c4588vc) {
        return c4588vc.o() && c4588vc.l().length() > 0;
    }

    @NotNull
    public final Map<String, C4588vc> a() {
        return this.f45557a;
    }

    private final C4588vc a(C4588vc c4588vc) {
        return this.f45557a.get(c4588vc.h());
    }
}
