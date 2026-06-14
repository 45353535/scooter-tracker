package com.android.volley.toolbox;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.android.volley.p;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class n extends com.android.volley.n {

    @Nullable
    @GuardedBy("mLock")
    private p.b mListener;
    private final Object mLock;

    public n(int i10, String str, p.b bVar, p.a aVar) {
        super(i10, str, aVar);
        this.mLock = new Object();
        this.mListener = bVar;
    }

    @Override // com.android.volley.n
    public void cancel() {
        super.cancel();
        synchronized (this.mLock) {
            this.mListener = null;
        }
    }

    @Override // com.android.volley.n
    protected p parseNetworkResponse(com.android.volley.k kVar) {
        String str;
        try {
            str = new String(kVar.f7526b, e.f(kVar.f7527c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(kVar.f7526b);
        }
        return p.c(str, e.e(kVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.n
    public void deliverResponse(String str) {
        p.b bVar;
        synchronized (this.mLock) {
            bVar = this.mListener;
        }
        if (bVar != null) {
            bVar.onResponse(str);
        }
    }
}
