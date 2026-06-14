package com.startapp.sdk.adsbase.crashreport;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.sdk.adsbase.crashreport.ThreadsState;
import com.startapp.sdk.internal.ci;
import com.startapp.sdk.internal.d;
import com.startapp.sdk.internal.g7;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.h9;
import com.startapp.sdk.internal.vi;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f64037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f64038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f64039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f64040d;

    public a(Context context, boolean z10, boolean z11, boolean z12) {
        this.f64037a = context;
        this.f64038b = z10;
        this.f64039c = z11;
        this.f64040d = z12;
    }

    @Override // com.startapp.sdk.internal.d
    public final boolean a(String str, long j10) {
        HashSet hashSet;
        ci ciVar = new ci();
        ciVar.f64378a = "com.startapp.";
        ciVar.f64382e = this.f64038b;
        ciVar.f64383f = this.f64039c;
        ciVar.f64381d = j10;
        ciVar.f64379b = str;
        if (this.f64040d) {
            hashSet = new HashSet();
            hashSet.add("android.webkit.WebView.loadDataWithBaseURL");
            hashSet.add("android.webkit.WebView.<init>");
            hashSet.add("android.webkit.WebView.stopLoading");
            hashSet.add("android.webkit.WebView.loadUrl");
            hashSet.add("libcore.icu.LocaleData.initLocaleData");
            hashSet.add("android.os.BinderProxy.transact");
            hashSet.add("android.hardware.SystemSensorManager.registerListenerImpl");
            hashSet.add("android.hardware.SystemSensorManager.<init>");
            hashSet.add("java.lang.Thread.<init>");
            hashSet.add("android.content.ContextWrapper.checkSelfPermission");
        } else {
            hashSet = null;
        }
        ciVar.f64380c = hashSet;
        ThreadsState threadsState = new ThreadsState(ciVar);
        if (threadsState.c() == null) {
            return false;
        }
        g7.a(this.f64037a, "StartappAnrTrace", threadsState);
        return true;
    }

    @Override // com.startapp.sdk.internal.d
    public final void remove() {
        if (new File(g7.b(this.f64037a, "StartappAnrTrace")).exists()) {
            Context context = this.f64037a;
            g7.a(new File(g7.b(context, "StartappAnrTrace")));
            g7.a(new File(g7.a(context, "StartappAnrTrace")));
        }
    }

    @Override // com.startapp.sdk.internal.d
    public final void a() {
        ThreadsState threadsState;
        ThreadsState.ShrunkStackTraceElement[] shrunkStackTraceElementArr;
        StackTraceElement stackTraceElement;
        if (new File(g7.b(this.f64037a, "StartappAnrTrace")).exists() && (threadsState = (ThreadsState) g7.c(this.f64037a, "StartappAnrTrace")) != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            PrintWriter printWriter = new PrintWriter(vi.a(byteArrayOutputStream));
            printWriter.print("\"delay: ");
            printWriter.print(threadsState.a());
            printWriter.println('\"');
            if (!TextUtils.isEmpty(threadsState.b())) {
                printWriter.print("\"handler: ");
                printWriter.print(threadsState.b());
                printWriter.println('\"');
            }
            Map mapC = threadsState.c();
            if (mapC == null) {
                shrunkStackTraceElementArr = null;
            } else {
                shrunkStackTraceElementArr = null;
                for (Map.Entry entry : mapC.entrySet()) {
                    if (shrunkStackTraceElementArr == null) {
                        shrunkStackTraceElementArr = (ThreadsState.ShrunkStackTraceElement[]) entry.getValue();
                    }
                    String str = (String) entry.getKey();
                    ThreadsState.ShrunkStackTraceElement[] shrunkStackTraceElementArr2 = (ThreadsState.ShrunkStackTraceElement[]) entry.getValue();
                    printWriter.print('\"');
                    printWriter.print(str);
                    printWriter.println('\"');
                    for (ThreadsState.ShrunkStackTraceElement shrunkStackTraceElement : shrunkStackTraceElementArr2) {
                        if (shrunkStackTraceElement.a() != 0) {
                            printWriter.print('\t');
                            printWriter.println(shrunkStackTraceElement.a());
                        }
                        StackTraceElement stackTraceElementB = shrunkStackTraceElement.b();
                        if (stackTraceElementB != null) {
                            printWriter.print('\t');
                            printWriter.print("at ");
                            printWriter.print(stackTraceElementB.getClassName());
                            printWriter.print('.');
                            printWriter.print(stackTraceElementB.getMethodName());
                            printWriter.print('(');
                            printWriter.print(stackTraceElementB.getFileName());
                            printWriter.print(':');
                            printWriter.print(stackTraceElementB.getLineNumber());
                            printWriter.println(')');
                        }
                    }
                }
            }
            printWriter.close();
            if (shrunkStackTraceElementArr == null) {
                return;
            }
            int length = shrunkStackTraceElementArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    stackTraceElement = null;
                    break;
                }
                StackTraceElement stackTraceElementB2 = shrunkStackTraceElementArr[i10].b();
                if (stackTraceElementB2 != null && stackTraceElementB2.getClassName().startsWith("com.startapp.")) {
                    stackTraceElement = stackTraceElementB2;
                    break;
                }
                i10++;
            }
            if (stackTraceElement == null) {
                return;
            }
            String string = byteArrayOutputStream.toString();
            g9 g9Var = new g9(h9.f64613h);
            g9Var.f64553d = stackTraceElement.getClassName() + '.' + stackTraceElement.getMethodName();
            g9Var.f64554e = string;
            g9Var.a();
        }
    }
}
