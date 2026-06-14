package com.inmobi.media;

import android.content.Context;
import com.ironsource.C4240b4;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class W8 extends AbstractC3696f2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final W8 f37936c = new W8();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f37937d = new AtomicBoolean(true);

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        AtomicBoolean atomicBoolean = f37937d;
        jSONObject.put("a-audioBannerEnabled", String.valueOf(atomicBoolean.get()));
        if (atomicBoolean.get()) {
            long j10 = this.f38537a / 1000;
            if (j10 != 0) {
                jSONObject.put("a-lastAudioBannerPlayedTs", String.valueOf(j10));
            }
            int i10 = this.f38538b;
            if (i10 > 0) {
                jSONObject.put("a-audioBannerFreq", String.valueOf(i10));
            }
            Context context = Ji.f37157a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f36782b;
                Ea eaA = Da.a(context, "banner_audio_pref_file");
                Intrinsics.checkNotNullParameter("user_mute_count", C4240b4.i.W);
                int i11 = eaA.f36783a.getInt("user_mute_count", -1);
                if (i11 > 0) {
                    jSONObject.put("a-b-umc", String.valueOf(i11));
                }
            }
        }
        return jSONObject;
    }
}
