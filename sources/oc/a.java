package oc;

import android.content.Context;
import android.view.View;
import ec.b;
import fd.c;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends jc.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final c f96690t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, Object assetsHolder, b repository, id.a adElementParams, jc.c adFormListener, yc.b eventCallback, wc.a aVar) {
        super(context, assetsHolder, repository, adElementParams, adFormListener, eventCallback, aVar);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(assetsHolder, "assetsHolder");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(adElementParams, "adElementParams");
        Intrinsics.checkNotNullParameter(adFormListener, "adFormListener");
        Intrinsics.checkNotNullParameter(eventCallback, "eventCallback");
        this.f96690t = new c(context);
    }

    @Override // jc.a
    public View H() {
        return this.f96690t;
    }

    @Override // ic.f0, ic.z
    public void c(long j10, long j11, float f10) {
        this.f96690t.c(j10, j11, f10);
    }

    @Override // ic.f
    public void c() {
        C().a(this);
    }
}
