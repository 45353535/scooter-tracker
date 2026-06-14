package com.appodeal.ads;

import com.appodeal.ads.networking.LoadingError;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class d4 implements AdNetworkInitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f13226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ of.e f13227b;

    public d4(AtomicBoolean atomicBoolean, of.e eVar) {
        this.f13226a = atomicBoolean;
        this.f13227b = eVar;
    }

    @Override // com.appodeal.ads.AdNetworkInitializationListener
    public final void onInitializationFailed(LoadingError loadingError) {
        if (this.f13226a.compareAndSet(false, true)) {
            of.e eVar = this.f13227b;
            Result.Companion companion = Result.f93230c;
            eVar.resumeWith(Result.b(kotlin.d.a(new IllegalStateException(String.valueOf(loadingError)))));
        }
    }

    @Override // com.appodeal.ads.AdNetworkInitializationListener
    public final void onInitializationFinished() {
        if (this.f13226a.compareAndSet(false, true)) {
            of.e eVar = this.f13227b;
            Result.Companion companion = Result.f93230c;
            eVar.resumeWith(Result.b(Unit.f93236a));
        }
    }
}
