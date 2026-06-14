package com.iab.omid.library.unity3d.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.unity3d.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes9.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.unity3d.weakreference.a f36249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f36251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f36252d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f36249a = new com.iab.omid.library.unity3d.weakreference.a(view);
        this.f36250b = view.getClass().getCanonicalName();
        this.f36251c = friendlyObstructionPurpose;
        this.f36252d = str;
    }

    public String a() {
        return this.f36252d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f36251c;
    }

    public com.iab.omid.library.unity3d.weakreference.a c() {
        return this.f36249a;
    }

    public String d() {
        return this.f36250b;
    }
}
