package com.inmobi.media;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Kn implements Nn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Jn f37235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3584aj f37236b;

    public Kn(Jn visibilityConfig, C3584aj simpleViewHolder) {
        Intrinsics.checkNotNullParameter(visibilityConfig, "visibilityConfig");
        Intrinsics.checkNotNullParameter(simpleViewHolder, "simpleViewHolder");
        this.f37235a = visibilityConfig;
        this.f37236b = simpleViewHolder;
    }

    @Override // com.inmobi.media.Nn
    public final Mn a() {
        C3750h5 c3750h5 = this.f37236b.f38213a;
        Rect rect = new Rect();
        if (!c3750h5.getGlobalVisibleRect(rect)) {
            return Mn.f37387a;
        }
        Jn jn = this.f37235a;
        return (Un.a(c3750h5, rect, jn.f37174a, jn.f37175b) && Un.a(c3750h5, rect, this.f37235a.f37174a, this.f37236b.f38214b)) ? Mn.f37388b : Mn.f37387a;
    }
}
