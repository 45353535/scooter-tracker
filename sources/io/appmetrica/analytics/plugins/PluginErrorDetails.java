package io.appmetrica.analytics.plugins;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class PluginErrorDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f78897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f78898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f78899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f78900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f78901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f78902f;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f78903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f78904b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f78905c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f78906d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f78907e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map f78908f;

        @NonNull
        public PluginErrorDetails build() {
            return new PluginErrorDetails(this.f78903a, this.f78904b, (List) WrapUtils.getOrDefault(this.f78905c, new ArrayList()), this.f78906d, this.f78907e, (Map) WrapUtils.getOrDefault(this.f78908f, new HashMap()), 0);
        }

        @NonNull
        public Builder withExceptionClass(@Nullable String str) {
            this.f78903a = str;
            return this;
        }

        @NonNull
        public Builder withMessage(@Nullable String str) {
            this.f78904b = str;
            return this;
        }

        @NonNull
        public Builder withPlatform(@Nullable String str) {
            this.f78906d = str;
            return this;
        }

        @NonNull
        public Builder withPluginEnvironment(@Nullable Map<String, String> map) {
            this.f78908f = map;
            return this;
        }

        @NonNull
        public Builder withStacktrace(@Nullable List<StackTraceItem> list) {
            this.f78905c = list;
            return this;
        }

        @NonNull
        public Builder withVirtualMachineVersion(@Nullable String str) {
            this.f78907e = str;
            return this;
        }
    }

    public static final class Platform {
        public static final String CORDOVA = "cordova";
        public static final String FLUTTER = "flutter";
        public static final String NATIVE = "native";
        public static final String REACT_NATIVE = "react_native";
        public static final String UNITY = "unity";
        public static final String XAMARIN = "xamarin";
    }

    /* synthetic */ PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map, int i10) {
        this(str, str2, list, str3, str4, map);
    }

    @Nullable
    public String getExceptionClass() {
        return this.f78897a;
    }

    @Nullable
    public String getMessage() {
        return this.f78898b;
    }

    @Nullable
    public String getPlatform() {
        return this.f78900d;
    }

    @NonNull
    public Map<String, String> getPluginEnvironment() {
        return this.f78902f;
    }

    @NonNull
    public List<StackTraceItem> getStacktrace() {
        return this.f78899c;
    }

    @Nullable
    public String getVirtualMachineVersion() {
        return this.f78901e;
    }

    private PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map) {
        this.f78897a = str;
        this.f78898b = str2;
        this.f78899c = new ArrayList(list);
        this.f78900d = str3;
        this.f78901e = str4;
        this.f78902f = CollectionUtils.getMapFromList(CollectionUtils.getListFromMap(map));
    }
}
