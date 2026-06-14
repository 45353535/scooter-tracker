package org.bidon.sdk.regulation;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lorg/bidon/sdk/regulation/Iab;", "", "tcfV1", "", "tcfV2", "usPrivacy", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTcfV1", "()Ljava/lang/String;", "getTcfV2", "getUsPrivacy", "component1", "component2", "component3", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Iab {

    @Nullable
    private final String tcfV1;

    @Nullable
    private final String tcfV2;

    @Nullable
    private final String usPrivacy;

    public Iab(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.tcfV1 = str;
        this.tcfV2 = str2;
        this.usPrivacy = str3;
    }

    public static /* synthetic */ Iab copy$default(Iab iab, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = iab.tcfV1;
        }
        if ((i10 & 2) != 0) {
            str2 = iab.tcfV2;
        }
        if ((i10 & 4) != 0) {
            str3 = iab.usPrivacy;
        }
        return iab.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTcfV1() {
        return this.tcfV1;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTcfV2() {
        return this.tcfV2;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUsPrivacy() {
        return this.usPrivacy;
    }

    @NotNull
    public final Iab copy(@Nullable String tcfV1, @Nullable String tcfV2, @Nullable String usPrivacy) {
        return new Iab(tcfV1, tcfV2, usPrivacy);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Iab)) {
            return false;
        }
        Iab iab = (Iab) other;
        return Intrinsics.areEqual(this.tcfV1, iab.tcfV1) && Intrinsics.areEqual(this.tcfV2, iab.tcfV2) && Intrinsics.areEqual(this.usPrivacy, iab.usPrivacy);
    }

    @Nullable
    public final String getTcfV1() {
        return this.tcfV1;
    }

    @Nullable
    public final String getTcfV2() {
        return this.tcfV2;
    }

    @Nullable
    public final String getUsPrivacy() {
        return this.usPrivacy;
    }

    public int hashCode() {
        String str = this.tcfV1;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tcfV2;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.usPrivacy;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Iab(tcfV1=" + this.tcfV1 + ", tcfV2=" + this.tcfV2 + ", usPrivacy=" + this.usPrivacy + ")";
    }
}
