package com.vungle.ads.internal.model;

import androidx.compose.foundation.c;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.util.Logger;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001:B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0013\u00102\u001a\u00020\u00072\b\u00103\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00104\u001a\u00020\tH\u0016J\u0006\u00105\u001a\u00020\u0007J\u0006\u00106\u001a\u000207J\b\u00108\u001a\u00020\u0003H\u0016J\u0006\u00109\u001a\u000207R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0016\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\fR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0010\"\u0004\b&\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\fR\u001a\u0010(\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u000e\u0010.\u001a\u00020/X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/vungle/ads/internal/model/AdAsset;", "", "adIdentifier", "", "serverPath", "localPath", "isRequired", "", "percentage", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;)V", "getAdIdentifier", "()Ljava/lang/String;", "contentLength", "", "getContentLength", "()J", "setContentLength", "(J)V", "fileSize", "getFileSize", "setFileSize", "isHtmlTemplate", "()Z", "isMainVideo", "isPrivacyIcon", "getLocalPath", "getPercentage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "rangeEnd", "getRangeEnd", "()Ljava/lang/Long;", "setRangeEnd", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "rangeStart", "getRangeStart", "setRangeStart", "getServerPath", "status", "Lcom/vungle/ads/internal/model/AdAsset$Status;", "getStatus", "()Lcom/vungle/ads/internal/model/AdAsset$Status;", "setStatus", "(Lcom/vungle/ads/internal/model/AdAsset$Status;)V", "waitLock", "Ljava/lang/Object;", "waitingForDownload", "Ljava/util/concurrent/atomic/AtomicBoolean;", "equals", "other", "hashCode", "isWaitingForDownload", "notifyDownloadEnough", "", "toString", "waitForDownload", "Status", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AdAsset {

    @NotNull
    private final String adIdentifier;
    private long contentLength;
    private long fileSize;
    private final boolean isRequired;

    @NotNull
    private final String localPath;

    @Nullable
    private final Integer percentage;

    @Nullable
    private Long rangeEnd;
    private long rangeStart;

    @NotNull
    private final String serverPath;

    @NotNull
    private Status status;

    @NotNull
    private final Object waitLock;

    @NotNull
    private final AtomicBoolean waitingForDownload;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/vungle/ads/internal/model/AdAsset$Status;", "", "(Ljava/lang/String;I)V", "NEW", "DOWNLOAD_RUNNING", "DOWNLOAD_FAILED", "DOWNLOAD_SUCCESS", "PROCESSED", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Status {
        NEW,
        DOWNLOAD_RUNNING,
        DOWNLOAD_FAILED,
        DOWNLOAD_SUCCESS,
        PROCESSED
    }

    public AdAsset(@NotNull String adIdentifier, @NotNull String serverPath, @NotNull String localPath, boolean z10, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(adIdentifier, "adIdentifier");
        Intrinsics.checkNotNullParameter(serverPath, "serverPath");
        Intrinsics.checkNotNullParameter(localPath, "localPath");
        this.adIdentifier = adIdentifier;
        this.serverPath = serverPath;
        this.localPath = localPath;
        this.isRequired = z10;
        this.percentage = num;
        this.status = Status.NEW;
        this.waitLock = new Object();
        this.waitingForDownload = new AtomicBoolean(false);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(AdAsset.class, other.getClass())) {
            return false;
        }
        AdAsset adAsset = (AdAsset) other;
        if (this.status == adAsset.status && this.fileSize == adAsset.fileSize && this.isRequired == adAsset.isRequired && Intrinsics.areEqual(this.adIdentifier, adAsset.adIdentifier) && Intrinsics.areEqual(this.serverPath, adAsset.serverPath) && this.contentLength == adAsset.contentLength && Intrinsics.areEqual(this.percentage, adAsset.percentage)) {
            return Intrinsics.areEqual(this.localPath, adAsset.localPath);
        }
        return false;
    }

    @NotNull
    public final String getAdIdentifier() {
        return this.adIdentifier;
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    @NotNull
    public final String getLocalPath() {
        return this.localPath;
    }

    @Nullable
    public final Integer getPercentage() {
        return this.percentage;
    }

    @Nullable
    public final Long getRangeEnd() {
        return this.rangeEnd;
    }

    public final long getRangeStart() {
        return this.rangeStart;
    }

    @NotNull
    public final String getServerPath() {
        return this.serverPath;
    }

    @NotNull
    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = ((((((this.adIdentifier.hashCode() * 31) + this.serverPath.hashCode()) * 31) + this.localPath.hashCode()) * 31) + this.status.hashCode()) * 31;
        long j10 = this.fileSize;
        int iA = (((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + c.a(this.isRequired)) * 31;
        long j11 = this.contentLength;
        int i10 = (iA + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        Integer num = this.percentage;
        return i10 + (num != null ? num.hashCode() : 0);
    }

    public final boolean isHtmlTemplate() {
        return Intrinsics.areEqual(this.adIdentifier, AdPayload.KEY_VM);
    }

    public final boolean isMainVideo() {
        return Intrinsics.areEqual(this.adIdentifier, Constants.KEY_MAIN_VIDEO);
    }

    public final boolean isPrivacyIcon() {
        return Intrinsics.areEqual(this.adIdentifier, "VUNGLE_PRIVACY_ICON_URL");
    }

    /* JADX INFO: renamed from: isRequired, reason: from getter */
    public final boolean getIsRequired() {
        return this.isRequired;
    }

    public final boolean isWaitingForDownload() {
        return this.waitingForDownload.get();
    }

    public final void notifyDownloadEnough() {
        if (this.waitingForDownload.getAndSet(false)) {
            synchronized (this.waitLock) {
                this.waitLock.notifyAll();
                Unit unit = Unit.f93236a;
            }
        }
    }

    public final void setContentLength(long j10) {
        this.contentLength = j10;
    }

    public final void setFileSize(long j10) {
        this.fileSize = j10;
    }

    public final void setRangeEnd(@Nullable Long l10) {
        this.rangeEnd = l10;
    }

    public final void setRangeStart(long j10) {
        this.rangeStart = j10;
    }

    public final void setStatus(@NotNull Status status) {
        Intrinsics.checkNotNullParameter(status, "<set-?>");
        this.status = status;
    }

    @NotNull
    public String toString() {
        return "AdAsset(adIdentifier=" + this.adIdentifier + ", serverPath=" + this.serverPath + ", localPath=" + this.localPath + ", status=" + this.status + ", fileSize=" + this.fileSize + ", contentLength=" + this.contentLength + ", isRequired=" + this.isRequired + ", percentage=" + this.percentage + ')';
    }

    public final void waitForDownload() {
        Object objB;
        this.waitingForDownload.set(true);
        synchronized (this.waitLock) {
            try {
                Result.Companion companion = Result.f93230c;
                this.waitLock.wait();
                objB = Result.b(Unit.f93236a);
            } finally {
            }
            Throwable thG = Result.g(objB);
            if (thG != null) {
                Logger.INSTANCE.e("AdAsset", "Interrupted while waiting for file download: " + this, thG);
            }
        }
    }

    public /* synthetic */ AdAsset(String str, String str2, String str3, boolean z10, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, z10, (i10 & 16) != 0 ? null : num);
    }
}
