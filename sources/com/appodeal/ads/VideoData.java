package com.appodeal.ads;

import android.net.Uri;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/appodeal/ads/VideoData;", "", "Autoload", "Remote", "LocalUri", "Lcom/appodeal/ads/VideoData$Autoload;", "Lcom/appodeal/ads/VideoData$LocalUri;", "Lcom/appodeal/ads/VideoData$Remote;", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface VideoData {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/appodeal/ads/VideoData$Autoload;", "Lcom/appodeal/ads/VideoData;", "<init>", "()V", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Autoload implements VideoData {
        public static final Autoload INSTANCE = new Autoload();

        private Autoload() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/appodeal/ads/VideoData$LocalUri;", "Lcom/appodeal/ads/VideoData;", "localUri", "Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "getLocalUri", "()Landroid/net/Uri;", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LocalUri implements VideoData {
        private final Uri localUri;

        public LocalUri(Uri localUri) {
            Intrinsics.checkNotNullParameter(localUri, "localUri");
            this.localUri = localUri;
        }

        public final Uri getLocalUri() {
            return this.localUri;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/appodeal/ads/VideoData$Remote;", "Lcom/appodeal/ads/VideoData;", "remoteUrl", "", "<init>", "(Ljava/lang/String;)V", "getRemoteUrl", "()Ljava/lang/String;", "component1", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Remote implements VideoData {
        private final String remoteUrl;

        public Remote(String remoteUrl) {
            Intrinsics.checkNotNullParameter(remoteUrl, "remoteUrl");
            this.remoteUrl = remoteUrl;
        }

        public static /* synthetic */ Remote copy$default(Remote remote, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = remote.remoteUrl;
            }
            return remote.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getRemoteUrl() {
            return this.remoteUrl;
        }

        public final Remote copy(String remoteUrl) {
            Intrinsics.checkNotNullParameter(remoteUrl, "remoteUrl");
            return new Remote(remoteUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Remote) && Intrinsics.areEqual(this.remoteUrl, ((Remote) other).remoteUrl);
        }

        public final String getRemoteUrl() {
            return this.remoteUrl;
        }

        public int hashCode() {
            return this.remoteUrl.hashCode();
        }

        public String toString() {
            return "Remote(remoteUrl=" + this.remoteUrl + ")";
        }
    }
}
