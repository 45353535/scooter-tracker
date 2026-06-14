package com.iab.omid.library.ironsrc.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.ironsrc.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes9.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.weakreference.a f35310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f35311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f35312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f35313d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f35310a = new com.iab.omid.library.ironsrc.weakreference.a(view);
        this.f35311b = view.getClass().getCanonicalName();
        this.f35312c = friendlyObstructionPurpose;
        this.f35313d = str;
    }

    public String a() {
        return this.f35313d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f35312c;
    }

    public com.iab.omid.library.ironsrc.weakreference.a c() {
        return this.f35310a;
    }

    public String d() {
        return this.f35311b;
    }
}
