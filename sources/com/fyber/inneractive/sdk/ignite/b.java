package com.fyber.inneractive.sdk.ignite;

import com.fyber.inneractive.sdk.network.f0;
import com.fyber.inneractive.sdk.network.k1;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f21060a;

    public b(h hVar) {
        this.f21060a = hVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        IgniteResponseOuterClass$IgniteResponse igniteResponseOuterClass$IgniteResponse = (IgniteResponseOuterClass$IgniteResponse) obj;
        this.f21060a.getClass();
        if (exc == null && igniteResponseOuterClass$IgniteResponse != null && igniteResponseOuterClass$IgniteResponse.hasClientId() && igniteResponseOuterClass$IgniteResponse.hasClientSecret()) {
            this.f21060a.onCredentialsRequestSuccess(igniteResponseOuterClass$IgniteResponse.getClientId(), igniteResponseOuterClass$IgniteResponse.getClientSecret());
            return;
        }
        String message = "";
        IAlog.a("Failed to fetch ignite client credentials with error: %s", exc != null ? exc.getMessage() : "");
        this.f21060a.getClass();
        if (!(exc instanceof k1) || ((k1) exc).f21327a != 204) {
            this.f21060a.a(j.FAILED_TO_RETRIEVE_CREDENTIALS, exc != null ? exc.getMessage() : null);
        }
        if (exc != null && exc.getMessage() != null) {
            message = exc.getMessage();
        }
        this.f21060a.onCredentialsRequestFailed(message);
    }
}
