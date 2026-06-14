package com.mobilefuse.sdk.nativeads;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J:\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0010\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/mobilefuse/sdk/nativeads/NativeImgAsset;", "Lcom/mobilefuse/sdk/nativeads/NativeAsset;", "id", "", "width", "height", "url", "", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getId", "()I", "getUrl", "()Ljava/lang/String;", "getWidth", "component1", "component2", "component3", "component4", MenuActionType.COPY, "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/mobilefuse/sdk/nativeads/NativeImgAsset;", "equals", "", "other", "", "hashCode", "toString", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class NativeImgAsset implements NativeAsset {

    @Nullable
    private final Integer height;
    private final int id;

    @NotNull
    private final String url;

    @Nullable
    private final Integer width;

    public NativeImgAsset(int i10, @Nullable Integer num, @Nullable Integer num2, @NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.id = i10;
        this.width = num;
        this.height = num2;
        this.url = url;
    }

    public static /* synthetic */ NativeImgAsset copy$default(NativeImgAsset nativeImgAsset, int i10, Integer num, Integer num2, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = nativeImgAsset.getId();
        }
        if ((i11 & 2) != 0) {
            num = nativeImgAsset.width;
        }
        if ((i11 & 4) != 0) {
            num2 = nativeImgAsset.height;
        }
        if ((i11 & 8) != 0) {
            str = nativeImgAsset.url;
        }
        return nativeImgAsset.copy(i10, num, num2, str);
    }

    public final int component1() {
        return getId();
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final NativeImgAsset copy(int id2, @Nullable Integer width, @Nullable Integer height, @NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new NativeImgAsset(id2, width, height, url);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeImgAsset)) {
            return false;
        }
        NativeImgAsset nativeImgAsset = (NativeImgAsset) other;
        return getId() == nativeImgAsset.getId() && Intrinsics.areEqual(this.width, nativeImgAsset.width) && Intrinsics.areEqual(this.height, nativeImgAsset.height) && Intrinsics.areEqual(this.url, nativeImgAsset.url);
    }

    @Nullable
    public final Integer getHeight() {
        return this.height;
    }

    @Override // com.mobilefuse.sdk.nativeads.NativeAsset
    public int getId() {
        return this.id;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        int id2 = getId() * 31;
        Integer num = this.width;
        int iHashCode = (id2 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.height;
        int iHashCode2 = (iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str = this.url;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NativeImgAsset(id=" + getId() + ", width=" + this.width + ", height=" + this.height + ", url=" + this.url + ")";
    }
}
