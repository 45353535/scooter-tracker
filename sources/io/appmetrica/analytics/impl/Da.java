package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Da implements HostRetryInfoProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5068ef f75667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC4964ae f75668b;

    public Da(@NotNull C5068ef c5068ef, @NotNull EnumC4964ae enumC4964ae) {
        this.f75667a = c5068ef;
        this.f75668b = enumC4964ae;
    }

    @NotNull
    public final EnumC4964ae a() {
        return this.f75668b;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final long getLastAttemptTimeSeconds() {
        return this.f75667a.a(this.f75668b, 0L);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final int getNextSendAttemptNumber() {
        return this.f75667a.a(this.f75668b, 1);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveLastAttemptTimeSeconds(long j10) {
        this.f75667a.b(this.f75668b, j10).b();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveNextSendAttemptNumber(int i10) {
        this.f75667a.b(this.f75668b, i10).b();
    }
}
