package io.appmetrica.analytics.screenshot.impl;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes12.dex */
public final class Z extends ContentObserver {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f78992d = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientContext f78993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f78994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile C5617k f78995c;

    public Z(ClientContext clientContext, C5624s c5624s) {
        super(clientContext.getClientExecutorProvider().getDefaultExecutor().getHandler());
        this.f78993a = clientContext;
        this.f78994b = c5624s;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10, Uri uri) {
        C5617k c5617k;
        super.onChange(z10, uri);
        if (!StringsKt.a0(String.valueOf(uri), f78992d, false, 2, null) || (c5617k = this.f78995c) == null) {
            return;
        }
        try {
            String[] strArr = (String[]) ArraysKt.plus((Object[]) new String[]{"date_added"}, (Collection) c5617k.f79023b);
            Cursor cursorQuery = this.f78993a.getContext().getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, strArr, "date_added >= ?", new String[]{String.valueOf(new SystemTimeProvider().currentTimeSeconds() - c5617k.f79024c)}, "date_added DESC");
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        for (String str : strArr) {
                        }
                        Iterator it = c5617k.f79023b.iterator();
                        while (it.hasNext()) {
                            if (StringsKt.g0(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow((String) it.next())).toLowerCase(Locale.ROOT), "screenshot", false, 2, null)) {
                                this.f78994b.invoke();
                            }
                        }
                    }
                } finally {
                }
            }
            Unit unit = Unit.f93236a;
            uf.c.a(cursorQuery, null);
        } catch (Exception unused) {
        }
    }
}
