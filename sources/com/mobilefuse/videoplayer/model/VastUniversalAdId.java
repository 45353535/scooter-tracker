package com.mobilefuse.videoplayer.model;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/mobilefuse/videoplayer/model/VastUniversalAdId;", "", "identifier", "", "idRegistry", "(Ljava/lang/String;Ljava/lang/String;)V", "getIdRegistry", "()Ljava/lang/String;", "getIdentifier", "component1", "component2", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class VastUniversalAdId {

    @Nullable
    private final String idRegistry;

    @Nullable
    private final String identifier;

    public VastUniversalAdId(@Nullable String str, @Nullable String str2) {
        this.identifier = str;
        this.idRegistry = str2;
    }

    public static /* synthetic */ VastUniversalAdId copy$default(VastUniversalAdId vastUniversalAdId, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = vastUniversalAdId.identifier;
        }
        if ((i10 & 2) != 0) {
            str2 = vastUniversalAdId.idRegistry;
        }
        return vastUniversalAdId.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIdRegistry() {
        return this.idRegistry;
    }

    @NotNull
    public final VastUniversalAdId copy(@Nullable String identifier, @Nullable String idRegistry) {
        return new VastUniversalAdId(identifier, idRegistry);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VastUniversalAdId)) {
            return false;
        }
        VastUniversalAdId vastUniversalAdId = (VastUniversalAdId) other;
        return Intrinsics.areEqual(this.identifier, vastUniversalAdId.identifier) && Intrinsics.areEqual(this.idRegistry, vastUniversalAdId.idRegistry);
    }

    @Nullable
    public final String getIdRegistry() {
        return this.idRegistry;
    }

    @Nullable
    public final String getIdentifier() {
        return this.identifier;
    }

    public int hashCode() {
        String str = this.identifier;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.idRegistry;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "VastUniversalAdId(identifier=" + this.identifier + ", idRegistry=" + this.idRegistry + ")";
    }
}
