package com.ironsource;

import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.kc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4400kc {

    /* JADX INFO: renamed from: com.ironsource.kc$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f43468a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f43469b = "SDKPluginType";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final String f43470c = "sessionid";

        private a() {
        }
    }

    @NotNull
    public final Map<String, String> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String pluginType = ConfigFile.getConfigFile().getPluginType();
        if (pluginType != null) {
            linkedHashMap.put(a.f43469b, pluginType);
        }
        String strD = IronSourceUtils.d();
        if (strD != null) {
            linkedHashMap.put("sessionid", strD);
        }
        return linkedHashMap;
    }
}
