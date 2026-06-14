package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f22743b;

    public e(boolean z10, String str) {
        this.f22742a = str;
        this.f22743b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == e.class) {
            e eVar = (e) obj;
            if (TextUtils.equals(this.f22742a, eVar.f22742a) && this.f22743b == eVar.f22743b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f22742a;
        return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.f22743b ? 1231 : 1237);
    }
}
