package com.my.tracker.obfuscated;

import android.util.SparseArray;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final SparseArray f61893a = new SparseArray(50);

    private u c(int i10) {
        w wVar = new w(i10);
        this.f61893a.put(i10, wVar);
        return wVar;
    }

    public boolean a(int i10) {
        return this.f61893a.get(i10) != null;
    }

    public void b(int i10) {
        u uVarC = (u) this.f61893a.get(i10);
        if (uVarC != null) {
            x2.a("TimeSpentCore: CountBasedTimeSpentsManager: found existed count based record with id = " + i10);
        } else {
            x2.a("TimeSpentCore: CountBasedTimeSpentsManager: not found existed count based record with id = " + i10 + ", creating new");
            uVarC = c(i10);
        }
        uVarC.f();
        x2.c("TimeSpent: incremented count based TimeSpent, id = " + i10 + ", count = " + uVarC.d());
    }

    public ArrayList a() {
        x2.a("TimeSpentCore: CountBasedTimeSpentsManager: onTick: start collecting count based TimeSpents");
        int size = this.f61893a.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add((v) this.f61893a.valueAt(i10));
        }
        this.f61893a.clear();
        x2.a("TimeSpentCore: CountBasedTimeSpentsManager: onTick: collected " + arrayList.size() + " count based TimeSpents");
        return arrayList;
    }
}
