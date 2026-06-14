package io.appmetrica.analytics.impl;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes12.dex */
public final class Fa implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ga f75769a;

    public Fa(Ga ga2) {
        this.f75769a = ga2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Uri uri = Uri.parse("content://com.huawei.appmarket.commondata/item/5");
        ContentResolver contentResolver = this.f75769a.f75817a.getContentResolver();
        Ga ga2 = this.f75769a;
        ga2.f75818b = contentResolver.query(uri, null, null, new String[]{ga2.f75817a.getPackageName()}, null);
        Cursor cursor = this.f75769a.f75818b;
        if (cursor == null || !cursor.moveToFirst()) {
            return null;
        }
        String string = this.f75769a.f75818b.getString(0);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new C5424sg(string, this.f75769a.f75818b.getLong(1), this.f75769a.f75818b.getLong(2), EnumC5399rg.f78154d);
    }
}
