package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public interface StartupParamsCallback {
    public static final String APPMETRICA_DEVICE_ID = "appmetrica_device_id";
    public static final String APPMETRICA_DEVICE_ID_HASH = "appmetrica_device_id_hash";
    public static final String APPMETRICA_UUID = "appmetrica_uuid";

    public static final class Reason {

        @NonNull
        public final String value;
        public static Reason UNKNOWN = new Reason("UNKNOWN");
        public static Reason NETWORK = new Reason("NETWORK");
        public static Reason INVALID_RESPONSE = new Reason("INVALID_RESPONSE");

        public Reason(@NonNull String str) {
            this.value = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Reason.class != obj.getClass()) {
                return false;
            }
            return this.value.equals(((Reason) obj).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "Reason{value='" + this.value + "'}";
        }
    }

    public static final class Result {

        @NonNull
        public final Map<String, StartupParamsItem> parameters;

        @Nullable
        public final String uuid = parameterForKey(StartupParamsCallback.APPMETRICA_UUID);

        @Nullable
        public final String deviceId = parameterForKey(StartupParamsCallback.APPMETRICA_DEVICE_ID);

        @Nullable
        public final String deviceIdHash = parameterForKey(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH);

        public Result(@NonNull Map<String, StartupParamsItem> map) {
            this.parameters = map;
        }

        @Nullable
        public String parameterForKey(@NonNull String str) {
            StartupParamsItem startupParamsItem = this.parameters.get(str);
            if (startupParamsItem != null) {
                return startupParamsItem.getId();
            }
            return null;
        }
    }

    void onReceive(@Nullable Result result);

    void onRequestError(@NonNull Reason reason, @Nullable Result result);
}
