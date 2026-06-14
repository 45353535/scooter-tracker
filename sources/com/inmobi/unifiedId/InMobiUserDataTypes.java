package com.inmobi.unifiedId;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/inmobi/unifiedId/InMobiUserDataTypes;", "", "md5", "", "sha1", "sha256", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMd5", "()Ljava/lang/String;", "getSha1", "getSha256", "component1", "component2", "component3", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", "Builder", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class InMobiUserDataTypes {

    @Nullable
    private final String md5;

    @Nullable
    private final String sha1;

    @Nullable
    private final String sha256;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\u0006J\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/inmobi/unifiedId/InMobiUserDataTypes$Builder;", "", "<init>", "()V", "", "md5", "(Ljava/lang/String;)Lcom/inmobi/unifiedId/InMobiUserDataTypes$Builder;", "sha1", "sha256", "Lcom/inmobi/unifiedId/InMobiUserDataTypes;", "build", "()Lcom/inmobi/unifiedId/InMobiUserDataTypes;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f40094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f40095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f40096c;

        @NotNull
        public final InMobiUserDataTypes build() {
            return new InMobiUserDataTypes(this.f40094a, this.f40095b, this.f40096c);
        }

        @NotNull
        public final Builder md5(@Nullable String md5) {
            this.f40094a = md5;
            return this;
        }

        @NotNull
        public final Builder sha1(@Nullable String sha1) {
            this.f40095b = sha1;
            return this;
        }

        @NotNull
        public final Builder sha256(@Nullable String sha256) {
            this.f40096c = sha256;
            return this;
        }
    }

    public InMobiUserDataTypes(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.md5 = str;
        this.sha1 = str2;
        this.sha256 = str3;
    }

    public static /* synthetic */ InMobiUserDataTypes copy$default(InMobiUserDataTypes inMobiUserDataTypes, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = inMobiUserDataTypes.md5;
        }
        if ((i10 & 2) != 0) {
            str2 = inMobiUserDataTypes.sha1;
        }
        if ((i10 & 4) != 0) {
            str3 = inMobiUserDataTypes.sha256;
        }
        return inMobiUserDataTypes.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMd5() {
        return this.md5;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSha1() {
        return this.sha1;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSha256() {
        return this.sha256;
    }

    @NotNull
    public final InMobiUserDataTypes copy(@Nullable String md5, @Nullable String sha1, @Nullable String sha256) {
        return new InMobiUserDataTypes(md5, sha1, sha256);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InMobiUserDataTypes)) {
            return false;
        }
        InMobiUserDataTypes inMobiUserDataTypes = (InMobiUserDataTypes) other;
        return Intrinsics.areEqual(this.md5, inMobiUserDataTypes.md5) && Intrinsics.areEqual(this.sha1, inMobiUserDataTypes.sha1) && Intrinsics.areEqual(this.sha256, inMobiUserDataTypes.sha256);
    }

    @Nullable
    public final String getMd5() {
        return this.md5;
    }

    @Nullable
    public final String getSha1() {
        return this.sha1;
    }

    @Nullable
    public final String getSha256() {
        return this.sha256;
    }

    public int hashCode() {
        String str = this.md5;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sha1;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sha256;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "InMobiUserDataTypes(md5=" + this.md5 + ", sha1=" + this.sha1 + ", sha256=" + this.sha256 + ")";
    }
}
