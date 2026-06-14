package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.model.AdPreferences;

/* JADX INFO: loaded from: classes11.dex */
public final class s implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f65231a = System.currentTimeMillis();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdPreferences.Placement f65232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f65233c;

    public s(AdPreferences.Placement placement, String str) {
        this.f65232b = placement;
        this.f65233c = str == null ? "" : str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j10 = this.f65231a - ((s) obj).f65231a;
        if (j10 > 0) {
            return 1;
        }
        return j10 == 0 ? 0 : -1;
    }
}
