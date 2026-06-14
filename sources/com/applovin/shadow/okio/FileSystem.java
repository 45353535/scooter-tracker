package com.applovin.shadow.okio;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.applovin.shadow.okio.Path;
import com.applovin.shadow.okio.internal.ResourceFileSystem;
import com.ironsource.C4240b4;
import com.my.target.common.menu.MenuActionType;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 B2\u00020\u0001:\u0001BB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u000f\u001a\u00020\u0004H&¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0004H&¢\u0006\u0004\b\u0013\u0010\u0012J'\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0004H&¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\f2\b\b\u0002\u0010\u001e\u001a\u00020\fH&¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010\u001cJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u0004H&¢\u0006\u0004\b\"\u0010#J!\u0010%\u001a\u00020$2\u0006\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\fH&¢\u0006\u0004\b%\u0010&J\u0015\u0010%\u001a\u00020$2\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b%\u0010'J!\u0010(\u001a\u00020$2\u0006\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\fH&¢\u0006\u0004\b(\u0010&J\u0015\u0010(\u001a\u00020$2\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b(\u0010'J!\u0010*\u001a\u00020)2\u0006\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\fH&¢\u0006\u0004\b*\u0010+J\u0015\u0010*\u001a\u00020)2\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b*\u0010,J\u001f\u0010-\u001a\u00020)2\u0006\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b-\u0010+J\u0015\u0010-\u001a\u00020)2\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b-\u0010,J\u001f\u0010/\u001a\u00020)2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0004H&¢\u0006\u0004\b/\u00100J\u001f\u00101\u001a\u00020)2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0004H\u0016¢\u0006\u0004\b1\u00100J!\u00102\u001a\u00020)2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\fH&¢\u0006\u0004\b2\u0010+J\u0015\u00102\u001a\u00020)2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b2\u0010,J!\u00104\u001a\u00020)2\u0006\u00103\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\fH\u0016¢\u0006\u0004\b4\u0010+J\u0015\u00104\u001a\u00020)2\u0006\u00103\u001a\u00020\u0004¢\u0006\u0004\b4\u0010,J\u001f\u00105\u001a\u00020)2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0004H&¢\u0006\u0004\b5\u00100J5\u0010<\u001a\u00028\u0000\"\u0004\b\u0000\u001062\u0006\u0010\u0019\u001a\u00020\u00042\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00028\u000007H\u0087\bø\u0001\u0000¢\u0006\u0004\b:\u0010;J?\u0010A\u001a\u00028\u0000\"\u0004\b\u0000\u001062\u0006\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\f2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00028\u000007H\u0087\bø\u0001\u0000¢\u0006\u0004\b?\u0010@\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006C"}, d2 = {"Lcom/applovin/shadow/okio/FileSystem;", "", "<init>", "()V", "Lcom/applovin/shadow/okio/Path;", "path", "canonicalize", "(Lcom/applovin/shadow/okio/Path;)Lcom/applovin/shadow/okio/Path;", "Lcom/applovin/shadow/okio/FileMetadata;", "metadata", "(Lcom/applovin/shadow/okio/Path;)Lcom/applovin/shadow/okio/FileMetadata;", "metadataOrNull", "", "exists", "(Lcom/applovin/shadow/okio/Path;)Z", "dir", "", "list", "(Lcom/applovin/shadow/okio/Path;)Ljava/util/List;", "listOrNull", "followSymlinks", "Lkotlin/sequences/Sequence;", "listRecursively", "(Lcom/applovin/shadow/okio/Path;Z)Lkotlin/sequences/Sequence;", "(Lcom/applovin/shadow/okio/Path;)Lkotlin/sequences/Sequence;", C4240b4.i.f42616b, "Lcom/applovin/shadow/okio/FileHandle;", "openReadOnly", "(Lcom/applovin/shadow/okio/Path;)Lcom/applovin/shadow/okio/FileHandle;", "mustCreate", "mustExist", "openReadWrite", "(Lcom/applovin/shadow/okio/Path;ZZ)Lcom/applovin/shadow/okio/FileHandle;", "Lcom/applovin/shadow/okio/Source;", "source", "(Lcom/applovin/shadow/okio/Path;)Lcom/applovin/shadow/okio/Source;", "Lcom/applovin/shadow/okio/Sink;", "sink", "(Lcom/applovin/shadow/okio/Path;Z)Lcom/applovin/shadow/okio/Sink;", "(Lcom/applovin/shadow/okio/Path;)Lcom/applovin/shadow/okio/Sink;", "appendingSink", "", "createDirectory", "(Lcom/applovin/shadow/okio/Path;Z)V", "(Lcom/applovin/shadow/okio/Path;)V", "createDirectories", TypedValues.AttributesType.S_TARGET, "atomicMove", "(Lcom/applovin/shadow/okio/Path;Lcom/applovin/shadow/okio/Path;)V", MenuActionType.COPY, "delete", "fileOrDirectory", "deleteRecursively", "createSymlink", "T", "Lkotlin/Function1;", "Lcom/applovin/shadow/okio/BufferedSource;", "readerAction", "-read", "(Lvh/c0;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "read", "Lcom/applovin/shadow/okio/BufferedSink;", "writerAction", "-write", "(Lvh/c0;ZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "write", com.taurusx.tax.f.y.f66058y, "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class FileSystem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final FileSystem RESOURCES;

    @NotNull
    public static final FileSystem SYSTEM;

    @NotNull
    public static final Path SYSTEM_TEMPORARY_DIRECTORY;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\b\u001a\u00020\u0004*\u00020\tH\u0007¢\u0006\u0002\b\nR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/applovin/shadow/okio/FileSystem$Companion;", "", "()V", "RESOURCES", "Lcom/applovin/shadow/okio/FileSystem;", "SYSTEM", "SYSTEM_TEMPORARY_DIRECTORY", "Lcom/applovin/shadow/okio/Path;", "asOkioFileSystem", "Ljava/nio/file/FileSystem;", "get", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FileSystem get(@NotNull java.nio.file.FileSystem fileSystem) {
            Intrinsics.checkNotNullParameter(fileSystem, "<this>");
            return new NioFileSystemWrappingFileSystem(fileSystem);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: -write$default, reason: not valid java name */
    public static /* synthetic */ Object m4414write$default(FileSystem fileSystem, Path file, boolean z10, Function1 writerAction, int i10, Object obj) throws Throwable {
        Object objInvoke;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(writerAction, "writerAction");
        BufferedSink bufferedSinkBuffer = Okio.buffer(fileSystem.sink(file, z10));
        Throwable th2 = null;
        try {
            objInvoke = writerAction.invoke(bufferedSinkBuffer);
            kotlin.jvm.internal.z.b(1);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            kotlin.jvm.internal.z.a(1);
        } catch (Throwable th4) {
            kotlin.jvm.internal.z.b(1);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th5) {
                    lf.c.a(th4, th5);
                }
            }
            kotlin.jvm.internal.z.a(1);
            objInvoke = null;
            th2 = th4;
        }
        if (th2 != null) {
            throw th2;
        }
        Intrinsics.checkNotNull(objInvoke);
        return objInvoke;
    }

    static {
        FileSystem jvmSystemFileSystem;
        try {
            Class.forName("java.nio.file.Files");
            jvmSystemFileSystem = new NioSystemFileSystem();
        } catch (ClassNotFoundException unused) {
            jvmSystemFileSystem = new JvmSystemFileSystem();
        }
        SYSTEM = jvmSystemFileSystem;
        Path.Companion companion = Path.INSTANCE;
        String property = System.getProperty("java.io.tmpdir");
        Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
        SYSTEM_TEMPORARY_DIRECTORY = Path.Companion.get$default(companion, property, false, 1, (Object) null);
        ClassLoader classLoader = ResourceFileSystem.class.getClassLoader();
        Intrinsics.checkNotNullExpressionValue(classLoader, "getClassLoader(...)");
        RESOURCES = new ResourceFileSystem(classLoader, false, null, 4, null);
    }

    public static /* synthetic */ Sink appendingSink$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appendingSink");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return fileSystem.appendingSink(path, z10);
    }

    public static /* synthetic */ void createDirectories$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectories");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        fileSystem.createDirectories(path, z10);
    }

    public static /* synthetic */ void createDirectory$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectory");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        fileSystem.createDirectory(path, z10);
    }

    public static /* synthetic */ void delete$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        fileSystem.delete(path, z10);
    }

    public static /* synthetic */ void deleteRecursively$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteRecursively");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        fileSystem.deleteRecursively(path, z10);
    }

    @NotNull
    public static final FileSystem get(@NotNull java.nio.file.FileSystem fileSystem) {
        return INSTANCE.get(fileSystem);
    }

    public static /* synthetic */ Sequence listRecursively$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listRecursively");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return fileSystem.listRecursively(path, z10);
    }

    public static /* synthetic */ FileHandle openReadWrite$default(FileSystem fileSystem, Path path, boolean z10, boolean z11, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openReadWrite");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return fileSystem.openReadWrite(path, z10, z11);
    }

    public static /* synthetic */ Sink sink$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return fileSystem.sink(path, z10);
    }

    /* JADX INFO: renamed from: -read, reason: not valid java name */
    public final <T> T m4415read(@NotNull Path file, @NotNull Function1<? super BufferedSource, ? extends T> readerAction) throws Throwable {
        T tInvoke;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(readerAction, "readerAction");
        BufferedSource bufferedSourceBuffer = Okio.buffer(source(file));
        Throwable th2 = null;
        try {
            tInvoke = readerAction.invoke(bufferedSourceBuffer);
            kotlin.jvm.internal.z.b(1);
            if (bufferedSourceBuffer != null) {
                try {
                    bufferedSourceBuffer.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            kotlin.jvm.internal.z.a(1);
        } catch (Throwable th4) {
            kotlin.jvm.internal.z.b(1);
            if (bufferedSourceBuffer != null) {
                try {
                    bufferedSourceBuffer.close();
                } catch (Throwable th5) {
                    lf.c.a(th4, th5);
                }
            }
            kotlin.jvm.internal.z.a(1);
            th2 = th4;
            tInvoke = null;
        }
        if (th2 != null) {
            throw th2;
        }
        Intrinsics.checkNotNull(tInvoke);
        return tInvoke;
    }

    /* JADX INFO: renamed from: -write, reason: not valid java name */
    public final <T> T m4416write(@NotNull Path file, boolean z10, @NotNull Function1<? super BufferedSink, ? extends T> writerAction) throws Throwable {
        T tInvoke;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(writerAction, "writerAction");
        BufferedSink bufferedSinkBuffer = Okio.buffer(sink(file, z10));
        Throwable th2 = null;
        try {
            tInvoke = writerAction.invoke(bufferedSinkBuffer);
            kotlin.jvm.internal.z.b(1);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            kotlin.jvm.internal.z.a(1);
        } catch (Throwable th4) {
            kotlin.jvm.internal.z.b(1);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th5) {
                    lf.c.a(th4, th5);
                }
            }
            kotlin.jvm.internal.z.a(1);
            th2 = th4;
            tInvoke = null;
        }
        if (th2 != null) {
            throw th2;
        }
        Intrinsics.checkNotNull(tInvoke);
        return tInvoke;
    }

    @NotNull
    public final Sink appendingSink(@NotNull Path file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        return appendingSink(file, false);
    }

    @NotNull
    public abstract Sink appendingSink(@NotNull Path file, boolean mustExist) throws IOException;

    public abstract void atomicMove(@NotNull Path source, @NotNull Path target) throws IOException;

    @NotNull
    public abstract Path canonicalize(@NotNull Path path) throws IOException;

    public void copy(@NotNull Path source, @NotNull Path target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        com.applovin.shadow.okio.internal.FileSystem.commonCopy(this, source, target);
    }

    public final void createDirectories(@NotNull Path dir, boolean mustCreate) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        com.applovin.shadow.okio.internal.FileSystem.commonCreateDirectories(this, dir, mustCreate);
    }

    public final void createDirectory(@NotNull Path dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        createDirectory(dir, false);
    }

    public abstract void createDirectory(@NotNull Path dir, boolean mustCreate) throws IOException;

    public abstract void createSymlink(@NotNull Path source, @NotNull Path target) throws IOException;

    public final void delete(@NotNull Path path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        delete(path, false);
    }

    public abstract void delete(@NotNull Path path, boolean mustExist) throws IOException;

    public void deleteRecursively(@NotNull Path fileOrDirectory, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        com.applovin.shadow.okio.internal.FileSystem.commonDeleteRecursively(this, fileOrDirectory, mustExist);
    }

    public final boolean exists(@NotNull Path path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        return com.applovin.shadow.okio.internal.FileSystem.commonExists(this, path);
    }

    @NotNull
    public abstract List<Path> list(@NotNull Path dir) throws IOException;

    @Nullable
    public abstract List<Path> listOrNull(@NotNull Path dir);

    @NotNull
    public Sequence<Path> listRecursively(@NotNull Path dir, boolean followSymlinks) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        return com.applovin.shadow.okio.internal.FileSystem.commonListRecursively(this, dir, followSymlinks);
    }

    @NotNull
    public final FileMetadata metadata(@NotNull Path path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        return com.applovin.shadow.okio.internal.FileSystem.commonMetadata(this, path);
    }

    @Nullable
    public abstract FileMetadata metadataOrNull(@NotNull Path path) throws IOException;

    @NotNull
    public abstract FileHandle openReadOnly(@NotNull Path file) throws IOException;

    @NotNull
    public final FileHandle openReadWrite(@NotNull Path file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        return openReadWrite(file, false, false);
    }

    @NotNull
    public abstract FileHandle openReadWrite(@NotNull Path file, boolean mustCreate, boolean mustExist) throws IOException;

    @NotNull
    public final Sink sink(@NotNull Path file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        return sink(file, false);
    }

    @NotNull
    public abstract Sink sink(@NotNull Path file, boolean mustCreate) throws IOException;

    @NotNull
    public abstract Source source(@NotNull Path file) throws IOException;

    public final void createDirectories(@NotNull Path dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        createDirectories(dir, false);
    }

    public final void deleteRecursively(@NotNull Path fileOrDirectory) throws IOException {
        Intrinsics.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        deleteRecursively(fileOrDirectory, false);
    }

    @NotNull
    public final Sequence<Path> listRecursively(@NotNull Path dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        return listRecursively(dir, false);
    }
}
