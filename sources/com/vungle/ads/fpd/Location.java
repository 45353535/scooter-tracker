package com.vungle.ads.fpd;

import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import ug.l;
import xg.f;
import yg.t2;

/* JADX INFO: loaded from: classes11.dex */
@l
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001b\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fHÇ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/vungle/ads/fpd/Location;", "", "<init>", "()V", "", "seen1", "Lyg/t2;", "serializationConstructorMarker", "(ILyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/fpd/Location;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "country", "setCountry", "(Ljava/lang/String;)Lcom/vungle/ads/fpd/Location;", "regionState", "setRegionState", "dma", "setDma", "(I)Lcom/vungle/ads/fpd/Location;", y.f66058y, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Location {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/fpd/Location$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/fpd/Location;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Location$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Location() {
    }

    public static final void write$Self(@NotNull Location self, @NotNull f output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
    }

    @NotNull
    public final Location setCountry(@NotNull String country) {
        Intrinsics.checkNotNullParameter(country, "country");
        return this;
    }

    @NotNull
    public final Location setDma(int dma) {
        return this;
    }

    @NotNull
    public final Location setRegionState(@NotNull String regionState) {
        Intrinsics.checkNotNullParameter(regionState, "regionState");
        return this;
    }

    public /* synthetic */ Location(int i10, t2 t2Var) {
    }
}
