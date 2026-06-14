package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class PreloadInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f74907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f74908b;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f74909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HashMap f74910b;

        /* synthetic */ Builder(String str, int i10) {
            this(str);
        }

        public PreloadInfo build() {
            return new PreloadInfo(this, 0);
        }

        public Builder setAdditionalParams(String str, String str2) {
            if (str != null && str2 != null) {
                this.f74910b.put(str, str2);
            }
            return this;
        }

        private Builder(String str) {
            this.f74909a = str;
            this.f74910b = new HashMap();
        }
    }

    /* synthetic */ PreloadInfo(Builder builder, int i10) {
        this(builder);
    }

    public static Builder newBuilder(String str) {
        return new Builder(str, 0);
    }

    public Map<String, String> getAdditionalParams() {
        return this.f74908b;
    }

    public String getTrackingId() {
        return this.f74907a;
    }

    private PreloadInfo(Builder builder) {
        this.f74907a = builder.f74909a;
        this.f74908b = CollectionUtils.unmodifiableMapCopy(builder.f74910b);
    }
}
