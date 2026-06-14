package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import androidx.annotation.RequiresApi;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AutoValue_SchedulerConfig_ConfigValue;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.auto.value.AutoValue;
import com.vungle.ads.internal.signals.SignalManager;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
@AutoValue
public abstract class SchedulerConfig {

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Clock f24475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map f24476b = new HashMap();

        public Builder addConfig(Priority priority, ConfigValue configValue) {
            this.f24476b.put(priority, configValue);
            return this;
        }

        public SchedulerConfig build() {
            if (this.f24475a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f24476b.keySet().size() < Priority.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map map = this.f24476b;
            this.f24476b = new HashMap();
            return SchedulerConfig.b(this.f24475a, map);
        }

        public Builder setClock(Clock clock) {
            this.f24475a = clock;
            return this;
        }
    }

    @AutoValue
    public static abstract class ConfigValue {

        @AutoValue.Builder
        public static abstract class Builder {
            public abstract ConfigValue build();

            public abstract Builder setDelta(long j10);

            public abstract Builder setFlags(Set<Flag> set);

            public abstract Builder setMaxAllowedDelay(long j10);
        }

        public static Builder builder() {
            return new AutoValue_SchedulerConfig_ConfigValue.Builder().setFlags(Collections.EMPTY_SET);
        }

        abstract long a();

        abstract Set b();

        abstract long c();
    }

    public enum Flag {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i10, long j10) {
        return (long) (Math.pow(3.0d, i10 - 1) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * ((long) r7))));
    }

    static SchedulerConfig b(Clock clock, Map map) {
        return new AutoValue_SchedulerConfig(clock, map);
    }

    public static Builder builder() {
        return new Builder();
    }

    private static Set e(Object... objArr) {
        return DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    private void f(JobInfo.Builder builder, Set set) {
        if (set.contains(Flag.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(Flag.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(Flag.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public static SchedulerConfig getDefault(Clock clock) {
        return builder().addConfig(Priority.DEFAULT, ConfigValue.builder().setDelta(30000L).setMaxAllowedDelay(SignalManager.TWENTY_FOUR_HOURS_MILLIS).build()).addConfig(Priority.HIGHEST, ConfigValue.builder().setDelta(1000L).setMaxAllowedDelay(SignalManager.TWENTY_FOUR_HOURS_MILLIS).build()).addConfig(Priority.VERY_LOW, ConfigValue.builder().setDelta(SignalManager.TWENTY_FOUR_HOURS_MILLIS).setMaxAllowedDelay(SignalManager.TWENTY_FOUR_HOURS_MILLIS).setFlags(e(Flag.DEVICE_IDLE)).build()).setClock(clock).build();
    }

    abstract Clock c();

    @RequiresApi(api = 21)
    public JobInfo.Builder configureJob(JobInfo.Builder builder, Priority priority, long j10, int i10) {
        builder.setMinimumLatency(getScheduleDelay(priority, j10, i10));
        f(builder, ((ConfigValue) d().get(priority)).b());
        return builder;
    }

    abstract Map d();

    public Set<Flag> getFlags(Priority priority) {
        return ((ConfigValue) d().get(priority)).b();
    }

    public long getScheduleDelay(Priority priority, long j10, int i10) {
        long time = j10 - c().getTime();
        ConfigValue configValue = (ConfigValue) d().get(priority);
        return Math.min(Math.max(a(i10, configValue.a()), time), configValue.c());
    }
}
