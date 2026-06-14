package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.time.Clock;

/* JADX INFO: loaded from: classes7.dex */
class CreationContextFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Clock f24392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Clock f24393c;

    CreationContextFactory(Context context, Clock clock, Clock clock2) {
        this.f24391a = context;
        this.f24392b = clock;
        this.f24393c = clock2;
    }

    CreationContext a(String str) {
        return CreationContext.create(this.f24391a, this.f24392b, this.f24393c, str);
    }
}
