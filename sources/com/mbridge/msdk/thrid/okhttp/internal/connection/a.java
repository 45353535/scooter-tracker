package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.y;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f51236a;

    public a(v vVar) {
        this.f51236a = vVar;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t
    public a0 a(t.a aVar) throws IOException {
        com.mbridge.msdk.thrid.okhttp.internal.http.g gVar = (com.mbridge.msdk.thrid.okhttp.internal.http.g) aVar;
        y yVarD = gVar.d();
        g gVarI = gVar.i();
        return gVar.a(yVarD, gVarI, gVarI.a(this.f51236a, aVar, !yVarD.e().equals("GET")), gVarI.c());
    }
}
