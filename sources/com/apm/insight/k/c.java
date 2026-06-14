package com.apm.insight.k;

import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ConcurrentLinkedQueue<c> f7895a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: com.apm.insight.k.c$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7896a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f7896a = iArr;
            try {
                iArr[CrashType.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7896a[CrashType.LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7896a[CrashType.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private JSONObject f7897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private JSONObject f7898b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CrashType f7899c;

        a(JSONObject jSONObject, CrashType crashType) {
            this.f7899c = crashType;
            if (crashType == CrashType.LAUNCH) {
                this.f7897a = ((JSONArray) jSONObject.opt("data")).optJSONObject(0);
            } else {
                this.f7897a = jSONObject;
            }
            this.f7898b = jSONObject.optJSONObject(POBCTAOverlayData.KEY_CTA_HEADER);
        }

        @Nullable
        public final String a() {
            return this.f7897a.optString("crash_thread_name", null);
        }

        public final long b() {
            return this.f7897a.optInt("app_start_time", -1);
        }

        @Nullable
        public final String c() {
            int i10 = AnonymousClass1.f7896a[this.f7899c.ordinal()];
            if (i10 == 1) {
                return this.f7897a.optString("data", null);
            }
            if (i10 == 2) {
                return this.f7897a.optString("stack", null);
            }
            if (i10 != 3) {
                return null;
            }
            return this.f7897a.optString("data", null);
        }
    }

    static void a(CrashType crashType, JSONObject jSONObject) {
        ConcurrentLinkedQueue<c> concurrentLinkedQueue = f7895a;
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return;
        }
        new a(jSONObject, crashType);
        while (!f7895a.isEmpty()) {
            f7895a.poll();
        }
        f7895a = null;
    }
}
