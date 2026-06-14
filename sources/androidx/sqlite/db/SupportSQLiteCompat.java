package androidx.sqlite.db;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.my.target.common.menu.MenuActionType;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat;", "", "<init>", "()V", "Api16Impl", "Api19Impl", "Api21Impl", "Api23Impl", "Api29Impl", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class SupportSQLiteCompat {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\u0007H\u0007¨\u0006\t"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api16Impl;", "", "<init>", "()V", MenuActionType.CANCEL, "", "cancellationSignal", "Landroid/os/CancellationSignal;", "createCancellationSignal", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final class Api16Impl {

        @NotNull
        public static final Api16Impl INSTANCE = new Api16Impl();

        private Api16Impl() {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static final void cancel(@NotNull CancellationSignal cancellationSignal) {
            Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
            cancellationSignal.cancel();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @NotNull
        public static final CancellationSignal createCancellationSignal() {
            return new CancellationSignal();
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api19Impl;", "", "<init>", "()V", "getNotificationUri", "Landroid/net/Uri;", "cursor", "Landroid/database/Cursor;", "isLowRamDevice", "", "activityManager", "Landroid/app/ActivityManager;", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final class Api19Impl {

        @NotNull
        public static final Api19Impl INSTANCE = new Api19Impl();

        private Api19Impl() {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @NotNull
        public static final Uri getNotificationUri(@NotNull Cursor cursor) {
            Intrinsics.checkNotNullParameter(cursor, "cursor");
            Uri notificationUri = cursor.getNotificationUri();
            Intrinsics.checkNotNullExpressionValue(notificationUri, "getNotificationUri(...)");
            return notificationUri;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static final boolean isLowRamDevice(@NotNull ActivityManager activityManager) {
            Intrinsics.checkNotNullParameter(activityManager, "activityManager");
            return activityManager.isLowRamDevice();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api21Impl;", "", "<init>", "()V", "getNoBackupFilesDir", "Ljava/io/File;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class Api21Impl {

        @NotNull
        public static final Api21Impl INSTANCE = new Api21Impl();

        private Api21Impl() {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public static final File getNoBackupFilesDir(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            File noBackupFilesDir = context.getNoBackupFilesDir();
            Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "getNoBackupFilesDir(...)");
            return noBackupFilesDir;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api23Impl;", "", "<init>", "()V", "setExtras", "", "cursor", "Landroid/database/Cursor;", HandleInvocationsFromAdViewer.KEY_EXTRAS, "Landroid/os/Bundle;", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class Api23Impl {

        @NotNull
        public static final Api23Impl INSTANCE = new Api23Impl();

        private Api23Impl() {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final void setExtras(@NotNull Cursor cursor, @NotNull Bundle extras) {
            Intrinsics.checkNotNullParameter(cursor, "cursor");
            Intrinsics.checkNotNullParameter(extras, "extras");
            cursor.setExtras(extras);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0007J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\u000e"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api29Impl;", "", "<init>", "()V", "setNotificationUris", "", "cursor", "Landroid/database/Cursor;", "cr", "Landroid/content/ContentResolver;", "uris", "", "Landroid/net/Uri;", "getNotificationUris", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @RequiresApi(29)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class Api29Impl {

        @NotNull
        public static final Api29Impl INSTANCE = new Api29Impl();

        private Api29Impl() {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public static final List<Uri> getNotificationUris(@NotNull Cursor cursor) {
            Intrinsics.checkNotNullParameter(cursor, "cursor");
            List<Uri> notificationUris = cursor.getNotificationUris();
            Intrinsics.checkNotNull(notificationUris);
            return notificationUris;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final void setNotificationUris(@NotNull Cursor cursor, @NotNull ContentResolver cr, @NotNull List<? extends Uri> uris) {
            Intrinsics.checkNotNullParameter(cursor, "cursor");
            Intrinsics.checkNotNullParameter(cr, "cr");
            Intrinsics.checkNotNullParameter(uris, "uris");
            cursor.setNotificationUris(cr, uris);
        }
    }

    private SupportSQLiteCompat() {
    }
}
