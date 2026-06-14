package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.time.Clock;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
final class AutoValue_SchedulerConfig extends SchedulerConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Clock f24464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f24465b;

    AutoValue_SchedulerConfig(Clock clock, Map map) {
        if (clock == null) {
            throw new NullPointerException("Null clock");
        }
        this.f24464a = clock;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f24465b = map;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    Clock c() {
        return this.f24464a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    Map d() {
        return this.f24465b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SchedulerConfig) {
            SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
            if (this.f24464a.equals(schedulerConfig.c()) && this.f24465b.equals(schedulerConfig.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f24464a.hashCode() ^ 1000003) * 1000003) ^ this.f24465b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f24464a + ", values=" + this.f24465b + "}";
    }
}
