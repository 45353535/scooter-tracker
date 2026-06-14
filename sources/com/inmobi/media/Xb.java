package com.inmobi.media;

import hh.v;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Xb implements hh.v {
    @Override // hh.v
    public final hh.b0 intercept(v.a chain) throws MalformedURLException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        hh.b0 b0VarA = chain.a(chain.request());
        if (b0VarA.U()) {
            Intrinsics.checkNotNull(b0VarA);
            Intrinsics.checkNotNullParameter(b0VarA, "<this>");
            String strY = b0VarA.U() ? b0VarA.y("Location") : null;
            if (strY != null) {
                Intrinsics.checkNotNullParameter(strY, "<this>");
                try {
                    new URL(strY);
                } catch (MalformedURLException unused) {
                }
            }
            chain.call().cancel();
            throw new MalformedURLException("Invalid URL in Location header: " + strY);
        }
        Intrinsics.checkNotNull(b0VarA);
        return b0VarA;
    }
}
