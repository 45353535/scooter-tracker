package io.sentry;

import androidx.webkit.internal.AssetHelper;
import com.ironsource.D5;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f83250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d2 f83251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Callable f83252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f83253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f83254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f83255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f83256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f83257h;

    public b(byte[] bArr, String str, String str2, boolean z10) {
        this(bArr, str, str2, "event.attachment", z10);
    }

    public static b a(Callable callable, String str, String str2, boolean z10) {
        return new b(callable, str, str2, "event.attachment", z10);
    }

    public static b b(byte[] bArr) {
        return new b(bArr, "thread-dump.txt", AssetHelper.DEFAULT_MIME_TYPE, false);
    }

    public static b c(io.sentry.protocol.j0 j0Var) {
        return new b((d2) j0Var, "view-hierarchy.json", D5.L, "event.view_hierarchy", false);
    }

    public String d() {
        return this.f83257h;
    }

    public Callable e() {
        return this.f83252c;
    }

    public byte[] f() {
        return this.f83250a;
    }

    public String g() {
        return this.f83255f;
    }

    public String h() {
        return this.f83254e;
    }

    public String i() {
        return this.f83253d;
    }

    public d2 j() {
        return this.f83251b;
    }

    boolean k() {
        return this.f83256g;
    }

    public b(byte[] bArr, String str, String str2, String str3, boolean z10) {
        this.f83250a = bArr;
        this.f83251b = null;
        this.f83252c = null;
        this.f83254e = str;
        this.f83255f = str2;
        this.f83257h = str3;
        this.f83256g = z10;
    }

    public b(d2 d2Var, String str, String str2, String str3, boolean z10) {
        this.f83250a = null;
        this.f83251b = d2Var;
        this.f83252c = null;
        this.f83254e = str;
        this.f83255f = str2;
        this.f83257h = str3;
        this.f83256g = z10;
    }

    public b(Callable callable, String str, String str2, String str3, boolean z10) {
        this.f83250a = null;
        this.f83251b = null;
        this.f83252c = callable;
        this.f83254e = str;
        this.f83255f = str2;
        this.f83257h = str3;
        this.f83256g = z10;
    }
}
