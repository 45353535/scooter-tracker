package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* JADX INFO: loaded from: classes12.dex */
public final class Sh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserProfile f76445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5252li f76446b;

    public Sh(C5252li c5252li, UserProfile userProfile) {
        this.f76446b = c5252li;
        this.f76445a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5252li c5252li = this.f76446b;
        C5252li.a(c5252li.f77709a, c5252li.f77712d, c5252li.f77713e).reportUserProfile(this.f76445a);
    }
}
