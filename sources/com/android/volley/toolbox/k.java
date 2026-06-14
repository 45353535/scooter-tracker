package com.android.volley.toolbox;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.android.volley.p;

/* JADX INFO: loaded from: classes5.dex */
public abstract class k extends com.android.volley.n {
    protected static final String PROTOCOL_CHARSET = "utf-8";
    private static final String PROTOCOL_CONTENT_TYPE = String.format("application/json; charset=%s", "utf-8");

    @Nullable
    @GuardedBy("mLock")
    private p.b mListener;
    private final Object mLock;

    @Nullable
    private final String mRequestBody;

    public k(int i10, String str, String str2, p.b bVar, p.a aVar) {
        super(i10, str, aVar);
        this.mLock = new Object();
        this.mListener = bVar;
        this.mRequestBody = str2;
    }

    @Override // com.android.volley.n
    public void cancel() {
        super.cancel();
        synchronized (this.mLock) {
            this.mListener = null;
        }
    }

    @Override // com.android.volley.n
    protected void deliverResponse(Object obj) {
        p.b bVar;
        synchronized (this.mLock) {
            bVar = this.mListener;
        }
        if (bVar != null) {
            bVar.onResponse(obj);
        }
    }

    @Override // com.android.volley.n
    public abstract byte[] getBody();

    @Override // com.android.volley.n
    public String getBodyContentType() {
        return PROTOCOL_CONTENT_TYPE;
    }

    @Override // com.android.volley.n
    @Deprecated
    public byte[] getPostBody() {
        return getBody();
    }

    @Override // com.android.volley.n
    @Deprecated
    public String getPostBodyContentType() {
        return getBodyContentType();
    }
}
