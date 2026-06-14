package com.google.android.datatransport.runtime;

import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.EventInternal;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
final class AutoValue_EventInternal extends EventInternal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f24306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EncodedPayload f24307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f24308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f24309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f24310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Integer f24311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f24312h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final byte[] f24313i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final byte[] f24314j;

    static final class Builder extends EventInternal.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f24315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f24316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private EncodedPayload f24317c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f24318d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Long f24319e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map f24320f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Integer f24321g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f24322h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private byte[] f24323i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private byte[] f24324j;

        Builder() {
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        protected Map a() {
            Map map = this.f24320f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        protected EventInternal.Builder b(Map map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f24320f = map;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal build() {
            String str = "";
            if (this.f24315a == null) {
                str = " transportName";
            }
            if (this.f24317c == null) {
                str = str + " encodedPayload";
            }
            if (this.f24318d == null) {
                str = str + " eventMillis";
            }
            if (this.f24319e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f24320f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new AutoValue_EventInternal(this.f24315a, this.f24316b, this.f24317c, this.f24318d.longValue(), this.f24319e.longValue(), this.f24320f, this.f24321g, this.f24322h, this.f24323i, this.f24324j);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setCode(Integer num) {
            this.f24316b = num;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setEncodedPayload(EncodedPayload encodedPayload) {
            if (encodedPayload == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f24317c = encodedPayload;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setEventMillis(long j10) {
            this.f24318d = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setExperimentIdsClear(byte[] bArr) {
            this.f24323i = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setExperimentIdsEncrypted(byte[] bArr) {
            this.f24324j = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setProductId(Integer num) {
            this.f24321g = num;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setPseudonymousId(String str) {
            this.f24322h = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setTransportName(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f24315a = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setUptimeMillis(long j10) {
            this.f24319e = Long.valueOf(j10);
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    protected Map a() {
        return this.f24310f;
    }

    public boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof EventInternal) {
            EventInternal eventInternal = (EventInternal) obj;
            if (this.f24305a.equals(eventInternal.getTransportName()) && ((num = this.f24306b) != null ? num.equals(eventInternal.getCode()) : eventInternal.getCode() == null) && this.f24307c.equals(eventInternal.getEncodedPayload()) && this.f24308d == eventInternal.getEventMillis() && this.f24309e == eventInternal.getUptimeMillis() && this.f24310f.equals(eventInternal.a()) && ((num2 = this.f24311g) != null ? num2.equals(eventInternal.getProductId()) : eventInternal.getProductId() == null) && ((str = this.f24312h) != null ? str.equals(eventInternal.getPseudonymousId()) : eventInternal.getPseudonymousId() == null)) {
                boolean z10 = eventInternal instanceof AutoValue_EventInternal;
                if (Arrays.equals(this.f24313i, z10 ? ((AutoValue_EventInternal) eventInternal).f24313i : eventInternal.getExperimentIdsClear())) {
                    if (Arrays.equals(this.f24314j, z10 ? ((AutoValue_EventInternal) eventInternal).f24314j : eventInternal.getExperimentIdsEncrypted())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    @Nullable
    public Integer getCode() {
        return this.f24306b;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public EncodedPayload getEncodedPayload() {
        return this.f24307c;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public long getEventMillis() {
        return this.f24308d;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    @Nullable
    public byte[] getExperimentIdsClear() {
        return this.f24313i;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    @Nullable
    public byte[] getExperimentIdsEncrypted() {
        return this.f24314j;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    @Nullable
    public Integer getProductId() {
        return this.f24311g;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    @Nullable
    public String getPseudonymousId() {
        return this.f24312h;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public String getTransportName() {
        return this.f24305a;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public long getUptimeMillis() {
        return this.f24309e;
    }

    public int hashCode() {
        int iHashCode = (this.f24305a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f24306b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f24307c.hashCode()) * 1000003;
        long j10 = this.f24308d;
        int i10 = (iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f24309e;
        int iHashCode3 = (((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f24310f.hashCode()) * 1000003;
        Integer num2 = this.f24311g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f24312h;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f24313i)) * 1000003) ^ Arrays.hashCode(this.f24314j);
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f24305a + ", code=" + this.f24306b + ", encodedPayload=" + this.f24307c + ", eventMillis=" + this.f24308d + ", uptimeMillis=" + this.f24309e + ", autoMetadata=" + this.f24310f + ", productId=" + this.f24311g + ", pseudonymousId=" + this.f24312h + ", experimentIdsClear=" + Arrays.toString(this.f24313i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f24314j) + "}";
    }

    private AutoValue_EventInternal(String str, Integer num, EncodedPayload encodedPayload, long j10, long j11, Map map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f24305a = str;
        this.f24306b = num;
        this.f24307c = encodedPayload;
        this.f24308d = j10;
        this.f24309e = j11;
        this.f24310f = map;
        this.f24311g = num2;
        this.f24312h = str2;
        this.f24313i = bArr;
        this.f24314j = bArr2;
    }
}
