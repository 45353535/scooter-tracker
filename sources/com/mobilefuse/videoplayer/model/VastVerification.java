package com.mobilefuse.videoplayer.model;

import com.mobilefuse.videoplayer.model.VastEventOwner;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.z;
import com.taurusx.tax.g.n;
import com.taurusx.tax.vast.ViewabilityVendor;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/mobilefuse/videoplayer/model/VastVerification;", "Lcom/mobilefuse/videoplayer/model/VastEventOwner;", z.f66061c, "", "events", "", "Lcom/mobilefuse/videoplayer/model/VastEvent;", n.f66163g, "Lcom/mobilefuse/videoplayer/model/VastBaseVerificationResource;", ViewabilityVendor.f67069t, "(Ljava/lang/String;Ljava/util/Set;Lcom/mobilefuse/videoplayer/model/VastBaseVerificationResource;Ljava/lang/String;)V", "getEvents", "()Ljava/util/Set;", "getResource", "()Lcom/mobilefuse/videoplayer/model/VastBaseVerificationResource;", "getVendor", "()Ljava/lang/String;", "getVerificationParameters", "component1", "component2", "component3", "component4", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class VastVerification implements VastEventOwner {

    @NotNull
    private final Set<VastEvent> events;

    @Nullable
    private final VastBaseVerificationResource resource;

    @Nullable
    private final String vendor;

    @Nullable
    private final String verificationParameters;

    public VastVerification(@Nullable String str, @NotNull Set<VastEvent> events, @Nullable VastBaseVerificationResource vastBaseVerificationResource, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(events, "events");
        this.vendor = str;
        this.events = events;
        this.resource = vastBaseVerificationResource;
        this.verificationParameters = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VastVerification copy$default(VastVerification vastVerification, String str, Set set, VastBaseVerificationResource vastBaseVerificationResource, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = vastVerification.vendor;
        }
        if ((i10 & 2) != 0) {
            set = vastVerification.getEvents();
        }
        if ((i10 & 4) != 0) {
            vastBaseVerificationResource = vastVerification.resource;
        }
        if ((i10 & 8) != 0) {
            str2 = vastVerification.verificationParameters;
        }
        return vastVerification.copy(str, set, vastBaseVerificationResource, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVendor() {
        return this.vendor;
    }

    @NotNull
    public final Set<VastEvent> component2() {
        return getEvents();
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final VastBaseVerificationResource getResource() {
        return this.resource;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVerificationParameters() {
        return this.verificationParameters;
    }

    @NotNull
    public final VastVerification copy(@Nullable String vendor, @NotNull Set<VastEvent> events, @Nullable VastBaseVerificationResource resource, @Nullable String verificationParameters) {
        Intrinsics.checkNotNullParameter(events, "events");
        return new VastVerification(vendor, events, resource, verificationParameters);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VastVerification)) {
            return false;
        }
        VastVerification vastVerification = (VastVerification) other;
        return Intrinsics.areEqual(this.vendor, vastVerification.vendor) && Intrinsics.areEqual(getEvents(), vastVerification.getEvents()) && Intrinsics.areEqual(this.resource, vastVerification.resource) && Intrinsics.areEqual(this.verificationParameters, vastVerification.verificationParameters);
    }

    @Override // com.mobilefuse.videoplayer.model.VastEventOwner
    @NotNull
    public Set<VastEvent> getEvents(@NotNull EventType eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return VastEventOwner.DefaultImpls.getEvents(this, eventType);
    }

    @Nullable
    public final VastBaseVerificationResource getResource() {
        return this.resource;
    }

    @Nullable
    public final String getVendor() {
        return this.vendor;
    }

    @Nullable
    public final String getVerificationParameters() {
        return this.verificationParameters;
    }

    public int hashCode() {
        String str = this.vendor;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Set<VastEvent> events = getEvents();
        int iHashCode2 = (iHashCode + (events != null ? events.hashCode() : 0)) * 31;
        VastBaseVerificationResource vastBaseVerificationResource = this.resource;
        int iHashCode3 = (iHashCode2 + (vastBaseVerificationResource != null ? vastBaseVerificationResource.hashCode() : 0)) * 31;
        String str2 = this.verificationParameters;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "VastVerification(vendor=" + this.vendor + ", events=" + getEvents() + ", resource=" + this.resource + ", verificationParameters=" + this.verificationParameters + ")";
    }

    @Override // com.mobilefuse.videoplayer.model.VastEventOwner
    @NotNull
    public Set<VastEvent> getEvents(@NotNull EventType eventType, @Nullable String str) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return VastEventOwner.DefaultImpls.getEvents(this, eventType, str);
    }

    @Override // com.mobilefuse.videoplayer.model.VastEventOwner
    @NotNull
    public Set<VastEvent> getEvents() {
        return this.events;
    }
}
