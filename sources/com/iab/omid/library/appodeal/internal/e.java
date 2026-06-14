package com.iab.omid.library.appodeal.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.appodeal.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes9.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.appodeal.weakreference.a f34394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f34396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f34397d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f34394a = new com.iab.omid.library.appodeal.weakreference.a(view);
        this.f34395b = view.getClass().getCanonicalName();
        this.f34396c = friendlyObstructionPurpose;
        this.f34397d = str;
    }

    public String a() {
        return this.f34397d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f34396c;
    }

    public com.iab.omid.library.appodeal.weakreference.a c() {
        return this.f34394a;
    }

    public String d() {
        return this.f34395b;
    }
}
