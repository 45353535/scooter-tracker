package com.iab.omid.library.inmobi.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes9.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.inmobi.weakreference.a f35175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f35176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f35177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f35178d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f35175a = new com.iab.omid.library.inmobi.weakreference.a(view);
        this.f35176b = view.getClass().getCanonicalName();
        this.f35177c = friendlyObstructionPurpose;
        this.f35178d = str;
    }

    public String a() {
        return this.f35178d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f35177c;
    }

    public com.iab.omid.library.inmobi.weakreference.a c() {
        return this.f35175a;
    }

    public String d() {
        return this.f35176b;
    }
}
