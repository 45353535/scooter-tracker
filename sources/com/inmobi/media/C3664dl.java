package com.inmobi.media;

import java.io.IOException;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.dl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3664dl implements hh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.e f38465a;

    public C3664dl(kotlinx.coroutines.e eVar) {
        this.f38465a = eVar;
    }

    @Override // hh.f
    public final void onFailure(hh.e call, IOException t10) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(t10, "e");
        kotlinx.coroutines.e eVar = this.f38465a;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(t10, "t");
        if (eVar.isActive()) {
            try {
                Result.Companion companion = Result.f93230c;
                eVar.resumeWith(Result.b(kotlin.d.a(t10)));
            } catch (IllegalStateException unused) {
            }
        }
    }

    @Override // hh.f
    public final void onResponse(hh.e call, hh.b0 response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        P4.a(this.f38465a, response);
    }
}
