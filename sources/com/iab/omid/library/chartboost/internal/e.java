package com.iab.omid.library.chartboost.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.chartboost.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes9.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.chartboost.weakreference.a f34785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f34787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f34788d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f34785a = new com.iab.omid.library.chartboost.weakreference.a(view);
        this.f34786b = view.getClass().getCanonicalName();
        this.f34787c = friendlyObstructionPurpose;
        this.f34788d = str;
    }

    public String a() {
        return this.f34788d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f34787c;
    }

    public com.iab.omid.library.chartboost.weakreference.a c() {
        return this.f34785a;
    }

    public String d() {
        return this.f34786b;
    }
}
