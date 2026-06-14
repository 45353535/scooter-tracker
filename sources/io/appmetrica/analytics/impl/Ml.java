package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Ml extends AbstractC5488v5 {
    public Ml(C5075em c5075em, C5204jm c5204jm, C5050dm c5050dm) {
        super(c5075em, c5204jm, c5050dm);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5488v5
    public final synchronized void a(@NonNull C5050dm c5050dm) {
        a(new S5(c(), C5468ua.H.v(), C5468ua.H.s(), ((C5050dm) b()).mergeFrom(c5050dm)));
        e();
    }
}
