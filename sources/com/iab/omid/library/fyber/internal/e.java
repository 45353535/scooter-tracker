package com.iab.omid.library.fyber.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes9.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.fyber.weakreference.a f35034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f35035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f35036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f35037d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f35034a = new com.iab.omid.library.fyber.weakreference.a(view);
        this.f35035b = view.getClass().getCanonicalName();
        this.f35036c = friendlyObstructionPurpose;
        this.f35037d = str;
    }

    public String a() {
        return this.f35037d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f35036c;
    }

    public com.iab.omid.library.fyber.weakreference.a c() {
        return this.f35034a;
    }

    public String d() {
        return this.f35035b;
    }
}
