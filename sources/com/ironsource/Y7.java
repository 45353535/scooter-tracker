package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface Y7<T> {
    T a(@NotNull String str);

    void a(T t10);

    void a(@NotNull String str, T t10);

    public static final class a implements Y7<ISDemandOnlyInterstitialListener> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private X7 f42144a = new X7();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Map<String, X7> f42145b = new HashMap();

        @Override // com.ironsource.Y7
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ISDemandOnlyInterstitialListener a(@NotNull String instanceId) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            X7 x72 = this.f42145b.get(instanceId);
            return x72 != null ? x72 : this.f42144a;
        }

        @Override // com.ironsource.Y7
        public void a(@NotNull ISDemandOnlyInterstitialListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f42144a.a(listener);
            Iterator<String> it = this.f42145b.keySet().iterator();
            while (it.hasNext()) {
                X7 x72 = this.f42145b.get(it.next());
                if (x72 != null) {
                    x72.a(listener);
                }
            }
        }

        @Override // com.ironsource.Y7
        public void a(@NotNull String instanceId, @NotNull ISDemandOnlyInterstitialListener listener) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(listener, "listener");
            if (this.f42145b.containsKey(instanceId)) {
                X7 x72 = this.f42145b.get(instanceId);
                if (x72 != null) {
                    x72.a(listener);
                    return;
                }
                return;
            }
            this.f42145b.put(instanceId, new X7(listener));
        }
    }

    public static final class b implements Y7<ISDemandOnlyRewardedVideoListener> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private C4226a8 f42146a = new C4226a8();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Map<String, C4226a8> f42147b = new HashMap();

        @Override // com.ironsource.Y7
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ISDemandOnlyRewardedVideoListener a(@NotNull String instanceId) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            C4226a8 c4226a8 = this.f42147b.get(instanceId);
            return c4226a8 != null ? c4226a8 : this.f42146a;
        }

        @Override // com.ironsource.Y7
        public void a(@NotNull ISDemandOnlyRewardedVideoListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f42146a.a(listener);
            Iterator<String> it = this.f42147b.keySet().iterator();
            while (it.hasNext()) {
                C4226a8 c4226a8 = this.f42147b.get(it.next());
                if (c4226a8 != null) {
                    c4226a8.a(listener);
                }
            }
        }

        @Override // com.ironsource.Y7
        public void a(@NotNull String instanceId, @NotNull ISDemandOnlyRewardedVideoListener listener) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(listener, "listener");
            if (this.f42147b.containsKey(instanceId)) {
                C4226a8 c4226a8 = this.f42147b.get(instanceId);
                if (c4226a8 != null) {
                    c4226a8.a(listener);
                    return;
                }
                return;
            }
            this.f42147b.put(instanceId, new C4226a8(listener));
        }
    }
}
