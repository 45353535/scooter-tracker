package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class Q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5141ha f76274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f76275b;

    public Q1() {
        this(new C5141ha());
    }

    public final synchronized long a(Context context) {
        String strA;
        try {
            this.f76274a.getClass();
            strA = Qa.a(FileUtils.getFileFromAppStorage(context, "metrica_service_settings.dat"));
        } catch (Throwable unused) {
        }
        return !TextUtils.isEmpty(strA) ? new JSONObject(strA).optLong(POBCTAOverlayData.KEY_CTA_DELAY) : 0L;
    }

    public final void b(Context context) {
        synchronized (this) {
        }
        if (this.f76275b) {
            return;
        }
        long jA = a(context);
        if (jA > 0) {
            try {
                Thread.sleep(jA);
            } catch (Throwable unused) {
            }
        }
        this.f76275b = true;
    }

    public Q1(C5141ha c5141ha) {
        this.f76275b = false;
        this.f76274a = c5141ha;
    }
}
