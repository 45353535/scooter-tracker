package com.fyber.inneractive.sdk.click;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f20249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f20250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f20252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f20253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f20254f = new ArrayList();

    public b(String str, q qVar, String str2, Exception exc) {
        this.f20252d = str;
        this.f20249a = qVar;
        this.f20251c = str2;
        this.f20250b = exc;
    }

    public final String toString() {
        q qVar = this.f20249a;
        if (qVar == q.FAILED) {
            Throwable th2 = this.f20250b;
            return "Open result: Failed! error: " + (th2 != null ? th2.getMessage() : "none");
        }
        return "Open result: Success! target: " + qVar + " method: " + this.f20251c;
    }
}
