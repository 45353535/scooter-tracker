package com.iab.omid.library.bigosg.b;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.bigosg.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes9.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.bigosg.e.a f34524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f34526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f34527d;

    public c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f34524a = new com.iab.omid.library.bigosg.e.a(view);
        this.f34525b = view.getClass().getCanonicalName();
        this.f34526c = friendlyObstructionPurpose;
        this.f34527d = str;
    }

    public com.iab.omid.library.bigosg.e.a a() {
        return this.f34524a;
    }

    public String b() {
        return this.f34525b;
    }

    public FriendlyObstructionPurpose c() {
        return this.f34526c;
    }

    public String d() {
        return this.f34527d;
    }
}
