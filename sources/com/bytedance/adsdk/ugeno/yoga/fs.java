package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes6.dex */
public class fs extends YogaNodeJNIBase {
    public void exu() {
        long j10 = this.qdl;
        if (j10 != 0) {
            this.qdl = 0L;
            YogaNative.jni_YGNodeFinalizeJNI(j10);
        }
    }

    protected void finalize() throws Throwable {
        try {
            exu();
        } finally {
            super.finalize();
        }
    }
}
