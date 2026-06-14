package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes9.dex */
public final class I1 implements kotlin.properties.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f37040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f37041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f37042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f37043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f37044e;

    public /* synthetic */ I1(Integer num, Function0 function0, int i10) {
        this(num, function0, (i10 & 4) == 0, false);
    }

    public final void a() {
        if (this.f37043d.compareAndSet(false, true)) {
            this.f37044e = true;
            eg.i.d(A9.f36557c, null, null, new H1(this, null), 3, null);
        }
    }

    @Override // kotlin.properties.d
    public final Object getValue(Object obj, KProperty property) {
        Intrinsics.checkNotNullParameter(property, "property");
        if (this.f37041b || !this.f37044e) {
            a();
        }
        return this.f37042c;
    }

    public I1(Object obj, Function0 refreshLogic, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(refreshLogic, "refreshLogic");
        this.f37040a = refreshLogic;
        this.f37041b = z10;
        this.f37042c = obj;
        this.f37043d = new AtomicBoolean(false);
        if (z11) {
            a();
        }
    }
}
