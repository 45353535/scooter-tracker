package org.bidon.sdk.config.models;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.utils.serializer.JsonName;
import org.bidon.sdk.utils.serializer.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lorg/bidon/sdk/config/models/Capping;", "Lorg/bidon/sdk/utils/serializer/Serializable;", "setting", "", "value", "", "<init>", "(Ljava/lang/String;I)V", "getSetting", "()Ljava/lang/String;", "getValue", "()I", "component1", "component2", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "toString", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Capping implements Serializable {

    @JsonName(key = "setting")
    @NotNull
    private final String setting;

    @JsonName(key = "value")
    private final int value;

    public Capping(@NotNull String setting, int i10) {
        Intrinsics.checkNotNullParameter(setting, "setting");
        this.setting = setting;
        this.value = i10;
    }

    public static /* synthetic */ Capping copy$default(Capping capping, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = capping.setting;
        }
        if ((i11 & 2) != 0) {
            i10 = capping.value;
        }
        return capping.copy(str, i10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSetting() {
        return this.setting;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @NotNull
    public final Capping copy(@NotNull String setting, int value) {
        Intrinsics.checkNotNullParameter(setting, "setting");
        return new Capping(setting, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Capping)) {
            return false;
        }
        Capping capping = (Capping) other;
        return Intrinsics.areEqual(this.setting, capping.setting) && this.value == capping.value;
    }

    @NotNull
    public final String getSetting() {
        return this.setting;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.setting.hashCode() * 31) + this.value;
    }

    @NotNull
    public String toString() {
        return "Capping(setting=" + this.setting + ", value=" + this.value + ")";
    }
}
