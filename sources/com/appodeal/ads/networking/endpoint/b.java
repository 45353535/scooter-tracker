package com.appodeal.ads.networking.endpoint;

import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.network.IndexProvider;
import com.appodeal.ads.storage.c;
import com.appodeal.ads.storage.e0;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import lf.i;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements IndexProvider {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Lazy f14099e = i.a(new Function0() { // from class: com.appodeal.ads.networking.endpoint.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return b.a();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f14100a = e0.f14799b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14101b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f14103d;

    public static final b a() {
        return new b();
    }

    @Override // com.appodeal.ads.network.IndexProvider
    public final int currentIndex() {
        int iB;
        synchronized (this.f14101b) {
            try {
                LogExtKt.logInternal$default("@AppodealEndpointImpl", "currentIndex: " + this.f14103d, null, 4, null);
                Integer num = this.f14103d;
                if (num != null) {
                    iB = num.intValue();
                } else {
                    iB = this.f14100a.b();
                    LogExtKt.logInternal$default("@AppodealEndpointImpl", "Loaded index from storage currentIndex: " + iB, null, 4, null);
                    this.f14103d = Integer.valueOf(iB);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iB;
    }

    @Override // com.appodeal.ads.network.IndexProvider
    public final Integer popNextIndex(int i10) {
        synchronized (this.f14101b) {
            int i11 = this.f14102c;
            if (i11 >= i10) {
                LogExtKt.logInternal$default("@AppodealEndpointImpl", "No more available indices after " + i11 + " attempts, size: " + i10, null, 4, null);
                return null;
            }
            LogExtKt.logInternal$default("@AppodealEndpointImpl", "Current attempts: " + i11 + ", currentIndex: " + this.f14103d, null, 4, null);
            this.f14102c = this.f14102c + 1;
            Integer numValueOf = Integer.valueOf((currentIndex() + 1) % i10);
            this.f14103d = numValueOf;
            LogExtKt.logInternal$default("@AppodealEndpointImpl", "New attempts: " + this.f14102c + ", new currentIndex: " + numValueOf, null, 4, null);
            return this.f14103d;
        }
    }

    @Override // com.appodeal.ads.network.IndexProvider
    public final void removeIndex() {
        synchronized (this.f14101b) {
            this.f14100a.d();
            this.f14103d = null;
            LogExtKt.logInternal$default("@AppodealEndpointImpl", "Removed index from storage", null, 4, null);
            Unit unit = Unit.f93236a;
        }
    }

    @Override // com.appodeal.ads.network.IndexProvider
    public final void saveIndex() {
        synchronized (this.f14101b) {
            try {
                Integer num = this.f14103d;
                if (num != null) {
                    int iIntValue = num.intValue();
                    this.f14100a.a(iIntValue);
                    this.f14102c = 0;
                    LogExtKt.logInternal$default("@AppodealEndpointImpl", "Saved index to storage: " + iIntValue + ", attempts: 0", null, 4, null);
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
