package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public interface R4 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Map<String, Object> f41658a;

        public a(@NotNull String providerName) {
            Intrinsics.checkNotNullParameter(providerName, "providerName");
            this.f41658a = MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_PROVIDER, providerName), TuplesKt.to(IronSourceConstants.EVENTS_DEMAND_ONLY, 1));
        }

        public final void a(@NotNull String key, @NotNull Object value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f41658a.put(key, value);
        }

        @NotNull
        public final Map<String, Object> a() {
            return MapsKt.toMutableMap(this.f41658a);
        }
    }

    void a(@NotNull A5 a52, @Nullable EnumC4556te enumC4556te);

    void a(@NotNull A5 a52, @NotNull String str);

    public static final class b implements R4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final C7 f41659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final a f41660b;

        public b(@NotNull C7 eventManager, @NotNull a eventBaseData) {
            Intrinsics.checkNotNullParameter(eventManager, "eventManager");
            Intrinsics.checkNotNullParameter(eventBaseData, "eventBaseData");
            this.f41659a = eventManager;
            this.f41660b = eventBaseData;
        }

        @Override // com.ironsource.R4
        public void a(@NotNull A5 eventName, @NotNull String instanceId) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Map<String, Object> mapA = this.f41660b.a();
            mapA.put("spId", instanceId);
            this.f41659a.a(new C4649z5(eventName, new JSONObject(MapsKt.toMap(mapA))));
        }

        @Override // com.ironsource.R4
        public void a(@NotNull A5 eventName, @Nullable EnumC4556te enumC4556te) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Map<String, Object> mapA = this.f41660b.a();
            if (enumC4556te != null) {
                mapA.put(IronSourceConstants.EVENTS_EXT1, enumC4556te.toString());
            }
            this.f41659a.a(new C4649z5(eventName, new JSONObject(MapsKt.toMap(mapA))));
        }
    }
}
