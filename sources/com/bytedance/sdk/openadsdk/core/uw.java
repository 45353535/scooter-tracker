package com.bytedance.sdk.openadsdk.core;

import android.os.Build;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.taurusx.tax.f.z;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class uw {
    private static final AtomicInteger lnr;
    private static final AtomicInteger mml;
    private static final AtomicInteger qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static final AtomicInteger f17545ud;

    static {
        AtomicInteger atomicInteger = new AtomicInteger();
        qdl = atomicInteger;
        AtomicInteger atomicInteger2 = new AtomicInteger();
        f17545ud = atomicInteger2;
        AtomicInteger atomicInteger3 = new AtomicInteger();
        lnr = atomicInteger3;
        AtomicInteger atomicInteger4 = new AtomicInteger();
        mml = atomicInteger4;
        atomicInteger.addAndGet(com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("encrypt_statistics_file", "encrypt_success_count", 0));
        atomicInteger2.addAndGet(com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("encrypt_statistics_file", "encrypt_fail_count", 0));
        atomicInteger3.addAndGet(com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("encrypt_statistics_file", "decrypt_success_count", 0));
        atomicInteger4.addAndGet(com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("encrypt_statistics_file", "decrypt_fail_count", 0));
    }

    public static void qdl() {
        try {
            long jQdl = com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("encrypt_statistics_file", "upload_time_key", 0L);
            if (jQdl <= 0 || System.currentTimeMillis() - jQdl < SignalManager.TWENTY_FOUR_HOURS_MILLIS) {
                if (jQdl <= 0 || jQdl > System.currentTimeMillis()) {
                    com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
                    return;
                }
                return;
            }
            ud();
            synchronized (uw.class) {
                qdl.set(0);
                f17545ud.set(0);
                lnr.set(0);
                mml.set(0);
                com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("encrypt_statistics_file");
                com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
            }
        } catch (Throwable unused) {
        }
    }

    private static void ud() {
        final int i10 = qdl.get();
        final int i11 = f17545ud.get();
        final int i12 = lnr.get();
        final int i13 = mml.get();
        com.bytedance.sdk.openadsdk.bjy.lnr.qdl("crypt_v4_statistics", false, new com.bytedance.sdk.openadsdk.bjy.ud() { // from class: com.bytedance.sdk.openadsdk.core.uw.1
            @Override // com.bytedance.sdk.openadsdk.bjy.ud
            @Nullable
            public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("encrypt_success_count", i10);
                    jSONObject.put("encrypt_fail_count", i11);
                    jSONObject.put("decrypt_success_count", i12);
                    jSONObject.put("decrypt_fail_count", i13);
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.bjy.qdl.mml.ud().qdl("crypt_v4_statistics").ud(jSONObject.toString());
            }
        });
    }

    public static synchronized void ud(boolean z10) {
        if (z10) {
            com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("encrypt_statistics_file", "encrypt_success_count", Integer.valueOf(qdl.incrementAndGet()));
        } else {
            com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("encrypt_statistics_file", "encrypt_fail_count", Integer.valueOf(f17545ud.incrementAndGet()));
        }
    }

    public static void qdl(final int i10, final PangleEncryptConstant.CryptDataScene cryptDataScene, final int i11) {
        com.bytedance.sdk.openadsdk.bjy.lnr.qdl("crypt_v4_fail", false, new com.bytedance.sdk.openadsdk.bjy.ud() { // from class: com.bytedance.sdk.openadsdk.core.uw.2
            @Override // com.bytedance.sdk.openadsdk.bjy.ud
            @Nullable
            public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crypt", i10);
                    jSONObject.put("scene", cryptDataScene.value());
                    jSONObject.put("reason", i11);
                    if (i11 == 6) {
                        jSONObject.put("model", Build.MODEL);
                        jSONObject.put(z.f66061c, Build.MANUFACTURER);
                    }
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.bjy.qdl.mml.ud().qdl("crypt_v4_fail").ud(jSONObject.toString());
            }
        });
    }

    public static synchronized void qdl(boolean z10) {
        if (z10) {
            com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("encrypt_statistics_file", "decrypt_success_count", Integer.valueOf(lnr.incrementAndGet()));
        } else {
            com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("encrypt_statistics_file", "decrypt_fail_count", Integer.valueOf(lnr.incrementAndGet()));
        }
    }

    public static void qdl(JSONObject jSONObject) {
        ud(jSONObject != null && jSONObject.optInt("cypher") == 4);
    }
}
