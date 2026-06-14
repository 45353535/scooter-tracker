package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
final class AutoValue_SchedulerConfig_ConfigValue extends SchedulerConfig.ConfigValue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f24466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f24467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f24468c;

    static final class Builder extends SchedulerConfig.ConfigValue.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f24469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f24470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Set f24471c;

        Builder() {
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public SchedulerConfig.ConfigValue build() {
            String str = "";
            if (this.f24469a == null) {
                str = " delta";
            }
            if (this.f24470b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f24471c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new AutoValue_SchedulerConfig_ConfigValue(this.f24469a.longValue(), this.f24470b.longValue(), this.f24471c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public SchedulerConfig.ConfigValue.Builder setDelta(long j10) {
            this.f24469a = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public SchedulerConfig.ConfigValue.Builder setFlags(Set<SchedulerConfig.Flag> set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f24471c = set;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public SchedulerConfig.ConfigValue.Builder setMaxAllowedDelay(long j10) {
            this.f24470b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    long a() {
        return this.f24466a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    Set b() {
        return this.f24468c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    long c() {
        return this.f24467b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SchedulerConfig.ConfigValue) {
            SchedulerConfig.ConfigValue configValue = (SchedulerConfig.ConfigValue) obj;
            if (this.f24466a == configValue.a() && this.f24467b == configValue.c() && this.f24468c.equals(configValue.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f24466a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f24467b;
        return ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f24468c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f24466a + ", maxAllowedDelay=" + this.f24467b + ", flags=" + this.f24468c + "}";
    }

    private AutoValue_SchedulerConfig_ConfigValue(long j10, long j11, Set set) {
        this.f24466a = j10;
        this.f24467b = j11;
        this.f24468c = set;
    }
}
