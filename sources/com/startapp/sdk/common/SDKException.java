package com.startapp.sdk.common;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public class SDKException extends Exception {
    private static final long serialVersionUID = 1203685012128929267L;
    private String method;
    private boolean retry;
    private int statusCode;
    private Uri uri;

    public SDKException(String str, Uri uri, int i10, boolean z10, IOException iOException) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(' ');
        sb2.append(uri);
        if (i10 != 0) {
            str2 = ", status " + i10;
        } else {
            str2 = "";
        }
        sb2.append(str2);
        sb2.append(z10 ? ", retry" : "");
        super(sb2.toString(), iOException);
        this.method = str;
        this.uri = uri;
        this.statusCode = i10;
        this.retry = z10;
    }

    public final int a() {
        return this.statusCode;
    }

    public SDKException() {
    }

    public SDKException(String str) {
        super(str);
    }

    public SDKException(String str, Exception exc) {
        super(str, exc);
    }
}
