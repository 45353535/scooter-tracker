package com.iab.omid.library.applovin.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes9.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.applovin.weakreference.a f34258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f34260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f34261d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f34258a = new com.iab.omid.library.applovin.weakreference.a(view);
        this.f34259b = view.getClass().getCanonicalName();
        this.f34260c = friendlyObstructionPurpose;
        this.f34261d = str;
    }

    public String a() {
        return this.f34261d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f34260c;
    }

    public com.iab.omid.library.applovin.weakreference.a c() {
        return this.f34258a;
    }

    public String d() {
        return this.f34259b;
    }
}
