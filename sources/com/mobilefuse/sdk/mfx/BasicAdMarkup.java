package com.mobilefuse.sdk.mfx;

import com.mobilefuse.sdk.component.ParsedAdMarkup;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/mobilefuse/sdk/mfx/BasicAdMarkup;", "Lcom/mobilefuse/sdk/component/ParsedAdMarkup;", "adm", "", "(Ljava/lang/String;)V", "getAdm", "()Ljava/lang/String;", "component1", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class BasicAdMarkup implements ParsedAdMarkup {

    @NotNull
    private final String adm;

    public BasicAdMarkup(@NotNull String adm) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        this.adm = adm;
    }

    public static /* synthetic */ BasicAdMarkup copy$default(BasicAdMarkup basicAdMarkup, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = basicAdMarkup.getAdm();
        }
        return basicAdMarkup.copy(str);
    }

    @NotNull
    public final String component1() {
        return getAdm();
    }

    @NotNull
    public final BasicAdMarkup copy(@NotNull String adm) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        return new BasicAdMarkup(adm);
    }

    public boolean equals(@Nullable Object other) {
        if (this != other) {
            return (other instanceof BasicAdMarkup) && Intrinsics.areEqual(getAdm(), ((BasicAdMarkup) other).getAdm());
        }
        return true;
    }

    @Override // com.mobilefuse.sdk.component.ParsedAdMarkup
    @NotNull
    public String getAdm() {
        return this.adm;
    }

    public int hashCode() {
        String adm = getAdm();
        if (adm != null) {
            return adm.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "BasicAdMarkup(adm=" + getAdm() + ")";
    }
}
