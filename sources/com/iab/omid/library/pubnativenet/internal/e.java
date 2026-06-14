package com.iab.omid.library.pubnativenet.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.pubnativenet.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes9.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.pubnativenet.weakreference.a f35856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f35857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f35858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f35859d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f35856a = new com.iab.omid.library.pubnativenet.weakreference.a(view);
        this.f35857b = view.getClass().getCanonicalName();
        this.f35858c = friendlyObstructionPurpose;
        this.f35859d = str;
    }

    public String a() {
        return this.f35859d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f35858c;
    }

    public com.iab.omid.library.pubnativenet.weakreference.a c() {
        return this.f35856a;
    }

    public String d() {
        return this.f35857b;
    }
}
