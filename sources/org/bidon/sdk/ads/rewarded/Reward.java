package org.bidon.sdk.ads.rewarded;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lorg/bidon/sdk/ads/rewarded/Reward;", "", "label", "", "amount", "", "<init>", "(Ljava/lang/String;I)V", "getLabel", "()Ljava/lang/String;", "getAmount", "()I", "component1", "component2", MenuActionType.COPY, "equals", "", "other", "hashCode", "toString", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Reward {
    private final int amount;

    @NotNull
    private final String label;

    public Reward(@NotNull String label, int i10) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.label = label;
        this.amount = i10;
    }

    public static /* synthetic */ Reward copy$default(Reward reward, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = reward.label;
        }
        if ((i11 & 2) != 0) {
            i10 = reward.amount;
        }
        return reward.copy(str, i10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAmount() {
        return this.amount;
    }

    @NotNull
    public final Reward copy(@NotNull String label, int amount) {
        Intrinsics.checkNotNullParameter(label, "label");
        return new Reward(label, amount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Reward)) {
            return false;
        }
        Reward reward = (Reward) other;
        return Intrinsics.areEqual(this.label, reward.label) && this.amount == reward.amount;
    }

    public final int getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return (this.label.hashCode() * 31) + this.amount;
    }

    @NotNull
    public String toString() {
        return "Reward(label=" + this.label + ", amount=" + this.amount + ")";
    }
}
