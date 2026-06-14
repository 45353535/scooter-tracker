package com.mobilefuse.sdk.nativeads;

import com.mobilefuse.sdk.component.ParsedAdMarkup;
import com.my.target.common.menu.MenuActionType;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u0006HÆ\u0003Jc\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J$\u0010#\u001a\u0004\u0018\u0001H$\"\n\b\u0000\u0010$\u0018\u0001*\u00020\u00072\u0006\u0010%\u001a\u00020&H\u0086\b¢\u0006\u0002\u0010'J\t\u0010(\u001a\u00020&HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f¨\u0006*"}, d2 = {"Lcom/mobilefuse/sdk/nativeads/NativeAdMarkup;", "Lcom/mobilefuse/sdk/component/ParsedAdMarkup;", "adm", "", "assetUrl", POBCoreNativeConstants.NATIVE_ASSETS, "", "Lcom/mobilefuse/sdk/nativeads/NativeAsset;", "impTrackers", POBCoreNativeConstants.NATIVE_LINK, "privacy", "eventTrackers", "Lcom/mobilefuse/sdk/nativeads/NativeEventTracker;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAdm", "()Ljava/lang/String;", "getAssetUrl", "getAssets", "()Ljava/util/List;", "getEventTrackers", "getImpTrackers", "getLink", "getPrivacy", "component1", "component2", "component3", "component4", "component5", "component6", "component7", MenuActionType.COPY, "equals", "", "other", "", "getAsset", "T", "id", "", "(I)Lcom/mobilefuse/sdk/nativeads/NativeAsset;", "hashCode", "toString", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class NativeAdMarkup implements ParsedAdMarkup {

    @NotNull
    private final String adm;

    @Nullable
    private final String assetUrl;

    @NotNull
    private final List<NativeAsset> assets;

    @NotNull
    private final List<NativeEventTracker> eventTrackers;

    @NotNull
    private final List<String> impTrackers;

    @NotNull
    private final String link;

    @NotNull
    private final String privacy;

    /* JADX WARN: Multi-variable type inference failed */
    public NativeAdMarkup(@NotNull String adm, @Nullable String str, @NotNull List<? extends NativeAsset> assets, @NotNull List<String> impTrackers, @NotNull String link, @NotNull String privacy, @NotNull List<NativeEventTracker> eventTrackers) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(impTrackers, "impTrackers");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(privacy, "privacy");
        Intrinsics.checkNotNullParameter(eventTrackers, "eventTrackers");
        this.adm = adm;
        this.assetUrl = str;
        this.assets = assets;
        this.impTrackers = impTrackers;
        this.link = link;
        this.privacy = privacy;
        this.eventTrackers = eventTrackers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NativeAdMarkup copy$default(NativeAdMarkup nativeAdMarkup, String str, String str2, List list, List list2, String str3, String str4, List list3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = nativeAdMarkup.getAdm();
        }
        if ((i10 & 2) != 0) {
            str2 = nativeAdMarkup.assetUrl;
        }
        if ((i10 & 4) != 0) {
            list = nativeAdMarkup.assets;
        }
        if ((i10 & 8) != 0) {
            list2 = nativeAdMarkup.impTrackers;
        }
        if ((i10 & 16) != 0) {
            str3 = nativeAdMarkup.link;
        }
        if ((i10 & 32) != 0) {
            str4 = nativeAdMarkup.privacy;
        }
        if ((i10 & 64) != 0) {
            list3 = nativeAdMarkup.eventTrackers;
        }
        String str5 = str4;
        List list4 = list3;
        String str6 = str3;
        List list5 = list;
        return nativeAdMarkup.copy(str, str2, list5, list2, str6, str5, list4);
    }

    @NotNull
    public final String component1() {
        return getAdm();
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAssetUrl() {
        return this.assetUrl;
    }

    @NotNull
    public final List<NativeAsset> component3() {
        return this.assets;
    }

    @NotNull
    public final List<String> component4() {
        return this.impTrackers;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPrivacy() {
        return this.privacy;
    }

    @NotNull
    public final List<NativeEventTracker> component7() {
        return this.eventTrackers;
    }

    @NotNull
    public final NativeAdMarkup copy(@NotNull String adm, @Nullable String assetUrl, @NotNull List<? extends NativeAsset> assets, @NotNull List<String> impTrackers, @NotNull String link, @NotNull String privacy, @NotNull List<NativeEventTracker> eventTrackers) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(impTrackers, "impTrackers");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(privacy, "privacy");
        Intrinsics.checkNotNullParameter(eventTrackers, "eventTrackers");
        return new NativeAdMarkup(adm, assetUrl, assets, impTrackers, link, privacy, eventTrackers);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeAdMarkup)) {
            return false;
        }
        NativeAdMarkup nativeAdMarkup = (NativeAdMarkup) other;
        return Intrinsics.areEqual(getAdm(), nativeAdMarkup.getAdm()) && Intrinsics.areEqual(this.assetUrl, nativeAdMarkup.assetUrl) && Intrinsics.areEqual(this.assets, nativeAdMarkup.assets) && Intrinsics.areEqual(this.impTrackers, nativeAdMarkup.impTrackers) && Intrinsics.areEqual(this.link, nativeAdMarkup.link) && Intrinsics.areEqual(this.privacy, nativeAdMarkup.privacy) && Intrinsics.areEqual(this.eventTrackers, nativeAdMarkup.eventTrackers);
    }

    @Override // com.mobilefuse.sdk.component.ParsedAdMarkup
    @NotNull
    public String getAdm() {
        return this.adm;
    }

    public final /* synthetic */ <T extends NativeAsset> T getAsset(int id2) {
        Iterator<NativeAsset> it = getAssets().iterator();
        while (it.hasNext()) {
            T t10 = (T) it.next();
            if (t10.getId() == id2) {
                Intrinsics.reifiedOperationMarker(3, "T");
                return t10;
            }
        }
        return null;
    }

    @Nullable
    public final String getAssetUrl() {
        return this.assetUrl;
    }

    @NotNull
    public final List<NativeAsset> getAssets() {
        return this.assets;
    }

    @NotNull
    public final List<NativeEventTracker> getEventTrackers() {
        return this.eventTrackers;
    }

    @NotNull
    public final List<String> getImpTrackers() {
        return this.impTrackers;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final String getPrivacy() {
        return this.privacy;
    }

    public int hashCode() {
        String adm = getAdm();
        int iHashCode = (adm != null ? adm.hashCode() : 0) * 31;
        String str = this.assetUrl;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<NativeAsset> list = this.assets;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.impTrackers;
        int iHashCode4 = (iHashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str2 = this.link;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.privacy;
        int iHashCode6 = (iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<NativeEventTracker> list3 = this.eventTrackers;
        return iHashCode6 + (list3 != null ? list3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NativeAdMarkup(adm=" + getAdm() + ", assetUrl=" + this.assetUrl + ", assets=" + this.assets + ", impTrackers=" + this.impTrackers + ", link=" + this.link + ", privacy=" + this.privacy + ", eventTrackers=" + this.eventTrackers + ")";
    }
}
