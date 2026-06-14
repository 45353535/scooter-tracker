package com.startapp.sdk.adsbase.remoteconfig;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.startapp.json.TypeInfo;
import com.startapp.json.TypeParser;
import com.startapp.sdk.internal.vi;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class HttpClientConfig implements Serializable {
    private static final long serialVersionUID = -8600520052388289445L;

    @Nullable
    private String headersFormat;

    @Nullable
    @TypeInfo(complex = true, parser = MapIntTimeoutParser.class)
    private Map<Integer, TimeoutConfig> timeout;
    private boolean compressionEnabled = false;
    private boolean disableSendAdvertisingId = false;

    @Nullable
    @TypeInfo(complex = true)
    private ComponentInfoEventConfig infoEvents = null;

    @Nullable
    @TypeInfo(type = HashSet.class)
    private Set<String> traceHeaders = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("server-timing", "siosid")));

    @Keep
    public static class MapIntTimeoutParser implements TypeParser<Map<Integer, TimeoutConfig>> {
        /* JADX WARN: Removed duplicated region for block: B:28:0x0038 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0016 A[SYNTHETIC] */
        @Override // com.startapp.json.TypeParser
        @androidx.annotation.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.util.Map<java.lang.Integer, com.startapp.sdk.adsbase.remoteconfig.TimeoutConfig> parse(@androidx.annotation.NonNull java.lang.Class<java.util.Map<java.lang.Integer, com.startapp.sdk.adsbase.remoteconfig.TimeoutConfig>> r7, @androidx.annotation.Nullable java.lang.Object r8) {
            /*
                r6 = this;
                com.startapp.sdk.adsbase.remoteconfig.TimeoutConfig$Parser r7 = new com.startapp.sdk.adsbase.remoteconfig.TimeoutConfig$Parser
                r7.<init>()
                boolean r0 = r8 instanceof org.json.JSONObject
                java.lang.Class<com.startapp.sdk.adsbase.remoteconfig.TimeoutConfig> r1 = com.startapp.sdk.adsbase.remoteconfig.TimeoutConfig.class
                if (r0 == 0) goto L41
                org.json.JSONObject r8 = (org.json.JSONObject) r8
                java.util.Iterator r0 = r8.keys()
                java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                r2.<init>()
            L16:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L40
                java.lang.Object r3 = r0.next()
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r4 = r8.opt(r3)
                com.startapp.sdk.adsbase.remoteconfig.TimeoutConfig r4 = r7.parse(r1, r4)
                if (r4 == 0) goto L16
                java.util.WeakHashMap r5 = com.startapp.sdk.internal.vi.f65408a
                if (r3 == 0) goto L35
                int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L35
                goto L36
            L35:
                r3 = 0
            L36:
                if (r3 == 0) goto L16
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2.put(r3, r4)
                goto L16
            L40:
                return r2
            L41:
                com.startapp.sdk.adsbase.remoteconfig.TimeoutConfig r7 = r7.parse(r1, r8)
                if (r7 == 0) goto L51
                r8 = -1
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                java.util.Map r7 = java.util.Collections.singletonMap(r8, r7)
                return r7
            L51:
                r7 = 0
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig.MapIntTimeoutParser.parse(java.lang.Class, java.lang.Object):java.util.Map");
        }
    }

    public final void a(boolean z10) {
        this.compressionEnabled = z10;
    }

    public final void b(boolean z10) {
        this.disableSendAdvertisingId = z10;
    }

    public final TimeoutConfig c() {
        Map<Integer, TimeoutConfig> map = this.timeout;
        if (map != null) {
            return map.get(-1);
        }
        return null;
    }

    public final Set d() {
        return this.traceHeaders;
    }

    public final boolean e() {
        return this.compressionEnabled;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            HttpClientConfig httpClientConfig = (HttpClientConfig) obj;
            if (this.compressionEnabled == httpClientConfig.compressionEnabled && this.disableSendAdvertisingId == httpClientConfig.disableSendAdvertisingId && vi.a(this.timeout, httpClientConfig.timeout) && vi.a((Object) this.infoEvents, (Object) httpClientConfig.infoEvents) && vi.a(this.traceHeaders, httpClientConfig.traceHeaders) && vi.a((Object) this.headersFormat, (Object) httpClientConfig.headersFormat)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.disableSendAdvertisingId;
    }

    public final int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.compressionEnabled), Boolean.valueOf(this.disableSendAdvertisingId), this.timeout, this.infoEvents, this.traceHeaders, this.headersFormat};
        WeakHashMap weakHashMap = vi.f65408a;
        return Arrays.deepHashCode(objArr);
    }

    public final TimeoutConfig a(int i10) {
        Map<Integer, TimeoutConfig> map;
        if (i10 != 0 && (map = this.timeout) != null) {
            for (Map.Entry<Integer, TimeoutConfig> entry : map.entrySet()) {
                if (((entry.getKey() != null ? entry.getKey().intValue() : 0) & i10) == i10) {
                    return entry.getValue();
                }
            }
        }
        return null;
    }

    public final ComponentInfoEventConfig b() {
        return this.infoEvents;
    }

    public final String a() {
        return this.headersFormat;
    }
}
