package com.applovin.shadow.okio.internal;

import com.applovin.shadow.okio.Path;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010!\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b%\u0010\u001cR\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/applovin/shadow/okio/internal/ZipEntry;", "", "Lcom/applovin/shadow/okio/Path;", "canonicalPath", "", "isDirectory", "", "comment", "", "crc", "compressedSize", "size", "", "compressionMethod", "lastModifiedAtMillis", "offset", "<init>", "(Lvh/c0;ZLjava/lang/String;JJJILjava/lang/Long;J)V", "Lcom/applovin/shadow/okio/Path;", "getCanonicalPath", "()Lvh/c0;", "Z", "()Z", "Ljava/lang/String;", "getComment", "()Ljava/lang/String;", "J", "getCrc", "()J", "getCompressedSize", "getSize", "I", "getCompressionMethod", "()I", "Ljava/lang/Long;", "getLastModifiedAtMillis", "()Ljava/lang/Long;", "getOffset", "", "children", "Ljava/util/List;", "getChildren", "()Ljava/util/List;", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ZipEntry {

    @NotNull
    private final Path canonicalPath;

    @NotNull
    private final List<Path> children;

    @NotNull
    private final String comment;
    private final long compressedSize;
    private final int compressionMethod;
    private final long crc;
    private final boolean isDirectory;

    @Nullable
    private final Long lastModifiedAtMillis;
    private final long offset;
    private final long size;

    public ZipEntry(@NotNull Path canonicalPath, boolean z10, @NotNull String comment, long j10, long j11, long j12, int i10, @Nullable Long l10, long j13) {
        Intrinsics.checkNotNullParameter(canonicalPath, "canonicalPath");
        Intrinsics.checkNotNullParameter(comment, "comment");
        this.canonicalPath = canonicalPath;
        this.isDirectory = z10;
        this.comment = comment;
        this.crc = j10;
        this.compressedSize = j11;
        this.size = j12;
        this.compressionMethod = i10;
        this.lastModifiedAtMillis = l10;
        this.offset = j13;
        this.children = new ArrayList();
    }

    @NotNull
    public final Path getCanonicalPath() {
        return this.canonicalPath;
    }

    @NotNull
    public final List<Path> getChildren() {
        return this.children;
    }

    @NotNull
    public final String getComment() {
        return this.comment;
    }

    public final long getCompressedSize() {
        return this.compressedSize;
    }

    public final int getCompressionMethod() {
        return this.compressionMethod;
    }

    public final long getCrc() {
        return this.crc;
    }

    @Nullable
    public final Long getLastModifiedAtMillis() {
        return this.lastModifiedAtMillis;
    }

    public final long getOffset() {
        return this.offset;
    }

    public final long getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: isDirectory, reason: from getter */
    public final boolean getIsDirectory() {
        return this.isDirectory;
    }

    public /* synthetic */ ZipEntry(Path path, boolean z10, String str, long j10, long j11, long j12, int i10, Long l10, long j13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(path, (i11 & 2) != 0 ? false : z10, (i11 & 4) != 0 ? "" : str, (i11 & 8) != 0 ? -1L : j10, (i11 & 16) != 0 ? -1L : j11, (i11 & 32) != 0 ? -1L : j12, (i11 & 64) != 0 ? -1 : i10, (i11 & 128) != 0 ? null : l10, (i11 & 256) != 0 ? -1L : j13);
    }
}
