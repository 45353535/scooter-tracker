package com.unity3d.ads.core.data.model;

import androidx.collection.b;
import com.ironsource.C4240b4;
import com.my.target.common.menu.MenuActionType;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JS\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\fHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006&"}, d2 = {"Lcom/unity3d/ads/core/data/model/CachedFile;", "", "url", "", "name", C4240b4.i.f42616b, "Ljava/io/File;", "extension", "contentLength", "", "protocol", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "", "(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;JLjava/lang/String;I)V", "getContentLength", "()J", "getExtension", "()Ljava/lang/String;", "getFile", "()Ljava/io/File;", "getName", "getPriority", "()I", "getProtocol", "getUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", MenuActionType.COPY, "equals", "", "other", "hashCode", "toString", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CachedFile {
    private final long contentLength;

    @Nullable
    private final String extension;

    @Nullable
    private final File file;

    @NotNull
    private final String name;
    private final int priority;

    @NotNull
    private final String protocol;

    @NotNull
    private final String url;

    public CachedFile(@NotNull String url, @NotNull String name, @Nullable File file, @Nullable String str, long j10, @NotNull String protocol, int i10) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        this.url = url;
        this.name = name;
        this.file = file;
        this.extension = str;
        this.contentLength = j10;
        this.protocol = protocol;
        this.priority = i10;
    }

    public static /* synthetic */ CachedFile copy$default(CachedFile cachedFile, String str, String str2, File file, String str3, long j10, String str4, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cachedFile.url;
        }
        if ((i11 & 2) != 0) {
            str2 = cachedFile.name;
        }
        if ((i11 & 4) != 0) {
            file = cachedFile.file;
        }
        if ((i11 & 8) != 0) {
            str3 = cachedFile.extension;
        }
        if ((i11 & 16) != 0) {
            j10 = cachedFile.contentLength;
        }
        if ((i11 & 32) != 0) {
            str4 = cachedFile.protocol;
        }
        if ((i11 & 64) != 0) {
            i10 = cachedFile.priority;
        }
        long j11 = j10;
        File file2 = file;
        String str5 = str3;
        return cachedFile.copy(str, str2, file2, str5, j11, str4, i10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final File getFile() {
        return this.file;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getExtension() {
        return this.extension;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getContentLength() {
        return this.contentLength;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getProtocol() {
        return this.protocol;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    @NotNull
    public final CachedFile copy(@NotNull String url, @NotNull String name, @Nullable File file, @Nullable String extension, long contentLength, @NotNull String protocol, int priority) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        return new CachedFile(url, name, file, extension, contentLength, protocol, priority);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CachedFile)) {
            return false;
        }
        CachedFile cachedFile = (CachedFile) other;
        return Intrinsics.areEqual(this.url, cachedFile.url) && Intrinsics.areEqual(this.name, cachedFile.name) && Intrinsics.areEqual(this.file, cachedFile.file) && Intrinsics.areEqual(this.extension, cachedFile.extension) && this.contentLength == cachedFile.contentLength && Intrinsics.areEqual(this.protocol, cachedFile.protocol) && this.priority == cachedFile.priority;
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    @Nullable
    public final String getExtension() {
        return this.extension;
    }

    @Nullable
    public final File getFile() {
        return this.file;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getPriority() {
        return this.priority;
    }

    @NotNull
    public final String getProtocol() {
        return this.protocol;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = ((this.url.hashCode() * 31) + this.name.hashCode()) * 31;
        File file = this.file;
        int iHashCode2 = (iHashCode + (file == null ? 0 : file.hashCode())) * 31;
        String str = this.extension;
        return ((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + b.a(this.contentLength)) * 31) + this.protocol.hashCode()) * 31) + this.priority;
    }

    @NotNull
    public String toString() {
        return "CachedFile(url=" + this.url + ", name=" + this.name + ", file=" + this.file + ", extension=" + this.extension + ", contentLength=" + this.contentLength + ", protocol=" + this.protocol + ", priority=" + this.priority + ')';
    }

    public /* synthetic */ CachedFile(String str, String str2, File file, String str3, long j10, String str4, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : file, (i11 & 8) != 0 ? "" : str3, (i11 & 16) != 0 ? -1L : j10, (i11 & 32) != 0 ? "" : str4, (i11 & 64) != 0 ? Integer.MAX_VALUE : i10);
    }
}
