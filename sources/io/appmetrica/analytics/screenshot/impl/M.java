package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class M implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y f78965a;

    public M() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S fromModel(@NotNull J j10) {
        S s10 = new S();
        s10.f78980a = j10.f78960a;
        W w10 = j10.f78961b;
        s10.f78981b = w10 != null ? this.f78965a.fromModel(w10) : null;
        return s10;
    }

    public M(@NotNull Y y10) {
        this.f78965a = y10;
    }

    public /* synthetic */ M(Y y10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            y10 = new Y(null, null, null, 7, null);
        }
        this(y10);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J toModel(@NotNull S s10) {
        return new J(s10.f78980a, this.f78965a.toModel(s10.f78981b));
    }
}
