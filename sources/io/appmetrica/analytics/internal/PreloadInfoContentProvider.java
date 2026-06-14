package io.appmetrica.analytics.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.AbstractC5227kj;
import io.appmetrica.analytics.impl.C5244la;
import io.appmetrica.analytics.impl.C5249lf;
import io.appmetrica.analytics.impl.C5274mf;
import io.appmetrica.analytics.impl.C5536x3;
import io.appmetrica.analytics.impl.C5561y3;
import io.appmetrica.analytics.impl.H5;
import io.appmetrica.analytics.impl.I5;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes12.dex */
public class PreloadInfoContentProvider extends ContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f78676a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UriMatcher f78677b = new UriMatcher(-1);

    private void a(I5 i52, ContentValues contentValues) {
        Context context = getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        if (applicationContext != null) {
            try {
                Object objInvoke = i52.f75920a.invoke(contentValues);
                if (objInvoke != null) {
                    i52.f75922c.b(applicationContext);
                    if (((Boolean) i52.f75921b.invoke(objInvoke)).booleanValue()) {
                        AbstractC5227kj.a("Successfully saved " + i52.f75923d, new Object[0]);
                    } else {
                        AbstractC5227kj.a("Did not save " + i52.f75923d + " because data is already present", new Object[0]);
                    }
                }
            } catch (Throwable th2) {
                ImportantLogger.INSTANCE.info("AppMetrica-Attribution", String.format("Unexpected error occurred", new Object[0]) + IOUtils.LINE_SEPARATOR_UNIX + StringUtils.throwableToString(th2), new Object[0]);
            }
        }
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        AbstractC5227kj.a("Deleting is not supported", new Object[0]);
        return -1;
    }

    public synchronized void disable() {
        this.f78676a = true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        synchronized (this) {
            try {
                if (this.f78676a) {
                    return null;
                }
                if (contentValues != null) {
                    int iMatch = this.f78677b.match(uri);
                    if (iMatch == 1) {
                        a(new I5(new C5249lf(), new C5274mf(), C5244la.f77693d, "preload info"), contentValues);
                    } else if (iMatch != 2) {
                        AbstractC5227kj.a("Bad content provider uri.", new Object[0]);
                    } else {
                        a(new I5(new C5536x3(), new C5561y3(), C5244la.f77693d, "clids"), contentValues);
                    }
                }
                CountDownLatch countDownLatch = H5.f75842a;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        String str = (applicationContext != null ? applicationContext.getPackageName() : "") + ".appmetrica.preloadinfo.retail";
        this.f78677b.addURI(str, "preloadinfo", 1);
        this.f78677b.addURI(str, "clids", 2);
        H5.f75842a = new CountDownLatch(1);
        H5.f75843b = this;
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        AbstractC5227kj.a("Query is not supported", new Object[0]);
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        AbstractC5227kj.a("Updating is not supported", new Object[0]);
        return -1;
    }
}
