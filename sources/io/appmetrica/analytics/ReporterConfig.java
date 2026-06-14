package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.C5131h0;
import io.appmetrica.analytics.impl.C5463u5;
import io.appmetrica.analytics.impl.Gn;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class ReporterConfig {

    @NonNull
    public final Map<String, Object> additionalConfig;

    @NonNull
    public final String apiKey;
    public final Map<String, String> appEnvironment;

    @Nullable
    public final Boolean dataSendingEnabled;

    @Nullable
    public final Integer dispatchPeriodSeconds;

    @Nullable
    public final Boolean logs;

    @Nullable
    public final Integer maxReportsCount;

    @Nullable
    public final Integer maxReportsInDatabaseCount;

    @Nullable
    public final Integer sessionTimeout;

    @Nullable
    public final String userProfileID;

    public static class Builder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final Gn f74911l = new Gn(new C5131h0());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C5463u5 f74912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f74913b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f74914c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Boolean f74915d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Boolean f74916e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Integer f74917f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f74918g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Integer f74919h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Integer f74920i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final HashMap f74921j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final HashMap f74922k;

        /* synthetic */ Builder(String str, int i10) {
            this(str);
        }

        @NonNull
        public ReporterConfig build() {
            return new ReporterConfig(this, 0);
        }

        @NonNull
        public Builder withAdditionalConfig(@NonNull String str, @Nullable Object obj) {
            this.f74922k.put(str, obj);
            return this;
        }

        @NonNull
        public Builder withAppEnvironmentValue(String str, String str2) {
            this.f74921j.put(str, str2);
            return this;
        }

        @NonNull
        public Builder withDataSendingEnabled(boolean z10) {
            this.f74916e = Boolean.valueOf(z10);
            return this;
        }

        @NonNull
        public Builder withDispatchPeriodSeconds(int i10) {
            this.f74919h = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public Builder withLogs() {
            this.f74915d = Boolean.TRUE;
            return this;
        }

        @NonNull
        public Builder withMaxReportsCount(int i10) {
            this.f74920i = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public Builder withMaxReportsInDatabaseCount(int i10) {
            this.f74917f = Integer.valueOf(this.f74912a.a(i10));
            return this;
        }

        @NonNull
        public Builder withSessionTimeout(int i10) {
            this.f74914c = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public Builder withUserProfileID(@Nullable String str) {
            this.f74918g = str;
            return this;
        }

        private Builder(String str) {
            this.f74921j = new HashMap();
            this.f74922k = new HashMap();
            f74911l.a(str);
            this.f74912a = new C5463u5(str);
            this.f74913b = str;
        }
    }

    /* synthetic */ ReporterConfig(Builder builder, int i10) {
        this(builder);
    }

    @NonNull
    public static Builder newConfigBuilder(@NonNull String str) {
        return new Builder(str, 0);
    }

    private ReporterConfig(Builder builder) {
        this.apiKey = builder.f74913b;
        this.sessionTimeout = builder.f74914c;
        this.logs = builder.f74915d;
        this.dataSendingEnabled = builder.f74916e;
        this.maxReportsInDatabaseCount = builder.f74917f;
        this.userProfileID = builder.f74918g;
        this.dispatchPeriodSeconds = builder.f74919h;
        this.maxReportsCount = builder.f74920i;
        this.appEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f74921j);
        this.additionalConfig = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f74922k);
    }
}
