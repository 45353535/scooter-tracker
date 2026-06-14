package com.vungle.ads.internal.model;

import android.util.Base64;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.zip.GZIPInputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uf.c;
import ug.l;
import ug.v;
import xg.f;
import yg.t2;
import yg.x0;
import yg.y2;

/* JADX INFO: loaded from: classes11.dex */
@l
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>=B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tBI\b\u0017\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017HÇ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001f\u0010\u001dJ\u000f\u0010 \u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\"\u0010\u001dJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010\u001dJ\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b&\u0010'J:\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b*\u0010\u001dJ\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010\u001dR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010'R\u001a\u00108\u001a\u0002078\u0002X\u0083\u0004¢\u0006\f\n\u0004\b8\u00109\u0012\u0004\b:\u0010;R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010<¨\u0006?"}, d2 = {"Lcom/vungle/ads/internal/model/BidPayload;", "", "", "version", "", "adunit", "", "impression", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "seen1", "Lcom/vungle/ads/internal/model/AdPayload;", "ad", "Lyg/t2;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lcom/vungle/ads/internal/model/AdPayload;Lyg/t2;)V", "", "compressed", "gzipDecode", "([B)Ljava/lang/String;", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/internal/model/BidPayload;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "getPlacementId", "()Ljava/lang/String;", "getEventId", "getCreativeId", "getAdPayload", "()Lcom/vungle/ads/internal/model/AdPayload;", "getDecodedAdsResponse", "component1", "()Ljava/lang/Integer;", "component2", "component3", "()Ljava/util/List;", MenuActionType.COPY, "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/vungle/ads/internal/model/BidPayload;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getVersion", "Ljava/lang/String;", "getAdunit", "Ljava/util/List;", "getImpression", "Lkotlinx/serialization/json/b;", "json", "Lkotlinx/serialization/json/b;", "getJson$annotations", "()V", "Lcom/vungle/ads/internal/model/AdPayload;", y.f66058y, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class BidPayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final AdPayload ad;

    @Nullable
    private final String adunit;

    @Nullable
    private final List<String> impression;

    @NotNull
    private final b json;

    @Nullable
    private final Integer version;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/BidPayload$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/BidPayload;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BidPayload$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BidPayload() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BidPayload copy$default(BidPayload bidPayload, Integer num, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = bidPayload.version;
        }
        if ((i10 & 2) != 0) {
            str = bidPayload.adunit;
        }
        if ((i10 & 4) != 0) {
            list = bidPayload.impression;
        }
        return bidPayload.copy(num, str, list);
    }

    private static /* synthetic */ void getJson$annotations() {
    }

    private final String gzipDecode(byte[] compressed) throws Throwable {
        GZIPInputStream gZIPInputStream;
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(compressed);
        try {
            gZIPInputStream = new GZIPInputStream(byteArrayInputStream, 1024);
            try {
                bArr = new byte[1024];
            } finally {
            }
        } finally {
        }
        while (true) {
            int i10 = gZIPInputStream.read(bArr);
            if (i10 == -1) {
                Unit unit = Unit.f93236a;
                c.a(gZIPInputStream, null);
                c.a(byteArrayInputStream, null);
                String string = byteArrayOutputStream.toString();
                Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
                return string;
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    public static final void write$Self(@NotNull BidPayload self, @NotNull f output, @NotNull SerialDescriptor serialDesc) {
        String decodedAdsResponse;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.r(serialDesc, 0) || self.version != null) {
            output.h(serialDesc, 0, x0.f119093a, self.version);
        }
        if (output.r(serialDesc, 1) || self.adunit != null) {
            output.h(serialDesc, 1, y2.f119104a, self.adunit);
        }
        if (output.r(serialDesc, 2) || self.impression != null) {
            output.h(serialDesc, 2, new yg.f(y2.f119104a), self.impression);
        }
        if (!output.r(serialDesc, 3)) {
            AdPayload adPayload = self.ad;
            AdPayload adPayload2 = null;
            if (self.adunit != null && (decodedAdsResponse = self.getDecodedAdsResponse()) != null) {
                b bVar = self.json;
                KSerializer kSerializerB = v.b(bVar.a(), v0.o(AdPayload.class));
                Intrinsics.checkNotNull(kSerializerB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                adPayload2 = (AdPayload) bVar.c(kSerializerB, decodedAdsResponse);
            }
            if (Intrinsics.areEqual(adPayload, adPayload2)) {
                return;
            }
        }
        output.h(serialDesc, 3, AdPayload$$serializer.INSTANCE, self.ad);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getVersion() {
        return this.version;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAdunit() {
        return this.adunit;
    }

    @Nullable
    public final List<String> component3() {
        return this.impression;
    }

    @NotNull
    public final BidPayload copy(@Nullable Integer version, @Nullable String adunit, @Nullable List<String> impression) {
        return new BidPayload(version, adunit, impression);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BidPayload)) {
            return false;
        }
        BidPayload bidPayload = (BidPayload) other;
        return Intrinsics.areEqual(this.version, bidPayload.version) && Intrinsics.areEqual(this.adunit, bidPayload.adunit) && Intrinsics.areEqual(this.impression, bidPayload.impression);
    }

    @Nullable
    /* JADX INFO: renamed from: getAdPayload, reason: from getter */
    public final AdPayload getAd() {
        return this.ad;
    }

    @Nullable
    public final String getAdunit() {
        return this.adunit;
    }

    @Nullable
    public final String getCreativeId() {
        AdPayload adPayload = this.ad;
        if (adPayload != null) {
            return adPayload.getCreativeId();
        }
        return null;
    }

    @Nullable
    public final String getDecodedAdsResponse() throws Throwable {
        byte[] bArrDecode = Base64.decode(this.adunit, 0);
        if (bArrDecode != null) {
            return gzipDecode(bArrDecode);
        }
        return null;
    }

    @Nullable
    public final String getEventId() {
        AdPayload adPayload = this.ad;
        if (adPayload != null) {
            return adPayload.eventId();
        }
        return null;
    }

    @Nullable
    public final List<String> getImpression() {
        return this.impression;
    }

    @Nullable
    public final String getPlacementId() {
        AdPayload adPayload = this.ad;
        if (adPayload != null) {
            return adPayload.placementId();
        }
        return null;
    }

    @Nullable
    public final Integer getVersion() {
        return this.version;
    }

    public int hashCode() {
        Integer num = this.version;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.adunit;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.impression;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BidPayload(version=" + this.version + ", adunit=" + this.adunit + ", impression=" + this.impression + ')';
    }

    public /* synthetic */ BidPayload(int i10, Integer num, String str, List list, AdPayload adPayload, t2 t2Var) {
        String decodedAdsResponse;
        AdPayload adPayload2 = null;
        if ((i10 & 1) == 0) {
            this.version = null;
        } else {
            this.version = num;
        }
        if ((i10 & 2) == 0) {
            this.adunit = null;
        } else {
            this.adunit = str;
        }
        if ((i10 & 4) == 0) {
            this.impression = null;
        } else {
            this.impression = list;
        }
        b bVarB = kotlinx.serialization.json.v.b(null, new Function1<e, Unit>() { // from class: com.vungle.ads.internal.model.BidPayload.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(e eVar) {
                invoke2(eVar);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull e Json) {
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.f(true);
                Json.d(true);
                Json.e(false);
            }
        }, 1, null);
        this.json = bVarB;
        if ((i10 & 8) != 0) {
            this.ad = adPayload;
            return;
        }
        if (this.adunit != null && (decodedAdsResponse = getDecodedAdsResponse()) != null) {
            KSerializer kSerializerB = v.b(bVarB.a(), v0.o(AdPayload.class));
            Intrinsics.checkNotNull(kSerializerB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            adPayload2 = (AdPayload) bVarB.c(kSerializerB, decodedAdsResponse);
        }
        this.ad = adPayload2;
    }

    public BidPayload(@Nullable Integer num, @Nullable String str, @Nullable List<String> list) {
        String decodedAdsResponse;
        this.version = num;
        this.adunit = str;
        this.impression = list;
        AdPayload adPayload = null;
        b bVarB = kotlinx.serialization.json.v.b(null, new Function1<e, Unit>() { // from class: com.vungle.ads.internal.model.BidPayload$json$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(e eVar) {
                invoke2(eVar);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull e Json) {
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.f(true);
                Json.d(true);
                Json.e(false);
            }
        }, 1, null);
        this.json = bVarB;
        if (str != null && (decodedAdsResponse = getDecodedAdsResponse()) != null) {
            KSerializer kSerializerB = v.b(bVarB.a(), v0.o(AdPayload.class));
            Intrinsics.checkNotNull(kSerializerB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            adPayload = (AdPayload) bVarB.c(kSerializerB, decodedAdsResponse);
        }
        this.ad = adPayload;
    }

    public /* synthetic */ BidPayload(Integer num, String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : list);
    }
}
