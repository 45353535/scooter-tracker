package org.bidon.sdk.adapter;

import com.ironsource.C4240b4;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.ads.AdType;
import org.bidon.sdk.databinders.extras.Extras;
import org.bidon.sdk.databinders.extras.ExtrasImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u001b\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0001J\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\u0010H\u0096\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lorg/bidon/sdk/adapter/DemandAd;", "Lorg/bidon/sdk/databinders/extras/Extras;", "adType", "Lorg/bidon/sdk/ads/AdType;", "<init>", "(Lorg/bidon/sdk/ads/AdType;)V", "getAdType", "()Lorg/bidon/sdk/ads/AdType;", "toString", "", "addExtra", "", C4240b4.i.W, "value", "", "getExtras", "", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DemandAd implements Extras {
    private final /* synthetic */ ExtrasImpl $$delegate_0;

    @NotNull
    private final AdType adType;

    public DemandAd(@NotNull AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.$$delegate_0 = new ExtrasImpl();
        this.adType = adType;
    }

    @Override // org.bidon.sdk.databinders.extras.Extras
    public void addExtra(@NotNull String key, @Nullable Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.$$delegate_0.addExtra(key, value);
    }

    @NotNull
    public final AdType getAdType() {
        return this.adType;
    }

    @Override // org.bidon.sdk.databinders.extras.Extras
    @NotNull
    public Map<String, Object> getExtras() {
        return this.$$delegate_0.getExtras();
    }

    @NotNull
    public String toString() {
        return "DemandAd(adType=" + this.adType + ", extras=" + getExtras() + ", hashcode=" + hashCode() + ")";
    }
}
