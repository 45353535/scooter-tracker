package com.google.maps.android;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/google/maps/android/ResponseStreetView;", "", "Lcom/google/maps/android/Status;", "status", "<init>", "(Lcom/google/maps/android/Status;)V", "component1", "()Lcom/google/maps/android/Status;", MenuActionType.COPY, "(Lcom/google/maps/android/Status;)Lcom/google/maps/android/ResponseStreetView;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/google/maps/android/Status;", "getStatus", "library_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class ResponseStreetView {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Status status;

    public ResponseStreetView(@NotNull Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
    }

    public static /* synthetic */ ResponseStreetView copy$default(ResponseStreetView responseStreetView, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            status = responseStreetView.status;
        }
        return responseStreetView.copy(status);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    @NotNull
    public final ResponseStreetView copy(@NotNull Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new ResponseStreetView(status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ResponseStreetView) && this.status == ((ResponseStreetView) other).status;
    }

    @NotNull
    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode();
    }

    @NotNull
    public String toString() {
        return "ResponseStreetView(status=" + this.status + ')';
    }
}
