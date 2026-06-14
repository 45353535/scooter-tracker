package androidx.room.support;

import android.content.Context;
import android.util.Log;
import androidx.room.DatabaseConfiguration;
import androidx.room.DelegatingOpenHelper;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.FileUtil;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import androidx.sqlite.util.ProcessLock;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0016H\u0016J\b\u0010#\u001a\u00020\u001bH\u0016J\u000e\u0010$\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u0016H\u0002J\u0018\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u0016H\u0002J\u0018\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u0016H\u0002J\u0010\u0010+\u001a\u00020\u00012\u0006\u0010*\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u0001X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 ¨\u0006,"}, d2 = {"Landroidx/room/support/PrePackagedCopyOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Landroidx/room/DelegatingOpenHelper;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "copyFromAssetPath", "", "copyFromFile", "Ljava/io/File;", "copyFromInputStream", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "databaseVersion", "", "delegate", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;ILandroidx/sqlite/db/SupportSQLiteOpenHelper;)V", "getDelegate", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "databaseConfiguration", "Landroidx/room/DatabaseConfiguration;", "verified", "", "databaseName", "getDatabaseName", "()Ljava/lang/String;", "setWriteAheadLoggingEnabled", "", "enabled", "writableDatabase", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getWritableDatabase", "()Landroidx/sqlite/db/SupportSQLiteDatabase;", "readableDatabase", "getReadableDatabase", "close", "setDatabaseConfiguration", "verifyDatabaseFile", "writable", "copyDatabaseFile", "destinationFile", "dispatchOnOpenPrepackagedDatabase", "databaseFile", "createFrameworkOpenHelper", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PrePackagedCopyOpenHelper implements SupportSQLiteOpenHelper, DelegatingOpenHelper, AutoCloseable {

    @NotNull
    private final Context context;

    @Nullable
    private final String copyFromAssetPath;

    @Nullable
    private final File copyFromFile;

    @Nullable
    private final Callable<InputStream> copyFromInputStream;
    private DatabaseConfiguration databaseConfiguration;
    private final int databaseVersion;

    @NotNull
    private final SupportSQLiteOpenHelper delegate;
    private boolean verified;

    public PrePackagedCopyOpenHelper(@NotNull Context context, @Nullable String str, @Nullable File file, @Nullable Callable<InputStream> callable, int i10, @NotNull SupportSQLiteOpenHelper delegate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.context = context;
        this.copyFromAssetPath = str;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.databaseVersion = i10;
        this.delegate = delegate;
    }

    private final void copyDatabaseFile(File destinationFile, boolean writable) throws Throwable {
        ReadableByteChannel readableByteChannelNewChannel;
        if (this.copyFromAssetPath != null) {
            readableByteChannelNewChannel = Channels.newChannel(this.context.getAssets().open(this.copyFromAssetPath));
            Intrinsics.checkNotNullExpressionValue(readableByteChannelNewChannel, "newChannel(...)");
        } else if (this.copyFromFile != null) {
            readableByteChannelNewChannel = new FileInputStream(this.copyFromFile).getChannel();
            Intrinsics.checkNotNullExpressionValue(readableByteChannelNewChannel, "getChannel(...)");
        } else {
            Callable<InputStream> callable = this.copyFromInputStream;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                readableByteChannelNewChannel = Channels.newChannel(callable.call());
                Intrinsics.checkNotNullExpressionValue(readableByteChannelNewChannel, "newChannel(...)");
            } catch (Exception e10) {
                throw new IOException("inputStreamCallable exception on call", e10);
            }
        }
        File fileCreateTempFile = File.createTempFile("room-copy-helper", ".tmp", this.context.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(fileCreateTempFile).getChannel();
        Intrinsics.checkNotNull(channel);
        FileUtil.copy(readableByteChannelNewChannel, channel);
        File parentFile = destinationFile.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + destinationFile.getAbsolutePath());
        }
        Intrinsics.checkNotNull(fileCreateTempFile);
        dispatchOnOpenPrepackagedDatabase(fileCreateTempFile, writable);
        if (fileCreateTempFile.renameTo(destinationFile)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + fileCreateTempFile.getAbsolutePath() + ") to destination (" + destinationFile.getAbsolutePath() + ").");
    }

    private final SupportSQLiteOpenHelper createFrameworkOpenHelper(File databaseFile) {
        try {
            final int version = DBUtil.readVersion(databaseFile);
            FrameworkSQLiteOpenHelperFactory frameworkSQLiteOpenHelperFactory = new FrameworkSQLiteOpenHelperFactory();
            SupportSQLiteOpenHelper.Configuration.Builder builderName = SupportSQLiteOpenHelper.Configuration.INSTANCE.builder(this.context).name(databaseFile.getAbsolutePath());
            final int iE = kotlin.ranges.g.e(version, 1);
            return frameworkSQLiteOpenHelperFactory.create(builderName.callback(new SupportSQLiteOpenHelper.Callback(iE) { // from class: androidx.room.support.PrePackagedCopyOpenHelper$createFrameworkOpenHelper$configuration$1
                @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
                public void onCreate(SupportSQLiteDatabase db2) {
                    Intrinsics.checkNotNullParameter(db2, "db");
                }

                @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
                public void onOpen(SupportSQLiteDatabase db2) {
                    Intrinsics.checkNotNullParameter(db2, "db");
                    int i10 = version;
                    if (i10 < 1) {
                        db2.setVersion(i10);
                    }
                }

                @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
                public void onUpgrade(SupportSQLiteDatabase db2, int oldVersion, int newVersion) {
                    Intrinsics.checkNotNullParameter(db2, "db");
                }
            }).build());
        } catch (IOException e10) {
            throw new RuntimeException("Malformed database file, unable to read version.", e10);
        }
    }

    private final void dispatchOnOpenPrepackagedDatabase(File databaseFile, boolean writable) throws IOException {
        DatabaseConfiguration databaseConfiguration = this.databaseConfiguration;
        if (databaseConfiguration == null) {
            Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
            databaseConfiguration = null;
        }
        if (databaseConfiguration.prepackagedDatabaseCallback == null) {
            return;
        }
        SupportSQLiteOpenHelper supportSQLiteOpenHelperCreateFrameworkOpenHelper = createFrameworkOpenHelper(databaseFile);
        try {
            SupportSQLiteDatabase writableDatabase = writable ? supportSQLiteOpenHelperCreateFrameworkOpenHelper.getWritableDatabase() : supportSQLiteOpenHelperCreateFrameworkOpenHelper.getReadableDatabase();
            DatabaseConfiguration databaseConfiguration2 = this.databaseConfiguration;
            if (databaseConfiguration2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
                databaseConfiguration2 = null;
            }
            RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback = databaseConfiguration2.prepackagedDatabaseCallback;
            Intrinsics.checkNotNull(prepackagedDatabaseCallback);
            prepackagedDatabaseCallback.onOpenPrepackagedDatabase(writableDatabase);
            Unit unit = Unit.f93236a;
            uf.c.a(supportSQLiteOpenHelperCreateFrameworkOpenHelper, null);
        } finally {
        }
    }

    private final void verifyDatabaseFile(boolean writable) {
        String name = getName();
        if (name == null) {
            throw new IllegalStateException("Required value was null.");
        }
        File databasePath = this.context.getDatabasePath(name);
        DatabaseConfiguration databaseConfiguration = this.databaseConfiguration;
        DatabaseConfiguration databaseConfiguration2 = null;
        if (databaseConfiguration == null) {
            Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
            databaseConfiguration = null;
        }
        ProcessLock processLock = new ProcessLock(name, this.context.getFilesDir(), databaseConfiguration.multiInstanceInvalidation);
        try {
            ProcessLock.lock$default(processLock, false, 1, null);
            if (!databasePath.exists()) {
                try {
                    Intrinsics.checkNotNull(databasePath);
                    copyDatabaseFile(databasePath, writable);
                    processLock.unlock();
                    return;
                } catch (IOException e10) {
                    throw new RuntimeException("Unable to copy database file.", e10);
                }
            }
            try {
                Intrinsics.checkNotNull(databasePath);
                int version = DBUtil.readVersion(databasePath);
                if (version == this.databaseVersion) {
                    processLock.unlock();
                    return;
                }
                DatabaseConfiguration databaseConfiguration3 = this.databaseConfiguration;
                if (databaseConfiguration3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
                    databaseConfiguration3 = null;
                }
                if (databaseConfiguration3.migrationContainer.findMigrationPath(version, this.databaseVersion) != null) {
                    processLock.unlock();
                    return;
                }
                DatabaseConfiguration databaseConfiguration4 = this.databaseConfiguration;
                if (databaseConfiguration4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
                } else {
                    databaseConfiguration2 = databaseConfiguration4;
                }
                if (databaseConfiguration2.isMigrationRequired(version, this.databaseVersion)) {
                    processLock.unlock();
                    return;
                }
                if (this.context.deleteDatabase(name)) {
                    try {
                        copyDatabaseFile(databasePath, writable);
                        Unit unit = Unit.f93236a;
                    } catch (IOException e11) {
                        Log.w(Room.LOG_TAG, "Unable to copy database file.", e11);
                    }
                } else {
                    Log.w(Room.LOG_TAG, "Failed to delete database file (" + name + ") for a copy destructive migration.");
                }
                processLock.unlock();
                return;
            } catch (IOException e12) {
                Log.w(Room.LOG_TAG, "Unable to read database version.", e12);
                processLock.unlock();
                return;
            }
        } catch (Throwable th2) {
            processLock.unlock();
            throw th2;
        }
        processLock.unlock();
        throw th2;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        getDelegate().close();
        this.verified = false;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @Nullable
    /* JADX INFO: renamed from: getDatabaseName */
    public String getName() {
        return getDelegate().getName();
    }

    @Override // androidx.room.DelegatingOpenHelper
    @NotNull
    public SupportSQLiteOpenHelper getDelegate() {
        return this.delegate;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @NotNull
    public SupportSQLiteDatabase getReadableDatabase() {
        if (!this.verified) {
            verifyDatabaseFile(false);
            this.verified = true;
        }
        return getDelegate().getReadableDatabase();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @NotNull
    public SupportSQLiteDatabase getWritableDatabase() {
        if (!this.verified) {
            verifyDatabaseFile(true);
            this.verified = true;
        }
        return getDelegate().getWritableDatabase();
    }

    public final void setDatabaseConfiguration(@NotNull DatabaseConfiguration databaseConfiguration) {
        Intrinsics.checkNotNullParameter(databaseConfiguration, "databaseConfiguration");
        this.databaseConfiguration = databaseConfiguration;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean enabled) {
        getDelegate().setWriteAheadLoggingEnabled(enabled);
    }
}
