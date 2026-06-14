package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class ModuleEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f74889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f74890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f74891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f74892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Category f74893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f74894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f74895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f74896h;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f74897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f74898b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f74899c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f74900d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Category f74901e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private HashMap f74902f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private HashMap f74903g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private HashMap f74904h;

        /* synthetic */ Builder(int i10, int i11) {
            this(i10);
        }

        public ModuleEvent build() {
            return new ModuleEvent(this, 0);
        }

        public Builder withAttributes(@Nullable Map<String, Object> map) {
            if (map != null) {
                this.f74904h = new HashMap(map);
            }
            return this;
        }

        public Builder withCategory(Category category) {
            this.f74901e = category;
            return this;
        }

        public Builder withEnvironment(@Nullable Map<String, Object> map) {
            if (map != null) {
                this.f74902f = new HashMap(map);
            }
            return this;
        }

        public Builder withExtras(@Nullable Map<String, byte[]> map) {
            if (map != null) {
                this.f74903g = new HashMap(map);
            }
            return this;
        }

        public Builder withName(@Nullable String str) {
            this.f74898b = str;
            return this;
        }

        public Builder withServiceDataReporterType(int i10) {
            this.f74900d = i10;
            return this;
        }

        public Builder withValue(@Nullable String str) {
            this.f74899c = str;
            return this;
        }

        private Builder(int i10) {
            this.f74900d = 1;
            this.f74901e = Category.GENERAL;
            this.f74897a = i10;
        }
    }

    public enum Category {
        GENERAL,
        SYSTEM
    }

    /* synthetic */ ModuleEvent(Builder builder, int i10) {
        this(builder);
    }

    public static Builder newBuilder(int i10) {
        return new Builder(i10, 0);
    }

    @Nullable
    public Map<String, Object> getAttributes() {
        return CollectionUtils.getMapFromListOrNull(this.f74896h);
    }

    public Category getCategory() {
        return this.f74893e;
    }

    @Nullable
    public Map<String, Object> getEnvironment() {
        return CollectionUtils.getMapFromListOrNull(this.f74894f);
    }

    @Nullable
    public Map<String, byte[]> getExtras() {
        return CollectionUtils.getMapFromListOrNull(this.f74895g);
    }

    @Nullable
    public String getName() {
        return this.f74890b;
    }

    public int getServiceDataReporterType() {
        return this.f74892d;
    }

    public int getType() {
        return this.f74889a;
    }

    @Nullable
    public String getValue() {
        return this.f74891c;
    }

    @NonNull
    public String toString() {
        return "ModuleEvent{type=" + this.f74889a + ", name='" + this.f74890b + "', value='" + this.f74891c + "', serviceDataReporterType=" + this.f74892d + ", category=" + this.f74893e + ", environment=" + this.f74894f + ", extras=" + this.f74895g + ", attributes=" + this.f74896h + '}';
    }

    private ModuleEvent(Builder builder) {
        this.f74889a = builder.f74897a;
        this.f74890b = builder.f74898b;
        this.f74891c = builder.f74899c;
        this.f74892d = builder.f74900d;
        this.f74893e = builder.f74901e;
        this.f74894f = CollectionUtils.getListFromMap(builder.f74902f);
        this.f74895g = CollectionUtils.getListFromMap(builder.f74903g);
        this.f74896h = CollectionUtils.getListFromMap(builder.f74904h);
    }
}
