package com.startapp.sdk.adsbase.apppresence;

import androidx.annotation.Nullable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class AppPresenceDetails implements Serializable {
    private static final long serialVersionUID = -6732887070965278910L;
    private int adAttempt;
    private int minAppVersion;
    private String packageName;

    @Nullable
    private String trackingUrl;
    private boolean isShown = true;
    private boolean appPresence = false;

    public AppPresenceDetails(int i10, int i11, String str, String str2) {
        this.trackingUrl = str;
        this.packageName = str2;
        this.adAttempt = i10;
        this.minAppVersion = i11;
    }

    public final void a(String str) {
        this.trackingUrl = str;
    }

    public final String b() {
        return this.packageName;
    }

    public final String c() {
        return this.trackingUrl;
    }

    public final boolean d() {
        return this.appPresence;
    }

    public final boolean e() {
        return this.isShown;
    }

    public final void a(boolean z10) {
        this.appPresence = z10;
    }

    public final void b(boolean z10) {
        this.isShown = z10;
    }

    public final int a() {
        return this.minAppVersion;
    }
}
