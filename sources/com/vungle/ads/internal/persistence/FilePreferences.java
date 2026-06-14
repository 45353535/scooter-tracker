package com.vungle.ads.internal.persistence;

import androidx.annotation.VisibleForTesting;
import com.ironsource.C4240b4;
import com.taurusx.tax.f.y;
import com.vungle.ads.internal.util.CollectionsConcurrencyUtil;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.PathProvider;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005\u0018\u0000 02\u00020\u0001:\u00010B#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0015J\u001d\u0010\u0010\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001bJ\u001d\u0010\u0010\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u001c¢\u0006\u0004\b\u0010\u0010\u001dJ\u001d\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010\u0010\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00062\u001a\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010 j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`!¢\u0006\u0004\b\u0010\u0010\"J=\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u00060 j\b\u0012\u0004\u0012\u00020\u0006`!2\u0006\u0010\r\u001a\u00020\u00062\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00060 j\b\u0012\u0004\u0012\u00020\u0006`!¢\u0006\u0004\b#\u0010$J\u001d\u0010\u0010\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020%¢\u0006\u0004\b\u0010\u0010&J\u001d\u0010'\u001a\u00020%2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020%¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R \u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/vungle/ads/internal/persistence/FilePreferences;", "", "Ljava/util/concurrent/Executor;", "ioExecutor", "Lcom/vungle/ads/internal/util/PathProvider;", "pathProvider", "", "filename", "<init>", "(Ljava/util/concurrent/Executor;Lcom/vungle/ads/internal/util/PathProvider;Ljava/lang/String;)V", "", "apply", "()V", C4240b4.i.W, "", "value", "put", "(Ljava/lang/String;Z)Lcom/vungle/ads/internal/persistence/FilePreferences;", "defaultValue", "getBoolean", "(Ljava/lang/String;Z)Z", "(Ljava/lang/String;)Ljava/lang/Boolean;", "(Ljava/lang/String;Ljava/lang/String;)Lcom/vungle/ads/internal/persistence/FilePreferences;", "remove", "(Ljava/lang/String;)Lcom/vungle/ads/internal/persistence/FilePreferences;", "getString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "(Ljava/lang/String;)Ljava/lang/String;", "", "(Ljava/lang/String;I)Lcom/vungle/ads/internal/persistence/FilePreferences;", "getInt", "(Ljava/lang/String;I)I", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "(Ljava/lang/String;Ljava/util/HashSet;)Lcom/vungle/ads/internal/persistence/FilePreferences;", "getStringSet", "(Ljava/lang/String;Ljava/util/HashSet;)Ljava/util/HashSet;", "", "(Ljava/lang/String;J)Lcom/vungle/ads/internal/persistence/FilePreferences;", "getLong", "(Ljava/lang/String;J)J", "Ljava/util/concurrent/Executor;", "Ljava/io/File;", C4240b4.i.f42616b, "Ljava/io/File;", "j$/util/concurrent/ConcurrentHashMap", "values", "Lj$/util/concurrent/ConcurrentHashMap;", y.f66058y, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FilePreferences {

    @NotNull
    public static final String FILENAME = "settings_vungle";

    @NotNull
    public static final String TPAT_FAILED_FILENAME = "vngFailedTpats";

    @NotNull
    private final File file;

    @NotNull
    private final Executor ioExecutor;

    @NotNull
    private final ConcurrentHashMap<String, Object> values;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ConcurrentHashMap<String, FilePreferences> filePreferenceMap = new ConcurrentHashMap<>();

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087T¢\u0006\f\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u000f\u0010\u0003R\u0014\u0010\u0010\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/vungle/ads/internal/persistence/FilePreferences$Companion;", "", "<init>", "()V", "Ljava/util/concurrent/Executor;", "ioExecutor", "Lcom/vungle/ads/internal/util/PathProvider;", "pathProvider", "", "filename", "Lcom/vungle/ads/internal/persistence/FilePreferences;", "get", "(Ljava/util/concurrent/Executor;Lcom/vungle/ads/internal/util/PathProvider;Ljava/lang/String;)Lcom/vungle/ads/internal/persistence/FilePreferences;", "FILENAME", "Ljava/lang/String;", "getFILENAME$annotations", "TPAT_FAILED_FILENAME", "j$/util/concurrent/ConcurrentHashMap", "filePreferenceMap", "Lj$/util/concurrent/ConcurrentHashMap;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ FilePreferences get$default(Companion companion, Executor executor, PathProvider pathProvider, String str, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                str = FilePreferences.FILENAME;
            }
            return companion.get(executor, pathProvider, str);
        }

        @VisibleForTesting
        public static /* synthetic */ void getFILENAME$annotations() {
        }

        @NotNull
        public final synchronized FilePreferences get(@NotNull Executor ioExecutor, @NotNull PathProvider pathProvider, @NotNull String filename) {
            Object filePreferences;
            Object objPutIfAbsent;
            try {
                Intrinsics.checkNotNullParameter(ioExecutor, "ioExecutor");
                Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
                Intrinsics.checkNotNullParameter(filename, "filename");
                ConcurrentHashMap concurrentHashMap = FilePreferences.filePreferenceMap;
                filePreferences = concurrentHashMap.get(filename);
                if (filePreferences == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(filename, (filePreferences = new FilePreferences(ioExecutor, pathProvider, filename, null)))) != null) {
                    filePreferences = objPutIfAbsent;
                }
                Intrinsics.checkNotNullExpressionValue(filePreferences, "filePreferenceMap.getOrP…, filename)\n            }");
            } catch (Throwable th2) {
                throw th2;
            }
            return (FilePreferences) filePreferences;
        }

        private Companion() {
        }
    }

    public /* synthetic */ FilePreferences(Executor executor, PathProvider pathProvider, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(executor, pathProvider, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: apply$lambda-0, reason: not valid java name */
    public static final void m7541apply$lambda0(FilePreferences this$0, Serializable serializable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(serializable, "$serializable");
        FileUtility.writeSerializable(this$0.file, serializable);
    }

    @NotNull
    public static final synchronized FilePreferences get(@NotNull Executor executor, @NotNull PathProvider pathProvider, @NotNull String str) {
        return INSTANCE.get(executor, pathProvider, str);
    }

    public final void apply() {
        final HashMap map = new HashMap(this.values);
        this.ioExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.persistence.a
            @Override // java.lang.Runnable
            public final void run() {
                FilePreferences.m7541apply$lambda0(this.f68050b, map);
            }
        });
    }

    public final boolean getBoolean(@NotNull String key, boolean defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.values.get(key);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : defaultValue;
    }

    public final int getInt(@NotNull String key, int defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.values.get(key);
        return obj instanceof Integer ? ((Number) obj).intValue() : defaultValue;
    }

    public final long getLong(@NotNull String key, long defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.values.get(key);
        return obj instanceof Long ? ((Number) obj).longValue() : defaultValue;
    }

    @NotNull
    public final String getString(@NotNull String key, @NotNull String defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Object obj = this.values.get(key);
        return obj instanceof String ? (String) obj : defaultValue;
    }

    @NotNull
    public final HashSet<String> getStringSet(@NotNull String key, @NotNull HashSet<String> defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Object obj = this.values.get(key);
        return obj instanceof HashSet ? CollectionsConcurrencyUtil.getNewHashSet((HashSet) obj) : defaultValue;
    }

    @NotNull
    public final FilePreferences put(@NotNull String key, boolean value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.values.put(key, Boolean.valueOf(value));
        return this;
    }

    @NotNull
    public final FilePreferences remove(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.values.containsKey(key)) {
            this.values.remove(key);
        }
        return this;
    }

    private FilePreferences(Executor executor, PathProvider pathProvider, String str) {
        this.ioExecutor = executor;
        File file = new File(pathProvider.getSharedPrefsDir(), str);
        this.file = file;
        ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
        this.values = concurrentHashMap;
        Object serializable = FileUtility.readSerializable(file);
        if (serializable instanceof HashMap) {
            concurrentHashMap.putAll((HashMap) serializable);
        }
    }

    @NotNull
    public final FilePreferences put(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.values.put(key, value);
        return this;
    }

    @Nullable
    public final Boolean getBoolean(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.values.get(key);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return null;
    }

    @Nullable
    public final String getString(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.values.get(key);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @NotNull
    public final FilePreferences put(@NotNull String key, int value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.values.put(key, Integer.valueOf(value));
        return this;
    }

    @NotNull
    public final FilePreferences put(@NotNull String key, @Nullable HashSet<String> value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.values.put(key, CollectionsConcurrencyUtil.getNewHashSet(value));
        return this;
    }

    @NotNull
    public final FilePreferences put(@NotNull String key, long value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.values.put(key, Long.valueOf(value));
        return this;
    }

    /* synthetic */ FilePreferences(Executor executor, PathProvider pathProvider, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(executor, pathProvider, (i10 & 4) != 0 ? FILENAME : str);
    }
}
