package com.bytedance.sdk.openadsdk.ud;

import com.bytedance.sdk.component.utils.wd;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class qdl {
    protected boolean qdl = false;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final ExecutorService f17832ud = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ud.qdl$qdl, reason: collision with other inner class name */
    private class CallableC0301qdl implements Callable<Void> {

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private final File f17833ud;

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            qdl.this.ud(this.f17833ud);
            return null;
        }

        private CallableC0301qdl(File file) {
            this.f17833ud = file;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud(File file) throws IOException {
        if (!this.qdl) {
            try {
                wd.ud(file);
            } catch (Throwable unused) {
            }
            qdl(wd.qdl(file.getParentFile()));
        } else {
            List<File> listQdl = wd.qdl(file);
            listQdl.toString();
            qdl(listQdl);
        }
    }

    protected abstract void qdl(List<File> list);

    protected abstract boolean qdl(long j10, int i10);

    protected abstract boolean qdl(File file, long j10, int i10);

    public void qdl(File file) throws IOException {
        this.f17832ud.submit(new CallableC0301qdl(file));
    }

    long ud(List<File> list) {
        Iterator<File> it = list.iterator();
        long length = 0;
        while (it.hasNext()) {
            length += it.next().length();
        }
        return length;
    }
}
