package com.mobilefuse.videoplayer.model;

import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.o.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J+\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/mobilefuse/videoplayer/model/VastJavaScriptResource;", "Lcom/mobilefuse/videoplayer/model/VastBaseVerificationResource;", g.f66428y, "", "apiFramework", "Lcom/mobilefuse/videoplayer/model/VerificationApiFramework;", "isBrowserOptional", "", "(Ljava/lang/String;Lcom/mobilefuse/videoplayer/model/VerificationApiFramework;Z)V", "getApiFramework", "()Lcom/mobilefuse/videoplayer/model/VerificationApiFramework;", "()Z", "resourceType", "Lcom/mobilefuse/videoplayer/model/VastVerificationResourceType;", "getResourceType", "()Lcom/mobilefuse/videoplayer/model/VastVerificationResourceType;", "getUri", "()Ljava/lang/String;", "component1", "component2", "component3", MenuActionType.COPY, "equals", "other", "", "hashCode", "", "toString", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class VastJavaScriptResource implements VastBaseVerificationResource {

    @Nullable
    private final VerificationApiFramework apiFramework;
    private final boolean isBrowserOptional;

    @NotNull
    private final VastVerificationResourceType resourceType = VastVerificationResourceType.JAVASCRIPT;

    @Nullable
    private final String uri;

    public VastJavaScriptResource(@Nullable String str, @Nullable VerificationApiFramework verificationApiFramework, boolean z10) {
        this.uri = str;
        this.apiFramework = verificationApiFramework;
        this.isBrowserOptional = z10;
    }

    public static /* synthetic */ VastJavaScriptResource copy$default(VastJavaScriptResource vastJavaScriptResource, String str, VerificationApiFramework verificationApiFramework, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = vastJavaScriptResource.uri;
        }
        if ((i10 & 2) != 0) {
            verificationApiFramework = vastJavaScriptResource.apiFramework;
        }
        if ((i10 & 4) != 0) {
            z10 = vastJavaScriptResource.isBrowserOptional;
        }
        return vastJavaScriptResource.copy(str, verificationApiFramework, z10);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final VerificationApiFramework getApiFramework() {
        return this.apiFramework;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsBrowserOptional() {
        return this.isBrowserOptional;
    }

    @NotNull
    public final VastJavaScriptResource copy(@Nullable String uri, @Nullable VerificationApiFramework apiFramework, boolean isBrowserOptional) {
        return new VastJavaScriptResource(uri, apiFramework, isBrowserOptional);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VastJavaScriptResource)) {
            return false;
        }
        VastJavaScriptResource vastJavaScriptResource = (VastJavaScriptResource) other;
        return Intrinsics.areEqual(this.uri, vastJavaScriptResource.uri) && Intrinsics.areEqual(this.apiFramework, vastJavaScriptResource.apiFramework) && this.isBrowserOptional == vastJavaScriptResource.isBrowserOptional;
    }

    @Nullable
    public final VerificationApiFramework getApiFramework() {
        return this.apiFramework;
    }

    @Override // com.mobilefuse.videoplayer.model.VastBaseVerificationResource
    @NotNull
    public VastVerificationResourceType getResourceType() {
        return this.resourceType;
    }

    @Nullable
    public final String getUri() {
        return this.uri;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public int hashCode() {
        String str = this.uri;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        VerificationApiFramework verificationApiFramework = this.apiFramework;
        int iHashCode2 = (iHashCode + (verificationApiFramework != null ? verificationApiFramework.hashCode() : 0)) * 31;
        boolean z10 = this.isBrowserOptional;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return iHashCode2 + r12;
    }

    public final boolean isBrowserOptional() {
        return this.isBrowserOptional;
    }

    @NotNull
    public String toString() {
        return "VastJavaScriptResource(uri=" + this.uri + ", apiFramework=" + this.apiFramework + ", isBrowserOptional=" + this.isBrowserOptional + ")";
    }
}
