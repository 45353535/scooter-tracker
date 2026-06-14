package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.HashSet;

/* JADX INFO: loaded from: classes12.dex */
public final class L6 implements DataSendingRestrictionController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J6 f76051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f76052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f76053c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f76054d = new HashSet();

    public L6(@NonNull J6 j62) {
        this.f76051a = j62;
        this.f76052b = ((K6) j62).a();
    }

    public final synchronized void a(@Nullable Boolean bool) {
        try {
            if (no.a(bool) || this.f76052b == null) {
                boolean zEquals = Boolean.FALSE.equals(bool);
                this.f76052b = Boolean.valueOf(zEquals);
                ((K6) this.f76051a).f76018a.c(zEquals).b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(@Nullable Boolean bool) {
        if (this.f76052b == null) {
            a(bool);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForMainReporter() {
        return Boolean.TRUE.equals(this.f76052b);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean isRestrictedForReporter(@androidx.annotation.NonNull java.lang.String r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.HashSet r0 = r1.f76053c     // Catch: java.lang.Throwable -> L16
            boolean r2 = r0.contains(r2)     // Catch: java.lang.Throwable -> L16
            if (r2 != 0) goto L18
            java.lang.Boolean r2 = r1.f76052b     // Catch: java.lang.Throwable -> L16
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L16
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L14
            goto L18
        L14:
            r2 = 0
            goto L19
        L16:
            r2 = move-exception
            goto L1b
        L18:
            r2 = 1
        L19:
            monitor-exit(r1)
            return r2
        L1b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.L6.isRestrictedForReporter(java.lang.String):boolean");
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForSdk() {
        Boolean bool;
        try {
            bool = this.f76052b;
        } catch (Throwable th2) {
            throw th2;
        }
        return bool == null ? this.f76054d.isEmpty() : bool.booleanValue();
    }

    public final synchronized void a(@NonNull String str, @Nullable Boolean bool) {
        try {
            if (no.a(bool) || (!this.f76054d.contains(str) && !this.f76053c.contains(str))) {
                if (((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue()) {
                    this.f76054d.add(str);
                    this.f76053c.remove(str);
                } else {
                    this.f76053c.add(str);
                    this.f76054d.remove(str);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
