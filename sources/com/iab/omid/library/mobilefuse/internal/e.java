package com.iab.omid.library.mobilefuse.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.mobilefuse.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes9.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.mobilefuse.weakreference.a f35580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f35581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f35582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f35583d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f35580a = new com.iab.omid.library.mobilefuse.weakreference.a(view);
        this.f35581b = view.getClass().getCanonicalName();
        this.f35582c = friendlyObstructionPurpose;
        this.f35583d = str;
    }

    public String a() {
        return this.f35583d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f35582c;
    }

    public com.iab.omid.library.mobilefuse.weakreference.a c() {
        return this.f35580a;
    }

    public String d() {
        return this.f35581b;
    }
}
