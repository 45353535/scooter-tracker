package com.ironsource.environment;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import com.ironsource.F4;

/* JADX INFO: loaded from: classes10.dex */
public class CrashProvider extends ContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f43033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    F4 f43034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f43035c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Uri f43037e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f43040h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    String f43041i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    UriMatcher f43036d = new UriMatcher(-1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f43038f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f43039g = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final String f43042j = "REPORTS";

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        int iMatch = this.f43036d.match(uri);
        if (iMatch == 1) {
            return this.f43040h;
        }
        if (iMatch == 2) {
            return this.f43041i;
        }
        throw new IllegalArgumentException("Invalid URI: " + uri);
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.f43033a = getContext();
        this.f43034b = new F4(this.f43033a);
        this.f43035c = this.f43033a.getPackageName();
        this.f43037e = Uri.parse("content://" + this.f43035c + "/REPORTS");
        this.f43040h = "vnd.android.cursor.dir/CrashReporter.Reports";
        this.f43041i = "vnd.android.cursor.item/CrashReporter/Reports";
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int iMatch = this.f43036d.match(uri);
        if (iMatch == 1) {
            return F4.c();
        }
        if (iMatch == 2) {
            return F4.a(Integer.parseInt(uri.getLastPathSegment()));
        }
        throw new IllegalArgumentException("Invalid URI: " + uri);
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
