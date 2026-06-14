package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes9.dex */
public final class Jd implements InterfaceC4176y8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Nm f37131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f37132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f37133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f37134d;

    public Jd(Nm videoMRC50Model) {
        Intrinsics.checkNotNullParameter(videoMRC50Model, "videoMRC50Model");
        this.f37131a = videoMRC50Model;
        this.f37132b = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.InterfaceC4176y8
    public final void a() {
    }

    @Override // com.inmobi.media.InterfaceC4176y8
    public final Flow b() {
        return hg.i.j(new Id(this, null));
    }
}
