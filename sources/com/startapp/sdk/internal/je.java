package com.startapp.sdk.internal;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.json.JsonParser;
import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class je implements CookieStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CookieStore f64759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vf f64760b;

    public je(Context context) {
        HttpCookie httpCookie;
        vf vfVar = new vf(context.getSharedPreferences("com.startapp.android.publish.CookiePrefsFile", 0));
        this.f64760b = vfVar;
        this.f64759a = new CookieManager().getCookieStore();
        String string = vfVar.getString("names", null);
        if (string != null) {
            for (String str : TextUtils.split(string, ";")) {
                String string2 = this.f64760b.getString("cookie_" + str, null);
                if (string2 != null && (httpCookie = (HttpCookie) JsonParser.fromJson(string2, HttpCookie.class)) != null) {
                    if (httpCookie.hasExpired()) {
                        uf ufVarEdit = this.f64760b.edit();
                        StringBuilder sb2 = new StringBuilder("cookie_");
                        sb2.append(httpCookie.getDomain() + "_" + httpCookie.getName());
                        ufVarEdit.remove(sb2.toString());
                        ufVarEdit.apply();
                        a();
                    } else if (httpCookie.getDomain() != null) {
                        this.f64759a.add(URI.create(httpCookie.getDomain()), httpCookie);
                    }
                }
            }
        }
    }

    public final void a() {
        uf ufVarEdit = this.f64760b.edit();
        HashSet hashSet = new HashSet();
        for (HttpCookie httpCookie : this.f64759a.getCookies()) {
            hashSet.add(httpCookie.getDomain() + "_" + httpCookie.getName());
        }
        String strJoin = TextUtils.join(";", hashSet);
        ufVarEdit.a("names", strJoin);
        ufVarEdit.f65346a.putString("names", strJoin);
        ufVarEdit.apply();
    }

    @Override // java.net.CookieStore
    public final void add(URI uri, HttpCookie httpCookie) {
        String str = httpCookie.getDomain() + "_" + httpCookie.getName();
        this.f64759a.add(uri, httpCookie);
        uf ufVarEdit = this.f64760b.edit();
        String str2 = "cookie_" + str;
        String json = JsonParser.toJson(httpCookie);
        ufVarEdit.a(str2, json);
        ufVarEdit.f65346a.putString(str2, json);
        ufVarEdit.apply();
        a();
    }

    @Override // java.net.CookieStore
    public final List get(URI uri) {
        return this.f64759a.get(uri);
    }

    @Override // java.net.CookieStore
    public final List getCookies() {
        return this.f64759a.getCookies();
    }

    @Override // java.net.CookieStore
    public final List getURIs() {
        return this.f64759a.getURIs();
    }

    @Override // java.net.CookieStore
    public final boolean remove(URI uri, HttpCookie httpCookie) {
        if (!this.f64759a.remove(uri, httpCookie)) {
            return false;
        }
        uf ufVarEdit = this.f64760b.edit();
        StringBuilder sb2 = new StringBuilder("cookie_");
        sb2.append(httpCookie.getDomain() + "_" + httpCookie.getName());
        ufVarEdit.remove(sb2.toString());
        ufVarEdit.apply();
        a();
        return true;
    }

    @Override // java.net.CookieStore
    public final boolean removeAll() {
        if (!this.f64759a.removeAll()) {
            return false;
        }
        uf ufVarEdit = this.f64760b.edit();
        ufVarEdit.clear();
        ufVarEdit.apply();
        a();
        return true;
    }
}
