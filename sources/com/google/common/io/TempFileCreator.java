package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.StandardSystemProperty;
import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableList;
import com.google.common.io.TempFileCreator;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import j$.util.Objects;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.FileSystems;
import java.nio.file.Paths;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntryFlag;
import java.nio.file.attribute.AclEntryPermission;
import java.nio.file.attribute.AclEntryType;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
abstract class TempFileCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final TempFileCreator f30962a = c();

    private static final class JavaIoCreator extends TempFileCreator {
        private JavaIoCreator() {
            super();
        }

        @Override // com.google.common.io.TempFileCreator
        File a() {
            File file = new File(StandardSystemProperty.JAVA_IO_TMPDIR.value());
            String str = System.currentTimeMillis() + TokenBuilder.TOKEN_DELIMITER;
            for (int i10 = 0; i10 < 10000; i10++) {
                File file2 = new File(file, str + i10);
                if (file2.mkdir()) {
                    return file2;
                }
            }
            throw new IllegalStateException("Failed to create directory within 10000 attempts (tried " + str + "0 to " + str + "9999)");
        }

        @Override // com.google.common.io.TempFileCreator
        File b(String str) {
            return File.createTempFile(str, null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @IgnoreJRERequirement
    static final class JavaNioCreator extends TempFileCreator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final PermissionSupplier f30963b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final PermissionSupplier f30964c;

        /* JADX INFO: Access modifiers changed from: private */
        @IgnoreJRERequirement
        interface PermissionSupplier {
            FileAttribute<?> get() throws IOException;
        }

        static {
            Set setSupportedFileAttributeViews = FileSystems.getDefault().supportedFileAttributeViews();
            if (setSupportedFileAttributeViews.contains("posix")) {
                f30963b = new PermissionSupplier() { // from class: com.google.common.io.u
                    @Override // com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier
                    public final FileAttribute get() {
                        return PosixFilePermissions.asFileAttribute(PosixFilePermissions.fromString("rw-------"));
                    }
                };
                f30964c = new PermissionSupplier() { // from class: com.google.common.io.v
                    @Override // com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier
                    public final FileAttribute get() {
                        return PosixFilePermissions.asFileAttribute(PosixFilePermissions.fromString("rwx------"));
                    }
                };
            } else if (setSupportedFileAttributeViews.contains("acl")) {
                PermissionSupplier permissionSupplierJ = j();
                f30964c = permissionSupplierJ;
                f30963b = permissionSupplierJ;
            } else {
                PermissionSupplier permissionSupplier = new PermissionSupplier() { // from class: com.google.common.io.w
                    @Override // com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier
                    public final FileAttribute get() {
                        return TempFileCreator.JavaNioCreator.g();
                    }
                };
                f30964c = permissionSupplier;
                f30963b = permissionSupplier;
            }
        }

        private JavaNioCreator() {
            super();
        }

        public static /* synthetic */ FileAttribute f(FileAttribute fileAttribute) {
            return fileAttribute;
        }

        public static /* synthetic */ FileAttribute g() throws IOException {
            throw new IOException("unrecognized FileSystem type " + FileSystems.getDefault());
        }

        public static /* synthetic */ FileAttribute h(IOException iOException) throws IOException {
            throw new IOException("Could not find user", iOException);
        }

        private static String i() {
            String strValue = StandardSystemProperty.USER_NAME.value();
            Objects.requireNonNull(strValue);
            try {
                Class<?> cls = Class.forName("java.lang.ProcessHandle");
                Class<?> cls2 = Class.forName("java.lang.ProcessHandle$Info");
                Class<?> cls3 = Class.forName("j$.util.Optional");
                Method method = cls.getMethod("current", null);
                Method method2 = cls.getMethod("info", null);
                Object objInvoke = cls3.getMethod("orElse", Object.class).invoke(cls2.getMethod("user", null).invoke(method2.invoke(method.invoke(null, null), null), null), strValue);
                Objects.requireNonNull(objInvoke);
                return (String) objInvoke;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException unused) {
                return strValue;
            } catch (InvocationTargetException e10) {
                Throwables.throwIfUnchecked(e10.getCause());
                return strValue;
            }
        }

        private static PermissionSupplier j() {
            try {
                final ImmutableList immutableListOf = ImmutableList.of(AclEntry.newBuilder().setType(AclEntryType.ALLOW).setPrincipal(FileSystems.getDefault().getUserPrincipalLookupService().lookupPrincipalByName(i())).setPermissions((Set<AclEntryPermission>) EnumSet.allOf(i.a())).setFlags(AclEntryFlag.DIRECTORY_INHERIT, AclEntryFlag.FILE_INHERIT).build());
                final FileAttribute<ImmutableList<AclEntry>> fileAttribute = new FileAttribute<ImmutableList<AclEntry>>() { // from class: com.google.common.io.TempFileCreator.JavaNioCreator.1
                    @Override // java.nio.file.attribute.FileAttribute
                    public String name() {
                        return "acl:acl";
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // java.nio.file.attribute.FileAttribute
                    public ImmutableList<AclEntry> value() {
                        return immutableListOf;
                    }
                };
                return new PermissionSupplier() { // from class: com.google.common.io.x
                    @Override // com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier
                    public final FileAttribute get() {
                        return TempFileCreator.JavaNioCreator.f(fileAttribute);
                    }
                };
            } catch (IOException e10) {
                return new PermissionSupplier() { // from class: com.google.common.io.y
                    @Override // com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier
                    public final FileAttribute get() {
                        return TempFileCreator.JavaNioCreator.h(e10);
                    }
                };
            }
        }

        @Override // com.google.common.io.TempFileCreator
        File a() {
            try {
                return java.nio.file.Files.createTempDirectory(Paths.get(StandardSystemProperty.JAVA_IO_TMPDIR.value(), new String[0]), null, f30964c.get()).toFile();
            } catch (IOException e10) {
                throw new IllegalStateException("Failed to create directory", e10);
            }
        }

        @Override // com.google.common.io.TempFileCreator
        File b(String str) {
            return java.nio.file.Files.createTempFile(Paths.get(StandardSystemProperty.JAVA_IO_TMPDIR.value(), new String[0]), str, null, f30963b.get()).toFile();
        }
    }

    private static final class ThrowingCreator extends TempFileCreator {
        private ThrowingCreator() {
            super();
        }

        @Override // com.google.common.io.TempFileCreator
        File a() {
            throw new IllegalStateException("Guava cannot securely create temporary files or directories under SDK versions before Jelly Bean. You can create one yourself, either in the insecure default directory or in a more secure directory, such as context.getCacheDir(). For more information, see the Javadoc for Files.createTempDir().");
        }

        @Override // com.google.common.io.TempFileCreator
        File b(String str) throws IOException {
            throw new IOException("Guava cannot securely create temporary files or directories under SDK versions before Jelly Bean. You can create one yourself, either in the insecure default directory or in a more secure directory, such as context.getCacheDir(). For more information, see the Javadoc for Files.createTempDir().");
        }
    }

    private static TempFileCreator c() {
        try {
            try {
                Class.forName("java.nio.file.Path");
                return new JavaNioCreator();
            } catch (ClassNotFoundException unused) {
                return new ThrowingCreator();
            } catch (IllegalAccessException unused2) {
                return new ThrowingCreator();
            } catch (NoSuchFieldException unused3) {
                return new ThrowingCreator();
            }
        } catch (ClassNotFoundException unused4) {
            return ((Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null)).intValue() < ((Integer) Class.forName("android.os.Build$VERSION_CODES").getField("JELLY_BEAN").get(null)).intValue() ? new ThrowingCreator() : new JavaIoCreator();
        }
    }

    abstract File a();

    abstract File b(String str);

    private TempFileCreator() {
    }
}
