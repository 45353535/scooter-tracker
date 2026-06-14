package vh;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import kotlin.jvm.internal.Intrinsics;
import vh.c0;

/* JADX INFO: loaded from: classes12.dex */
public class w extends v {
    private final Long x(FileTime fileTime) {
        Long lValueOf = Long.valueOf(fileTime.toMillis());
        if (lValueOf.longValue() != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // vh.v, vh.l
    public void c(c0 source, c0 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        try {
            Files.move(source.p(), target.p(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e10) {
            throw new FileNotFoundException(e10.getMessage());
        }
    }

    @Override // vh.v, vh.l
    public k m(c0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return w(path.p());
    }

    @Override // vh.v
    public String toString() {
        return "NioSystemFileSystem";
    }

    protected final k w(Path nioPath) {
        Intrinsics.checkNotNullParameter(nioPath, "nioPath");
        try {
            BasicFileAttributes attributes = Files.readAttributes(nioPath, (Class<BasicFileAttributes>) com.applovin.shadow.okio.t.a(), LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(nioPath) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            c0 c0VarF = symbolicLink != null ? c0.a.f(c0.f106805c, symbolicLink, false, 1, null) : null;
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lX = fileTimeCreationTime != null ? x(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lX2 = fileTimeLastModifiedTime != null ? x(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new k(zIsRegularFile, zIsDirectory, c0VarF, lValueOf, lX, lX2, fileTimeLastAccessTime != null ? x(fileTimeLastAccessTime) : null, null, 128, null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }
}
