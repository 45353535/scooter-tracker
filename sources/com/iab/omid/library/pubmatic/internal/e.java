package com.iab.omid.library.pubmatic.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.pubmatic.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes9.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.pubmatic.weakreference.a f35721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f35722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f35723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f35724d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f35721a = new com.iab.omid.library.pubmatic.weakreference.a(view);
        this.f35722b = view.getClass().getCanonicalName();
        this.f35723c = friendlyObstructionPurpose;
        this.f35724d = str;
    }

    public String a() {
        return this.f35724d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f35723c;
    }

    public com.iab.omid.library.pubmatic.weakreference.a c() {
        return this.f35721a;
    }

    public String d() {
        return this.f35722b;
    }
}
