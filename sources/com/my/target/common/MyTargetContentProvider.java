package com.my.target.common;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.f0;
import com.my.target.gb;

/* JADX INFO: loaded from: classes11.dex */
public final class MyTargetContentProvider extends ContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f59423a = true;

    public final /* synthetic */ void a() {
        try {
            Context context = getContext();
            Integer num = (Integer) context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get("com.my.target.autoInitMode");
            if (num == null || num.intValue() != 0) {
                gb.c("Start autoinitialization");
                MyTargetManager.initSdk(context);
            }
        } catch (Throwable th2) {
            gb.c("Autoinitialization failed - " + th2.getMessage());
        }
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (providerInfo == null) {
            return;
        }
        if ("com.my.target.mytargetcontentprovider".equals(providerInfo.authority)) {
            gb.c("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
            this.f59423a = false;
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        if (!this.f59423a) {
            return false;
        }
        f0.b(new Runnable() { // from class: l5.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f94050b.a();
            }
        });
        return false;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }
}
