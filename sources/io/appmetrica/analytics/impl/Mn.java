package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes12.dex */
public final class Mn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M3 f76144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Eo f76145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConjunctiveCompositeThreadSafeToggle f76146c;

    public Mn(Toggle toggle) {
        M3 m32 = new M3(C5468ua.k().z());
        this.f76144a = m32;
        Eo eo = new Eo();
        this.f76145b = eo;
        this.f76146c = new ConjunctiveCompositeThreadSafeToggle(CollectionsKt.listOf((Object[]) new Toggle[]{m32, eo, toggle == null ? new xo() : toggle}), "loc-def");
    }
}
