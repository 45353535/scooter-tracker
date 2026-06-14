package com.iabtcf.exceptions;

/* JADX INFO: loaded from: classes9.dex */
public class TCStringDecodeException extends RuntimeException {
    private static final long serialVersionUID = 4508672474002398542L;

    public TCStringDecodeException(Throwable th2) {
        super(th2);
    }

    public TCStringDecodeException(String str) {
        super(str);
    }

    public TCStringDecodeException(String str, Throwable th2) {
        super(str, th2);
    }
}
