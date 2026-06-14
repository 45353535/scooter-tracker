package com.fyber.inneractive.sdk.cache;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.o;
import com.fyber.inneractive.sdk.util.w0;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20210a;

    public b(String str) {
        this.f20210a = str;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final void a(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            o.f23888a.getSharedPreferences("IAConfigurationPreferences", 0).edit().putString("dt.dynamic.icon.data", w0.a(bitmap)).apply();
        }
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String b() {
        return "dt.dynamic.icon.last.modified";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String c() {
        return String.valueOf(("dt.dynamic.icon_" + this.f20210a).hashCode());
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
        return w0.a(str);
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String a() {
        return this.f20210a;
    }
}
