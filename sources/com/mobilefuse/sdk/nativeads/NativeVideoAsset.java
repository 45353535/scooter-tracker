package com.mobilefuse.sdk.nativeads;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/mobilefuse/sdk/nativeads/NativeVideoAsset;", "Lcom/mobilefuse/sdk/nativeads/NativeAsset;", "id", "", "vastTag", "", "(ILjava/lang/String;)V", "getId", "()I", "getVastTag", "()Ljava/lang/String;", "component1", "component2", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "toString", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class NativeVideoAsset implements NativeAsset {
    private final int id;

    @NotNull
    private final String vastTag;

    public NativeVideoAsset(int i10, @NotNull String vastTag) {
        Intrinsics.checkNotNullParameter(vastTag, "vastTag");
        this.id = i10;
        this.vastTag = vastTag;
    }

    public static /* synthetic */ NativeVideoAsset copy$default(NativeVideoAsset nativeVideoAsset, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = nativeVideoAsset.getId();
        }
        if ((i11 & 2) != 0) {
            str = nativeVideoAsset.vastTag;
        }
        return nativeVideoAsset.copy(i10, str);
    }

    public final int component1() {
        return getId();
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVastTag() {
        return this.vastTag;
    }

    @NotNull
    public final NativeVideoAsset copy(int id2, @NotNull String vastTag) {
        Intrinsics.checkNotNullParameter(vastTag, "vastTag");
        return new NativeVideoAsset(id2, vastTag);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeVideoAsset)) {
            return false;
        }
        NativeVideoAsset nativeVideoAsset = (NativeVideoAsset) other;
        return getId() == nativeVideoAsset.getId() && Intrinsics.areEqual(this.vastTag, nativeVideoAsset.vastTag);
    }

    @Override // com.mobilefuse.sdk.nativeads.NativeAsset
    public int getId() {
        return this.id;
    }

    @NotNull
    public final String getVastTag() {
        return this.vastTag;
    }

    public int hashCode() {
        int id2 = getId() * 31;
        String str = this.vastTag;
        return id2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NativeVideoAsset(id=" + getId() + ", vastTag=" + this.vastTag + ")";
    }
}
