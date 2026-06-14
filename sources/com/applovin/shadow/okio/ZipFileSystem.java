package com.applovin.shadow.okio;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.applovin.shadow.okio.Path;
import com.applovin.shadow.okio.internal.FixedLengthSource;
import com.applovin.shadow.okio.internal.ZipEntry;
import com.applovin.shadow.okio.internal.ZipFilesKt;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ironsource.C4240b4;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\b\u0000\u0018\u0000 62\u00020\u0001:\u00016B7\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u000eJ\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010!J\u001f\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010!J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020&2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0010H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020&2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0010H\u0016¢\u0006\u0004\b)\u0010(J\u001f\u0010+\u001a\u00020*2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0010H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00020*2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u0002H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020*2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0010H\u0016¢\u0006\u0004\b0\u0010,J\u001f\u00101\u001a\u00020*2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u0002H\u0016¢\u0006\u0004\b1\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00102R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00103R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00104R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00105¨\u00067"}, d2 = {"Lcom/applovin/shadow/okio/ZipFileSystem;", "Lcom/applovin/shadow/okio/FileSystem;", "Lcom/applovin/shadow/okio/Path;", "zipPath", "fileSystem", "", "Lcom/applovin/shadow/okio/internal/ZipEntry;", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "comment", "<init>", "(Lvh/c0;Lvh/l;Ljava/util/Map;Ljava/lang/String;)V", "path", "canonicalizeInternal", "(Lcom/applovin/shadow/okio/Path;)Lcom/applovin/shadow/okio/Path;", "dir", "", "throwOnFailure", "", "list", "(Lcom/applovin/shadow/okio/Path;Z)Ljava/util/List;", "canonicalize", "Lcom/applovin/shadow/okio/FileMetadata;", "metadataOrNull", "(Lcom/applovin/shadow/okio/Path;)Lcom/applovin/shadow/okio/FileMetadata;", C4240b4.i.f42616b, "Lcom/applovin/shadow/okio/FileHandle;", "openReadOnly", "(Lcom/applovin/shadow/okio/Path;)Lcom/applovin/shadow/okio/FileHandle;", "mustCreate", "mustExist", "openReadWrite", "(Lcom/applovin/shadow/okio/Path;ZZ)Lcom/applovin/shadow/okio/FileHandle;", "(Lcom/applovin/shadow/okio/Path;)Ljava/util/List;", "listOrNull", "Lcom/applovin/shadow/okio/Source;", "source", "(Lcom/applovin/shadow/okio/Path;)Lcom/applovin/shadow/okio/Source;", "Lcom/applovin/shadow/okio/Sink;", "sink", "(Lcom/applovin/shadow/okio/Path;Z)Lcom/applovin/shadow/okio/Sink;", "appendingSink", "", "createDirectory", "(Lcom/applovin/shadow/okio/Path;Z)V", TypedValues.AttributesType.S_TARGET, "atomicMove", "(Lcom/applovin/shadow/okio/Path;Lcom/applovin/shadow/okio/Path;)V", "delete", "createSymlink", "Lcom/applovin/shadow/okio/Path;", "Lcom/applovin/shadow/okio/FileSystem;", "Ljava/util/Map;", "Ljava/lang/String;", com.taurusx.tax.f.y.f66058y, "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ZipFileSystem extends FileSystem {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final Path ROOT = Path.Companion.get$default(Path.INSTANCE, "/", false, 1, (Object) null);

    @Nullable
    private final String comment;

    @NotNull
    private final Map<Path, ZipEntry> entries;

    @NotNull
    private final FileSystem fileSystem;

    @NotNull
    private final Path zipPath;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/applovin/shadow/okio/ZipFileSystem$Companion;", "", "<init>", "()V", "Lcom/applovin/shadow/okio/Path;", NativeAdContent.ViewTag.ROOT, "Lcom/applovin/shadow/okio/Path;", "getROOT", "()Lvh/c0;", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Path getROOT() {
            return ZipFileSystem.ROOT;
        }

        private Companion() {
        }
    }

    public ZipFileSystem(@NotNull Path zipPath, @NotNull FileSystem fileSystem, @NotNull Map<Path, ZipEntry> entries, @Nullable String str) {
        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.zipPath = zipPath;
        this.fileSystem = fileSystem;
        this.entries = entries;
        this.comment = str;
    }

    private final Path canonicalizeInternal(Path path) {
        return ROOT.resolve(path, true);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    @NotNull
    public Sink appendingSink(@NotNull Path file, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void atomicMove(@NotNull Path source, @NotNull Path target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    @NotNull
    public Path canonicalize(@NotNull Path path) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(path, "path");
        Path pathCanonicalizeInternal = canonicalizeInternal(path);
        if (this.entries.containsKey(pathCanonicalizeInternal)) {
            return pathCanonicalizeInternal;
        }
        throw new FileNotFoundException(String.valueOf(path));
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void createDirectory(@NotNull Path dir, boolean mustCreate) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void createSymlink(@NotNull Path source, @NotNull Path target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void delete(@NotNull Path path, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    @NotNull
    public List<Path> list(@NotNull Path dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        List<Path> list = list(dir, true);
        Intrinsics.checkNotNull(list);
        return list;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    @Nullable
    public List<Path> listOrNull(@NotNull Path dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        return list(dir, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0083 A[Catch: all -> 0x007c, TRY_LEAVE, TryCatch #4 {all -> 0x007c, blocks: (B:13:0x0053, B:33:0x0083, B:39:0x008f, B:28:0x0078, B:24:0x0072, B:14:0x005f), top: B:58:0x0053, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008f A[Catch: all -> 0x007c, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x007c, blocks: (B:13:0x0053, B:33:0x0083, B:39:0x008f, B:28:0x0078, B:24:0x0072, B:14:0x005f), top: B:58:0x0053, inners: #1, #5 }] */
    @Override // com.applovin.shadow.okio.FileSystem
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.applovin.shadow.okio.FileMetadata metadataOrNull(@org.jetbrains.annotations.NotNull com.applovin.shadow.okio.Path r14) throws java.lang.Throwable {
        /*
            r13 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            com.applovin.shadow.okio.Path r14 = r13.canonicalizeInternal(r14)
            java.util.Map<com.applovin.shadow.okio.Path, com.applovin.shadow.okio.internal.ZipEntry> r0 = r13.entries
            java.lang.Object r14 = r0.get(r14)
            com.applovin.shadow.okio.internal.ZipEntry r14 = (com.applovin.shadow.okio.internal.ZipEntry) r14
            r1 = 0
            if (r14 != 0) goto L15
            return r1
        L15:
            com.applovin.shadow.okio.FileMetadata r2 = new com.applovin.shadow.okio.FileMetadata
            boolean r0 = r14.getIsDirectory()
            r3 = r0 ^ 1
            boolean r4 = r14.getIsDirectory()
            boolean r0 = r14.getIsDirectory()
            if (r0 == 0) goto L29
            r6 = r1
            goto L32
        L29:
            long r5 = r14.getSize()
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r6 = r0
        L32:
            java.lang.Long r8 = r14.getLastModifiedAtMillis()
            r11 = 128(0x80, float:1.8E-43)
            r12 = 0
            r5 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            long r3 = r14.getOffset()
            r5 = -1
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L4b
            return r2
        L4b:
            com.applovin.shadow.okio.FileSystem r0 = r13.fileSystem
            com.applovin.shadow.okio.Path r3 = r13.zipPath
            com.applovin.shadow.okio.FileHandle r3 = r0.openReadOnly(r3)
            long r4 = r14.getOffset()     // Catch: java.lang.Throwable -> L7c
            com.applovin.shadow.okio.Source r14 = r3.source(r4)     // Catch: java.lang.Throwable -> L7c
            com.applovin.shadow.okio.BufferedSource r14 = com.applovin.shadow.okio.Okio.buffer(r14)     // Catch: java.lang.Throwable -> L7c
            com.applovin.shadow.okio.FileMetadata r2 = com.applovin.shadow.okio.internal.ZipFilesKt.readLocalHeader(r14, r2)     // Catch: java.lang.Throwable -> L6e
            if (r14 == 0) goto L6c
            r14.close()     // Catch: java.lang.Throwable -> L69
            goto L6c
        L69:
            r0 = move-exception
            r14 = r0
            goto L81
        L6c:
            r14 = r1
            goto L81
        L6e:
            r0 = move-exception
            r2 = r0
            if (r14 == 0) goto L7f
            r14.close()     // Catch: java.lang.Throwable -> L76
            goto L7f
        L76:
            r0 = move-exception
            r14 = r0
            lf.c.a(r2, r14)     // Catch: java.lang.Throwable -> L7c
            goto L7f
        L7c:
            r0 = move-exception
            r14 = r0
            goto L90
        L7f:
            r14 = r2
            r2 = r1
        L81:
            if (r14 != 0) goto L8f
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)     // Catch: java.lang.Throwable -> L7c
            if (r3 == 0) goto L9c
            r3.close()     // Catch: java.lang.Throwable -> L8c
            goto L9c
        L8c:
            r0 = move-exception
            r1 = r0
            goto L9c
        L8f:
            throw r14     // Catch: java.lang.Throwable -> L7c
        L90:
            if (r3 == 0) goto L9a
            r3.close()     // Catch: java.lang.Throwable -> L96
            goto L9a
        L96:
            r0 = move-exception
            lf.c.a(r14, r0)
        L9a:
            r2 = r1
            r1 = r14
        L9c:
            if (r1 != 0) goto La2
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            return r2
        La2:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.ZipFileSystem.metadataOrNull(com.applovin.shadow.okio.Path):com.applovin.shadow.okio.FileMetadata");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    @NotNull
    public FileHandle openReadOnly(@NotNull Path file) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    @NotNull
    public FileHandle openReadWrite(@NotNull Path file, boolean mustCreate, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip entries are not writable");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    @NotNull
    public Sink sink(@NotNull Path file, boolean mustCreate) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    @NotNull
    public Source source(@NotNull Path file) throws Throwable {
        BufferedSource bufferedSourceBuffer;
        Intrinsics.checkNotNullParameter(file, "file");
        ZipEntry zipEntry = this.entries.get(canonicalizeInternal(file));
        if (zipEntry == null) {
            throw new FileNotFoundException("no such file: " + file);
        }
        FileHandle fileHandleOpenReadOnly = this.fileSystem.openReadOnly(this.zipPath);
        Throwable th2 = null;
        try {
            bufferedSourceBuffer = Okio.buffer(fileHandleOpenReadOnly.source(zipEntry.getOffset()));
            if (fileHandleOpenReadOnly != null) {
                try {
                    fileHandleOpenReadOnly.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
        } catch (Throwable th4) {
            if (fileHandleOpenReadOnly != null) {
                try {
                    fileHandleOpenReadOnly.close();
                } catch (Throwable th5) {
                    lf.c.a(th4, th5);
                }
            }
            bufferedSourceBuffer = null;
            th2 = th4;
        }
        if (th2 != null) {
            throw th2;
        }
        Intrinsics.checkNotNull(bufferedSourceBuffer);
        ZipFilesKt.skipLocalHeader(bufferedSourceBuffer);
        return zipEntry.getCompressionMethod() == 0 ? new FixedLengthSource(bufferedSourceBuffer, zipEntry.getSize(), true) : new FixedLengthSource(new InflaterSource(new FixedLengthSource(bufferedSourceBuffer, zipEntry.getCompressedSize(), true), new Inflater(true)), zipEntry.getSize(), false);
    }

    private final List<Path> list(Path dir, boolean throwOnFailure) throws IOException {
        ZipEntry zipEntry = this.entries.get(canonicalizeInternal(dir));
        if (zipEntry != null) {
            return CollectionsKt.toList(zipEntry.getChildren());
        }
        if (!throwOnFailure) {
            return null;
        }
        throw new IOException("not a directory: " + dir);
    }
}
