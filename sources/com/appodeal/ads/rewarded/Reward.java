package com.appodeal.ads.rewarded;

import androidx.collection.a;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/appodeal/ads/rewarded/Reward;", "", "", "amount", "", "currency", "<init>", "(DLjava/lang/String;)V", "component1", "()D", "component2", "()Ljava/lang/String;", MenuActionType.COPY, "(DLjava/lang/String;)Lcom/appodeal/ads/rewarded/Reward;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "getAmount", "b", "Ljava/lang/String;", "getCurrency", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Reward {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final double amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final String currency;

    public Reward(double d10, String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.amount = d10;
        this.currency = currency;
    }

    public static /* synthetic */ Reward copy$default(Reward reward, double d10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = reward.amount;
        }
        if ((i10 & 2) != 0) {
            str = reward.currency;
        }
        return reward.copy(d10, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final Reward copy(double amount, String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new Reward(amount, currency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Reward)) {
            return false;
        }
        Reward reward = (Reward) other;
        return Double.compare(this.amount, reward.amount) == 0 && Intrinsics.areEqual(this.currency, reward.currency);
    }

    public final double getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        return this.currency.hashCode() + (a.a(this.amount) * 31);
    }

    public String toString() {
        return "Reward(amount=" + this.amount + ", currency=" + this.currency + ")";
    }
}
