package com.inmobi.media;

import android.os.Debug;
import com.inmobi.media.core.config.models.CrashConfig;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.hf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3760hf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CrashConfig f38713a;

    static {
        C3774i4 c3774i4 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(CrashConfig.class, "clazz");
        f38713a = (CrashConfig) Y3.f38021a.a(CrashConfig.class);
        System.currentTimeMillis();
    }

    public static void a(JSONObject payload, boolean z10, boolean z11, long j10) {
        int i10;
        int i11;
        long j11;
        long j12;
        long[] jArr;
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (f38713a.getCrashConfig().getReportOOMInfo() && z10) {
            X4 crashType = z11 ? W4.f37930d : U4.f37820d;
            Intrinsics.checkNotNullParameter(crashType, "type");
            Ea eaA = S9.a();
            if (eaA != null) {
                String key = crashType.f37987c;
                Intrinsics.checkNotNullParameter(key, "key");
                eaA.a(crashType.f37987c, eaA.f36783a.getInt(key, 0) + 1, true);
            }
            Intrinsics.checkNotNullParameter(crashType, "crashType");
            Ea eaA2 = S9.a();
            if (eaA2 != null) {
                String key2 = crashType.f37985a;
                Intrinsics.checkNotNullParameter(key2, "key");
                long j13 = eaA2.f36783a.getLong(key2, 0L);
                String str = crashType.f37986b;
                if (j13 == 0) {
                    eaA2.a(str, j10, true);
                } else {
                    eaA2.a(str, j10 - j13, true);
                }
            }
            if (z11) {
                W4 crashType2 = W4.f37930d;
                Intrinsics.checkNotNullParameter(crashType2, "type");
                Ea eaA3 = S9.a();
                if (eaA3 != null) {
                    String key3 = crashType2.f37987c;
                    Intrinsics.checkNotNullParameter(key3, "key");
                    i10 = eaA3.f36783a.getInt(key3, 0);
                } else {
                    i10 = 0;
                }
                U4 crashType3 = U4.f37820d;
                Intrinsics.checkNotNullParameter(crashType3, "type");
                Ea eaA4 = S9.a();
                if (eaA4 != null) {
                    String key4 = crashType3.f37987c;
                    Intrinsics.checkNotNullParameter(key4, "key");
                    i11 = eaA4.f36783a.getInt(key4, 0);
                } else {
                    i11 = 0;
                }
                int i12 = i10 + i11;
                float f10 = i12 > 0 ? (i10 * 100.0f) / i12 : 0.0f;
                payload.put("inmobiOOMCount", i10);
                payload.put("appOOMCount", i11);
                Intrinsics.checkNotNullParameter(crashType3, "crashType");
                Ea eaA5 = S9.a();
                if (eaA5 != null) {
                    String key5 = crashType3.f37986b;
                    Intrinsics.checkNotNullParameter(key5, "key");
                    j11 = eaA5.f36783a.getLong(key5, 0L);
                } else {
                    j11 = 0;
                }
                payload.put("appOomCrashInterval", j11);
                Intrinsics.checkNotNullParameter(crashType2, "crashType");
                Ea eaA6 = S9.a();
                if (eaA6 != null) {
                    String key6 = crashType2.f37986b;
                    Intrinsics.checkNotNullParameter(key6, "key");
                    j12 = eaA6.f36783a.getLong(key6, 0L);
                } else {
                    j12 = 0;
                }
                payload.put("inmOOMCrashInterval", j12);
                payload.put("oomRatioInMobiToApp", Float.valueOf(f10));
                C4148x5.f39893a.getClass();
                if (C4148x5.w()) {
                    long jLongValue = 0;
                    long jLongValue2 = 0;
                    for (Map.Entry<String, String> entry : Debug.getRuntimeStats().entrySet()) {
                        String key7 = entry.getKey();
                        String value = entry.getValue();
                        if (Intrinsics.areEqual(key7, "art.gc.blocking-gc-count")) {
                            Intrinsics.checkNotNull(value);
                            Long lX = StringsKt.x(value);
                            jLongValue = lX != null ? lX.longValue() : 0L;
                        } else if (Intrinsics.areEqual(key7, "art.gc.gc-count")) {
                            Intrinsics.checkNotNull(value);
                            Long lX2 = StringsKt.x(value);
                            jLongValue2 = lX2 != null ? lX2.longValue() : 0L;
                        }
                    }
                    jArr = new long[]{jLongValue, jLongValue2};
                } else {
                    jArr = null;
                }
                if (jArr != null) {
                    payload.put("blockingGcCount", jArr[0]);
                    payload.put("gcCount", jArr[1]);
                }
            }
        }
    }
}
