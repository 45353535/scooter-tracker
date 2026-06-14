package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class iq {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private d f2609;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f2610;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private long f2611;

    public static class d {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private int f2612;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private String f2613;

        public d(int i10, String str) {
            this.f2612 = i10;
            this.f2613 = str;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final int m6805() {
            return this.f2612;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final String m6806() {
            return this.f2613;
        }
    }

    public iq(String str, int i10, String str2, long j10) {
        this.f2610 = str;
        this.f2611 = j10;
        this.f2609 = new d(i10, str2);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final JSONObject m6801() throws JSONException {
        return !TextUtils.isEmpty(this.f2610) ? new JSONObject(this.f2610) : new JSONObject();
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final d m6802() {
        return this.f2609;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final long m6803() {
        return this.f2611;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m6804() {
        return this.f2610;
    }
}
