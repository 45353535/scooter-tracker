package com.vungle.ads.internal.util;

import android.os.Build;
import android.webkit.URLUtil;
import androidx.annotation.VisibleForTesting;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C4240b4;
import com.vungle.ads.AssetFailedToDeleteError;
import hh.u;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uf.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u00017B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J$\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001aH\u0007J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0018H\u0007J\"\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00182\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001aH\u0007J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020!H\u0002J\u001a\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0004J\u0010\u0010%\u001a\u00020&2\b\u0010#\u001a\u0004\u0018\u00010\u0004J\u0012\u0010'\u001a\u00020\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u0018H\u0007J&\u0010'\u001a\u00020\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u00182\u0006\u0010 \u001a\u00020!2\n\u0010(\u001a\u00060)j\u0002`*H\u0002J$\u0010+\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!2\n\u0010(\u001a\u00060)j\u0002`*H\u0002J\u001d\u0010,\u001a\u0004\u0018\u0001H-\"\u0004\b\u0000\u0010-2\u0006\u0010\u001c\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001c\u001a\u00020\u0018J\u0010\u00100\u001a\u0002012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0018J\u001a\u00102\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00182\b\u00103\u001a\u0004\u0018\u000104H\u0007J\u0018\u00105\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00182\b\u00106\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R&\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00068\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\u0002\u001a\u0004\b\t\u0010\nR&\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u00068"}, d2 = {"Lcom/vungle/ads/internal/util/FileUtility;", "", "()V", "TAG", "", "allowedClasses", "", "Ljava/lang/Class;", "getAllowedClasses$vungle_ads_release$annotations", "getAllowedClasses$vungle_ads_release", "()Ljava/util/List;", "<set-?>", "Lcom/vungle/ads/internal/util/FileUtility$ObjectInputStreamProvider;", "objectInputStreamProvider", "getObjectInputStreamProvider", "()Lcom/vungle/ads/internal/util/FileUtility$ObjectInputStreamProvider;", "setObjectInputStreamProvider", "(Lcom/vungle/ads/internal/util/FileUtility$ObjectInputStreamProvider;)V", "closeQuietly", "", "closeable", "Ljava/io/Closeable;", "delete", InneractiveMediationDefs.GENDER_FEMALE, "Ljava/io/File;", "excludeFiles", "", "deleteAndLogIfFailed", C4240b4.i.f42616b, "deleteContents", "folder", "getIndentString", "indent", "", "guessFileName", "url", "ext", "isValidUrl", "", "printDirectoryTree", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "printFile", "readSerializable", "T", "(Ljava/io/File;)Ljava/lang/Object;", "readString", "size", "", "writeSerializable", "serializable", "Ljava/io/Serializable;", "writeString", "content", "ObjectInputStreamProvider", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FileUtility {

    @NotNull
    private static final String TAG = "FileUtility";

    @NotNull
    public static final FileUtility INSTANCE = new FileUtility();

    @NotNull
    private static ObjectInputStreamProvider objectInputStreamProvider = new ObjectInputStreamProvider() { // from class: com.vungle.ads.internal.util.a
        @Override // com.vungle.ads.internal.util.FileUtility.ObjectInputStreamProvider
        public final ObjectInputStream provideObjectInputStream(InputStream inputStream) {
            return FileUtility.m7582objectInputStreamProvider$lambda0(inputStream);
        }
    };

    @NotNull
    private static final List<Class<?>> allowedClasses = CollectionsKt.listOf((Object[]) new Class[]{LinkedHashSet.class, HashSet.class, HashMap.class, ArrayList.class, File.class});

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/util/FileUtility$ObjectInputStreamProvider;", "", "provideObjectInputStream", "Ljava/io/ObjectInputStream;", "inputStream", "Ljava/io/InputStream;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface ObjectInputStreamProvider {
        @NotNull
        ObjectInputStream provideObjectInputStream(@Nullable InputStream inputStream) throws IOException, ClassNotFoundException;
    }

    private FileUtility() {
    }

    public static final void delete(@Nullable File f10, @Nullable Set<String> excludeFiles) {
        if (f10 != null) {
            try {
                if (f10.exists()) {
                    if (f10.isDirectory()) {
                        if (excludeFiles != null && excludeFiles.contains(f10.getName())) {
                            Logger.INSTANCE.d(TAG, "Skipping deletion of directory: " + f10.getName());
                            return;
                        }
                        deleteContents(f10, excludeFiles);
                    }
                    if (excludeFiles != null && excludeFiles.contains(f10.getName())) {
                        Logger.INSTANCE.d(TAG, "Skipping deletion of file: " + f10.getName());
                        return;
                    }
                    if (f10.delete()) {
                        return;
                    }
                    Logger.INSTANCE.d(TAG, "Failed to delete file: " + f10);
                }
            } catch (Exception e10) {
                Logger.INSTANCE.e(TAG, "Failed to delete file: " + e10.getLocalizedMessage());
            }
        }
    }

    public static /* synthetic */ void delete$default(File file, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            set = null;
        }
        delete(file, set);
    }

    public static final void deleteAndLogIfFailed(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                Files.delete(file.toPath());
            } else {
                if (file.delete()) {
                    return;
                }
                new AssetFailedToDeleteError("Cannot delete " + file.getName()).logErrorNoReturnValue$vungle_ads_release();
            }
        } catch (Exception e10) {
            new AssetFailedToDeleteError("Failed to delete " + file.getName() + " with error :" + e10.getMessage()).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    public static final void deleteContents(@NotNull File folder, @Nullable Set<String> excludeFiles) {
        Intrinsics.checkNotNullParameter(folder, "folder");
        File[] fileArrListFiles = folder.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            delete(file, excludeFiles);
        }
    }

    public static /* synthetic */ void deleteContents$default(File file, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            set = null;
        }
        deleteContents(file, set);
    }

    @VisibleForTesting
    public static /* synthetic */ void getAllowedClasses$vungle_ads_release$annotations() {
    }

    private final String getIndentString(int indent) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < indent; i10++) {
            sb2.append("|  ");
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    public static /* synthetic */ String guessFileName$default(FileUtility fileUtility, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return fileUtility.guessFileName(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: objectInputStreamProvider$lambda-0, reason: not valid java name */
    public static final ObjectInputStream m7582objectInputStreamProvider$lambda0(InputStream inputStream) {
        return new SafeObjectInputStream(inputStream, allowedClasses);
    }

    public static final void printDirectoryTree(@Nullable File folder) {
    }

    private final void printFile(File file, int indent, StringBuilder sb2) {
        sb2.append(getIndentString(indent));
        sb2.append("+--");
        sb2.append(file.getName());
        sb2.append('\n');
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0028: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:41), block:B:11:0x0028 */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.vungle.ads.internal.util.FileUtility] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.util.FileUtility] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.vungle.ads.internal.util.FileUtility] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.io.Closeable, java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v11, types: [com.vungle.ads.internal.util.FileUtility$ObjectInputStreamProvider] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Nullable
    public static final <T> T readSerializable(@NotNull File file) {
        Closeable closeable;
        ObjectInputStream objectInputStreamProvideObjectInputStream;
        ?? r12;
        Intrinsics.checkNotNullParameter(file, "file");
        ?? Exists = file.exists();
        Closeable closeable2 = null;
        try {
            if (Exists == 0) {
                return null;
            }
            try {
                Exists = new FileInputStream(file);
                try {
                    objectInputStreamProvideObjectInputStream = objectInputStreamProvider.provideObjectInputStream(Exists);
                } catch (IOException e10) {
                    e = e10;
                    objectInputStreamProvideObjectInputStream = null;
                } catch (ClassNotFoundException e11) {
                    e = e11;
                    objectInputStreamProvideObjectInputStream = null;
                } catch (Exception e12) {
                    e = e12;
                    objectInputStreamProvideObjectInputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    ?? r02 = INSTANCE;
                    r02.closeQuietly(closeable2);
                    r02.closeQuietly(Exists);
                    throw th;
                }
            } catch (IOException e13) {
                e = e13;
                Exists = 0;
                objectInputStreamProvideObjectInputStream = null;
            } catch (ClassNotFoundException e14) {
                e = e14;
                Exists = 0;
                objectInputStreamProvideObjectInputStream = null;
            } catch (Exception e15) {
                e = e15;
                Exists = 0;
                objectInputStreamProvideObjectInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                Exists = 0;
            }
            try {
                T t10 = (T) objectInputStreamProvideObjectInputStream.readObject();
                ?? r03 = INSTANCE;
                r03.closeQuietly(objectInputStreamProvideObjectInputStream);
                r03.closeQuietly(Exists);
                return t10;
            } catch (IOException e16) {
                e = e16;
                Logger.INSTANCE.e(TAG, "IOException: " + e.getMessage());
                r12 = Exists;
                ?? r04 = INSTANCE;
                r04.closeQuietly(objectInputStreamProvideObjectInputStream);
                r04.closeQuietly(r12);
                try {
                    delete$default(file, null, 2, null);
                } catch (IOException unused) {
                }
                return null;
            } catch (ClassNotFoundException e17) {
                e = e17;
                Logger.INSTANCE.e(TAG, "ClassNotFoundException: " + e.getMessage());
                r12 = Exists;
                ?? r042 = INSTANCE;
                r042.closeQuietly(objectInputStreamProvideObjectInputStream);
                r042.closeQuietly(r12);
                delete$default(file, null, 2, null);
                return null;
            } catch (Exception e18) {
                e = e18;
                Logger.INSTANCE.e(TAG, "cannot read serializable " + e.getMessage());
                r12 = Exists;
                ?? r0422 = INSTANCE;
                r0422.closeQuietly(objectInputStreamProvideObjectInputStream);
                r0422.closeQuietly(r12);
                delete$default(file, null, 2, null);
                return null;
            }
        } catch (Throwable th4) {
            th = th4;
            closeable2 = closeable;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void writeSerializable(@NotNull File file, @Nullable Serializable serializable) {
        OutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream;
        Intrinsics.checkNotNullParameter(file, "file");
        if (file.exists()) {
            deleteAndLogIfFailed(file);
        }
        if (serializable == null) {
            return;
        }
        OutputStream outputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                objectOutputStream = new ObjectOutputStream(fileOutputStream);
                try {
                    objectOutputStream.writeObject(serializable);
                    objectOutputStream.reset();
                    FileUtility fileUtility = INSTANCE;
                    fileUtility.closeQuietly(objectOutputStream);
                    fileUtility.closeQuietly(fileOutputStream);
                } catch (IOException e10) {
                    e = e10;
                    outputStream = fileOutputStream;
                    try {
                        Logger.INSTANCE.e(TAG, String.valueOf(e.getMessage()));
                        FileUtility fileUtility2 = INSTANCE;
                        fileUtility2.closeQuietly(objectOutputStream);
                        fileUtility2.closeQuietly(outputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = outputStream;
                        outputStream = objectOutputStream;
                        FileUtility fileUtility3 = INSTANCE;
                        fileUtility3.closeQuietly(outputStream);
                        fileUtility3.closeQuietly(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    outputStream = objectOutputStream;
                    FileUtility fileUtility32 = INSTANCE;
                    fileUtility32.closeQuietly(outputStream);
                    fileUtility32.closeQuietly(fileOutputStream);
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
                objectOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                FileUtility fileUtility322 = INSTANCE;
                fileUtility322.closeQuietly(outputStream);
                fileUtility322.closeQuietly(fileOutputStream);
                throw th;
            }
        } catch (IOException e12) {
            e = e12;
            objectOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = null;
        }
    }

    public final void closeQuietly(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @NotNull
    public final List<Class<?>> getAllowedClasses$vungle_ads_release() {
        return allowedClasses;
    }

    @VisibleForTesting
    @NotNull
    public final ObjectInputStreamProvider getObjectInputStreamProvider() {
        return objectInputStreamProvider;
    }

    @NotNull
    public final String guessFileName(@NotNull String url, @Nullable String ext) {
        Intrinsics.checkNotNullParameter(url, "url");
        String strGuessFileName = URLUtil.guessFileName(url, null, ext);
        Intrinsics.checkNotNullExpressionValue(strGuessFileName, "guessFileName(url, null, ext)");
        return strGuessFileName;
    }

    public final boolean isValidUrl(@Nullable String url) {
        if (url != null) {
            try {
                if (!StringsKt.y0(url)) {
                    if (u.f73749k.f(url) != null) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Nullable
    public final String readString(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (!file.exists()) {
            return null;
        }
        try {
            return i.m(file, null, 1, null);
        } catch (IOException e10) {
            Logger.INSTANCE.e(TAG, "IOException: " + e10.getMessage());
            return null;
        } catch (Exception e11) {
            Logger.INSTANCE.e(TAG, "cannot read string " + e11.getMessage());
            return null;
        }
    }

    @VisibleForTesting
    public final void setObjectInputStreamProvider(@NotNull ObjectInputStreamProvider objectInputStreamProvider2) {
        Intrinsics.checkNotNullParameter(objectInputStreamProvider2, "<set-?>");
        objectInputStreamProvider = objectInputStreamProvider2;
    }

    public final long size(@Nullable File file) {
        long size = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            if (!(fileArrListFiles.length == 0)) {
                for (File file2 : fileArrListFiles) {
                    size += size(file2);
                }
            }
        }
        return size;
    }

    public final void writeString(@NotNull File file, @Nullable String content) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (content == null) {
            return;
        }
        try {
            i.o(file, content, Charsets.UTF_8);
        } catch (IOException e10) {
            Logger.INSTANCE.e(TAG, String.valueOf(e10.getMessage()));
        }
    }

    private final void printDirectoryTree(File folder, int indent, StringBuilder sb2) {
        if (folder == null) {
            return;
        }
        if (!folder.isDirectory()) {
            throw new IllegalArgumentException("folder is not a Directory");
        }
        sb2.append(getIndentString(indent));
        sb2.append("+--");
        sb2.append(folder.getName());
        sb2.append("/\n");
        File[] fileArrListFiles = folder.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (file.isDirectory()) {
                printDirectoryTree(file, indent + 1, sb2);
            } else {
                Intrinsics.checkNotNullExpressionValue(file, "file");
                printFile(file, indent + 1, sb2);
            }
        }
    }
}
