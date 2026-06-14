package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f23053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f23054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f23055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f23056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f23057e;

    public n(Context context, m mVar, h hVar) {
        hVar.getClass();
        this.f23053a = hVar;
        this.f23054b = new s(mVar);
        this.f23055c = new d(context, mVar);
        this.f23056d = new f(context, mVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(k kVar) {
        if (this.f23057e != null) {
            throw new IllegalStateException();
        }
        String scheme = kVar.f23036a.getScheme();
        Uri uri = kVar.f23036a;
        int i10 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f23162a;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || scheme2.equals(C4240b4.i.f42616b)) {
            if (kVar.f23036a.getPath().startsWith("/android_asset/")) {
                this.f23057e = this.f23055c;
            } else {
                this.f23057e = this.f23054b;
            }
        } else if ("asset".equals(scheme)) {
            this.f23057e = this.f23055c;
        } else if ("content".equals(scheme)) {
            this.f23057e = this.f23056d;
        } else {
            this.f23057e = this.f23053a;
        }
        return this.f23057e.a(kVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        h hVar = this.f23057e;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.f23057e = null;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f23057e.read(bArr, i10, i11);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        h hVar = this.f23057e;
        if (hVar == null) {
            return null;
        }
        return hVar.a();
    }
}
