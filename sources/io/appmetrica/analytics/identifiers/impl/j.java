package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f75367a;

    @VisibleForTesting
    public j(@NotNull f fVar) {
        this.f75367a = fVar;
    }

    @Override // io.appmetrica.analytics.identifiers.impl.b
    @NotNull
    public final c a(@NotNull Context context) {
        c cVar;
        f fVar;
        try {
            try {
                try {
                    m mVar = (m) ((o) this.f75367a.a(context));
                    cVar = new c(IdentifierStatus.OK, new a("huawei", mVar.a(), Boolean.valueOf(mVar.b())), null, 4);
                    fVar = this.f75367a;
                } finally {
                }
            } catch (g e10) {
                String message = e10.getMessage();
                if (message == null) {
                    message = "unknown exception during binding huawei services";
                }
                cVar = new c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, message);
                fVar = this.f75367a;
            }
            fVar.b(context);
            return cVar;
        } catch (Throwable th2) {
            try {
                this.f75367a.b(context);
            } catch (Throwable unused) {
            }
        }
    }

    public j() {
        this(new f(k.f75368a, i.f75366a, "huawei"));
    }
}
