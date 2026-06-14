package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.i;
import com.fyber.inneractive.sdk.network.t;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class InneractiveInfrastructureError extends InneractiveError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InneractiveErrorCode f20589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f20590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f20591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Exception f20592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f20593e;

    public InneractiveInfrastructureError(InneractiveErrorCode inneractiveErrorCode, i iVar) {
        this(inneractiveErrorCode, iVar, null);
    }

    public void addReportedError(t tVar) {
        this.f20593e.add(tVar);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveError
    public String description() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f20589a);
        if (this.f20591c != null) {
            sb2.append(" : ");
            sb2.append(this.f20591c);
        }
        return sb2.toString();
    }

    public Throwable getCause() {
        Exception exc = this.f20592d;
        return exc == null ? this.f20591c : exc;
    }

    public InneractiveErrorCode getErrorCode() {
        return this.f20589a;
    }

    public i getFyberMarketplaceAdLoadFailureReason() {
        return this.f20590b;
    }

    public boolean isErrorAlreadyReported(t tVar) {
        return this.f20593e.contains(tVar);
    }

    public void setCause(Exception exc) {
        this.f20592d = exc;
    }

    public InneractiveInfrastructureError(InneractiveErrorCode inneractiveErrorCode, i iVar, Throwable th2) {
        this.f20593e = new ArrayList();
        this.f20589a = inneractiveErrorCode;
        this.f20590b = iVar;
        this.f20591c = th2;
    }
}
