package sg.bigo.ads.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsIntent;
import sg.bigo.ads.a.a;
import sg.bigo.ads.a.a.a;
import sg.bigo.ads.a.a.b;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f100107a = true;

    private static void a() {
        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "Chrome tabs libs does not exist.");
        f100107a = false;
    }

    public static void a(final Context context) {
        a(context, "", null, "warmup", new Runnable() { // from class: sg.bigo.ads.a.c.3
            @Override // java.lang.Runnable
            public final void run() {
                b bVarA = b.a();
                Context context2 = context;
                if (context2 != null) {
                    sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "Chrome tabs warming up.");
                    bVarA.a(context2.getApplicationContext());
                }
            }
        });
    }

    static void a(final Context context, final String str, final int i10, final int i11, final boolean z10, final Bitmap bitmap, final a.c cVar, final a.b bVar) {
        a(context, str, bVar, "open", new Runnable() { // from class: sg.bigo.ads.a.c.2
            @Override // java.lang.Runnable
            public final void run() {
                Uri uri;
                final b bVarA = b.a();
                Context context2 = context;
                final String str2 = str;
                int i12 = i10;
                int i13 = i11;
                boolean z11 = z10;
                Bitmap bitmap2 = bitmap;
                final a.c cVar2 = cVar;
                final a.b bVar2 = bVar;
                if (!TextUtils.isEmpty(str2)) {
                    bVarA.f100090b.remove(str2);
                }
                sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "Start load url: " + str2 + " with chrome tab current thread: " + Thread.currentThread().getName() + ".");
                try {
                    uri = Uri.parse(str2);
                } catch (Exception unused) {
                    uri = null;
                }
                if (uri == null) {
                    sg.bigo.ads.common.t.a.a(0, "ChromeTabsStatic", "Stop open chrome tab with error url.");
                    if (bVar2 != null) {
                        bVar2.a(context2, str2, 3, "Invalid url");
                        return;
                    }
                    return;
                }
                bVarA.a(context2);
                bVarA.f100089a.f100077d = new CustomTabsCallback() { // from class: sg.bigo.ads.a.b.1
                    @Override // androidx.browser.customtabs.CustomTabsCallback
                    public final void onNavigationEvent(int i14, Bundle bundle) {
                        super.onNavigationEvent(i14, bundle);
                        if (cVar2 == null) {
                            return;
                        }
                        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "Receive custom tab event: " + b.a(i14));
                        if (i14 == 5) {
                            cVar2.a();
                            return;
                        }
                        if (i14 == 1) {
                            cVar2.b();
                            return;
                        }
                        if (i14 == 3) {
                            cVar2.d();
                            return;
                        }
                        if (i14 == 4) {
                            cVar2.c();
                            return;
                        }
                        if (i14 == 2) {
                            cVar2.e();
                        } else if (i14 == 6) {
                            cVar2.f();
                            b.this.f100089a.f100077d = null;
                        }
                    }
                };
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(bVarA.f100089a.a());
                if (i12 != 0) {
                    builder.setToolbarColor(i12);
                }
                if (i13 != 0) {
                    builder.setSecondaryToolbarColor(i13);
                }
                if (bitmap2 != null) {
                    builder.setCloseButtonIcon(bitmap2);
                }
                builder.setShowTitle(z11);
                CustomTabsIntent customTabsIntentBuild = builder.build();
                try {
                    Context contextB = sg.bigo.ads.common.f.b.b();
                    if (contextB == null) {
                        contextB = context2;
                    }
                    a.b bVar3 = new a.b() { // from class: sg.bigo.ads.a.b.2
                        @Override // sg.bigo.ads.a.a.a.b
                        public final void a(Context context3, b.a aVar) {
                            a.b bVar4 = bVar2;
                            if (bVar4 != null) {
                                bVar4.a(context3, str2, 2, aVar == null ? "" : aVar.f100083b);
                            }
                        }

                        @Override // sg.bigo.ads.a.a.a.b
                        public final void a(b.a aVar) {
                            a.b bVar4 = bVar2;
                            if (bVar4 == null || aVar == null) {
                                return;
                            }
                            bVar4.a(aVar.f100086e, aVar.f100085d, aVar.f100084c);
                        }
                    };
                    b.a aVarA = sg.bigo.ads.a.a.b.a(contextB);
                    if (aVarA == null || !aVarA.f100082a) {
                        bVar3.a(contextB, aVarA);
                    } else {
                        customTabsIntentBuild.intent.setPackage(aVarA.f100086e);
                        customTabsIntentBuild.launchUrl(contextB, uri);
                        bVar3.a(aVarA);
                    }
                } catch (Exception e10) {
                    if (bVar2 != null) {
                        bVar2.a(context2, str2, 4, e10.toString());
                    }
                    bVarA.f100089a.f100077d = null;
                }
            }
        });
    }

    public static void a(final Context context, final String str, final a.b bVar) {
        a(context, str, bVar, "preload", new Runnable() { // from class: sg.bigo.ads.a.c.1
            @Override // java.lang.Runnable
            public final void run() {
                b bVarA = b.a();
                Context context2 = context;
                String str2 = str;
                a.b bVar2 = bVar;
                sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "Start preload url: " + str2 + " with chrome tab current thread: " + Thread.currentThread().getName() + ".");
                if (context2 == null) {
                    sg.bigo.ads.common.t.a.a(0, "ChromeTabsStatic", "Preload: empty context!");
                    if (bVar2 != null) {
                        bVar2.a(context2, str2, 3, "Invalid context");
                        return;
                    }
                    return;
                }
                Context applicationContext = context2.getApplicationContext();
                if (TextUtils.isEmpty(str2)) {
                    sg.bigo.ads.common.t.a.a(0, "ChromeTabsStatic", "Preload: empty url!");
                    if (bVar2 != null) {
                        bVar2.a(applicationContext, str2, 3, "Invalid url");
                        return;
                    }
                    return;
                }
                bVarA.f100090b.add(str2);
                if (bVarA.a(applicationContext)) {
                    sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "Meet the conditions for connection of Chrome service.");
                    bVarA.b();
                    if (bVar2 != null) {
                        bVar2.a("", "0", "");
                        return;
                    }
                    return;
                }
                sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "Failed to make connection of Chrome service.");
                bVarA.f100090b.remove(str2);
                if (bVar2 != null) {
                    bVar2.a(applicationContext, str2, 2, "Failed to make connection of Chrome service.");
                }
            }
        });
    }

    private static void a(@Nullable Context context, String str, @Nullable a.b bVar, String str2, Runnable runnable) {
        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "start ".concat(String.valueOf(str2)));
        if (!f100107a) {
            sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "Failed to " + str2 + " with not exists chrome tab libs");
            if (context == null || bVar == null) {
                return;
            }
            bVar.a(context, str, 1, "NoClassDefFoundError");
            return;
        }
        try {
            runnable.run();
        } catch (NoClassDefFoundError e10) {
            sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "Failed to " + str2 + " with not exists chrome tab libs");
            a();
            if (context == null || bVar == null) {
                return;
            }
            bVar.a(context, str, 1, e10.toString());
        } catch (Throwable th2) {
            sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "Failed to " + str2 + " with unknown reason: " + th2.toString());
            if (context == null || bVar == null) {
                return;
            }
            bVar.a(context, str, 4, th2.toString());
        }
    }
}
