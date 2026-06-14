package com.iab.omid.library.startio.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.startio.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes9.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.startio.weakreference.a f35991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f35992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f35993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f35994d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f35991a = new com.iab.omid.library.startio.weakreference.a(view);
        this.f35992b = view.getClass().getCanonicalName();
        this.f35993c = friendlyObstructionPurpose;
        this.f35994d = str;
    }

    public String a() {
        return this.f35994d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f35993c;
    }

    public com.iab.omid.library.startio.weakreference.a c() {
        return this.f35991a;
    }

    public String d() {
        return this.f35992b;
    }
}
