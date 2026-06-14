package com.apm.insight;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements ICrashCallback, IOOMCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IOOMCallback f7612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ICrashCallback f7613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f7614c;

    public b(String str, ICrashCallback iCrashCallback) {
        this.f7614c = str;
        this.f7613b = iCrashCallback;
    }

    public final void a(@NonNull CrashType crashType, @Nullable Throwable th2, @Nullable Thread thread, long j10, JSONArray jSONArray) {
        CrashType crashType2;
        Throwable th3;
        Thread thread2;
        long j11;
        if (this.f7612a == null || jSONArray == null) {
            return;
        }
        int i10 = 0;
        while (i10 < jSONArray.length()) {
            if (TextUtils.equals(a.a(jSONArray.optJSONObject(i10), POBCTAOverlayData.KEY_CTA_HEADER, "aid"), this.f7614c)) {
                crashType2 = crashType;
                th3 = th2;
                thread2 = thread;
                j11 = j10;
                this.f7612a.onCrash(crashType2, th3, thread2, j11);
            } else {
                crashType2 = crashType;
                th3 = th2;
                thread2 = thread;
                j11 = j10;
            }
            i10++;
            crashType = crashType2;
            th2 = th3;
            thread = thread2;
            j10 = j11;
        }
    }

    @Override // com.apm.insight.ICrashCallback
    public final void onCrash(@NonNull CrashType crashType, @Nullable String str, @Nullable Thread thread) {
    }

    @Override // com.apm.insight.IOOMCallback
    public final void onCrash(@NonNull CrashType crashType, @Nullable Throwable th2, @Nullable Thread thread, long j10) {
    }

    public b(String str, IOOMCallback iOOMCallback) {
        this.f7614c = str;
        this.f7612a = iOOMCallback;
    }

    public final void a(@NonNull CrashType crashType, @Nullable String str, @Nullable Thread thread, JSONArray jSONArray) {
        if (this.f7613b == null || jSONArray == null) {
            return;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            if (TextUtils.equals(a.a(jSONArray.optJSONObject(i10), POBCTAOverlayData.KEY_CTA_HEADER, "aid"), this.f7614c)) {
                this.f7613b.onCrash(crashType, str, thread);
            }
        }
    }

    public final void a(@NonNull CrashType crashType, @Nullable String str, @Nullable String str2, String str3) {
        d dVarA;
        if (this.f7613b == null || (dVarA = d.a(this.f7614c)) == null || !dVarA.a(str3, str2)) {
            return;
        }
        this.f7613b.onCrash(crashType, str, null);
    }
}
