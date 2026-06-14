package com.iab.omid.library.vungle.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.vungle.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes9.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.vungle.weakreference.a f36382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f36384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f36385d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f36382a = new com.iab.omid.library.vungle.weakreference.a(view);
        this.f36383b = view.getClass().getCanonicalName();
        this.f36384c = friendlyObstructionPurpose;
        this.f36385d = str;
    }

    public String a() {
        return this.f36385d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f36384c;
    }

    public com.iab.omid.library.vungle.weakreference.a c() {
        return this.f36382a;
    }

    public String d() {
        return this.f36383b;
    }
}
