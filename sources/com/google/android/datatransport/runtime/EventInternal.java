package com.google.android.datatransport.runtime;

import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.AutoValue_EventInternal;
import com.google.auto.value.AutoValue;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
@AutoValue
public abstract class EventInternal {

    @AutoValue.Builder
    public static abstract class Builder {
        protected abstract Map a();

        public final Builder addMetadata(String str, String str2) {
            a().put(str, str2);
            return this;
        }

        protected abstract Builder b(Map map);

        public abstract EventInternal build();

        public abstract Builder setCode(Integer num);

        public abstract Builder setEncodedPayload(EncodedPayload encodedPayload);

        public abstract Builder setEventMillis(long j10);

        public abstract Builder setExperimentIdsClear(byte[] bArr);

        public abstract Builder setExperimentIdsEncrypted(byte[] bArr);

        public abstract Builder setProductId(Integer num);

        public abstract Builder setPseudonymousId(String str);

        public abstract Builder setTransportName(String str);

        public abstract Builder setUptimeMillis(long j10);

        public final Builder addMetadata(String str, long j10) {
            a().put(str, String.valueOf(j10));
            return this;
        }

        public final Builder addMetadata(String str, int i10) {
            a().put(str, String.valueOf(i10));
            return this;
        }
    }

    public static Builder builder() {
        return new AutoValue_EventInternal.Builder().b(new HashMap());
    }

    protected abstract Map a();

    public final String get(String str) {
        String str2 = (String) a().get(str);
        return str2 == null ? "" : str2;
    }

    @Nullable
    public abstract Integer getCode();

    public abstract EncodedPayload getEncodedPayload();

    public abstract long getEventMillis();

    @Nullable
    public abstract byte[] getExperimentIdsClear();

    @Nullable
    public abstract byte[] getExperimentIdsEncrypted();

    public final int getInteger(String str) {
        String str2 = (String) a().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final long getLong(String str) {
        String str2 = (String) a().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    public final Map<String, String> getMetadata() {
        return DesugarCollections.unmodifiableMap(a());
    }

    public final String getOrDefault(String str, String str2) {
        String str3 = (String) a().get(str);
        return str3 == null ? str2 : str3;
    }

    @Deprecated
    public byte[] getPayload() {
        return getEncodedPayload().getBytes();
    }

    @Nullable
    public abstract Integer getProductId();

    @Nullable
    public abstract String getPseudonymousId();

    public abstract String getTransportName();

    public abstract long getUptimeMillis();

    public Builder toBuilder() {
        return new AutoValue_EventInternal.Builder().setTransportName(getTransportName()).setCode(getCode()).setProductId(getProductId()).setPseudonymousId(getPseudonymousId()).setExperimentIdsClear(getExperimentIdsClear()).setExperimentIdsEncrypted(getExperimentIdsEncrypted()).setEncodedPayload(getEncodedPayload()).setEventMillis(getEventMillis()).setUptimeMillis(getUptimeMillis()).b(new HashMap(a()));
    }
}
