package com.moloco.sdk.acm.recorder;

import com.moloco.sdk.acm.c;
import com.moloco.sdk.acm.f;
import com.moloco.sdk.acm.recorder.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54093a;

    public b(String str) {
        this.f54093a = str;
    }

    @Override // com.moloco.sdk.acm.recorder.a
    public void a(f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String str = this.f54093a;
        if (str == null || str.length() == 0) {
            com.moloco.sdk.acm.a.f53924a.u(event);
        } else {
            com.moloco.sdk.acm.a.f53924a.u(event.f("mediator", this.f54093a));
        }
    }

    @Override // com.moloco.sdk.acm.recorder.a
    public void b(c event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String str = this.f54093a;
        if (str == null || str.length() == 0) {
            com.moloco.sdk.acm.a.f53924a.t(event);
        } else {
            com.moloco.sdk.acm.a.f53924a.t(event.e("mediator", this.f54093a));
        }
    }

    @Override // com.moloco.sdk.acm.recorder.a
    public f c(String str) {
        return a.b.a(this, str);
    }

    public /* synthetic */ b(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }
}
