package com.inmobi.media;

import hh.v;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class B8 implements hh.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36614a;

    public B8(long j10) {
        this.f36614a = j10;
    }

    @Override // hh.v
    public final hh.b0 intercept(v.a chain) throws C3576ab {
        Intrinsics.checkNotNullParameter(chain, "chain");
        hh.b0 b0VarA = chain.a(chain.request());
        hh.c0 c0VarM = b0VarA.m();
        long jContentLength = c0VarM != null ? c0VarM.contentLength() : 0L;
        if (jContentLength <= this.f36614a) {
            Intrinsics.checkNotNull(b0VarA);
            return b0VarA;
        }
        b0VarA.close();
        throw new C3576ab("Image size exceeds limit: " + jContentLength + " Bytes");
    }
}
