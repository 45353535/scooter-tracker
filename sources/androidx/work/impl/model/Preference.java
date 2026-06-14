package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.ironsource.C4240b4;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Entity
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Landroidx/work/impl/model/Preference;", "", C4240b4.i.W, "", "value", "", "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", "", "(Ljava/lang/String;Z)V", "getKey", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", MenuActionType.COPY, "(Ljava/lang/String;Ljava/lang/Long;)Landroidx/work/impl/model/Preference;", "equals", "other", "hashCode", "", "toString", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final /* data */ class Preference {

    @PrimaryKey
    @ColumnInfo(name = C4240b4.i.W)
    @NotNull
    private final String key;

    @ColumnInfo(name = "long_value")
    @Nullable
    private final Long value;

    public Preference(@NotNull String key, @Nullable Long l10) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.key = key;
        this.value = l10;
    }

    public static /* synthetic */ Preference copy$default(Preference preference, String str, Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = preference.key;
        }
        if ((i10 & 2) != 0) {
            l10 = preference.value;
        }
        return preference.copy(str, l10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getValue() {
        return this.value;
    }

    @NotNull
    public final Preference copy(@NotNull String key, @Nullable Long value) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new Preference(key, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Preference)) {
            return false;
        }
        Preference preference = (Preference) other;
        return Intrinsics.areEqual(this.key, preference.key) && Intrinsics.areEqual(this.value, preference.value);
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final Long getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.key.hashCode() * 31;
        Long l10 = this.value;
        return iHashCode + (l10 == null ? 0 : l10.hashCode());
    }

    @NotNull
    public String toString() {
        return "Preference(key=" + this.key + ", value=" + this.value + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Preference(@NotNull String key, boolean z10) {
        this(key, Long.valueOf(z10 ? 1L : 0L));
        Intrinsics.checkNotNullParameter(key, "key");
    }
}
