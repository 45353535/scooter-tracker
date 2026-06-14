package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* JADX INFO: loaded from: classes12.dex */
public final class T0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserProfile f76475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5409s1 f76476b;

    public T0(C5409s1 c5409s1, UserProfile userProfile) {
        this.f76476b = c5409s1;
        this.f76475a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5409s1.a(this.f76476b).reportUserProfile(this.f76475a);
    }
}
