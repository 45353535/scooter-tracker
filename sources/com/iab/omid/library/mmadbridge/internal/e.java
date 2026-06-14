package com.iab.omid.library.mmadbridge.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes9.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.mmadbridge.weakreference.a f35445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f35446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f35447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f35448d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f35445a = new com.iab.omid.library.mmadbridge.weakreference.a(view);
        this.f35446b = view.getClass().getCanonicalName();
        this.f35447c = friendlyObstructionPurpose;
        this.f35448d = str;
    }

    public String a() {
        return this.f35448d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f35447c;
    }

    public com.iab.omid.library.mmadbridge.weakreference.a c() {
        return this.f35445a;
    }

    public String d() {
        return this.f35446b;
    }
}
