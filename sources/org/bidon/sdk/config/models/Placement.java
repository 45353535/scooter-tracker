package org.bidon.sdk.config.models;

import com.ironsource.C4524s;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.utils.serializer.JsonName;
import org.bidon.sdk.utils.serializer.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lorg/bidon/sdk/config/models/Placement;", "Lorg/bidon/sdk/utils/serializer/Serializable;", "name", "", "reward", "Lorg/bidon/sdk/config/models/Reward;", C4524s.f44855e, "Lorg/bidon/sdk/config/models/Capping;", "<init>", "(Ljava/lang/String;Lorg/bidon/sdk/config/models/Reward;Lorg/bidon/sdk/config/models/Capping;)V", "getName", "()Ljava/lang/String;", "getReward", "()Lorg/bidon/sdk/config/models/Reward;", "getCapping", "()Lorg/bidon/sdk/config/models/Capping;", "component1", "component2", "component3", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Placement implements Serializable {

    @JsonName(key = C4524s.f44855e)
    @Nullable
    private final Capping capping;

    @JsonName(key = "name")
    @NotNull
    private final String name;

    @JsonName(key = "reward")
    @Nullable
    private final Reward reward;

    public Placement(@NotNull String name, @Nullable Reward reward, @Nullable Capping capping) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.reward = reward;
        this.capping = capping;
    }

    public static /* synthetic */ Placement copy$default(Placement placement, String str, Reward reward, Capping capping, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = placement.name;
        }
        if ((i10 & 2) != 0) {
            reward = placement.reward;
        }
        if ((i10 & 4) != 0) {
            capping = placement.capping;
        }
        return placement.copy(str, reward, capping);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Reward getReward() {
        return this.reward;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Capping getCapping() {
        return this.capping;
    }

    @NotNull
    public final Placement copy(@NotNull String name, @Nullable Reward reward, @Nullable Capping capping) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new Placement(name, reward, capping);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Placement)) {
            return false;
        }
        Placement placement = (Placement) other;
        return Intrinsics.areEqual(this.name, placement.name) && Intrinsics.areEqual(this.reward, placement.reward) && Intrinsics.areEqual(this.capping, placement.capping);
    }

    @Nullable
    public final Capping getCapping() {
        return this.capping;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Reward getReward() {
        return this.reward;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        Reward reward = this.reward;
        int iHashCode2 = (iHashCode + (reward == null ? 0 : reward.hashCode())) * 31;
        Capping capping = this.capping;
        return iHashCode2 + (capping != null ? capping.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Placement(name=" + this.name + ", reward=" + this.reward + ", capping=" + this.capping + ")";
    }
}
