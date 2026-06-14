package com.mobilefuse.sdk.internal.repository;

import com.mobilefuse.sdk.component.ParsedAdMarkup;
import com.mobilefuse.sdk.network.model.MfxBidResponse;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/mobilefuse/sdk/internal/repository/ParsedAdMarkupResponse;", "Lcom/mobilefuse/sdk/internal/repository/AdRepositoryResponse;", "bidResponse", "Lcom/mobilefuse/sdk/network/model/MfxBidResponse;", "markup", "Lcom/mobilefuse/sdk/component/ParsedAdMarkup;", "(Lcom/mobilefuse/sdk/network/model/MfxBidResponse;Lcom/mobilefuse/sdk/component/ParsedAdMarkup;)V", "getBidResponse", "()Lcom/mobilefuse/sdk/network/model/MfxBidResponse;", "getMarkup", "()Lcom/mobilefuse/sdk/component/ParsedAdMarkup;", "component1", "component2", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class ParsedAdMarkupResponse implements AdRepositoryResponse {

    @NotNull
    private final MfxBidResponse bidResponse;

    @NotNull
    private final ParsedAdMarkup markup;

    public ParsedAdMarkupResponse(@NotNull MfxBidResponse bidResponse, @NotNull ParsedAdMarkup markup) {
        Intrinsics.checkNotNullParameter(bidResponse, "bidResponse");
        Intrinsics.checkNotNullParameter(markup, "markup");
        this.bidResponse = bidResponse;
        this.markup = markup;
    }

    public static /* synthetic */ ParsedAdMarkupResponse copy$default(ParsedAdMarkupResponse parsedAdMarkupResponse, MfxBidResponse mfxBidResponse, ParsedAdMarkup parsedAdMarkup, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mfxBidResponse = parsedAdMarkupResponse.getBidResponse();
        }
        if ((i10 & 2) != 0) {
            parsedAdMarkup = parsedAdMarkupResponse.markup;
        }
        return parsedAdMarkupResponse.copy(mfxBidResponse, parsedAdMarkup);
    }

    @NotNull
    public final MfxBidResponse component1() {
        return getBidResponse();
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ParsedAdMarkup getMarkup() {
        return this.markup;
    }

    @NotNull
    public final ParsedAdMarkupResponse copy(@NotNull MfxBidResponse bidResponse, @NotNull ParsedAdMarkup markup) {
        Intrinsics.checkNotNullParameter(bidResponse, "bidResponse");
        Intrinsics.checkNotNullParameter(markup, "markup");
        return new ParsedAdMarkupResponse(bidResponse, markup);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParsedAdMarkupResponse)) {
            return false;
        }
        ParsedAdMarkupResponse parsedAdMarkupResponse = (ParsedAdMarkupResponse) other;
        return Intrinsics.areEqual(getBidResponse(), parsedAdMarkupResponse.getBidResponse()) && Intrinsics.areEqual(this.markup, parsedAdMarkupResponse.markup);
    }

    @Override // com.mobilefuse.sdk.internal.repository.AdRepositoryResponse
    @NotNull
    public MfxBidResponse getBidResponse() {
        return this.bidResponse;
    }

    @NotNull
    public final ParsedAdMarkup getMarkup() {
        return this.markup;
    }

    public int hashCode() {
        MfxBidResponse bidResponse = getBidResponse();
        int iHashCode = (bidResponse != null ? bidResponse.hashCode() : 0) * 31;
        ParsedAdMarkup parsedAdMarkup = this.markup;
        return iHashCode + (parsedAdMarkup != null ? parsedAdMarkup.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ParsedAdMarkupResponse(bidResponse=" + getBidResponse() + ", markup=" + this.markup + ")";
    }
}
