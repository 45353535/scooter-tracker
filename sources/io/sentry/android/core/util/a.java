package io.sentry.android.core.util;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Object f82768a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0992a f82769b;

    /* JADX INFO: renamed from: io.sentry.android.core.util.a$a, reason: collision with other inner class name */
    public interface InterfaceC0992a {
        Object a(Context context);
    }

    public a(InterfaceC0992a interfaceC0992a) {
        this.f82769b = interfaceC0992a;
    }

    public Object a(Context context) {
        if (this.f82768a == null) {
            synchronized (this) {
                try {
                    if (this.f82768a == null) {
                        this.f82768a = this.f82769b.a(context);
                    }
                } finally {
                }
            }
        }
        return this.f82768a;
    }
}
