package org.bidon.sdk.config.models;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.utils.serializer.JsonName;
import org.bidon.sdk.utils.serializer.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lorg/bidon/sdk/config/models/Reward;", "Lorg/bidon/sdk/utils/serializer/Serializable;", "title", "", "amount", "", "<init>", "(Ljava/lang/String;I)V", "getTitle", "()Ljava/lang/String;", "getAmount", "()I", "component1", "component2", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "toString", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Reward implements Serializable {

    @JsonName(key = "value")
    private final int amount;

    @JsonName(key = "title")
    @NotNull
    private final String title;

    public Reward(@NotNull String title, int i10) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.amount = i10;
    }

    public static /* synthetic */ Reward copy$default(Reward reward, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = reward.title;
        }
        if ((i11 & 2) != 0) {
            i10 = reward.amount;
        }
        return reward.copy(str, i10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAmount() {
        return this.amount;
    }

    @NotNull
    public final Reward copy(@NotNull String title, int amount) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new Reward(title, amount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Reward)) {
            return false;
        }
        Reward reward = (Reward) other;
        return Intrinsics.areEqual(this.title, reward.title) && this.amount == reward.amount;
    }

    public final int getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.amount;
    }

    @NotNull
    public String toString() {
        return "Reward(title=" + this.title + ", amount=" + this.amount + ")";
    }
}
