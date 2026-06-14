package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class e0 extends c0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f8697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f8698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f8699h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f8700i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f8701j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8702k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final a f8703l;

    public interface a {
        void a(Uri uri);
    }

    public e0(String str, com.applovin.impl.sdk.ad.b bVar, String str2, com.applovin.impl.sdk.k kVar, a aVar) {
        this(str, bVar, bVar.S(), true, str2, kVar, aVar);
    }

    private void a(Uri uri) {
        a aVar;
        if (this.f8479e.get() || (aVar = this.f8703l) == null) {
            return;
        }
        aVar.a(uri);
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean call() {
        if (this.f8479e.get()) {
            return Boolean.FALSE;
        }
        String strA = this.f8702k.G().a(a(), this.f8697f, this.f8698g.getCachePrefix(), this.f8699h, this.f8700i, this.f8702k.G().a(this.f8697f, this.f8698g), this.f8701j, f2.a((AppLovinAdImpl) this.f8698g));
        if (TextUtils.isEmpty(strA)) {
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f8479e.get()) {
            return Boolean.FALSE;
        }
        File fileA = this.f8702k.G().a(strA, a());
        if (fileA == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8477c.b(this.f8476b, "Unable to retrieve File for cached filename = " + strA);
            }
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f8479e.get()) {
            return Boolean.FALSE;
        }
        Uri uriFromFile = Uri.fromFile(fileA);
        if (uriFromFile == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8477c.b(this.f8476b, "Unable to extract Uri from file");
            }
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f8479e.get()) {
            return Boolean.FALSE;
        }
        a(uriFromFile);
        return Boolean.TRUE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f8697f.equals(((e0) obj).f8697f);
    }

    public int hashCode() {
        String str = this.f8697f;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public e0(String str, com.applovin.impl.sdk.ad.b bVar, List list, boolean z10, String str2, com.applovin.impl.sdk.k kVar, a aVar) {
        super("AsyncTaskCacheResource", kVar);
        this.f8697f = str;
        this.f8698g = bVar;
        this.f8699h = list;
        this.f8700i = z10;
        this.f8701j = str2;
        this.f8702k = kVar;
        this.f8703l = aVar;
    }
}
