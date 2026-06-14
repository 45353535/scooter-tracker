package com.mobilefuse.sdk.telemetry;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0006H\u0016J\u0018\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\tH&J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\tH&¨\u0006\f"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/TelemetryEventsMfxService;", "T", "", "createJson", "Lorg/json/JSONObject;", "data", "", "", "createJsonLines", "", "reportEvents", "", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
public interface TelemetryEventsMfxService<T> {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3})
    public static final class DefaultImpls {
        @Nullable
        public static <T> JSONObject createJson(@NotNull TelemetryEventsMfxService<T> telemetryEventsMfxService, @NotNull Map<String, ? extends Object> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return null;
        }
    }

    @Nullable
    JSONObject createJson(@NotNull Map<String, ? extends Object> data);

    @Nullable
    String createJsonLines(@NotNull List<? extends T> data);

    void reportEvents(@NotNull List<? extends T> data);
}
