package com.iab.omid.library.corpmailru.b;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.corpmailru.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes9.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.corpmailru.e.a f34907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f34909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f34910d;

    public c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f34907a = new com.iab.omid.library.corpmailru.e.a(view);
        this.f34908b = view.getClass().getCanonicalName();
        this.f34909c = friendlyObstructionPurpose;
        this.f34910d = str;
    }

    public com.iab.omid.library.corpmailru.e.a a() {
        return this.f34907a;
    }

    public String b() {
        return this.f34908b;
    }

    public FriendlyObstructionPurpose c() {
        return this.f34909c;
    }

    public String d() {
        return this.f34910d;
    }
}
