package com.fyber.inneractive.sdk.cache;

import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f20212c = IAlog.a(d.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20214b;

    public d(String str) {
        this.f20213a = str;
        Locale locale = Locale.US;
        int iHashCode = str.hashCode();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(iHashCode);
        this.f20214b = sb2.toString();
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final void a(Object obj) {
        IAlog.c("%s: onCacheCommitted: %s for url: %s", f20212c, (Uri) obj, this.f20213a);
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String b() {
        return "";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String c() {
        return this.f20214b;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final boolean d() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final Object a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Uri.fromFile(new File(str));
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String a() {
        return this.f20213a;
    }
}
