package com.iab.omid.library.bytedance2.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes9.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.weakreference.a f34650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f34652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f34653d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f34650a = new com.iab.omid.library.bytedance2.weakreference.a(view);
        this.f34651b = view.getClass().getCanonicalName();
        this.f34652c = friendlyObstructionPurpose;
        this.f34653d = str;
    }

    public String a() {
        return this.f34653d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f34652c;
    }

    public com.iab.omid.library.bytedance2.weakreference.a c() {
        return this.f34650a;
    }

    public String d() {
        return this.f34651b;
    }
}
