package yads;

import android.os.Bundle;
import android.os.Parcel;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class go0 implements e23 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b20 f111285a = new b20();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i23 f111286b = new i23();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f111287c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f111288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f111289e;

    public go0() {
        for (int i10 = 0; i10 < 2; i10++) {
            this.f111287c.addFirst(new eo0(this));
        }
        this.f111288d = 0;
    }

    @Override // yads.e23
    public final void a(long j10) {
    }

    @Override // yads.ba0
    public final Object b() {
        if (this.f111289e) {
            throw new IllegalStateException();
        }
        if (this.f111288d != 0) {
            return null;
        }
        this.f111288d = 1;
        return this.f111286b;
    }

    @Override // yads.ba0
    public final void flush() {
        if (this.f111289e) {
            throw new IllegalStateException();
        }
        this.f111286b.b();
        this.f111288d = 0;
    }

    @Override // yads.ba0
    public final void release() {
        this.f111289e = true;
    }

    @Override // yads.ba0
    public final Object a() {
        if (this.f111289e) {
            throw new IllegalStateException();
        }
        if (this.f111288d != 2 || this.f111287c.isEmpty()) {
            return null;
        }
        j23 j23Var = (j23) this.f111287c.removeFirst();
        if (this.f111286b.b(4)) {
            j23Var.f112430b |= 4;
        } else {
            i23 i23Var = this.f111286b;
            long j10 = i23Var.f110672f;
            b20 b20Var = this.f111285a;
            ByteBuffer byteBuffer = i23Var.f110670d;
            byteBuffer.getClass();
            byte[] bArrArray = byteBuffer.array();
            b20Var.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.unmarshall(bArrArray, 0, bArrArray.length);
            parcelObtain.setDataPosition(0);
            Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
            parcelObtain.recycle();
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM);
            parcelableArrayList.getClass();
            fo0 fo0Var = new fo0(j10, pq.a(a20.f108519t, parcelableArrayList));
            j23Var.f111527c = this.f111286b.f110672f;
            j23Var.f112227d = fo0Var;
            j23Var.f112228e = 0L;
        }
        this.f111286b.b();
        this.f111288d = 0;
        return j23Var;
    }

    @Override // yads.ba0
    public final void a(i23 i23Var) {
        if (!this.f111289e) {
            if (this.f111288d == 1) {
                if (this.f111286b == i23Var) {
                    this.f111288d = 2;
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    public final void a(j23 j23Var) {
        if (this.f111287c.size() < 2) {
            if (!this.f111287c.contains(j23Var)) {
                j23Var.f112430b = 0;
                j23Var.f112227d = null;
                this.f111287c.addFirst(j23Var);
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalStateException();
    }
}
