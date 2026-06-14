package com.iab.omid.library.taurusx.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.taurusx.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes9.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.taurusx.weakreference.a f36121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f36123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f36124d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f36121a = new com.iab.omid.library.taurusx.weakreference.a(view);
        this.f36122b = view.getClass().getCanonicalName();
        this.f36123c = friendlyObstructionPurpose;
        this.f36124d = str;
    }

    public String a() {
        return this.f36124d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f36123c;
    }

    public com.iab.omid.library.taurusx.weakreference.a c() {
        return this.f36121a;
    }

    public String d() {
        return this.f36122b;
    }
}
