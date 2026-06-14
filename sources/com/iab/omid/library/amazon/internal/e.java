package com.iab.omid.library.amazon.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.amazon.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes9.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.amazon.weakreference.a f34129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f34131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f34132d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f34129a = new com.iab.omid.library.amazon.weakreference.a(view);
        this.f34130b = view.getClass().getCanonicalName();
        this.f34131c = friendlyObstructionPurpose;
        this.f34132d = str;
    }

    public String a() {
        return this.f34132d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f34131c;
    }

    public com.iab.omid.library.amazon.weakreference.a c() {
        return this.f34129a;
    }

    public String d() {
        return this.f34130b;
    }
}
