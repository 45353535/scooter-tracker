package com.startapp.sdk.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class kb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lb f64826a;

    public kb(final k7 k7Var) {
        this.f64826a = new lb(new k7() { // from class: com.startapp.sdk.internal.jm
            @Override // com.startapp.sdk.internal.k7
            public final Object a() {
                return kb.a(k7Var);
            }
        });
    }

    public static /* synthetic */ AtomicReference a(k7 k7Var) {
        return new AtomicReference(k7Var.a());
    }
}
