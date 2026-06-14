package com.taurusx.tax.g.o0;

import android.os.AsyncTask;
import com.taurusx.tax.log.LogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: loaded from: classes11.dex */
public class z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f66250c = 2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f66252y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f66253z = com.taurusx.tax.w.o.w.W() * 1048576;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Deque<WeakReference<AsyncTaskC0798z>> f66251w = new ArrayDeque();

    /* JADX INFO: renamed from: com.taurusx.tax.g.o0.z$z, reason: collision with other inner class name */
    public static class AsyncTaskC0798z extends AsyncTask<String, Void, y> {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f66254o = "FileDownloaderTask";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f66255c = 0;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final w f66256w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final WeakReference<AsyncTaskC0798z> f66257y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final int f66258z;

        public AsyncTaskC0798z(int i10, w wVar) {
            this.f66258z = i10;
            this.f66256w = wVar;
            WeakReference<AsyncTaskC0798z> weakReference = new WeakReference<>(this);
            this.f66257y = weakReference;
            z.f66251w.add(weakReference);
        }

        @Override // android.os.AsyncTask
        public void onCancelled() {
            LogUtil.v("taurusx", "FileDownloader task was cancelled.");
            z.f66251w.remove(this.f66257y);
            w wVar = this.f66256w;
            if (wVar != null) {
                wVar.downloadEnd(com.taurusx.tax.w.w.TASK_CANCELED.setMessage("FileDownloader task was cancelled"), 0L);
            }
        }

        public void z(long j10) {
            this.f66255c = j10;
        }

        /* JADX WARN: Removed duplicated region for block: B:80:0x01a8 A[Catch: all -> 0x01b5, TryCatch #1 {all -> 0x01b5, blocks: (B:78:0x018e, B:80:0x01a8, B:83:0x01ad, B:85:0x01b1, B:93:0x01c1, B:89:0x01b7, B:91:0x01bb, B:92:0x01be), top: B:106:0x018e }] */
        /* JADX WARN: Removed duplicated region for block: B:92:0x01be A[Catch: all -> 0x01b5, TryCatch #1 {all -> 0x01b5, blocks: (B:78:0x018e, B:80:0x01a8, B:83:0x01ad, B:85:0x01b1, B:93:0x01c1, B:89:0x01b7, B:91:0x01bb, B:92:0x01be), top: B:106:0x018e }] */
        /* JADX WARN: Removed duplicated region for block: B:96:0x01d0  */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.taurusx.tax.g.o0.y doInBackground(java.lang.String... r12) {
            /*
                Method dump skipped, instruction units count: 491
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.g.o0.z.AsyncTaskC0798z.doInBackground(java.lang.String[]):com.taurusx.tax.g.o0.y");
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(y yVar) {
            if (!isCancelled()) {
                z.f66251w.remove(this.f66257y);
                if (yVar == null) {
                    w wVar = this.f66256w;
                    if (wVar != null) {
                        wVar.downloadEnd(com.taurusx.tax.w.w.TASK_RESULT_EMPTY.setMessage("Download result is empty"), 0L);
                        return;
                    }
                    return;
                }
                w wVar2 = this.f66256w;
                if (wVar2 != null) {
                    wVar2.downloadEnd(yVar.f66248w, yVar.f66249z);
                    return;
                }
                return;
            }
            onCancelled();
        }
    }

    public static void z(int i10, String str, w wVar) {
        z(i10, str, 0L, wVar);
    }

    public static void z(int i10, String str, long j10, w wVar) {
        if (wVar != null) {
            wVar.downloadStart();
        }
        if (str == null) {
            LogUtil.v("taurusx", "FileDownloader attempted to cache with null url.");
            if (wVar != null) {
                wVar.downloadEnd(com.taurusx.tax.w.w.EMPTY_URL.setMessage("FileDownloader attempted to cache with null url"), 0L);
                return;
            }
            return;
        }
        AsyncTaskC0798z asyncTaskC0798z = new AsyncTaskC0798z(i10, wVar);
        asyncTaskC0798z.z(j10);
        try {
            if (i10 == 2) {
                com.taurusx.tax.g.r0.w.w(asyncTaskC0798z, str);
            } else {
                com.taurusx.tax.g.r0.w.z(asyncTaskC0798z, str);
            }
        } catch (Exception e10) {
            if (wVar != null) {
                wVar.downloadEnd(com.taurusx.tax.w.w.TASK_EXECUTE_FAILED.setMessage("FileDownloader execute with exception: " + e10.getMessage()), 0L);
            }
        }
    }
}
