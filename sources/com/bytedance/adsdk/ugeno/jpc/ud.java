package com.bytedance.adsdk.ugeno.jpc;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ud {
    private final DataSetObservable qdl = new DataSetObservable();

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private DataSetObserver f16183ud;

    public void lnr() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.f16183ud;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.qdl.notifyChanged();
    }

    public float qdl(int i10) {
        return 1.0f;
    }

    public abstract int qdl();

    public abstract boolean qdl(View view, Object obj);

    public Parcelable ud() {
        return null;
    }

    public int qdl(Object obj) {
        return -1;
    }

    public Object qdl(ViewGroup viewGroup, int i10) {
        return qdl((View) viewGroup, i10);
    }

    public void qdl(ViewGroup viewGroup, int i10, Object obj) {
        qdl((View) viewGroup, i10, obj);
    }

    @Deprecated
    public Object qdl(View view, int i10) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @Deprecated
    public void qdl(View view, int i10, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    void qdl(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f16183ud = dataSetObserver;
        }
    }
}
