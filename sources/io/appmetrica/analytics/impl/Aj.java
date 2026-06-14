package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* JADX INFO: loaded from: classes12.dex */
public final class Aj implements Xa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserProfile f75530a;

    public Aj(UserProfile userProfile) {
        this.f75530a = userProfile;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya2) {
        ya2.reportUserProfile(this.f75530a);
    }
}
